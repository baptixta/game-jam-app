package com.example.cleanadventure


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_about.*


class AboutFragment : Fragment(R.layout.fragment_about) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

    }

    override fun onResume() {
        super.onResume()

        val sharedPref = activity!!.getSharedPreferences("About", Context.MODE_PRIVATE)

        txtPais.setText(sharedPref.getString("Pais", ""))
        txtDataNascimento.setText(sharedPref.getString("DataNascimento", ""))
        txtNomeUsuario.setText(sharedPref.getString("NomeUsuario", ""))
        txtEmail.setText(sharedPref.getString("EnderecoEmail", ""))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSalvar2.setOnClickListener {
            // Criando o arquivo e salvando Shared Preferences
            val sharedPrefEditor = activity!!.getSharedPreferences("About", Context.MODE_PRIVATE).edit()
            sharedPrefEditor.putString("Pais",txtPais.text.toString())
            sharedPrefEditor.putString("DataNascimento", txtDataNascimento.text.toString())
            sharedPrefEditor.putString("NomeUsuario", txtNomeUsuario.text.toString())
            sharedPrefEditor.putString("EnderecoEmail", txtEmail.text.toString())
            sharedPrefEditor.apply()

            val sharedPref = activity!!.getSharedPreferences("About", Context.MODE_PRIVATE)
            val readData = sharedPref.getString("Pais", "VALOR_PADRAO")
        }

    }
}
