package com.tinnews.network;

import com.tinnews.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country);

    @GET
    Call<NewsResponse> getEverything(@Query("q") String query, @Query("pageSize") int pageSize);

}
