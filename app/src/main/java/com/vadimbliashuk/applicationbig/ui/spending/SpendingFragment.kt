package com.vadimbliashuk.applicationbig.ui.spending

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.vadimbliashuk.applicationbig.R
import com.vadimbliashuk.applicationbig.model.SpendingEntity
import kotlinx.android.synthetic.main.fragment_spending.*

class SpendingFragment : Fragment() {

    private lateinit var spendingViewModel: SpendingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_spending, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        spendingViewModel =
            ViewModelProviders.of(this).get(SpendingViewModel::class.java)

        fab_add_new_spending.setOnClickListener {
            //TODO
        }
    }

    private fun getSpending(description: String, quantity: Int): SpendingEntity {
        return SpendingEntity(description, quantity)
    }
}