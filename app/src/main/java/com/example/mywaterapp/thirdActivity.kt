package com.example.mywaterapp


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class thirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val hydrationDataTextView = findViewById<TextView>(R.id.hydra)
        val hydrationData = intent.getStringExtra("hydrationData")

        hydrationDataTextView.text = hydrationData
    }
}
