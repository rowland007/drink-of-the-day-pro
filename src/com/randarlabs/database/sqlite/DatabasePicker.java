package com.randarlabs.database.sqlite;

import java.util.Calendar;

import com.randarlabs.database.Drinks;
import com.randarlabs.util.FindDay;

import android.widget.Toast;

public class DatabasePicker {
	public static void setDrinkDatabase(DBAdapter db) {
		FindDay.setDayOfTheWeek();
		switch(FindDay.getDayOfTheWeek()){
		case Calendar.SUNDAY:
			DBAdapter.upDateVersion(1);
			Drinks.setSundayDrinks(db);
			Drinks.setMondayDrinks(db);
			Drinks.setTuesdayDrinks(db);
			Drinks.setWednesdayDrinks(db);
			break;
		case Calendar.MONDAY:
			DBAdapter.upDateVersion(2);
			Drinks.setMondayDrinks(db);
			break;
		case Calendar.TUESDAY:
			DBAdapter.upDateVersion(3);
			Drinks.setMondayDrinks(db);
			Drinks.setTuesdayDrinks(db);
			break;
		case Calendar.WEDNESDAY:
			DBAdapter.upDateVersion(4);
			Drinks.setWednesdayDrinks(db);
			break;
		case Calendar.THURSDAY:
			DBAdapter.upDateVersion(5);
			Drinks.setMondayDrinks(db);
			Drinks.setTuesdayDrinks(db);
			Drinks.setWednesdayDrinks(db);
			Drinks.setThursdayDrinks(db);
			break;
		case Calendar.FRIDAY:
			DBAdapter.upDateVersion(6);
			Drinks.setMondayDrinks(db);
			Drinks.setTuesdayDrinks(db);
			Drinks.setWednesdayDrinks(db);
			Drinks.setFridayDrinks(db);
			break;
		case Calendar.SATURDAY:
			DBAdapter.upDateVersion(7);
			Drinks.setMondayDrinks(db);
			Drinks.setTuesdayDrinks(db);
			Drinks.setWednesdayDrinks(db);
			Drinks.setSaturdayDrinks(db);
			break;
		default:
			Toast.makeText(null, "ERROR: Could not load drinks", Toast.LENGTH_LONG).show();
			break;
		}
	}
}
