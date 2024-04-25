package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity(), View. OnClickListener {
    //inisialisasi wajib 1
    lateinit var btnExplicit: Button
    lateinit var btnImplicit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //inisialisasi wajib 2
        btnExplicit = findViewById(R.id.btnExplicit)
        btnImplicit = findViewById(R.id.btnImplicit)
        btnExplicit.setOnClickListener(this)
        btnImplicit.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnExplicit -> {
                //fungsi inntent dijalankan di dalam aksi button atau onclick
                //deklarasi intent
                val intentExplicit = Intent(this@HomeActivity, PageActivity2::class.java)
                // run intent
                startActivity(intentExplicit)
            }
            R.id.btnImplicit -> {

            }
        }
    }
}