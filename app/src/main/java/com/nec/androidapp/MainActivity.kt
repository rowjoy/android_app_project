package com.nec.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.nec.androidapp.R.layout.activity_main
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main);
        val clickMeButton :  Button = findViewById(R.id.Click_me);
        val increment : Button = findViewById(R.id.increment);
        clickMeButton.setOnClickListener(){
            val toast = Toast.makeText(this, "Your message here", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 200, 0) // Change Gravity.CENTER to your desired gravity
            toast.show();
        };

        increment.setOnClickListener(){
           randomNumber();
        }


    }

    private fun randomNumber  (){
        val random = Random.nextInt(7);
        val showNumber : TextView = findViewById(R.id.show_value);
        showNumber.text = random.toString();
        val  toast = Toast.makeText(this, random.toString() , Toast.LENGTH_SHORT);
        toast.show();
    }


}

