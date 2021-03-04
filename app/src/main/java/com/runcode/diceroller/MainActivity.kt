package com.runcode.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var imageContainer: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.rollButtonId)
        button.setOnClickListener {
            rollDice()
        }
        imageContainer = findViewById(R.id.base_image)
    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6) + 1
        when (randomInt) {
            1 -> imageContainer.setImageResource(R.drawable.dice_1)
            2 -> imageContainer.setImageResource(R.drawable.dice_2)
            3 -> imageContainer.setImageResource(R.drawable.dice_3)
            4 -> imageContainer.setImageResource(R.drawable.dice_4)
            5 -> imageContainer.setImageResource(R.drawable.dice_5)
            6 -> imageContainer.setImageResource(R.drawable.dice_6)
        }
    }
}