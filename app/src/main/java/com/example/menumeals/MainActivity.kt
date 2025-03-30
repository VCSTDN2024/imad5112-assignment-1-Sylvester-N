package com.example.menumeals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    //declare variables

    private var timeInsert: EditText? = null
    private var displayTime: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//declare widgets

        timeInsert = findViewById(R.id.timeInsert)
        displayTime = findViewById(R.id.displayTime)

        //declare buttons

        val btnReset = findViewById<Button>(R.id.BtnReset)
        val btnCheck = findViewById<Button>(R.id.BtnCheck)

        val btnBF = findViewById<Button>(R.id.BtnBF)
        val btnL = findViewById<Button>(R.id.BtnL)
        val btnD = findViewById<Button>(R.id.BtnD)

        val btnQB = findViewById<Button>(R.id.BtnQB)
        val btnDessert = findViewById<Button>(R.id.BtnDessert)
        val btnS = findViewById<Button>(R.id.BtnS)

        val btnExit = findViewById<Button>(R.id.BtnExit)

        //link buttons to functions

        btnReset.setOnClickListener {
            timeInsert?.text?.clear()
            displayTime?.text = ""
        }

        //checkTime fun from previous activity

        btnCheck.setOnClickListener {
            checkTime()
        }

        //link buttons to activities

        btnBF.setOnClickListener {
            val intent = Intent(this, Breakfast::class.java)
            startActivity(intent)
        }
        btnL.setOnClickListener {
            val intent = Intent(this, Lunch::class.java)
            startActivity(intent)
        }
        btnD.setOnClickListener {
            val intent = Intent(this, Dinner::class.java)
            startActivity(intent)
        }
        btnS.setOnClickListener {
            val intent = Intent(this, Snack::class.java)
            startActivity(intent)
        }
        btnQB.setOnClickListener {
            val intent = Intent(this, QuickBite::class.java)
            startActivity(intent)
        }
        btnDessert.setOnClickListener {
            val intent = Intent(this, Dessert::class.java)
            startActivity(intent)
        }
        //declare exit button
        btnExit.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }
    }


    //isNotEmpty fun assisted by Germini (Android Studio feature)
    //isNotEmpty fun to ensure the user does not leave the EditText empty upon checking their desired meal of the day

    private fun isNotEmpty(): Boolean {
        var b = true
        val timeText = timeInsert?.text.toString().trim()
        if (timeText.isEmpty()) {
            timeInsert?.error = "Input required!"
            b = false

        } else {
            val time = timeText.toIntOrNull()
            if (time == null) {
                timeInsert?.error = "Invalid input. Please enter a valid number."
                b = false
            }
        }
        return b
    }


    //checkTime private function from previous class activity done in lecture (Check Generation App)
    // including IMAD5112 module manual and Mr Kincade Garanganga.

    private fun checkTime() {
        if (isNotEmpty()) {
            val timeText = timeInsert?.text.toString().trim()
            val time = timeText.toIntOrNull()
            if (time != null) {
                when (time) {

                    //Range for diferent times of day, for specific meals of the day
                    // (e.g:600 - 6am = Breakfast)

                    in 600..1059 -> displayTime?.text = "Breakfast"
                    in 1100..1259 -> displayTime?.text = "Light-Snack"
                    in 1300..1559 -> displayTime?.text = "Lunch"
                    in 1600..1859 -> displayTime?.text = "Quick-Bite"
                    in 1900..2159 -> displayTime?.text = "Dinner"
                    in 2200..2230 -> displayTime?.text = "Dessert"

                    //else -> displayTime?.text = "No meals served at this time of day!"
                    //else fun, any input outside of given range will return this message

                    else -> {
                        displayTime?.text = "No meals served at this time of day!"
                    }
                }
            }
        }
    }
}