package com.vagif_tagiyev.examproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var travel =  supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView, Fragment())
        travel.commit()

        Handler(Looper.getMainLooper()).postDelayed({
            travel = supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,PassengerFragment())
                addToBackStack(null)
                commit()
            }
        }, 3000)
    }
}