package com.example.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        init()
    }
   private fun init(){
       Glide.with(this)
           .load("https://i2.wp.com/scoopak.com/wp-content/uploads/2013/12/Green-Tree-Nature-Autumn-Spring-Hd-Wallpaper-scaled.jpg")
           .placeholder(R.mipmap.ic_launcher).into(imageView1)

   }


}