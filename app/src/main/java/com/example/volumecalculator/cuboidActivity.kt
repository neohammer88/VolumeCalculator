package com.example.volumecalculator

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cuboid.*

class cuboidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuboid)

        //Find edit text boxes
            val heightText = findViewById<EditText>(R.id.edtTextCuboidHeight)
            val widthText = findViewById<EditText>(R.id.edtTextCuboidWidth)
            val depthText = findViewById<EditText>(R.id.edtTextCuboidDepth)
            val answerText = findViewById<TextView>(R.id.txtViewCuboidAnswer)

        //Function for cuboid volume
        fun cuboidVolume(){
            val height = heightText.getText().toString()
            val width = widthText.getText().toString()
            val depth = depthText.getText().toString()
            //Calculate cuboid volume
            val cuboidVolume = (java.lang.Double.parseDouble(height) * java.lang.Double.parseDouble(width) * java.lang.Double.parseDouble(depth))

            //Set the output type and input the answer
            "%.2f".format(cuboidVolume).toDouble()
            val strVolume = java.lang.Double.toString(cuboidVolume)
            answerText.setText(strVolume)
        }

        //Run answer button
        val btncuboidAnswer = findViewById<Button>(R.id.btnCuboidAnswer)
        btncuboidAnswer.setOnClickListener {

            //Exception for null value in text boxes
            if(TextUtils.isEmpty(edtTextCuboidHeight.getText().toString()) ||
                    TextUtils.isEmpty(edtTextCuboidDepth.getText().toString()) ||
                    TextUtils.isEmpty(edtTextCuboidWidth.getText().toString())){
                Toast.makeText(this, "Empty fields not allowed", Toast.LENGTH_SHORT).show()
            }
            else{
                cuboidVolume()
            }
        }

        //Reset values in text boxes
        val btnReset = findViewById<Button>(R.id.btnReset)
        btnReset.setOnClickListener {
            heightText.text.clear()
            widthText.text.clear()
            depthText.text.clear()
            answerText.setText("")
            heightText.requestFocus()
        }
    }
}
