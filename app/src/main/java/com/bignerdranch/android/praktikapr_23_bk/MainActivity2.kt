package com.bignerdranch.android.praktikapr_23_bk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bignerdranch.android.praktikapr_23_bk.databinding.ActivityMainBinding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ButtonDownHelloworld.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flBlank2Place, Fragment1Activity.newInstance())
                .commit()
        }
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flBlank2Place, Fragment2Activity.newInstance())
            .commit()
    }
}