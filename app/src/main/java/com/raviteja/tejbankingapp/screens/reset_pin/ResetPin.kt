package com.raviteja.tejbankingapp.screens.reset_pin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.raviteja.tejbankingapp.databinding.ResetPinBinding
import com.raviteja.tejbankingapp.utils.KeyBoardNum
import com.raviteja.tejbankingapp.utils.back
import com.raviteja.tejbankingapp.utils.checkAllNotEmpty
import com.raviteja.tejbankingapp.utils.showMessage

class ResetPin : Fragment() {
    private lateinit var binding: ResetPinBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = ResetPinBinding.inflate(inflater,container,false)


        setViews()

        return binding.root
    }

    private fun setViews() {
        setUpCustomKeyBoard()
        setButtons()
    }


    private fun setButtons() {
        binding.apply {
            btnBack.setOnClickListener {
                back()
//                findNavController().navigateUp()
            }

            btnSave.setOnClickListener {
               if(checkAllNotEmpty(pinOne,pinTwo,pinThree,pinFour)){
                   showMessage("saved")
                   back()
//                   findNavController().navigateUp()
               }else{
                   showMessage("fill all fields")
               }
            }

        }
    }


    private fun setUpCustomKeyBoard(){
        /**
            after all pin filled do something here
             **/
        KeyBoardNum(binding.keyboardNumLayout,
            binding.pinOne,
            binding.pinTwo,
            binding.pinThree,
            binding.pinFour){
            /**
            after all pin filled do something here
             **/

        }
    }




}