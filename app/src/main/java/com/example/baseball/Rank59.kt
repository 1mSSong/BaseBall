package com.example.baseball

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rank59 : AppCompatActivity() {
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rank59)

        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val uri: Uri = Uri.parse("https://m.sports.naver.com/player/index.nhn?from=nx&tab=record&playerId=72443&category=kbo")
            intent.data = uri
            startActivity(intent)
        }
    }
}