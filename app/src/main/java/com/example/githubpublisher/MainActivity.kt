package com.example.githubpublisher

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.githubpublisher.databinding.ActivityMainBinding
import com.example.sample_demo.SampleUtils.getNameMyself

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getNameMyself()
        binding.wvSample.loadWebUrl("https://cricmatch365.com/")
        binding.wvSample.webViewProp()
    }
}