package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.youtubeplayerview.*

class VidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vid)

        findViewById<Button>(R.id.btn_sample1).setOnClickListener {
            startActivity(Intent(this, Sample1Activity::class.java))
        }

        findViewById<Button>(R.id.btn_sample2).setOnClickListener {
            startActivity(Intent(this, Sample2Activity::class.java))
        }

        findViewById<Button>(R.id.btn_sample3).setOnClickListener {
            startActivity(Intent(this, Sample3Activity::class.java))
        }

        findViewById<Button>(R.id.btn_sample4).setOnClickListener {
            startActivity(Intent(this, Sample4Activity::class.java))
        }

        findViewById<Button>(R.id.btn_sample5).setOnClickListener {
            startActivity(Intent(this, Sample5Activity::class.java))
        }

        findViewById<Button>(R.id.btn_sample6).setOnClickListener {
            startActivity(Intent(this, Sample6Activity::class.java))
        }

        findViewById<Button>(R.id.btn_sample7).setOnClickListener {
            startActivity(Intent(this, Sample7Activity::class.java))
        }

        findViewById<Button>(R.id.btn_sample8).setOnClickListener {
            startActivity(Intent(this, Sample8Activity::class.java))
        }


    }

}