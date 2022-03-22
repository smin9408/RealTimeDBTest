package com.example.realtimedbtest.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realtimedbtest.R
import com.example.realtimedbtest.datas.ChattingData

class ChattingRecyclerAdapter(
    val mContext: Context,
    val mList: List<ChattingData>
) :RecyclerView.Adapter<ChattingRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

        fun bind(data: ChattingData){

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(mContext).inflate(R.layout.chatting_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val data = mList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return mList.size
    }


}