package com.devmasterteam.tasks.service.model

import com.google.gson.annotations.SerializedName

class PersonModel {

    /*
        "name": "artur",
        "token": "a0/ynjK8I+NVs8wA9NQRnnHZLR+TWZ9K0fOgeT7tmczziIRh4QIVVQ==",
        "personKey": "uaG738aeQvlx2S0fk1mfStHzoHk+7ZnM84iEYeECFVU="
     */

    @SerializedName("token")
    lateinit var token: String

    @SerializedName("perswwonKey")
    lateinit var perswwonKey: String

    @SerializedName("name")
    lateinit var name: String


}