package com.ex.augmentedreality;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.ex.augmentedreality.ComponentTable;

public class CompDBhelper extends SQLiteOpenHelper {

	// Database Version
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "ComponentDB";

	public CompDBhelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// SQL statement to create book table
		String CREATE_BOOK_TABLE = "CREATE TABLE components ( " + "id TEXT, "
				+ "SFI TEXT, " + "manufacturer TEXT, " + "LastFix TEXT, "
				+ "FixType TEXT )";

		// create components table
		db.execSQL(CREATE_BOOK_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS components");

		// create frezh components table
		this.onCreate(db);
	}

	// ----------------------------------------------------------------------

	// Components table name
	private static final String TABLE_COMPONENTS = "components";

	// Components Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_SFI = "SFI";
	private static final String KEY_MANUFACTURER = "manufacturer";
	private static final String KEY_LASTFIX = "LastFix";
	private static final String KEY_FIXTYPE = "FixType";

	private static final String[] COLUMNS = { KEY_ID, KEY_SFI,
		KEY_MANUFACTURER, KEY_LASTFIX, KEY_FIXTYPE };

	public void addComponent(ComponentTable component) {
		Log.d("addComponent", component.toString());
		// 1. get reference to writable database
		SQLiteDatabase db = this.getWritableDatabase();

		// 2. create ContentValues to add key "column"/value
		ContentValues values = new ContentValues();
		values.put(KEY_ID, component.getId());
		values.put(KEY_SFI, component.getSFI());
		values.put(KEY_MANUFACTURER, component.getManufacturer());
		values.put(KEY_LASTFIX, component.getLastFix());
		values.put(KEY_FIXTYPE, component.getFixType());

		// 3. insert
		db.insert(TABLE_COMPONENTS, null, values);

		db.close();
	}

	public ComponentTable getComponent(String id) {

		// 1. get reference to readable DB
		SQLiteDatabase db = this.getReadableDatabase();

		// 2. build query
		Cursor cursor = db.query(TABLE_COMPONENTS, COLUMNS, null, null, null, null, null, null);

		// 3. If we got results get the first one
		if (cursor != null)
			cursor.moveToFirst();

		// 4. build book objects
		ComponentTable component = new ComponentTable();
		// component.setId(Integer.parseInt(cursor.getString(0)));
	
		component.setId(cursor.getString(0));
		component.setSFI(cursor.getString(1));
		component.setManufacturer(cursor.getString(2));
		component.setLastFix(cursor.getString(3));
		component.setFixType(cursor.getString(4));

		Log.d("getComponent(" + id + ")", component.toString());

		return component;

	}

}