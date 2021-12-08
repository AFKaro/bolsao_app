package br.unicap.bolsao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Abertura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abertura)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }, 2000)
    }
}