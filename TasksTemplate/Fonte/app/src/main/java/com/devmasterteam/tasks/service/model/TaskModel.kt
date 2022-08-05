package com.devmasterteam.tasks.service.model

import com.google.gson.annotations.SerializedName

class TaskModel {

    // esses dados nao serao salvos no banco de dados por que vem direto da API
    @SerializedName("Id")
    var id: Int = 0

    @SerializedName("PriorityId")
    var priorityId: Int = 0

    @SerializedName("Description")
    var description: String = ""

    @SerializedName("DueDate")
    var dueDate: String = ""

    @SerializedName("Complete")
    var complete: Boolean = false

    var priorityDescription: String = ''
}