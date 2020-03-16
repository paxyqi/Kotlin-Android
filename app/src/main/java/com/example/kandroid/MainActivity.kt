package com.example.kandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RatingBar
import android.widget.RatingBar.OnRatingBarChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity Started")
        val Mbut = findViewById<Button>(R.id.mainBut)
        val Mtext = findViewById<TextView>(R.id.textDate)
        Mbut.setOnClickListener{_-> Mtext.setText("I love U so much")}
        val rateStar = findViewById<RatingBar>(R.id.rateStar)
        //rateStar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener())
        rateStar.setOnRatingBarChangeListener(OnRatingBarChangeListener { _, rating, _ ->
            Log.e(
                "------------",
                "当前的评价等级：$rating"
            )
        })
    }
}
