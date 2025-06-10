package com.raviteja.tejbankingapp.screens.otp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.raviteja.tejbankingapp.R
import com.raviteja.tejbankingapp.databinding.OtpBinding
import com.raviteja.tejbankingapp.utils.KeyBoardNum
import com.raviteja.tejbankingapp.utils.back
import com.raviteja.tejbankingapp.utils.navigateOtpToUploadDocument
import com.raviteja.tejbankingapp.utils.showMessage

class Otp : Fragment() {

    private lateinit var viewModel: OtpViewModel
    private lateinit var binding: OtpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = OtpBinding.inflate(inflater,container,false)
        viewModel = ViewModelProvider(this)[OtpViewModel::class.java]


        setViews()

        return binding.root
    }

    private fun setViews() {
        binding.apply {


            setUpCustomKeyBoard()

            /** button back **/
            btnBack.setOnClickListener {
                back()
//                findNavController().navigateUp()
            }

            btnResetCode.setOnClickListener {
                showMessage("reset code")
            }

        }
    }



    private fun setUpCustomKeyBoard(){
        KeyBoardNum(binding.keyboardNumLayout,
            binding.otpOne,
            binding.otpTwo,
            binding.otpThree,
            binding.otpFour){
            /**
            after all otp filled do something
             **/

            /**
            after all otp filled do something
             **/

            navigateOtpToUploadDocument()
//            navigateToUploadDocument()
        }
    }


    private fun navigateToUploadDocument(){
        findNavController().navigate(R.id.action_otp_to_uploadDocument)
    }




}