package com.example.recyclerviewersample.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewersample.R
import com.example.recyclerviewersample.model.FamilyMember

class Adapter(val FamilyMemberList: List<FamilyMember>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MyViewHolder(layoutInflater.inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = FamilyMemberList[position]
        holder.render(item)
        holder.setPrice(position)
        holder.setDescription(position)
    }

    override fun getItemCount(): Int = FamilyMemberList.size
}