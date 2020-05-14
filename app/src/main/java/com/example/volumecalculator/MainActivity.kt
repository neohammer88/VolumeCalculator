package com.example.volumecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Choose shapes
        val btnShapes = findViewById<Button>(R.id.btnShape)
        btnShapes.setOnClickListener {
            val intent = Intent(this, chooseShapes::class.java)
            startActivity(intent)
        }

        //End application
        val btnExit = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}
