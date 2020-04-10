package com.gasoil.majukitabersama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gasoil.majukitabersama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        binding.txtMainSPBU.text = getString(R.string.spbu)
        binding.txtMainRetester.text = "RETESTER"
        binding.txtMainSPPBE.text = "SPPBE"
    }
}
