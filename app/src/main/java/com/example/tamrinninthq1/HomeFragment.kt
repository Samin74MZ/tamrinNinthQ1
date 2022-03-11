package com.example.tamrinninthq1

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.tamrinninthq1.databinding.FragmentHomeBinding
var isLike= mutableListOf<Boolean>(false,false,false,false,false,false,false,false,false,false,false,false)
class HomeFragment : Fragment() {
   lateinit var binding:FragmentHomeBinding
   var likeBtnList= mutableListOf<Button>()
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
        initView()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
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

             binding.imageButton1.setOnClickListener {
                 if (isRegister==true) {
                     changeIcon1()
                     isLike[0] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton2.setOnClickListener {
                 if (isRegister==true) {
                     changeIcon2()
                     isLike[1] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton3.setOnClickListener {
                 if (isRegister==true) {
                     changeIcon3()
                     isLike[2] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton4.setOnClickListener {

                 if (isRegister==true) {
                     changeIcon4()
                     isLike[3] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton5.setOnClickListener {
                 if (isRegister==true) {
                     changeIcon5()
                     isLike[4] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton6.setOnClickListener {
                 if (isRegister==true) {
                     changeIcon6()
                     isLike[5] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton7.setOnClickListener {
                 if (isRegister==true) {
                     changeIcon7()
                     isLike[6] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton8.setOnClickListener {

                 if (isRegister==true) {
                     changeIcon8()
                     isLike[7] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton9.setOnClickListener {

                 if (isRegister==true) {
                     changeIcon9()
                     isLike[8] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton10.setOnClickListener {

                 if (isRegister==true) {
                     changeIcon10()
                     isLike[9] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton11.setOnClickListener {

                 if (isRegister==true) {
                     changeIcon11()
                     isLike[10] = true
                 }else{
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                 }
             }
             binding.imageButton12.setOnClickListener {

                 if (isRegister==true) {
                     changeIcon12()
                     isLike[11] = true
                 } else {
                     Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT)
                         .show()
                 }
             }
         }


    private fun changeIcon1() {
        binding.imageButton1.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon2() {
        binding.imageButton2.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon3() {
        binding.imageButton3.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon4() {
        binding.imageButton4.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon5() {
        binding.imageButton5.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon6() {
        binding.imageButton6.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon7() {
        binding.imageButton7.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon8() {
        binding.imageButton8.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon9() {
        binding.imageButton9.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon10() {
        binding.imageButton10.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon11() {
        binding.imageButton11.setIconResource(R.drawable.ic_baseline_favorite_24)
    }
    private fun changeIcon12() {
        binding.imageButton12.setIconResource(R.drawable.ic_baseline_favorite_24)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.profile -> {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
                true
            }
            R.id.favorite -> {
                if (isRegister==true) {
                    findNavController().navigate(R.id.action_homeFragment_to_favoriteFragment)

                }else {
                    Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
                }
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

