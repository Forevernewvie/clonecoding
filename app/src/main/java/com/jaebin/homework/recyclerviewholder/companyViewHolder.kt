package com.jaebin.homework.recyclerviewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jaebin.homework.AppContext
import com.jaebin.homework.data.Company
import com.jaebin.homework.databinding.CompanyItemBinding

class companyViewHolder(val companyitem: CompanyItemBinding) : RecyclerView.ViewHolder(companyitem.root) {

    fun bind(item: Company){
        companyitem.hospitalAddr.text = item.address
        companyitem.hospitalAddrEtc.text = item.addressEtc
        companyitem.hospitalName.text = item.companyName
        Glide.with(AppContext.instance)
            .load(item.introPath)
            .into(companyitem.hospitalImg)
    }


}