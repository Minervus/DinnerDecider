package com.tonynguyen.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Dominoes")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Listens for click on Decide button
        decideButton.setOnClickListener {
            // Generates random integer
            val random = Random()
            // selects random integer within length of the array
            val randomFood = random.nextInt(foodList.count())
            // Change text in selectedFoodTxt element to array index with the number from random
            selectedFoodTxt.text = foodList[randomFood]
        }

        // Listens for click on the add food button
        addFoodButton.setOnClickListener {
            // creates new val called newFood that is the input of the string into the text field
            val newFood = addFoodTxt.text.toString()
            // Adds the new food val to the array foodList
            foodList.add(newFood)
            // Clears the field
            addFoodTxt.text.clear()
            println(foodList)
        }

    }
}
