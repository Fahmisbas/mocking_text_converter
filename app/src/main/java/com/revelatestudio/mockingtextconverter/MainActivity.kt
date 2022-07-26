package com.revelatestudio.mockingtextconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.revelatestudio.mockingtextconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnMockText.setOnClickListener {

            val input = binding.edtMockText.text.toString().toCharArray()
            val converted = StringBuilder()
            var c = ' '

            for (i in input.indices) {
                c = if (i % 2 == 0) {
                    Character.toUpperCase(input[i])
                } else {
                    Character.toLowerCase(input[i])
                }
                converted.append(c)
            }

            binding.edtMockText.setText(converted)
        }

    }
}