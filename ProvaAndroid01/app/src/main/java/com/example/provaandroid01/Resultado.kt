package com.example.provaandroid01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val dados : Bundle = intent.extras

        val alcool = dados.getDouble("alcool")
        val gasolina = dados.getDouble("gasolina")

        calcular(alcool,gasolina)



    }
    fun calcular(alcool:Double , gasolina:Double){

        val resultado = alcool/gasolina

        if(resultado >= 0.7){
            tvResultado.setText("Melhor usar Gasolina")
        }else{
            tvResultado.setText("Melhor usar Alcool")
        }

    }




}
