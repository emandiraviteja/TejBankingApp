package com.raviteja.tejbankingapp.screens.card_settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.raviteja.tejbankingapp.R
import com.raviteja.tejbankingapp.databinding.CardSettingsBinding
import com.raviteja.tejbankingapp.utils.back
import com.raviteja.tejbankingapp.utils.navigateCardSettingsToResetPin
import com.raviteja.tejbankingapp.utils.showAlerter


class CardSettings : Fragment() {

    private lateinit var viewModel: CardSettingsViewModel
    private lateinit var binding: CardSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = CardSettingsBinding.inflate(inflater,container,false)

        viewModel = ViewModelProvider(this)[CardSettingsViewModel::class.java]


        setViews()

        return binding.root
    }

    private fun setViews() {
        binding.apply {

            setButtons()
            val expenses =  expensesSeek.progress

        }
    }

    private fun setButtons() {
        binding.apply {
            btnBack.setOnClickListener { back() }
            btnResetPin.setOnClickListener {
//                findNavController().navigate(R.id.action_cardSettings_to_resetPin)
                navigateCardSettingsToResetPin()
            }
            btnBlockCard.setOnClickListener {
                showAlerter("Blocking Card","Card Blocking...", R.drawable.ic_block)
            }

        }
    }



}