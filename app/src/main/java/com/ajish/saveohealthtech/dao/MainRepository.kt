package com.ajish.saveohealthtech.dao

import com.ajish.saveohealthtech.api.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}