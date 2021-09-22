package com.example.modul_5_1_lesson_4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_menu_grid.*

class MenuGridActivity : AppCompatActivity() {

    lateinit var typeAdapter: TypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_grid)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.title = "Phones"
        titleColor = Color.BLACK

        typeAdapter = TypeAdapter(this,MyData.typeListName,object : ItemGridOnClick{
            override fun onClick(type: String, position: Int) {
                val intent = Intent(this@MenuGridActivity,PhoneListActivity::class.java)
                intent.putExtra("type",position)
                intent.putExtra("title",type)
                startActivity(intent)
            }
        })
        grid_View.adapter = typeAdapter
    }
}