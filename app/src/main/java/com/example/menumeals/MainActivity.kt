/* Referencing List */
/* Binding Youtube video:https://youtu.be/By1jrbOTUF8?si=jlPpJxhEdaz-PTjI*/

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
import kotlin.text.clear
import kotlin.text.isEmpty
import kotlin.text.toIntOrNull
import kotlin.text.trim
import com.example.menumeals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setContentView(binding.root)

        binding.BtnReset.setOnClickListener {
            binding.timeInsert.text.clear()
            binding.displayTime.text = ""
        }

        binding.BtnCheck.setOnClickListener {
            checkTimeAndNavigate()
        }

        //exit button

        val btnExit = findViewById<Button>(R.id.BtnExit)

        // Set a click listener for the button

        btnExit.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }
    }

    //check if user input is empty
    // if empty, display error message and not allow user to continue to next activity when the text field is empty

    private fun isNotEmpty(): Boolean {
        var b = true
        val timeText = binding.timeInsert.text.toString().trim()
        if (timeText.isEmpty()) {
            binding.timeInsert.error = "Input required!"
            b = false
        } else {
            val time = timeText.toIntOrNull()
            if (time == null) {
                binding.timeInsert.error = "Invalid input. Please enter a valid number."
                b = false
            }
        }
        return b
    }

    //check time of day and navigate to corresponding activity

    private fun checkTimeAndNavigate() {
        if (isNotEmpty()) {
            val timeText = binding.timeInsert.text.toString().trim()
            val time = timeText.toIntOrNull()
            if (time != null) {
                val intent = when (time) {

                    in 600..1059 -> Intent(this, Breakfast::class.java)
                    in 1100..1259 -> Intent(this, Snack::class.java)
                    in 1300..1559 -> Intent(this, Lunch::class.java)
                    in 1600..1859 -> Intent(this, QuickBite::class.java)
                    in 1900..2159 ->Intent(this, Dinner::class.java)
                    in 2200..2230 -> Intent(this, Dessert::class.java)

                    else -> {
                        binding.displayTime.text = "No meals are served at this time of day."

                        return
                    }
                }
                startActivity(intent)
            }
        }
    }
}