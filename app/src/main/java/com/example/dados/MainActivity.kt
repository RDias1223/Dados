package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button= findViewById(R.id.roll_Button)
        rollButton.setOnClickListener{
            girarDado()
        }

    }

    private fun girarDado() {
        val resultText:TextView= findViewById(R.id.result_text)
        val randomInt=Random.nextInt(65)+1
        resultText.text=randomInt.toString()
    }

}