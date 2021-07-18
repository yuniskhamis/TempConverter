package com.yunis.tempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val celsius: TextView = findViewById(R.id.tempCelsius)


        val resultFahrenheit: TextView = findViewById(R.id.tempFahrenheit)

        val convertButton: Button = findViewById(R.id.button)
        val resetButton: Button = findViewById(R.id.button2)
       convertButton.setOnClickListener{


            val fahrenheitResult: Float = (celsius.text.toString().toFloat() * 9 / 5) + 32
            resultFahrenheit.text = fahrenheitResult.toString()


            val celsiusResult: Float = ((resultFahrenheit.text.toString().toFloat()) - 32) * 5/9
            celsius.text = celsiusResult.toString()


        }

        resetButton.setOnClickListener {
            celsius.text = ""
            resultFahrenheit.text = ""
        }

    }



}


