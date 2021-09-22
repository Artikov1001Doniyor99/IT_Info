package com.example.modul_5_1_lesson_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        btn_menu.setOnClickListener {
            startActivity(Intent(this,MenuGridActivity::class.java))
        }

        btn_add.setOnClickListener {
            startActivity(Intent(this,AddPhoneListActivity::class.java))
        }

        loadData()

    }

    private fun loadData() {
        MyData.typeListName.add("Iphone")
        MyData.typeListName.add("Samsung")
        MyData.typeListName.add("MI")
        MyData.typeListName.add("Sony")
        MyData.typeListName.add("Huawei")
        MyData.typeListName.add("Artel")
    }
}