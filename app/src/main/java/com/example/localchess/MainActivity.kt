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
        val timer = object : CountDownTimer(300000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var diff = millisUntilFinished
                val textTimer : TextView = findViewById(R.id.viewTimer)
                val secondsInMilli : Long = 1000
                val minutesInMilli = secondsInMilli * 60
                val hoursInMilli = minutesInMilli * 60
                val daysInMilli = hoursInMilli * 24

                diff %= daysInMilli
                diff %= hoursInMilli
                val elepsedMinutes = diff / minutesInMilli
                diff %= minutesInMilli
                val elepsedSecond = diff / secondsInMilli
                val text = "${elepsedMinutes}:${elepsedSecond}"
                textTimer.setText(text)
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