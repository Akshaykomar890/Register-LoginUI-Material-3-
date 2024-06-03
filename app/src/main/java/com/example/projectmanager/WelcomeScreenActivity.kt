package com.example.projectmanager

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectmanager.databinding.ActivityOpeningScreenBinding

class WelcomeScreenActivity:AppCompatActivity() {
    lateinit var binding: ActivityOpeningScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityOpeningScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.WelcomeCreateAccBtn.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
        binding.CreateLoginBtn.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}