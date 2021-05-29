package com.joko.learnfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment

class Example2Fragment : Fragment(R.layout.fragment_example2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemImageView = view.findViewById<Button>(R.id.button)
        ViewCompat.setTransitionName(itemImageView, "buton_trans")
    }
}