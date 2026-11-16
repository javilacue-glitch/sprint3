package com.example.sprint3javierlacueva

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.DrawableRes
import com.example.sprint3javierlacueva.databinding.ViewMyCardBinding

**
 * PRINCIPIOS Y CONSIDERACIONES DE DISEÑO APLICADOS EN HOMEACTIVITY (RETO 7):
 *
 * 1. Diseño Visual y Principios UI (CRAP):
 *    - Contraste: Fondo oscuro estilo Netflix (#141414) combinado con texto principal
 *      en blanco (#FFFFFF) y subtítulo en gris claro (#D1D1D1) para crear jerarquía
 *      visual clara (título 28sp en negrita frente a subtítulo 16sp) y destacar el botón rojo.
 *    - Repetición: Uso coherente de la paleta cromática de Netflix (#141414 y #E50914) en el
 *      tema global, el marco de la imagen y el degradado del botón.
 *    - Alineación: Todos los componentes siguen una alineación centrada y márgenes
 *      laterales uniformes de 24dp.
 *    - Proximidad: El título y el subtítulo están próximos entre sí (10dp) al formar
 *      un mismo bloque informativo, mientras que el botón se separa 36dp como bloque de acción.
 *
 * 2. Experiencia de Usuario (UX):
 *    - Ley de Fitts: El botón principal ocupa el ancho disponible (match_parent) y tiene una
 *      altura mínima de 56dp para que sea fácil de alcanzar y pulsar.
 *    - Ley de Hick: Se muestra una única acción principal clara para evitar sobrecargar al usuario.
 *
 * 3. Accesibilidad (WCAG AA y Android):
 *    - Uso de componentes estándar (ImageView, TextView, AppCompatButton) para que TalkBack
 *      reconozca su rol y estado.
 *    - Descripción textual en la imagen mediante contentDescription (@string/velada_img_desc).
 *    - Zona táctil superior a 48x48dp en el botón (minHeight="56dp").
 *    - Texto escalable en unidades sp, alturas flexibles (wrap_content) y contenedor raíz
 *      ScrollView para evitar cortes al aumentar el tamaño de fuente del sistema.
 *    - Relación de contraste superior a 4.5:1 entre textos y fondo oscuro.
 *    - Orden de lectura lógico de arriba abajo y atributo accessibilityHeading="true" en el título.
 *
 * 4. Buenas prácticas de desarrollo:
 *    - Centralización de cadenas en res/values/strings.xml (sin textos hardcoded).
 *    - Uso de View Binding en lugar de findViewById.
 *    - Personalización mediante recurso drawable de tipo shape (bg_boton_velada.xml).
 */

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
