package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent = findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v : View){
        val nama = findViewById<EditText>(R.id.txt_name)
        val age = findViewById<EditText>(R.id.txt_age)
        val email = findViewById<EditText>(R.id.txt_email)
        val domisili = findViewById<EditText>(R.id.txt_domisili)
        val status = findViewById<EditText>(R.id.txt_marriage)


        when (v.id){
            R.id.button -> run {
                val person = Person (
                    nama.text.trim().toString(),
                    age.text.toString().toInt(),
                    email.text.trim().toString(),
                    domisili.text.trim().toString(),
                    status.text.trim().toString(),
                )
                val intentObjek = Intent(this@MainActivity, DetailActivity::class.java)
                intentObjek.putExtra(EXTRA_PERSON, person)
                startActivity(intentObjek)
            }
        }
    }
    companion object{const val EXTRA_PERSON = "extra_person"}
}