package com.example.multi_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("name")
        val job = intent.getStringExtra("job")
        val company = intent.getStringExtra("company")

        val nameValue = findViewById<TextView>(R.id.nameValue)
        val jobValue = findViewById<TextView>(R.id.jobValue)
        val companyValue = findViewById<TextView>(R.id.companyValue)

        nameValue.text = "Nom : $name"
        jobValue.text = "Job: $job"
        companyValue.text = "Company: $company"

        val confirmButton = findViewById<Button>(R.id.start_third_activity)
        confirmButton.setOnClickListener{

            val intent = Intent(this, ThirdActivity::class.java)

            val nameText = nameValue.text.toString()
            val jobText = jobValue.text.toString()
            val companyText = companyValue.text.toString()

            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", nameText)
            intent.putExtra("job", jobText)
            intent.putExtra("company", companyText)
            startActivity(intent)
        }
    }
}