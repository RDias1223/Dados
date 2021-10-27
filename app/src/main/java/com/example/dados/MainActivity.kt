package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val mostrarDados:ImageView= findViewById(R.id.Dados_imagens)

        val randomInt=Random.nextInt(6)+1

        val resultadoDrawable =when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        mostrarDados.setImageResource(resultadoDrawable)
    }

}