package com.jaebin.homework.recyclerviewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.AppContext
import com.jaebin.homework.R
import com.jaebin.homework.data.Company
import com.jaebin.homework.data.Title
import com.jaebin.homework.databinding.CompanyListLayoutBinding
import com.jaebin.homework.recyclerviewadapter.companyAdapter

class companyListViewHolder(val item: CompanyListLayoutBinding) : RecyclerView.ViewHolder(item.root) {

    fun bind(outItem: Title<Company>) {
        item.childTitle.text = outItem.title
        item.listBtn.setImageResource(R.drawable.ic_viewlist)
        item.childRecyclerCompany.adapter = companyAdapter(outItem.sumItemList)
        item.childRecyclerCompany.layoutManager =
            LinearLayoutManager(AppContext.instance).also {
                it.orientation = LinearLayoutManager.HORIZONTAL
            }
        item.childRecyclerCompany.setHasFixedSize(true)

    }

}