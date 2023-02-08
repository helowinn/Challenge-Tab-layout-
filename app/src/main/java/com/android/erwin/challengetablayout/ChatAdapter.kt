package com.android.erwin.challengetablayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.erwin.challengetablayout.databinding.ItemChatBinding

class ChatAdapter (private val chatList : List<ChatResponse>) :
    RecyclerView.Adapter<ChatAdapter.ChatHolderView>() {


    inner class ChatHolderView (val binding: ItemChatBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolderView {
        val binding = ItemChatBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ChatHolderView(binding)
    }

    override fun onBindViewHolder(holder: ChatHolderView, position: Int) {
        with(holder){
            with(chatList[position]){
                binding.tvUsername.text = username
                binding.tvChat.text = chat
                binding.tvDate.text = date

            }
        }
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

}