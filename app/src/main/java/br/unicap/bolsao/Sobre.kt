package br.unicap.bolsao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.View


class Sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)
    }


    fun goGithub(view: View?) {
        goToUrl("https://github.com/AFKaro")
    }

    fun goReferencias(view: View?) {
        goToUrl("https://github.com/AFKaro")
    }

    private fun goToUrl(url: String) {
        val uriUrl: Uri = Uri.parse(url)
        val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
        startActivity(launchBrowser)
    }
}