package com.example.lab5intent


import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import  android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowDetail(v:View){
        val intent = Intent (this, SecondActivity :: class.java)
        intent.putExtra( "stdData",Student(IdEDT.text.toString(),nameEDT.text.toString(),
            ageEDT.text.toString().toInt()))
        startActivity(intent)
    }
}