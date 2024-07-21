package com.example.helloandroid.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloandroid.R
import kotlin.math.log

// kullanıcı tek seferde tikladiginda kapanmasin, 2 defa tikladiginda kapansin.
class SettingsActivity : AppCompatActivity() {
    var counter = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // enable true oldugunda default davranisi birakir, akışı bize bırakir.
        // false'a cektigimizde default akisina devema ettirmek icin logic icine false diyeecegim..
        // yani bu tekrar calistiginda logice bir daha girme; default davranis olarak backpress yap.
        val callBack = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Log.i("Setingsactivity", "onBackPressed")
                counter++

                if (counter <= 1){
                    Toast.makeText(this@SettingsActivity,"Çıkmak için iki kere tıkla", Toast.LENGTH_LONG).show()
                    isEnabled = false
                }
            }
        }

        onBackPressedDispatcher.addCallback(this, callBack)
    }

    // super cagriisni yapmazsak fonksiyon asil yapmasi gereken isii yapmaz.

   /* override fun onBackPressed() {
        Log.i("Setingsactivity", "onBackPressed")
        counter++
        Log.e("counter: ", "value: $counter")
        if (counter > 1){
            super.onBackPressed()

        } else {
            Toast.makeText(this,"Çıkmak için iki kere tıkla", Toast.LENGTH_LONG).show()
            return
        }

    }*/
}