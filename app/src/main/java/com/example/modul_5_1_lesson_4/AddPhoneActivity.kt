package com.example.modul_5_1_lesson_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.muddzdev.styleabletoast.StyleableToast
import kotlinx.android.synthetic.main.activity_add_phone.*

class AddPhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_phone)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.title = "Add phone"

        MySharedPreference.init(this)
        val type = intent.getIntExtra("type",-1)



        btn_save.setOnClickListener {

            val name = edit_phone_name.text.toString().trim()
            val features = edit_features.text.toString().trim()



            if (name != "" && features != "" && type != -1 && name != " " && features != " "){

                val list = MySharedPreference.obyekString
                list.add(Phone(type,name,features))
                MySharedPreference.obyekString = list

                StyleableToast.makeText(this, "Save", Toast.LENGTH_SHORT, R.style.mytoast_a).show();
                finish()
            }else{
                StyleableToast.makeText(this, "Insufficient information", Toast.LENGTH_SHORT, R.style.mytoast_b).show();
            }

        }

    }
}