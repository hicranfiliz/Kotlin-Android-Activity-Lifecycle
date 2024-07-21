package com.example.helloandroid.ui

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner


// 3. yontem olarak: Bu fonksiyon event kisminda bize lifecycle fonksiyonlari verilir.

// Peki lifecycle observer ile default liefcycle observer arasında default olarak bir fark var mı?
// (gozle gorulur bir fark yoktur. )
// 2. ve 3. yontem arasinda.

// peki bunlarin lifecyclini nasil takip edecegim?
// activty'de oncreate icinde addObserver tanimlayip, bu classin nesnesini ekelrsem icine, artik lifecyclea katilmis oluyor.
class CameraComponent3 : LifecycleEventObserver{
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event){
            Lifecycle.Event.ON_RESUME -> startCamera()
            Lifecycle.Event.ON_PAUSE -> stopCamera()
            else -> {}
        }
    }

    fun startCamera(){
        Log.e("Camera Component3", "Start Camera")
    }

    fun stopCamera(){
        Log.e("Camera Component3", "Stop Camera")
    }

}