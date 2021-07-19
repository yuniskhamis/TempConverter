package com.yunis.tempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val celsius: EditText= findViewById(R.id.tempCelsius)


        val resultFahrenheit: EditText = findViewById(R.id.tempFahrenheit)

        val convertButton: Button = findViewById(R.id.button)
        val resetButton: Button = findViewById(R.id.button2)
       convertButton.setOnClickListener{

if (resultFahrenheit.text.toString().isEmpty()) {
    val fahrenheitResult: Float = (celsius.text.toString().toFloat() * 9 / 5) + 32
    resultFahrenheit.setText(fahrenheitResult.toString())
} else {
    val celsiusResult: Float = (resultFahrenheit.text.toString().toFloat() - 32) * 5 / 9
    celsius.setText(celsiusResult.toString())
}


        }

        resetButton.setOnClickListener {
            celsius.setText("")
            resultFahrenheit.setText("")
        }

    }



}


