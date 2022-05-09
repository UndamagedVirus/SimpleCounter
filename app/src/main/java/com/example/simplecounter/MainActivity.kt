package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    var counter = 0
    private lateinit var countertxt : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    countertxt = findViewById(R.id.countertxt)
    }

    fun plusNumber(view: View) {
        counter += 1
        countertxt.text = counter.toString()
        Toast.makeText(this, "Plus Has Been Pressed", Toast.LENGTH_LONG).show()
    }

    fun minusNumber(view: View) {
        counter -= 1
        countertxt.text = counter.toString()
        Toast.makeText(this, "Minus Has Been Pressed", Toast.LENGTH_LONG).show()
    }

    fun aboutBtn(view: View) {
        Toast.makeText(this, "First App Properly Made. 09/05/22", Toast.LENGTH_LONG).show()
    }

}


