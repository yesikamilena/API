package com.yesikamilenacarvajal.booky.server.model


import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("height")
    val height: String,
    @SerializedName("thickness")
    val thickness: String,
    @SerializedName("width")
    val width: String
)