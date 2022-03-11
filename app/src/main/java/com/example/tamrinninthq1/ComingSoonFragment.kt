package com.example.tamrinninthq1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tamrinninthq1.databinding.FragmentComingSoonBinding

class ComingSoonFragment : Fragment() {
    lateinit var binding: FragmentComingSoonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentComingSoonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.iBtn1.setOnClickListener {
            if (isRegister == true) {
                val sendIntent = Intent()
                sendIntent.apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, binding.tvOne.text)
                    type = "text/plain"
                    val shareIntent = Intent.createChooser(sendIntent, null)
                    startActivity(shareIntent)
                }
            } else {
                Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
            }
        }
        binding.iBtn2.setOnClickListener {
            if (isRegister == true) {
                val sendIntent = Intent()
                sendIntent.apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, binding.tvTwe.text)
                    type = "text/plain"
                    val shareIntent = Intent.createChooser(sendIntent, null)
                    startActivity(shareIntent)
                }
            } else {
                Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
            }
        }
        binding.imageButton3.setOnClickListener {
            if (isRegister == true) {
                val sendIntent = Intent()
                sendIntent.apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, binding.tvThree.text)
                    type = "text/plain"
                    val shareIntent = Intent.createChooser(sendIntent, null)
                    startActivity(shareIntent)
                }
            } else {
                Toast.makeText(activity, "Please enter your info first", Toast.LENGTH_SHORT).show()
            }
        }
    }
}