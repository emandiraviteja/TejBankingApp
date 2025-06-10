package com.raviteja.tejbankingapp.screens.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raviteja.tejbankingapp.data.User

class ProfileViewModel : ViewModel() {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    fun updateUser(user: User){
        _user.value = user
    }


}