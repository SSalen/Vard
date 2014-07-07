package com.ex.augmentedreality;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class dbClass {

	public static final String KEY_ID = "_id";
	public static final String KEY_INFO = "component_info";

	private static final String DATABASE_NAME = "AugmentedRealityDB";
	private static final String DATABASE_TABLE = "componentTable";
	private static final int DATABASE_VERSION = 1;

	private DbHelper ourHelper;
	private final Context ourContext;
	private SQLiteDatabase ourDatabase;

	private static class DbHelper extends SQLiteOpenHelper {

		public DbHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE " + DATABASE_TABLE + " (" + KEY_ID
					+ " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_INFO
					+ " TEXT NOT NULL); ");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
			onCreate(db);
		}

	}

	public dbClass(Context C) {
		ourContext = C;
	}

	public dbClass open() throws SQLException {
		ourHelper = new DbHelper(ourContext);
		ourDatabase = ourHelper.getWritableDatabase();
		return this;
	}

	public void close() {
		ourHelper.close();
	}

	public String getData() {
		// TODO Auto-generated method stub
		String[] columns = new String[]{ KEY_ID, KEY_INFO};
		Cursor c = ourDatabase.query(DATABASE_TABLE, columns, null, null, null, null, null);
		String result = "";
		
		int iRow = c.getColumnIndex(KEY_ID);
		int iInfo = c.getColumnIndex(KEY_INFO);
		
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			result = result + c.getString(iRow) + " " + c.getString(iInfo) + "\n"; //Hvordan få ut bare ønsket rad?
		}
		return result;
	}

}
