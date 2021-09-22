package com.example.modul_5_1_lesson_4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_phone_list.view.*

class PhoneListAdapter(context: Context,val list: List<Phone>,var itemClickListPhones: ItemClickListPhones):ArrayAdapter<Phone>(context,R.layout.item_phone_list,list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView:View

        if(convertView != null){
            itemView = convertView
        }else{
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_phone_list,parent,false)
        }

        itemView.txt_item_phone.text = list[position].name
        itemView.card_item_phone.setOnClickListener {
            itemClickListPhones.onClick(list[position],position)
        }

        return itemView
    }

}

interface ItemClickListPhones{
    fun onClick(phone: Phone,position: Int)
}