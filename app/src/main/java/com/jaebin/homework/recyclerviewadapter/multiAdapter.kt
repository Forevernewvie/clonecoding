package com.jaebin.homework.recyclerviewadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.data.*
import com.jaebin.homework.databinding.CompanyListLayoutBinding
import com.jaebin.homework.databinding.ConsultItemBinding
import com.jaebin.homework.databinding.ExpertListLayoutBinding
import com.jaebin.homework.databinding.ProfileitemBinding
import com.jaebin.homework.recyclerviewholder.companyListViewHolder
import com.jaebin.homework.recyclerviewholder.consultViewHolder
import com.jaebin.homework.recyclerviewholder.expertListViewHolder
import com.jaebin.homework.recyclerviewholder.proFileViewHolder
import java.lang.RuntimeException

class multiAdapter(val data: Datas, val pageMap: PageMap, val outerExpertListView: ArrayList<Title<Expert>>, val outerCompanyListView: ArrayList<Title<Company>>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val consultType:Int = 0
    val expertType:Int = 1
    val comapanyType:Int = 2
    val profileType : Int = 4

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val consultItemBinding = ConsultItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val expertListItemBinding = ExpertListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val companyListItemBinding = CompanyListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val profileItemBinding = ProfileitemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return when(viewType) {
            profileType -> proFileViewHolder(profileItemBinding)
            consultType-> consultViewHolder(consultItemBinding)
            expertType-> expertListViewHolder(expertListItemBinding)
            comapanyType-> companyListViewHolder(companyListItemBinding)
            else -> throw RuntimeException()
        }

    }

    override fun getItemViewType(position: Int): Int {
        return when(position){
            data.expertListPosition-1 ->expertType
            data.companyListPosition-1 ->comapanyType
            0 -> profileType
            else -> consultType
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (position==data.expertListPosition-1){
                for(element in outerExpertListView){
                    (holder as expertListViewHolder).bind(element)
                }
        }
        else if(position==data.companyListPosition-1) {
            for (element in outerCompanyListView) {
                (holder as companyListViewHolder).bind(element)
            }
        }
        else if ( position == 0){
                (holder as proFileViewHolder).bind(Profile("박준걸1님이 궁금한 증상을 알려주세요"))
        }
        else  {
            (holder as consultViewHolder).bind(data.consultList[position])
        }
    }


    override fun getItemCount(): Int = pageMap.totalCount
}