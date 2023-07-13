package com.example.testingondraws.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testingondraws.model.User

class UserViewModel : ViewModel() {
    private val _userLiveData = MutableLiveData<User>()
    val userLiveData: LiveData<User> = _userLiveData

    fun loadUser() {
        val user = User("John Doe", 25)
        _userLiveData.value = user
    }
}