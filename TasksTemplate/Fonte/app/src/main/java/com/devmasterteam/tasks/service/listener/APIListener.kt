package com.devmasterteam.tasks.service.listener

import com.devmasterteam.tasks.service.model.PriorityModel

interface APIListener<T> {

    fun onSuccess(result: List<PriorityModel>)

    fun onFailure(message : String)

}