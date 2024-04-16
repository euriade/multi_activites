package com.example.multi_activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val name = intent.getStringExtra("name")
        val job = intent.getStringExtra("job")
        val company = intent.getStringExtra("company")

        val nameShow = findViewById<TextView>(R.id.nameShow)
        val jobShow = findViewById<TextView>(R.id.jobShow)
        val companyShow = findViewById<TextView>(R.id.companyShow)

        nameShow.text = name
        jobShow.text = job
        companyShow.text = company
    }
}