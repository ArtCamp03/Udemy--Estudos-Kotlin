package com.devmasterteam.tasks.service.repository.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor() {
    companion object{

        private lateinit var INSTANCE: Retrofit

        private fun getRetrofitInstance(): Retrofit{
            val httpClient = OkHttpClient.Builder()

            // caso INSTANCE nao foi inicializado
           if(!::INSTANCE.isInitialized){
              synchronized(RetrofitClient::class){
                  INSTANCE = Retrofit.Builder()
                      .baseUrl("http://devmasterteam.com/CursoAndroidAPI/")    // URL padrao da API
                      .client(httpClient.build())               // orquestra as chamadas HTTP
                      .addConverterFactory(GsonConverterFactory.create())  // converte Json em classes
                      .build()
              }
           }
            return INSTANCE
        }

        fun <T> getService(serviceClass: Class<T>): T{
            return getRetrofitInstance().create(serviceClass)
        }
        
    }
}