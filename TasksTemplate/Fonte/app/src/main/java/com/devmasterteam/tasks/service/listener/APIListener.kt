package com.devmasterteam.tasks.service.listener

import com.devmasterteam.tasks.service.model.PriorityModel

interface APIListener<T> {

    fun onSuccess(result: T)

    fun onFailure(message : String)

}