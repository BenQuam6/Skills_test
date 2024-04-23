package com.example.skillstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayWindow = findViewById<TextView>(R.id.Skilltest1)
        val lucas = findViewById<Button>(R.id.Lucas1)
        val ben = findViewById<Button>(R.id.Ben1)

        lucas.setOnClickListener {
            displayWindow.text = "Lucas"
            Toast.makeText(this, "Good Job Ben", Toast.LENGTH_SHORT).show()
        }

        ben.setOnClickListener {
            displayWindow.text = "Ben"
            Toast.makeText(this, "Good Job Ben", Toast.LENGTH_SHORT).show()
        }






    }
}