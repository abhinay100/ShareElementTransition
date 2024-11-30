package com.example.shareelementtransition

import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionScene.Transition
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater


/**
 * Created by Abhinay on 01/12/24.
 *
 *
 */
class ImageFragment: Fragment(R.layout.fragment_image) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val animation = TransitionInflater.from(requireContext()).inflateTransition(
            android.R.transition.move
        )
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation
    }

}