package com.android.erwin.challengetablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.erwin.challengetablayout.databinding.FragmentChatBinding

class ChatFragment : Fragment() {

    private var _binding : FragmentChatBinding? = null
    private val binding: FragmentChatBinding
    get() = _binding!!

    private lateinit var adapterChat: ChatAdapter
    private lateinit var chatResponse: List<ChatResponse>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChatBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ChatList()

        val layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        binding.rvChat.layoutManager = layoutManager
        adapterChat = ChatAdapter(chatResponse)
        binding.rvChat.adapter = adapterChat

    }

    private fun ChatList(){
        chatResponse = listOf(
            ChatResponse("Langit","wkwkkwkwkw","07/02/2023"),
            ChatResponse("Bulan","hehehhe","07/02/2023"),
            ChatResponse("Bintang","ckckckkc","07/02/2023"),
            ChatResponse("Awan","hahahhaha","07/02/2023"),
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}