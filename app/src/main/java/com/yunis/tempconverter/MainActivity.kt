package com.yunis.tempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val celsius: EditText = findViewById(R.id.tempCelsius)
        val fahrenheit: EditText = findViewById(R.id.tempFahrenheit)
        val convertButton: Button = findViewById(R.id.button)
        val resetButton: Button = findViewById(R.id.button2)
        convertButton.setOnClickListener {
            try {
                if (fahrenheit.text.toString().isEmpty()) {
                    val fahrenheitResult: Float = (celsius.text.toString().toFloat() * 9 / 5) + 32
                    fahrenheit.setText(fahrenheitResult.toString())
                } else {
                    val celsiusResult: Float = (fahrenheit.text.toString().toFloat() - 32) * 5 / 9
                    celsius.setText(celsiusResult.toString())
                }
            } catch (NumberFormatException: Exception) {

                val toast = Toast.makeText(this, "Enter an Integer date type, you entered a string", Toast.LENGTH_SHORT)
                toast.show()
            }

        }

        resetButton.setOnClickListener {
            celsius.setText("")
            fahrenheit.setText("")
        }

    }

}


