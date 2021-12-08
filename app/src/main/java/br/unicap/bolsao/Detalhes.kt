package br.unicap.bolsao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detalhes.*

class Detalhes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val sTitle = intent.getStringExtra("titulo")
        val sContent = intent.getStringExtra("conteudo")
        val sImage = intent.getStringExtra("imagem")

        supportActionBar?.title = sTitle
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Picasso.get().load(sImage).into(detalheImagem)
        detalheConteudo.text = sContent
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}