package com.example.appdevsec;

import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.appdevsec.api.GetAccounts;
import com.example.appdevsec.api.GetJson;
import com.example.appdevsec.api.GetUser;
import com.example.appdevsec.model.ListAccounts;
import com.example.appdevsec.model.User;
import retrofit2.Call;

public class UserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

