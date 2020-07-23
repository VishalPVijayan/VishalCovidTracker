package com.vishalpvijayan.vishalcovidtracker

import okhttp3.OkHttpClient
import okhttp3.Request

object Client {
    // create a singleton class : We can use this class with creating the instance of this class the benefit of using singleton class here.
    private val okHttpClient = OkHttpClient()

    private val request = Request.Builder()
        .url("https://api.covid19india.org/data.json")
        .build()

    val api = okHttpClient.newCall(request)
}