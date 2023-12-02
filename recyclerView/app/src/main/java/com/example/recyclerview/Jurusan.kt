package com.example.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Jurusan (
    val imgKarakter: Int,
    val namaKarakter: String,
    val descKarakter : String
    ) : Parcelable