package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val person = intent.getParcelableExtra<Person>(MainActivity.EXTRA_PERSON)
        val name = findViewById<TextView>(R.id.tf_name)
        val age = findViewById<TextView>(R.id.tf_age)
        val email = findViewById<TextView>(R.id.tf_email)
        val domisili = findViewById<TextView>(R.id.tf_domisili)
        val status = findViewById<TextView>(R.id.tf_status)

        name.text = "nama: ${person?.name}"
        age.text = "age: ${person?.age.toString()}"
        email.text = "email: ${person?.email}"
        domisili.text = "domisili: ${person?.domicile}"
        status.text = "status pernikahan: ${person?.marriage}"
    }
}