package com.example.volumecalculator

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cylinder.*

class cylinderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cylinder)


        //Find edit text boxes
        val cylinderHeightText = findViewById<EditText>(R.id.etCylinderHeight)
        val cylinderRadiusText = findViewById<EditText>(R.id.etCylinderRadius)
        val cylinderanswer = findViewById<TextView>(R.id.tvCylinderAnswer)
        cylinderHeightText.requestFocus()

        //Function for cuboid volume
        fun cylinderVolume(){
            val cylinderHeight = cylinderHeightText.getText().toString()
            val cylinderRadius = cylinderRadiusText.getText().toString()

            //Calculate cuboid volume
            val cylinderVolume = (java.lang.Double.parseDouble(cylinderRadius) * java.lang.Double.parseDouble(cylinderRadius)) * (java.lang.Double.parseDouble(cylinderHeight))

            //Set the output type and input the answer
            "%.2f".format(cylinderVolume).toDouble()
            val strCylinderVolume = java.lang.Double.toString(cylinderVolume)
            cylinderanswer.setText(strCylinderVolume)
        }


        //Run answer button
        val cylinderAnswer = findViewById<Button>(R.id.btnCylinderAnswer)
        cylinderAnswer.setOnClickListener {

            //Exception for null value in text boxes
            if(TextUtils.isEmpty(etCylinderHeight.getText().toString()) ||
                TextUtils.isEmpty(etCylinderRadius.getText().toString())){
                Toast.makeText(this, "Empty fields not allowed", Toast.LENGTH_SHORT).show()
            }
            else{
                cylinderVolume()
            }
        }

        //Reset values in text boxes
        val btnCylinderRetry = findViewById<Button>(R.id.btnCylinderRetry)
        btnCylinderRetry.setOnClickListener {
            cylinderHeightText.text.clear()
            cylinderRadiusText.text.clear()
            cylinderanswer.setText("")
            cylinderHeightText.requestFocus()
        }
    }
}
