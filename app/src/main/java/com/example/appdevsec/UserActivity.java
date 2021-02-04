package com.example.appdevsec;

import android.os.Bundle;
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

    GetUser user = GetJson.getInstance().create(GetUser.class);
    GetAccounts accounts = GetJson.getInstance().create(GetAccounts.class);
    Call<ListAccounts> callListAccounts = accounts.getAccounts();
    Call<User> callUser = user.getUser();

}

