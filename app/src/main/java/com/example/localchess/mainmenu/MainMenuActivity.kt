package com.example.localchess.mainmenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.localchess.R
import com.example.localchess.host.choice.ChoiceHostActivity

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

    }

    fun onClickCreateHost(view: View) {

    }

    fun onClickConnect(view: View)
    {
        val intent = Intent(this@MainMenuActivity, ChoiceHostActivity::class.java).apply {
            putExtra("userName", "")
        }
        startActivity(intent)
    }
}