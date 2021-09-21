package com.example.modul_5_1_lesson_1

/*1-topshiriq
Dasturda 2 ta activity bor. Birinchi activityda dasturlash tili logosi hamda nomi bo'ladi.
Istalgan bitta item click bo'lganda ikkinchi activityga o'tiladi. Ikkinchi activityda shu dasturlash tili
haqida ma'lumot berilgan bo'ladi. Asosiy oynasi quyidagi rasmda keltirilgan.*/

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var list = ArrayList<ImageData>()
    lateinit var imageBaseAdapter: BaseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

       imageBaseAdapter = ImageBaseAdapter(list)
        grid_View.adapter =imageBaseAdapter

        grid_View.setOnItemClickListener { adapterView, view, i, l ->
                  val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("image",list[i])
            startActivity(intent)
        }

    }

    private fun loadData() {

            list.add(ImageData(R.drawable.android, "Android"))
            list.add(ImageData(R.drawable.java, "Java"))
            list.add(ImageData(R.drawable.python, "Python"))
            list.add(ImageData(R.drawable.mysql, "MySQL"))
            list.add(ImageData(R.drawable.php, "PHP"))

    }
}