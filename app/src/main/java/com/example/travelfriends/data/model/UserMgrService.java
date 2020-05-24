package com.example.travelfriends.data.model;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @ClassName: UserMgrService
 * @Description: 登录注册请求封装
 * @Author: zly
 * @CreateDate: 2020/5/24 14:42
 */
public interface UserMgrService {

    @POST("register")
    @FormUrlEncoded
    Call<UserBean> register(@Query("username") String username, @Query("password") String password);

    @GET("login")
    Call<UserBean> login(@Query("username") String username, @Query("password") String password);
}
