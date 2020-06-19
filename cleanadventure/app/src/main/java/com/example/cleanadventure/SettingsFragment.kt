package com.example.cleanadventure


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_settings.*


/**
 * A simple [Fragment] subclass.
 *
 */
class SettingsFragment : Fragment(R.layout.fragment_settings) {
    override fun onResume() {
        super.onResume()

        val sharedPref = activity!!.getSharedPreferences("Settings", Context.MODE_PRIVATE)

        txtNome.setText(sharedPref.getString("Nome", ""))
        txtSobrenome.setText(sharedPref.getString("Sobrenome",""))
        txtNomeUsuario2.setText(sharedPref.getString("NomeUsuario",""))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSalvar.setOnClickListener {
            // Criando o arquivo e salvando Shared Preferences
            val sharedPrefEditor = activity!!.getSharedPreferences("Settings", Context.MODE_PRIVATE).edit()
            sharedPrefEditor.putString("Nome",txtNome.text.toString())
            sharedPrefEditor.putString("Sobrenome",txtSobrenome.text.toString())
            sharedPrefEditor.putString("NomeUsuario",txtNomeUsuario2.text.toString())
            sharedPrefEditor.apply()

            val sharedPref = activity!!.getSharedPreferences("Settings", Context.MODE_PRIVATE)
            val readData = sharedPref.getString("Nome", "VALOR_PADRAO")
        }
    }
}
