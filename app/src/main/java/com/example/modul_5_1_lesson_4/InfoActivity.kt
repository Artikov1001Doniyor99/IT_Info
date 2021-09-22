package com.example.modul_5_1_lesson_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.core.graphics.toColor
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val type = intent.getIntExtra("type",-1)

        var name = intent.getStringExtra("name")
        var info = intent.getStringExtra("info")

        MySharedPreference.init(this)


        info_tv.text = "$info"

        supportActionBar?.title = name





    }
}