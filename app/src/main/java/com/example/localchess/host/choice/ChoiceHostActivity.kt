package com.example.localchess.host.choice

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.localchess.R

class ChoiceHostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_host)
        //Реализуй функцию, которая находит все хосты
        val listHosts = arrayOf("Host 1", "Host 2", "Host 3", "Host 4") // Простой пример
        val listView : ListView = findViewById(R.id.hostsListView)
        val adapter : ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, listHosts)
        listView.adapter = adapter
    }
    fun onClockUpdateHostList(view: View) {

    }

    fun onClickBack(view: View) {
        finish()
    }
}