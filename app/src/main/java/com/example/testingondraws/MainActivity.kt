package com.example.testingondraws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.example.testingondraws.databinding.ActivityMainBinding
import com.example.testingondraws.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel.userLiveData.observe(this) {user ->
            binding.nameTextView.text = user.name
            binding.ageTextView.text = user.age.toString()
        }

        binding.loadButton.setOnClickListener {
            viewModel.loadUser()
        }
    }
}