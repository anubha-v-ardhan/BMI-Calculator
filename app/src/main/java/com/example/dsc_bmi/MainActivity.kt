package com.example.dsc_bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val h = height.text.toString().toFloat() / 100 //height converted to meters
            val w = weight.text.toString().toFloat()
            val res = w/(h*h) // formula for BMI
            result.text = "%.2f".format(res) //to display only 2 decimal place
        }
    }
}