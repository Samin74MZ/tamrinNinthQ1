package com.example.tamrinninthq1

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.tamrinninthq1.databinding.FragmentProfileBinding

const val FullName = "fullName"
const val UserName = "userName"
const val Email = "email"
const val Phone = "phone"
var isRegister = false
var sharedPreferences: SharedPreferences? = null

class ProfileFragment : Fragment() {
    lateinit var binging: FragmentProfileBinding
    var listOfInfo = mutableListOf<EditText>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binging = FragmentProfileBinding.inflate(layoutInflater, container, false)
        sharedPreferences = this.activity?.getSharedPreferences("Info", Context.MODE_PRIVATE)
        initView()
        return binging.root
    }

    private fun initView() {
        listOfInfo.add(binging.evFullName)
        listOfInfo.add(binging.evUsername)
        listOfInfo.add(binging.evEmail)
//        if (sharedPreferences?.getString(FullName,"")!="") {
//            setInfo()
//            register()
//        }else {
//            register()
//            binging.registerLayout.isVisible= false
//            binging.showInfo.isVisible=true
//        }
        if (isRegister == true) {
            setInfo()
            binging.registerLayout.isVisible = false
            binging.showInfo.isVisible = true
        } else {
            register()
        }

    }

    private fun setInfo() {
        binging.tvFullName.setText(
            sharedPreferences?.getString(
                FullName,
                binging.evFullName.text.toString()
            )
        )
        binging.tvUsername.setText(
            sharedPreferences?.getString(
                UserName,
                binging.evUsername.text.toString()
            )
        )
        binging.tvEmail.setText(
            sharedPreferences?.getString(
                Email,
                binging.evEmail.text.toString()
            )
        )
        binging.tvPhone.setText(
            sharedPreferences?.getString(
                Phone,
                binging.evPhone.text.toString()
            )
        )
    }

    private fun saveInfo() {
        sharedPreferences = this.activity?.getSharedPreferences("Info", Context.MODE_PRIVATE)
        val editor = sharedPreferences?.edit()
        editor?.putString(FullName, binging.evFullName.text.toString())
        editor?.putString(UserName, binging.evUsername.text.toString())
        editor?.putString(Email, binging.evEmail.text.toString())
        editor?.putString(Phone, binging.evPhone.text.toString())
        editor?.putBoolean("isRegister", isRegister)
        editor?.apply()
    }

    private fun register() {
        binging.btnRegister.setOnClickListener {
            if (isCheck()) {
                saveInfo()
                getInfo()
                binging.registerLayout.isVisible = false
                binging.showInfo.isVisible = true
                isRegister = true
            }
        }
    }

    private fun isCheck(): Boolean {
        var result = true

        listOfInfo.forEach {
            if (it.text.isBlank()) {
                it.error = "Can not be empty!"
                result = false
            }
        }
        return result
    }

    private fun getInfo() {
        binging.tvFullName.text = sharedPreferences?.getString(FullName, "")
        binging.tvUsername.text = sharedPreferences?.getString(UserName, "")
        binging.tvEmail.text = sharedPreferences?.getString(Email, "")
        binging.tvPhone.text = sharedPreferences?.getString(Phone, "")

    }
}