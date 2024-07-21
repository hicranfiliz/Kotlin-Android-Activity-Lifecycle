package com.example.helloandroid.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloandroid.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        Log.i("second activity", "onCreateesecnd")

        val param = intent.getStringExtra("key") ?: "default"

        val bundle = intent.extras
        val bundleParam = bundle?.getString("keyBundle" , "default bundle value") ?: "dlfk"
        Log.i("knf", param)
        Log.i("knf", bundleParam)
    }


    override fun onStart() {
        Log.i("second activity", "onStartsecnd")
        super.onStart()
    }

    override fun onResume() {
        Log.i("second activity", "onResumesecnd")
        super.onResume()
    }

    override fun onPause() {
        Log.i("second activity", "onPausesecnd")
        super.onPause()
    }

    override fun onStop() {
        Log.i("second activity", "onStopsecnd")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("second activity", "onDestroysecnd")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.i("second activity", "onRestartsecnd")
        super.onRestart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("second activity", "onSaveInstanceState")

        /* val edtUserField = findViewById<EditText>(R.id.edtUserField)
         val userField = edtUserField.text.toString()

         outState.putString("userfield", userField) */

        /*outState.run {
            putString()
        }*/

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i("second activity", "onRestoreInstanceState")

        /*val userField =  savedInstanceState.getString("userfield")
        val edtUserField = findViewById<EditText>(R.id.edtUserField)
        edtUserField.setText(userField) */

        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onBackPressed() {
        Log.i("second activity", "onBackPressed")

        super.onBackPressed()
    }

    // notificationslarla calisirken lazim olacak.
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }

    override fun onUserLeaveHint() {
        Log.i("second activity", "onUserLeaveHint")

        super.onUserLeaveHint()
    }

    override fun onUserInteraction() {
        Log.i("second activity", "onUserInteraction")
        super.onUserInteraction()
    }

    override fun onContentChanged() {
        Log.i("second activity", "onContentChanged")

        super.onContentChanged()
    }

    override fun onLowMemory() {
        Log.i("second activity", "onLowMemory")

        super.onLowMemory()
    }
}