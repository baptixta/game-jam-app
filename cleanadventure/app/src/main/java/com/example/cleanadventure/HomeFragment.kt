package com.example.cleanadventure


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onResume() {
        super.onResume()

        val sharedPref = activity!!.getSharedPreferences("Login", Context.MODE_PRIVATE)

        txtUsuario.setText(sharedPref.getString("Usuario", ""))
        txtSenha.setText(sharedPref.getString("Senha", ""))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnEntrar.setOnClickListener {
            // Criando o arquivo e salvando Shared Preferences
            val sharedPrefEditor = activity!!.getSharedPreferences("Login", Context.MODE_PRIVATE).edit()
            sharedPrefEditor.putString("Usuario",txtUsuario.text.toString())
            sharedPrefEditor.putString("Senha",txtSenha.text.toString())
            sharedPrefEditor.apply()

            val sharedPref = activity!!.getSharedPreferences("Login", Context.MODE_PRIVATE)
            val readData = sharedPref.getString("Pais", "VALOR_PADRAO")
        }

    }
}
