package com.example.modul_5_1_lesson_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.view.menu.MenuView
import androidx.core.view.marginBottom
import androidx.core.view.marginRight
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.item.view.*

class ImageBaseAdapter(var list: List<ImageData>):BaseAdapter() {
    override fun getCount(): Int = list.size

    override fun getItem(p0: Int): ImageData = list[p0]

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var itemView:View
        if (p1 == null){
            itemView = LayoutInflater.from(p2?.context).inflate(R.layout.item,p2,false)

        }else{
            itemView = p1
        }



        itemView.setPadding(0,0,0,10)
        itemView.text_V.text = list[p0].text
        itemView.image_I.setImageResource(list[p0].img)

        return itemView

    }


}