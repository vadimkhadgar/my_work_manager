package com.vadimbliashuk.applicationbig.ui.goals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.vadimbliashuk.applicationbig.R

class GoalsFragment : Fragment() {

    private lateinit var goalsViewModel: GoalsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        goalsViewModel =
            ViewModelProviders.of(this).get(GoalsViewModel::class.java)
        return inflater.inflate(R.layout.fragment_goals, container, false)
    }
}