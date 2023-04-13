package br.com.connect.appfitnesstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var btnImc: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImc = findViewById(R.id.btn_imc)

        btnImc.setOnClickListener {
            Log.i("teste", "clicou!")

            val i = Intent(this, ImcActivity::class.java)
            startActivity(i)
        }
    }
}