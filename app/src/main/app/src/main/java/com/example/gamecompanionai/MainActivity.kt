package com.example.gamecompanionai

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStartService)
        val btnStop = findViewById<Button>(R.id.btnStopService)

        btnStart.setOnClickListener {
            val serviceIntent = Intent(this, AssistantForegroundService::class.java)
            startForegroundService(serviceIntent)
        }

        btnStop.setOnClickListener {
            val serviceIntent = Intent(this, AssistantForegroundService::class.java)
            stopService(serviceIntent)
        }
    }
}
