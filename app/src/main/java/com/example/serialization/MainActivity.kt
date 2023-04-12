package com.example.serialization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name: EditText = findViewById(R.id.input_1)
        var email: EditText = findViewById(R.id.input_2)
        var gender: Spinner = findViewById(R.id.spinner)
        var button: Button=findViewById(R.id.button_first)

        // Assign list & style to spinner using adapter
        var adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this@MainActivity,
            R.array.Genders,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        gender.setAdapter(adapter)


        button.setOnClickListener {

                if (name.text.isNotEmpty() && email.text.isNotEmpty()) {
                    var intent = Intent(this, Activity2::class.java)
                    intent.putExtra("Gender", gender.selectedItem.toString())
                    intent.putExtra("name", name.text.toString())
                    intent.putExtra("email", email.text.toString())
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Please fill in the fields",
                        Toast.LENGTH_SHORT
                    ).show()
                }

        }

    }
}