package com.joko.learnfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class FragmentFactory(private val exampleRepository: ExampleRepository) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment =
        when (loadFragmentClass(classLoader, className)) {
            ExampleFragment::class.java -> ExampleFragment(exampleRepository)
            else -> super.instantiate(classLoader, className)
        }
}