package com.choi.variousarchitecture.data

import com.google.gson.annotations.SerializedName
import java.util.Date

data class TodoDto(
    @SerializedName("id")
    val id:Int,
    @SerializedName("title")
    val title:String,
    @SerializedName("description")
    val description:String,
    @SerializedName("status")
    val status:String,
    @SerializedName("dueDate")
    val dueDate:Date
)
