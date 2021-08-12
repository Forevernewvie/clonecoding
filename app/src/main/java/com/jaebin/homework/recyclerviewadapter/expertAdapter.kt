package com.jaebin.homework.recyclerviewadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.data.Expert
import com.jaebin.homework.databinding.ExpertItemBinding
import com.jaebin.homework.recyclerviewholder.expertViewHolder

class expertAdapter(val data: List<Expert>) : RecyclerView.Adapter<expertViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): expertViewHolder {
        val binding = ExpertItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return expertViewHolder(binding)
    }

    override fun onBindViewHolder(holder: expertViewHolder, position: Int) {
         holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}
