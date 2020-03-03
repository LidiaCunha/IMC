package br.senai.sp.jandira.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val editTextAltura = findViewById<EditText>(R.id.edit_text_altura)
        val editTextPeso = findViewById<EditText>(R.id.edit_text_peso)




        buttonCalcular.setOnClickListener {
            val abrirActivityResultado = Intent(this, ResultadoActivity::class.java)

            abrirActivityResultado.putExtra("peso", editTextPeso.text.toString())
            abrirActivityResultado.putExtra("altura", editTextAltura.text.toString())

             startActivity(abrirActivityResultado)
        }
    }
}
