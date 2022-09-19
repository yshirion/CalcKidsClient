package com.example.RestServise;

import com.example.objects.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserService {

    @GET("user/{id}")
    Call<User> getById(@Path("id") long userId);

    @GET("user/parent/{fid}")
    Call<User> getParent(@Path("fid") long fid);

    @GET("user/family/{id}")
    Call<List<User>> findByFamily(@Path("id") long family_id);

    @GET("user/check/{name}/{password}")
    Call<User> checkUser(@Path("name") String name, @Path("password") String password);

    @POST("user/save")
    Call<String> save(@Body User user);

    @POST("user/saveParent")
    Call<String> saveParent(@Body User user);
}