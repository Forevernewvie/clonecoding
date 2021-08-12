package com.jaebin.homework.recyclerviewholder

import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.data.Consult
import com.jaebin.homework.databinding.ConsultItemBinding
import com.jaebin.homework.extensionTest.longtoDateTime
import com.jaebin.homework.extensionTest.makeString

class consultViewHolder(val item: ConsultItemBinding) : RecyclerView.ViewHolder(item.root){

    fun bind(consultItem: Consult){
        item.answerCnt.text = consultItem.answerCnt.toString()
        item.context.text = consultItem.context
        item.title.text = consultItem.title
        item.timeStamp.text = consultItem.regDate.longtoDateTime()
        item.tag.text = consultItem.tagList.makeString()
    }


}