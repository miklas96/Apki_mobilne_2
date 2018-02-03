package com.example.miki.apki_mobilne

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class call_log : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_log)

        val btndial = findViewById<Button>(R.id.btndial)

        btndial.setOnClickListener {
            val intent = Intent(this, dial_pad::class.java)
            startActivity(intent)
        }
    }
}
