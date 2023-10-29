package com.nec.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.Gravity
import android.widget.*
import com.nec.androidapp.R.layout.activity_main
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var  diceImage : ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main);
        val emailcontroller : EditText = findViewById(R.id.email_name);
        val passwordController : EditText = findViewById(R.id.Number_password);

        login_buttonOpration("rowjoy@gmail.com", "dhjfdjfhfg");
        val diceButton : Button = findViewById(R.id.Dice_button);
        diceImage = findViewById(R.id.Dice_image);

        diceButton.setOnClickListener(){
            diceRandom();
        }










    }



    private fun diceRandom() {
        val result =  when (Random.nextInt(6)){
            1 -> R.drawable.dice_1;
            2 -> R.drawable.dice_2;
            3 -> R.drawable.dice_3;
            4 -> R.drawable.dice_4;
            5 -> R.drawable.dice_5;
            else -> R.drawable.dice_6;
        }
        diceImage.setImageResource(result);

    }

    private fun login_buttonOpration( email: String, password : String) {
        val login_button : Button = findViewById(R.id.login_button);
    }




}

/*
    private fun randomNumber  (){
        val random = Random.nextInt(7);
        val showNumber : TextView = findViewById(R.id.show_value);
        showNumber.text = random.toString();
        val  toast = Toast.makeText(this, random.toString() , Toast.LENGTH_SHORT);
        toast.show();
    }

    val clickMeButton :  Button = findViewById(R.id.Click_me);
        val increment : Button = findViewById(R.id.increment);
        clickMeButton.setOnClickListener(){
            val toast = Toast.makeText(this, "Your message here", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 200, 0) // Change Gravity.CENTER to your desired gravity
            toast.show();
        };

*/


