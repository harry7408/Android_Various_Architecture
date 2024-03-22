package com.choi.variousarchitecture



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.choi.variousarchitecture.databinding.ActivityMainBinding
import com.choi.variousarchitecture.mvc.MvcActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            mvcButton.setOnClickListener {
                startActivity(Intent(this@MainActivity,MvcActivity::class.java))
            }

           /* mvpButton.setOnClickListener {
                startActivity(Intent(this@MainActivity,MvcActivity::class.java))
            }

            mvvmButton.setOnClickListener {
                startActivity(Intent(this@MainActivity,MvcActivity::class.java))
            }

            mviButton.setOnClickListener {
                startActivity(Intent(this@MainActivity,MvcActivity::class.java))
            }*/

        }
    }
}