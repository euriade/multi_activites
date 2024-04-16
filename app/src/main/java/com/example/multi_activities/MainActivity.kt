package com.example.multi_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val sendButton = findViewById<Button>(R.id.start_second_activity)
        sendButton.setOnClickListener{

            val name = findViewById<EditText>(R.id.nameInput)
            val job = findViewById<EditText>(R.id.jobInput)
            val company = findViewById<EditText>(R.id.companyInput)

            val intent = Intent(this, SecondActivity::class.java)

            val setName = name.text.toString()
            val setJob = job.text.toString()
            val setCompany = company.text.toString()

            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", setName)
            intent.putExtra("job", setJob)
            intent.putExtra("company", setCompany)
            startActivity(intent)
        }
    }
}