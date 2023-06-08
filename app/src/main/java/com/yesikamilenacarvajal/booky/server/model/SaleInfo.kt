package com.yesikamilenacarvajal.booky.server.model


import com.google.gson.annotations.SerializedName

data class SaleInfo(
    @SerializedName("country")
    val country: String,
    @SerializedName("isEbook")
    val isEbook: Boolean,
    @SerializedName("saleability")
    val saleability: String
)