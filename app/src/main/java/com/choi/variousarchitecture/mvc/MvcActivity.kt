package com.choi.variousarchitecture.mvc

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.choi.variousarchitecture.databinding.ActivityMainBinding

class MvcActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding=ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(binding.root)
        }
    }

}