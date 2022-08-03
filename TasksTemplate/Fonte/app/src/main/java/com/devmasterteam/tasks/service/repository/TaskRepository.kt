package com.devmasterteam.tasks.service.repository

import com.devmasterteam.tasks.service.repository.remote.RetrofitClient
import com.devmasterteam.tasks.service.repository.remote.TaskService

class TaskRepository {

    // chamada remota
    private val remote =  RetrofitClient.getService(TaskService::class.java)
}