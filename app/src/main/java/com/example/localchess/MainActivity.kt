package com.example.localchess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timerTask()
    }
    private fun timerTask() {
        val timer = object : CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val textTimer : TextView = findViewById(R.id.viewTimer)
                textTimer.setText((millisUntilFinished / 1000).toString())
            }
            override fun onFinish() {
                timerFinish()
            }
        }
        timer.start()
    }
    private fun timerFinish()
    {
        Toast.makeText(this, "", Toast.LENGTH_LONG).show()
    }
}