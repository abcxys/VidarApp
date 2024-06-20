package com.example.vidarapp.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/inventory/getInventoryByProductId")
    Call<String> getInventoryByProductId(@Query("productId") Integer productId);
}
