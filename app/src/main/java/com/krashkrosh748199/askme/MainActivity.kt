package com.krashkrosh748199.askme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnFirst)
            val etFirst = findViewById<EditText>(R.id.etFirst)
            val etLast = findViewById<EditText>(R.id.etLast)
            val etDate = findViewById<EditText>(R.id.etDate)
            val etCountry = findViewById<EditText>(R.id.etCountry)
        btnApply.setOnClickListener{
            val enteredName = etFirst.text.toString()
            val enteredName1 = etLast.text.toString()
            val enteredName2 = etDate.text.toString()
            val enteredName3 = etCountry.text.toString()

            Log.d("MainActivity","$enteredName $enteredName1, born on $enteredName2, from $enteredName3 just applied to the formula.")

        }
    }
}