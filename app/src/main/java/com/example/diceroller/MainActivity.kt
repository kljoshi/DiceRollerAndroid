package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var roll_button: Button
    private lateinit var dice_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
        setupClickListener()
    }

    private fun setupView() {
        roll_button = findViewById(R.id.roll_button)
        dice_image = findViewById(R.id.dice_text)
    }

    private fun setupClickListener() {
        roll_button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val diceImage = when((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        dice_image.setImageDrawable(
                ContextCompat.getDrawable(
                        applicationContext,
                        diceImage
                ))
    }
}
