package com.example.recyclerview


import JurusanAdapter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class MainActivity : AppCompatActivity() {
    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val jurusanList = listOf(
            Jurusan(R.drawable.weiying,
                "Wei Ying",
                "Mikir Dulu Gaess"
                ),
            Jurusan(R.drawable.image3, "Wei Wuxian", "Sini Kamu"),
            Jurusan(R.drawable.image2, "Lan Zhan", "Waduh")

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_gambar)
        recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = JurusanAdapter(this, jurusanList){
                val intent = Intent(this, DetailKarakterActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
        }


        }
    }
