package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * this activity allows the user to roll a dice and view the result on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button =  findViewById(R.id.button)
        rollButton.setOnClickListener{
            val result = rollDice()
            val toast = Toast.makeText(this,  "Dice Rolled! your result $result", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
    /**
     * Roll the dice and update the screen whit the result
     */
    private fun rollDice():Int {
        /* Creat an object from the class Dice with 6 sides and roll it */
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        /* update the screen whit the dice roll */
        when (diceRoll){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            else -> diceImage.setImageResource(R.drawable.dice_6)
        }
        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
        return diceRoll
    }
}

class Dice(val numSides: Int){

    fun roll(): Int{
        return (1..numSides).random()
    }

}