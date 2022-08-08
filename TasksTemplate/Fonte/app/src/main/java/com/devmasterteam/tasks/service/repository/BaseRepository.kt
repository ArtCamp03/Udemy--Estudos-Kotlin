package com.devmasterteam.tasks.service.repository

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import com.devmasterteam.tasks.R
import com.devmasterteam.tasks.service.constants.TaskConstants
import com.devmasterteam.tasks.service.listener.APIListener
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

open class BaseRepository(val context: Context) {

    private fun failResponse(str: String): String {
        return Gson().fromJson(str, String::class.java)
    }

    fun <T> executeCall(call: Call<T>, listener: APIListener<T>) {
        call.enqueue(object : Callback<Boolean> {
            override fun onResponse(call: Call<Boolean>, response: Response<Boolean>) {
                if (response.code() == TaskConstants.HTTP.SUCCESS) {
                    response.body()?.let { listener.onSuccess(it) }
                } else {
                    listener.onFailure(failResponse(response.errorBody()!!.string()))
                }
            }

            override fun onFailure(call: Call<Boolean>, t: Throwable) {
                listener.onFailure(context.getString(R.string.ERROR_UNEXPECTED))
            }

        })
    }

    fun isConnectionAvailable(): Boolean {
        var result = false

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
       if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
           val activityNet = cm.activeNetwork ?: return false
           val networkCapabilities = cm.getNetworkCapabilities(activityNet) ?: return false
           result = when {
               networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
               networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
               else -> false
           }
       }else{
           if(cm.activeNetworkInfo 1= null) {
               result = when (cm.activeNetworkInfo!!.type) {
                   ConnectivityManager.TYPE_WIFI -> true
                   ConnectivityManager.TYPE_MOBILE -> true
                   ConnectivityManager.TYPE_ETHERNET -> true
                   else -> false
               }
           }
       }

        return result
    }
}