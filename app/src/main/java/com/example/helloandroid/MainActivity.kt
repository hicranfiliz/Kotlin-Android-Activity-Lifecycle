package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.helloandroid.ui.SecondActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("Mainactivity", "ONcreate")

        setContentView(R.layout.activity_main)

        /*if (savedInstanceState != null){
            val userField =  savedInstanceState.getString("userfield")
            val edtUserField = findViewById<EditText>(R.id.edtUserField)
            edtUserField.setText(userField)
        }*/

        val btnOpenSecondActivity = findViewById<Button>(R.id.btnopenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("key", "value")

            val bundle = Bundle()
            bundle.putString("keyBundle", "valueBundle")

            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        Log.i("Mainactivity", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("Mainactivity", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Mainactivity", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Mainactivity", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Mainactivity", "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.i("Mainactivity", "onRestart")
        super.onRestart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("Mainactivity", "onSaveInstanceState")

       /* val edtUserField = findViewById<EditText>(R.id.edtUserField)
        val userField = edtUserField.text.toString()

        outState.putString("userfield", userField) */

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i("Mainactivity", "onRestoreInstanceState")

        /*val userField =  savedInstanceState.getString("userfield")
        val edtUserField = findViewById<EditText>(R.id.edtUserField)
        edtUserField.setText(userField) */

        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onBackPressed() {
        Log.i("Mainactivity", "onBackPressed")

        super.onBackPressed()
    }

    override fun onUserLeaveHint() {
        Log.i("Mainactivity", "onUserLeaveHint")

        super.onUserLeaveHint()
    }

    override fun onUserInteraction() {
        Log.i("Mainactivity", "onUserInteraction")
        super.onUserInteraction()
    }

    override fun onContentChanged() {
        Log.i("Mainactivity", "onContentChanged")

        super.onContentChanged()
    }

    override fun onLowMemory() {
        Log.i("Mainactivity", "onLowMemory")

        super.onLowMemory()
    }
}