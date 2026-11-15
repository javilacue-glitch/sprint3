package com.example.sprint3javierlacueva

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sprint3javierlacueva.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.miCardVelada.titulo = getString(R.string.card_velada_title)
        binding.miCardVelada.subtitulo = getString(R.string.card_velada_subtitle)
        binding.miCardVelada.descripcion = getString(R.string.card_velada_description)
        binding.miCardVelada.textoBotonPrincipal = getString(R.string.card_velada_primary_btn)
        binding.miCardVelada.textoBotonSecundario = getString(R.string.card_velada_secondary_btn)

        binding.miCardVelada.setImagenPrincipal(
            R.drawable.cartel_velada_2027,
            getString(R.string.card_velada_img_desc)
        )
        binding.miCardVelada.setImagenAvatar(
            R.drawable.cartel_velada_2027,
            getString(R.string.card_velada_avatar_desc)
        )

        binding.miCardVelada.setOnAccionPrincipalClickListener {
            Toast.makeText(this, getString(R.string.toast_no_implemented), Toast.LENGTH_SHORT).show()
        }

        binding.miCardVelada.setOnAccionSecundariaClickListener {
            Toast.makeText(this, getString(R.string.toast_no_implemented), Toast.LENGTH_SHORT).show()
        }

        binding.miCardVelada.setOnOpcionesClickListener {
            Toast.makeText(this, getString(R.string.toast_no_implemented), Toast.LENGTH_SHORT).show()
        }
    }
}