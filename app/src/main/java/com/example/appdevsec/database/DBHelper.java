package com.example.appdevsec.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static  final String DATABASE_NAME = "DB.db";
    private static  final int DATABASE_VERSION = 1;

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String strSql = "create table Account ("
                + "id text not null,"
                + "account_name text not null,"
                + "amount text not null,"
                + "iban text not null,"
                + "currency text not null"
                + ")";
        db.execSQL( strSql );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String strSql = "drop table Account";
        db.execSQL( strSql );
        this.onCreate(db);

    }

    public void insertData (String id, String account_name, String amount, String iban, String currency, String name ){
        name = name.replace("'","'");
        String strSql = "insert into Account (id,account_name,amount,iban,currency) values('"+id+"',"
        +account_name+"',"+amount+"',"+iban+"',"+currency+"')";
        this.getWritableDatabase().execSQL(strSql);
    }
}
