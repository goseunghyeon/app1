package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Sample1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1)

        val youTubePlayerView = findViewById<YouTubePlayerView>(R.id.you_tube_player_view)
        youTubePlayerView.play(VIDEO_ID)
    }

    companion object {
        private const val VIDEO_ID ="dKSnCGKiglQ"
    }

}