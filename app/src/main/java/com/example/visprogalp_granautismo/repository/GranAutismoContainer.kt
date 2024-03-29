package com.example.visprogalp_granautismo.repository


import com.example.visprogalp_granautismo.service.GranAutismoService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GranAutismoContainer() {

    class AuthInterceptor(private val bearerToken: String) : Interceptor {
        override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
            val originalRequest = chain.request()
            val request = originalRequest.newBuilder()
                .header("Authorization", "Bearer $bearerToken")
                .build()
            return chain.proceed(request)
        }
    }
    companion object{
        var ACCESS_TOKEN = ""
        var USER_ID = -1

    private val client = OkHttpClient.Builder()
        .addInterceptor(AuthInterceptor(ACCESS_TOKEN))
        .build()
    }
    private val BASE_URL = "http://127.0.0.1:8000/api/"

    private val client = OkHttpClient.Builder()
        .addInterceptor(AuthInterceptor(ACCESS_TOKEN))
        .build()

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(client)
        .build()

    private val retrofitService: GranAutismoService by lazy{
        retrofit.create(GranAutismoService::class.java)
    }

    val GranAutismoRepository: GranAutismoRepository by lazy{
        GranAutismoRepository(retrofitService)
    }
}