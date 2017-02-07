package com.example.android.timetable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alice on 7/2/17.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="TimeTableDB.db";
    public static final String TABLE_NAME="TimeTable_table";
    public static final String COL_1="ID";
    public static final String COL_2="DAY";
    public static final String COL_3="1";
    public static final String COL_4="2";
    public static final String COL_5="3";
    public static final String COL_6="4";
    public static final String COL_7="5";
    public static final String COL_8="6";
    public static final String COL_9="7";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+TABLE_NAME+" ("+COL_1+" INTEGER PRIMARY KEY AUTOINCREMENT"+", "+COL_2+" TEXT"
                +", "+COL_3+" TEXT"+", "+COL_4+" TEXT, "+COL_5+" TEXT, "+COL_6+" TEXT, "+COL_7+" TEXT,"+
                COL_8+" TEXT, "+COL_9+" TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
