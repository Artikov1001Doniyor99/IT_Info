package com.example.modul_5_1_lesson_4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item.view.*

class TypeAdapter(
    context: Context,
    var list: List<String>,
    val itemGridOnClick: ItemGridOnClick
):ArrayAdapter<String>(context,R.layout.item,list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView:View
        if (convertView != null){
            itemView = convertView
        }else{
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        }

        itemView.txt_item_grid.text = list[position]
        itemView.card_Item.setOnClickListener {
            itemGridOnClick.onClick(list[position],position)
        }
        return itemView

    }

}

interface ItemGridOnClick{
    fun onClick(type:String,position: Int)
}