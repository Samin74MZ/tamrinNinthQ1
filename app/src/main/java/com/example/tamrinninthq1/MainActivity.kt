package com.example.tamrinninthq1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.home -> {
//
//                true
//            }
//            R.id.favorite -> {
//
//                true
//            }
//            R.id.coming_soon -> {
//
//                true
//            }
//            R.id.profile -> {
//
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}