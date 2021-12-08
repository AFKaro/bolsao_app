package br.unicap.bolsao

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val tog = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        tog.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(tog)
        tog.syncState()

        navigationView.setNavigationItemSelectedListener(this)

        val adapter = Adaptador(
            resources.getStringArray(R.array.titulos),
            resources.getStringArray(R.array.conteudos),
            resources.getStringArray(R.array.imagens)
        )
        storyList.layoutManager = LinearLayoutManager(this)
        storyList.adapter = adapter
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)

        if(item.itemId == R.id.sobre){
            val intent = Intent(applicationContext,Sobre::class.java)
            startActivity(intent)
        }

        return true;
    }
}
