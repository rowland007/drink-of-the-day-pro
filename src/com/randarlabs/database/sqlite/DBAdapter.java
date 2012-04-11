package com.randarlabs.database.sqlite;

import java.io.IOException;
import java.util.Locale;
import java.util.Random;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
//import java.util.Random;

public class DBAdapter
{
    public static final String KEY_ROWID = "_id";
    public static final String KEY_DRINK = "drink";
    public static final String KEY_RECIPE = "recipe";
    public static final String KEY_DIRECTIONS = "directions";
    private static final String TAG = "DBAdapter";
    
    private static final String DATABASE_NAME = "drinks";
    private static final String DATABASE_TABLE = "recipes";
    private static int DATABASE_VERSION = 20;

    private static final String DATABASE_CREATE =
        "create table recipes (_id integer primary key autoincrement, "
        + "drink text not null, recipe text not null, directions text not null);";
        
    private final Context context; 
    
    private DatabaseHelper DBHelper;
    private static SQLiteDatabase db;

    public DBAdapter(Context ctx) 
    {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }
        
    private static class DatabaseHelper extends SQLiteOpenHelper 
    {
        DatabaseHelper(Context context) 
        {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) 
        {
            db.execSQL(DATABASE_CREATE);         
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, 
        int newVersion) 
        {
            Log.w(TAG, "Upgrading database from version " + oldVersion 
                    + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS recipes");
            onCreate(db);
        }
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
        	Log.w(TAG, "Downgrading database from version " + oldVersion 
                    + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS recipes");
            onCreate(db);
        }
        /**
         * Creates a empty database on the system and rewrites it with your own database.
         * */
        @SuppressWarnings("unused")
		public void createDataBase() throws IOException{
     
        	boolean dbExist = DBExists();
     
        	if(dbExist){
        		//do nothing - database already exist
        		
        		db.setVersion(db.getVersion() + 1);
        	}else{
     
        		//By calling this method and empty database will be created into the default system path
                //of your application so we are going to be able to overwrite that database with our database.
            	//this.getReadableDatabase();
        		onCreate(db);
            	//try {
     
        			//copyDataBase();
     
        		//} catch (IOException e) {
     
            		//throw new Error("Error copying database");
     
            	//}
        	}
     
        }
    }
    
    /**
     * Check if the database already exist to avoid re-copying the file each time you open the application.
     * @return true if it exists, false if it doesn't
     */
    private static boolean DBExists() {
    	SQLiteDatabase db = null;
    	
    	try {
    		String databasePath = DATABASE_NAME;
    		db = SQLiteDatabase.openDatabase(databasePath, null, SQLiteDatabase.OPEN_READWRITE);
    		db.setLocale(Locale.getDefault());
    		db.setLockingEnabled(true);
    		db.setVersion(db.getVersion() + 1);
    		
    	}	catch (SQLiteException e) {
    		
    			Log.e("SqlHelper", "database not found");
    			
    	}
    	
    	if(db != null) {
    		db.close();
    	}
    	
    	return db != null ? true : false;
    }
    

    
    public static void upDateVersion(int version){
    	DATABASE_VERSION = version;
    }
    //---opens the database---
    public DBAdapter open() throws SQLException 
    {
        db = DBHelper.getWritableDatabase();
        return this;
    }

    //---closes the database---    
    public void close() 
    {
        DBHelper.close();
    }
    
    public int getDatabaseVersion(){
    	return db.getVersion();
    }
    
    public void setDatabaseVersion(int version){
    	db.setVersion(version);
    }
    //---insert a recipe into the database---
    public long insertRecipe(String drink, String recipe, String directions) 
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_DRINK, drink);
        initialValues.put(KEY_RECIPE, recipe);
        initialValues.put(KEY_DIRECTIONS, directions);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }

    //---deletes a particular recipe---
    public boolean deleteRecipe(long rowId) 
    {
        return db.delete(DATABASE_TABLE, KEY_ROWID + 
        		"=" + rowId, null) > 0;
    }

    //---retrieves all the recipes---
    public Cursor getAllRecipes() 
    {
        return db.query(DATABASE_TABLE, new String[] {
        		KEY_ROWID, 
        		KEY_DRINK,
        		KEY_RECIPE,
        		KEY_DIRECTIONS,}, 
                null, 
                null, 
                null, 
                null, 
                null);
    }
    public int getAllEntries()
    {
    	Cursor cursor = db.rawQuery(
    			"SELECT COUNT(drink) FROM recipes", null);
    	if(cursor.moveToFirst()) {
    		return cursor.getInt(0);
    	}
    	return cursor.getInt(0);
    }
    //---retrieves a random recipe---
    public int getRandomEntry()
    {
    	int id = 1;
    	id = getAllEntries();
    	
    	Random random = new Random();
    	int rand = random.nextInt(id) + 1;
    	Cursor cursor = db.rawQuery(
    					"SELECT _id FROM recipes WHERE _id = " + rand, null);
    	if(cursor.moveToFirst()){
    		return cursor.getInt(0);
    	}
    	return cursor.getInt(0);
    }
    //---retrieves a particular recipe---
    public Cursor getRecipe(int rowId) throws SQLException 
    {
        Cursor mCursor =
                db.query(true, DATABASE_TABLE, new String[] {
                		KEY_ROWID,
                		KEY_DRINK, 
                		KEY_RECIPE,
                		KEY_DIRECTIONS,
                		}, 
                		KEY_ROWID + "=" + rowId, 
                		null,
                		null, 
                		null, 
                		null, 
                		null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    //---updates a recipe---
    public boolean updateRecipe(long rowId, String drink, 
    String recipe, String directions) 
    {
        ContentValues args = new ContentValues();
        args.put(KEY_DRINK, drink);
        args.put(KEY_RECIPE, recipe);
        args.put(KEY_DIRECTIONS, directions);
        return db.update(DATABASE_TABLE, args, 
                         KEY_ROWID + "=" + rowId, null) > 0;
    }
    public String DisplayDrinkName(Cursor c){
    	String temp = c.getString(1);
    	c.close();
    	return temp;
    }
    public String DisplayDrinkRecipe(Cursor c){
    	String temp = c.getString(2);
    	c.close();
    	return temp;
    }
    public String DisplayDrinkDirections(Cursor c){
    	String temp = c.getString(3);
    	c.close();
    	return temp;
    }
}
