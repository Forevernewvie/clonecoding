package com.jaebin.homework.recyclerviewholder

import androidx.annotation.Dimension
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jaebin.homework.AppContext
import com.jaebin.homework.R
import com.jaebin.homework.data.Expert
import com.jaebin.homework.data.Profile
import com.jaebin.homework.databinding.ExpertItemBinding
import com.jaebin.homework.databinding.ProfileitemBinding

class proFileViewHolder (val profileItem: ProfileitemBinding) : RecyclerView.ViewHolder(profileItem.root){


    fun bind(item: Profile){
        profileItem.searchContext.setText(item.questionBar)
    }
}