package com.example.appdevsec.api;

import com.example.appdevsec.model.ListAccounts;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetAccounts {
    @GET("accounts")
    Call<ListAccounts> getAccounts();
}
