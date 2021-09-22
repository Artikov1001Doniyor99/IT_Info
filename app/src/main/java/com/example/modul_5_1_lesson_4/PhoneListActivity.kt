package com.example.modul_5_1_lesson_4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_phone_list.*

class PhoneListActivity : AppCompatActivity() {

    lateinit var phoneListAdapter: PhoneListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_list)

        supportActionBar?.title = intent.getStringExtra("title")
        titleColor = Color.BLACK

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


    }

    override fun onStart() {
        super.onStart()
        val type = intent.getIntExtra("type",-1)

        MySharedPreference.init(this)
        val list = MySharedPreference.obyekString

        var listSort = ArrayList<Phone>()

        for (phone in list){
            if(phone.type == type){
                listSort.add(phone)
            }
        }




        phoneListAdapter = PhoneListAdapter(this,listSort,object : ItemClickListPhones{
            override fun onClick(phone: Phone, position: Int) {
                Toast.makeText(this@PhoneListActivity, "Click", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@PhoneListActivity,InfoActivity::class.java)
                intent.putExtra("type",position)
                intent.putExtra("name",phone.name)
                intent.putExtra("info",phone.info)
                startActivity(intent)
            }

        })
        list_phones.adapter = phoneListAdapter
    }

}