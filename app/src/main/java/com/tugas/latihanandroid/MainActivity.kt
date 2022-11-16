package com.tugas.latihanandroid

import android.os.Bundle
import android.os.PersistableBundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.tbAddcontact -> Toast.makeText(this, "Kamu menekan AddContact", Toast.LENGTH_LONG).show()
            R.id.tbfavorit -> Toast.makeText(this, "Kamu menekan favorit", Toast.LENGTH_LONG).show()
            R.id.tbSetting -> Toast.makeText(this, "Kamu menekan AddContact", Toast.LENGTH_LONG).show()
            R.id.tbfeedback-> Toast.makeText(this, "Kamu menekan feedback", Toast.LENGTH_LONG).show()
            R.id.tbClose -> finish()
        }
        return true
    }
}