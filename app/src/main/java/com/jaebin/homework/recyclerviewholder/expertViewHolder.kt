package com.jaebin.homework.recyclerviewholder

import androidx.annotation.Dimension
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jaebin.homework.AppContext
import com.jaebin.homework.R
import com.jaebin.homework.data.Expert
import com.jaebin.homework.data.TagX
import com.jaebin.homework.databinding.ExpertItemBinding
import com.jaebin.homework.extensionTest.makeStringX

class expertViewHolder(val expertItem: ExpertItemBinding) : RecyclerView.ViewHolder(expertItem.root) {


    fun bind(item: Expert){
        if(item.tagList.makeStringX() == ""){
            expertItem.tagX.text = item.companyName
            expertItem.tagX.setTextSize(Dimension.SP,12F)
        } else{
            expertItem.tagX.text = item.tagList.makeStringX()
            expertItem.hospitalName.text = item.companyName
        }
        expertItem.doctorNameKind.text = item.name+"("+item.typeName+")"
        Glide.with(AppContext.instance)
            .load(item.profileImagePath)
            .placeholder(R.color.grey)
            .into(expertItem.doctorFace)

    }
}





