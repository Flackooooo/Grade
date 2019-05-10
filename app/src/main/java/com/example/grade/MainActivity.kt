package com.example.grade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var java = 0
    var network = 0
    var database = 0

    var total = 0
    var ave = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTotal.setOnClickListener {
            java = editTextJava.text.toString().toInt()
            network = editTextNetwork.text.toString().toInt()
            database = editTextDatabase.text.toString().toInt()
            total = java + network + database
            editTextTotal.setText(total)
        }
        buttonAvarage.setOnClickListener {
            java = editTextJava.text.toString().toInt()
            network = editTextNetwork.text.toString().toInt()
            database = editTextDatabase.text.toString().toInt()
            ave = total/3
            editTextAvarage.setText(ave)
        }
    }
}
