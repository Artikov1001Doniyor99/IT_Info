package com.example.modul_5_1_lesson_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_phone_list.*

class AddPhoneListActivity : AppCompatActivity() {

    lateinit var typeAdapter: TypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_list)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.title = "Phone types"

        typeAdapter = TypeAdapter(this,MyData.typeListName,object : ItemGridOnClick{
            override fun onClick(type: String, position: Int) {
                val intent = Intent(this@AddPhoneListActivity, AddPhoneActivity::class.java)
                intent.putExtra("type",position)
                startActivity(intent)
            }

        })

        list_phones.adapter = typeAdapter

    }
}