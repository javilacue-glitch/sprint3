package com.example.sprint3javierlacueva

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sprint3javierlacueva.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Listener de clic en el botón personalizado
        binding.btnComprarEntradas.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.toast_no_implemented),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}