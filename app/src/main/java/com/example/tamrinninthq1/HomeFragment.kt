package com.example.tamrinninthq1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.tamrinninthq1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
   lateinit var binding:FragmentHomeBinding
   var likeBtnList= mutableListOf<ImageButton>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
     fun initView(){
         likeBtnList.add(binding.imageButton1)
         likeBtnList.add(binding.imageButton2)
         likeBtnList.add(binding.imageButton3)
         likeBtnList.add(binding.imageButton4)
         likeBtnList.add(binding.imageButton5)
         likeBtnList.add(binding.imageButton6)
         likeBtnList.add(binding.imageButton7)
         likeBtnList.add(binding.imageButton8)
         likeBtnList.add(binding.imageButton9)
         likeBtnList.add(binding.imageButton10)
         likeBtnList.add(binding.imageButton11)
         likeBtnList.add(binding.imageButton12)
     }
    fun like(){
        var like=false
       likeBtnList.forEach {

       }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                true
            }
            R.id.favorite -> {
                findNavController().navigate(R.id.action_homeFragment_to_favoriteFragment)
                true
            }
//            R.id.home -> {
//                true
//            }
            R.id.comingsoon -> {
                findNavController().navigate(R.id.action_homeFragment_to_comingSoonFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}