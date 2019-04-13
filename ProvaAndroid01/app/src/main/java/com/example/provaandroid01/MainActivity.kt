package com.example.provaandroid01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        b_calcular.setOnClickListener {
            val intent = Intent(this, Resultado::class.java)

            val dados = Bundle()

            val alcool = eTAlcool.text.toString()
            val gasolina =eTGasolina.text.toString()

            if(validacampos(alcool, gasolina)){
                dados.putDouble("alcool",alcool.toDouble())
                dados.putDouble("gasolina",gasolina.toDouble())

                intent.putExtras(dados)

                startActivity(intent)

            }else{
                tvAlerta.setText("Preencha os campos")

            }

        }



    }
    fun validacampos(alcool:String, gasolina:String):Boolean{
        var validade = true
        if(alcool.equals("") || alcool.isEmpty()){
            validade = false
        }else if (gasolina.equals("") || alcool.isEmpty()) {
            validade = false

        }
        return validade
    }



}
