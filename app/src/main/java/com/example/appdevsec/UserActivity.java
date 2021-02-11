package com.example.appdevsec;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.appdevsec.database.DBHelper;

public class UserActivity extends AppCompatActivity {

    private TextView Account;
    private DBHelper databaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Account = (TextView) findViewById( R.id.Account);
        databaseManager =  new DBHelper(this);
        databaseManager.insertData("1","tresor","50","23263","£","Raph");
        databaseManager.close();
    }

}

