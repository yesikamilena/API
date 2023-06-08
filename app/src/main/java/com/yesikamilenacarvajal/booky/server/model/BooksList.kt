package com.yesikamilenacarvajal.booky.server.model


import com.google.gson.annotations.SerializedName

data class BooksList(
    @SerializedName("accessInfo")
    val accessInfo: AccessInfo,
    @SerializedName("etag")
    val etag: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("saleInfo")
    val saleInfo: SaleInfo,
    @SerializedName("selfLink")
    val selfLink: String,
    @SerializedName("volumeInfo")
    val volumeInfo: VolumeInfo
)