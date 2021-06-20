package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Sample2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_sample1, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val youTubePlayerView =
            view?.findViewById<YouTubePlayerView>(R.id.you_tube_player_view)
        youTubePlayerView?.play(VIDEO_ID)

    }

    companion object {
        fun newInstance() = Sample2Fragment()
        private const val VIDEO_ID = "VuZYY2etJmw"
    }
}
