package com.example.sprint3javierlacueva

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.DrawableRes
import com.example.sprint3javierlacueva.databinding.ViewMyCardBinding

class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding = ViewMyCardBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    var titulo: String
        get() = binding.txtTituloCard.text.toString()
        set(value) {
            binding.txtTituloCard.text = value
        }

    var subtitulo: String
        get() = binding.txtSubtituloCard.text.toString()
        set(value) {
            binding.txtSubtituloCard.text = value
        }

    var descripcion: String
        get() = binding.txtDescripcionCard.text.toString()
        set(value) {
            binding.txtDescripcionCard.text = value
        }

    var textoBotonPrincipal: String
        get() = binding.btnAccionPrincipal.text.toString()
        set(value) {
            binding.btnAccionPrincipal.text = value
        }

    var textoBotonSecundario: String
        get() = binding.btnAccionSecundaria.text.toString()
        set(value) {
            binding.btnAccionSecundaria.text = value
        }

    fun setImagenPrincipal(@DrawableRes imagenResId: Int, descripcionAccesible: String? = null) {
        binding.imgPrincipalCard.setImageResource(imagenResId)
        if (descripcionAccesible != null) {
            binding.imgPrincipalCard.contentDescription = descripcionAccesible
        }
    }

    fun setImagenAvatar(@DrawableRes imagenResId: Int, descripcionAccesible: String? = null) {
        binding.imgAvatarCard.setImageResource(imagenResId)
        if (descripcionAccesible != null) {
            binding.imgAvatarCard.contentDescription = descripcionAccesible
        }
    }

    fun setOnAccionPrincipalClickListener(listener: () -> Unit) {
        binding.btnAccionPrincipal.setOnClickListener {
            listener()
        }
    }

    fun setOnAccionSecundariaClickListener(listener: () -> Unit) {
        binding.btnAccionSecundaria.setOnClickListener {
            listener()
        }
    }

    fun setOnOpcionesClickListener(listener: () -> Unit) {
        binding.btnOpcionesCard.setOnClickListener {
            listener()
        }
    }
}