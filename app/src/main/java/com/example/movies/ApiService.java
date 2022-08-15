package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?token=7P6M599-A2N4K50-P2SY76J-TC6E2M8&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovie(@Query("page") int page);

    @GET("movie?token=ZQQ8GMN-TN54SGK-NB3MKEC-ZKB8V06&field=id")
    Single<TrailersResponse> loadTrailers(@Query("search")int id);

    @GET("review?token=ZQQ8GMN-TN54SGK-NB3MKEC-ZKB8V06&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}
