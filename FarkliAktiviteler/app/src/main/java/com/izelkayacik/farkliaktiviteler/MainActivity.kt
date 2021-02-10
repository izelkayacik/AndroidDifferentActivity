package com.izelkayacik.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate Çağırıldı")

    }

    override fun onStart() {
        super.onStart()

        println("onStart Çağırıldı")
    }

    override fun onResume() {
        super.onResume()

        println("onResume Çağırıldı")
    }

    override fun onPause() {
        super.onPause()

        println("onPause Çağırıldı")
    }

    override fun onStop() {
        super.onStop()

        println("onStop Çağırıldı")
    }

    override fun onDestroy() {
        super.onDestroy()

        println("onDestroy Çağırıldı")
    }
    fun aktiviteDegistir(view: View){

        val kullaniciVerisi = editText.text.toString()

        val intent = Intent(applicationContext, IkinciActivity:: class.java)
        intent.putExtra("YollananVeri", kullaniciVerisi)
        startActivity(intent)
        finish()
    }
}