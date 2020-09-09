package com.alejandrazuleta.pruebaseleccion.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.alejandrazuleta.pruebaseleccion.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        val homeFragment = HomeFragment()
        transaction.add(R.id.contenedor, homeFragment).commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        when (item.itemId){
            R.id.mo_all -> {
                val homeFragment =
                    HomeFragment()
                transaction.replace(R.id.contenedor, homeFragment).commit()
            }
            R.id.mo_fav -> {
                val favoritesFragment =
                    FavoritesFragment()
                transaction.replace(R.id.contenedor, favoritesFragment).commit()
            }
        }

        return super.onOptionsItemSelected(item)
    }


}