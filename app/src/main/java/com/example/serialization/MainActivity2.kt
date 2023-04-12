package com.example.serialization


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var mainlayout : RelativeLayout = findViewById(R.id.actvity2)

        var username =intent.getStringExtra("Username")
        var email = intent.getStringExtra("Email")
        var gender = intent.getStringExtra("Gender")

        if(gender == "Male")
        {

            mainlayout.setBackgroundColor(ContextCompat.getColor(this@Activity2, R.color.teal_700))
        }
        else
        {
            mainlayout.setBackgroundColor(ContextCompat.getColor(this@Activity2, R.color.purple_200))
        }

        fun getName(): String?
        {
            return username
        }
        fun getemail(): Int?
        {
            return email?.toInt()
        }
        fun getGender(): String?
        {
            return gender
        }
        fun setName(user:String?)
        {
            username=user
        }
        fun setgender(gen:String?)
        {
            gender=gen
        }
        fun setemail(a:String?)
        {
            email=a
        }
    }
}