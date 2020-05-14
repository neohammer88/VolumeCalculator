package com.example.volumecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class chooseShapes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_shapes)

        //Go cuboid volume activity
        val btncuboidActivity: ImageButton = findViewById(R.id.btnCuboid)
        btncuboidActivity.setOnClickListener {
            val intent = Intent(this, cuboidActivity::class.java)
            startActivity(intent)
        }

        //Go cuboid volume activity
        val btncylinderActivity: ImageButton = findViewById(R.id.btnCylinder)
        btncylinderActivity.setOnClickListener {
            val intent = Intent(this, cylinderActivity::class.java)
            startActivity(intent)
        }
    }
}
