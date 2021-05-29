package com.joko.learnfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val bundle = bundleOf("some_int" to 666)
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<ExampleFragment>(R.id.fragment_container_view, args = bundle)
            }
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            supportFragmentManager.commit {
                replace<ExampleFragment>(R.id.fragment_container_view, tag = "fragment1", args = bundleOf("some_int" to 666))
                setReorderingAllowed(true)
                addToBackStack(null)
            }

            val fragment: ExampleFragment? =
                supportFragmentManager.findFragmentByTag("fragment1") as ExampleFragment?
            Log.i(TAG, "onCreate: $fragment?")
        }
    }
}