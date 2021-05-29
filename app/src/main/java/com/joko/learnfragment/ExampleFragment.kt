package com.joko.learnfragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment

class ExampleFragment (val repository: ExampleRepository) : Fragment(R.layout.fragment_example) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val someInt = requireArguments().getInt("some_int")
        Log.i("Fragment", "onViewCreated: $someInt")
    }
}