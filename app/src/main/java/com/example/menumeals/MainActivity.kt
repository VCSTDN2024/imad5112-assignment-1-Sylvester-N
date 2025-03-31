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

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtnReset.setOnClickListener {
            binding.timeInsert.text.clear()
            binding.displayTime.text = ""
        }


        binding.BtnCheck.setOnClickListener {
            checkTimeAndNavigate()
        }

        val btnExit = findViewById<Button>(R.id.BtnExit)

        btnExit.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }


    }

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

    private fun checkTimeAndNavigate() {
        if (isNotEmpty()) {
            val timeText = binding.timeInsert.text.toString().trim()
            val time = timeText.toIntOrNull()
            if (time != null) {
                val intent = when (time) {
                    in 600..1159 -> Intent(this, Breakfast::class.java)
                    in 1200..1359 -> Intent(this, Lunch::class.java)
                    in 1400..1759 -> Intent(this, Snack::class.java)
                    in 1800..2159 -> Intent(this, Dinner::class.java)
                    else -> {
                        binding.displayTime.text = "No meals are served at this time of day."
                        return // Exit the function if the time is invalid
                    }
                }
                startActivity(intent)
            }
        }
    }
}