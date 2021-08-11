package com.excite.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.text = "Let`s roll"
        rollButton.setOnClickListener{
//            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText = findViewById<TextView>(R.id.result_text)
        val randInt = Random.nextInt(6) + 1
        resultText.text = randInt.toString()
    }
}