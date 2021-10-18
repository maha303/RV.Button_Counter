package com.example.rvbutton_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv=findViewById<TextView>(R.id.tv)
        var num=26
        val btnAdd=findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            num++
            tv.text= num.toString()

        }
        val btnSub=findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener {
            num--
            tv.text= num.toString()

        }


    }
}