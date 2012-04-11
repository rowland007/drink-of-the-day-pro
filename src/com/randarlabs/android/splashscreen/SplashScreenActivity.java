package com.randarlabs.android.splashscreen;

import com.randarlabs.Constructor;
import com.randarlabs.database.sqlite.DBAdapter;
import com.randarlabs.database.sqlite.DatabasePicker;
import com.randarlabs.util.FindDate;
import com.randarlabs.util.ThemeOfTheDay;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SplashScreenActivity extends Activity {
	/**
	 * Simple Dialog used to show the splash screen
	 */
	protected Dialog mSplashDialog;
	DBAdapter database;
	int rowID = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		MyStateSaver data = (MyStateSaver) getLastNonConfigurationInstance();
		if (data != null) {
			// Show splash screen if still loading
			if (data.showSplashScreen) {
				showSplashScreen();
			}
			setContentView(com.randarlabs.android.R.layout.main3);
			/*/ Rebuild your UI with your saved state here
			FindDate.setDate();
			ThemeOfTheDay.setTheme();
			if(database == null)
				database = new DBAdapter(this);
			else
				database.upDateVersion();

			DatabasePicker.setDrinkDatabase(database);
			database.open();

			rowID = database.getRandomEntry();
			TextView tvThemeTitle = (TextView) findViewById(com.randarlabs.android.R.id.TV_themeTitle);
			tvThemeTitle.setText(ThemeOfTheDay.getTheme());
			TextView tvDrinkTitle = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkName);
			tvDrinkTitle.setText(Constructor.getDrinkName(rowID, database));
			TextView tvDrinkRecipe = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkRecipe);
			tvDrinkRecipe.setText(Constructor.getDrinkRecipe(rowID, database));
			TextView tvDrinkDirections = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkDirections);
			tvDrinkDirections.setText(Constructor.getDrinkDirections(rowID,
					database));
			
			
			
			// ////////////////////////////////////////////////////////////////////////////////////////////////////
			// /DELETE BEFORE
			// PUBLISH//////////////////////////////////////////////////////////////////////////////
			TextView databaseVersion = (TextView) findViewById(com.randarlabs.android.R.id.TV_DatabaseVersion);// //
			databaseVersion.setText(" " + database.getDatabaseVersion());// /////////////////////////////////////////////
			// ////////////////////////////////////////////////////////////////////////////////////////////////////
			// ////////////////////////////////////////////////////////////////////////////////////////////////////
			
			database.close();*/
		
		
		} else {
			showSplashScreen();
			setContentView(com.randarlabs.android.R.layout.main3);
			// Do your heavy loading here on a background thread

			FindDate.setDate();
			ThemeOfTheDay.setTheme();

			database = new DBAdapter(this);
			//if(database.getDatabaseVersion() <= 1){
			//	database.open();
			//	database.setDatabaseVersion(database.getDatabaseVersion() + 1);
			//	database.close();
			//}
			

			DatabasePicker.setDrinkDatabase(database);
			database.open();

			rowID = database.getRandomEntry();
			TextView tvThemeTitle = (TextView) findViewById(com.randarlabs.android.R.id.TV_themeTitle);
			tvThemeTitle.setText(ThemeOfTheDay.getTheme());
			TextView tvDrinkTitle = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkName);
			tvDrinkTitle.setText(Constructor.getDrinkName(rowID, database));
			TextView tvDrinkRecipe = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkRecipe);
			tvDrinkRecipe.setText(Constructor.getDrinkRecipe(rowID, database));
			TextView tvDrinkDirections = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkDirections);
			tvDrinkDirections.setText(Constructor.getDrinkDirections(rowID,
					database));
			

			// ////////////////////////////////////////////////////////////////////////////////////////////////////
			// /DELETE BEFORE
			// PUBLISH//////////////////////////////////////////////////////////////////////////////
			//TextView databaseVersion = (TextView)findViewById(com.randarlabs.android.R.id.TV_DatabaseVersion);// //
			//databaseVersion.setText(" " + database.getDatabaseVersion());// /////////////////////////////////////////////
			// ////////////////////////////////////////////////////////////////////////////////////////////////////
			// ////////////////////////////////////////////////////////////////////////////////////////////////////
			
			database.close();
		}

		// Capture our button from layout
		ImageButton randomButton = (ImageButton) findViewById(com.randarlabs.android.R.id.imageButtonNextRandom);
		// Register the onClick listener with the implementation
		randomButton.setOnClickListener(mRandomListener);
	}

	@Override
	public Object onRetainNonConfigurationInstance() {
		MyStateSaver data = new MyStateSaver();
		// Save your important data here

		if (mSplashDialog != null) {
			data.showSplashScreen = true;
			removeSplashScreen();
		}
		return data;
	}

	/**
	 * Removes the Dialog that displays the splash screen
	 */
	protected void removeSplashScreen() {
		if (mSplashDialog != null) {
			mSplashDialog.dismiss();
			mSplashDialog = null;
		}
	}

	/**
	 * Shows the splash screen over the full Activity
	 */
	protected void showSplashScreen() {
		mSplashDialog = new Dialog(this,
				com.randarlabs.android.R.style.SplashScreen);
		mSplashDialog.setContentView(com.randarlabs.android.R.layout.splash);
		mSplashDialog.setCancelable(false);
		mSplashDialog.show();

		// Set Runnable to remove splash screen just in case
		final Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				removeSplashScreen();
			}
		}, 3000);
	}

	/**
	 * Simple class for storing important data across config changes
	 */
	private class MyStateSaver {
		public boolean showSplashScreen = false;
		// Your other important fields here
	}

	// Create an anonymous implementation of OnClickListener
	private android.view.View.OnClickListener mRandomListener = new android.view.View.OnClickListener() {
		public void onClick(View v) {
			database.open();
			int rowID = database.getRandomEntry();
			TextView tvDrinkTitle = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkName);
			tvDrinkTitle.setText(Constructor.getDrinkName(rowID, database));
			TextView tvDrinkRecipe = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkRecipe);
			tvDrinkRecipe.setText(Constructor.getDrinkRecipe(rowID, database));
			TextView tvDrinkDirections = (TextView) findViewById(com.randarlabs.android.R.id.TV_DrinkDirections);
			tvDrinkDirections.setText(Constructor.getDrinkDirections(rowID,
					database));
			database.close();
		}
	};
}