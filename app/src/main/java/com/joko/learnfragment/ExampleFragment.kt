package com.joko.learnfragment

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment

class ExampleFragment : Fragment(R.layout.fragment_example) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val itemImageView = view.findViewById<Button>(R.id.button1)
        ViewCompat.setTransitionName(itemImageView, "buton_trans")
    }
}