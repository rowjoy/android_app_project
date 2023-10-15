package com.nec.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import com.nec.androidapp.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main);
        var click_me_button :  Button = findViewById(R.id.Click_me)
        click_me_button.setOnClickListener(){
            val toast = Toast.makeText(this, "Your message here", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 200, 0) // Change Gravity.CENTER to your desired gravity
            toast.show();
            println("Hi");
        }

    }
}

