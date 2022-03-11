package com.example.tamrinninthq1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableRow
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.example.tamrinninthq1.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {
    lateinit var binding: FragmentFavoriteBinding
    var rowList = mutableListOf<TableRow>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        initView()
        return binding.root
    }

    fun initView() {
        rowList.add(binding.r1)
        rowList.add(binding.r2)
        rowList.add(binding.r3)
        rowList.add(binding.r4)
        rowList.add(binding.r5)
        rowList.add(binding.r6)
        rowList.add(binding.r7)
        rowList.add(binding.r8)
        rowList.add(binding.r9)
        rowList.add(binding.r10)
        rowList.add(binding.r11)
        rowList.add(binding.r12)
        for (i in 0..11) {
            if (isLike[i] == true) {
                rowList[i].isVisible = true
            }
        }
    }

}