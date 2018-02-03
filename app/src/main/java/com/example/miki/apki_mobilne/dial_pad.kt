package com.example.miki.apki_mobilne

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

//import android.widget.Toast

class dial_pad : AppCompatActivity() {

    val REQUEST_PHONE_CALL = 1

    var numb: String = """"""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val number = findViewById<TextView>(R.id.number)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btndel = findViewById<Button>(R.id.btndel)
        val btn0 = findViewById<Button>(R.id.btn0)
        val btncall = findViewById<FloatingActionButton>(R.id.btncall)
        val btnhash = findViewById<Button>(R.id.btnhash)
        val btnstar = findViewById<Button>(R.id.btnstar)
        val btnhistory = findViewById<Button>(R.id.btnhistory)

        btn1.setOnClickListener {
                numb += "1"
                number.setText(numb)
            }
        btn2.setOnClickListener {
                numb += "2"
                number.setText(numb)
            }
        btn3.setOnClickListener {
                numb += "3"
                number.setText(numb)
            }
        btn4.setOnClickListener {
                numb += "4"
                number.setText(numb)
            }
        btn5.setOnClickListener  {
                numb += "5"
                number.setText(numb)
            }
        btn6.setOnClickListener {
                numb += "6"
                number.setText(numb)
            }
        btn7.setOnClickListener {
                numb += "7"
                number.setText(numb)
            }
        btn8.setOnClickListener {
                numb += "8"
                number.setText(numb)
            }
        btn9.setOnClickListener {
                numb += "9"
                number.setText(numb)
            }
        btndel.setOnClickListener  {
                numb = ""
                number.setText(numb)
            }
        btn0.setOnClickListener {
                numb += "0"
                number.setText(numb)
            }
        btnhash.setOnClickListener {
                numb += "#"
                number.setText(numb)
            }
        btnstar.setOnClickListener {
                numb += "*"
                number.setText(numb)
            }
        btnhistory.setOnClickListener {
            val intent = Intent(this, call_log::class.java)
            startActivity(intent)
        }
        btncall.setOnClickListener{

            if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), REQUEST_PHONE_CALL)

            }else{

                startCall()
            }
        }

    }

    @SuppressLint("MissingPermission")
    private fun startCall() {
        val callintent = Intent(Intent.ACTION_CALL)
        callintent.data = Uri.parse("tel:" + numb)
        startActivity(callintent)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if(requestCode == REQUEST_PHONE_CALL)startCall()
    }


    }









