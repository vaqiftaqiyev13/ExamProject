package com.vagif_tagiyev.examproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var travel =  supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView, Fragment())
        travel.commit()

        Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
            override fun run() {
               travel = supportFragmentManager.beginTransaction()
                travel.replace(R.id.fragmentContainerView,PassengerFragment())
                travel.commit()
            }
        }, 3000)
    }
}