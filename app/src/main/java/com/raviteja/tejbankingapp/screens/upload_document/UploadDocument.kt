package com.raviteja.tejbankingapp.screens.upload_document

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.raviteja.tejbankingapp.databinding.UploadDocumentBinding
import com.raviteja.tejbankingapp.utils.back
import com.raviteja.tejbankingapp.utils.navigateUploadDocumentToHome
import com.raviteja.tejbankingapp.utils.showMessage

class UploadDocument : Fragment() {

    private lateinit var binding: UploadDocumentBinding
    private lateinit var viewModel: UploadDocumentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = UploadDocumentBinding.inflate(inflater,container,false)
        viewModel = ViewModelProvider(this)[UploadDocumentViewModel::class.java]


        setViews()


        return binding.root
    }



    private fun setViews() {
        setButtons()
    }

    private fun setButtons() {
        binding.apply {
            // back button
            btnBack.setOnClickListener {
//                findNavController().navigateUp()
                back()
            }

            btnVerify.setOnClickListener {
                navigateUploadDocumentToHome()
//                findNavController().navigate(R.id.action_uploadDocument_to_home)
            }

            btnNeedSupport.setOnClickListener {
                showMessage("need support")
            }
        }
    }


}