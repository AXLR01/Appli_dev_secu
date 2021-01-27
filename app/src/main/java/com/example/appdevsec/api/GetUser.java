package com.example.appdevsec.api;

import com.example.appdevsec.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetUser {
    @GET("config/1")
    Call<User> getUser();
}
