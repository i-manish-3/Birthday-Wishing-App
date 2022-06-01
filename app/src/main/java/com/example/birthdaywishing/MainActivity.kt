package com.example.birthdaywishing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBtn.setOnClickListener{
            val name = name.editableText.toString()
            val intent = Intent(this,BirthdayActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}