package com.example.helloandroid.ui

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class CameraComponent : LifecycleObserver {

    // lifecycle event deprecated olmus. Cunku bu isini reflection ile cozer. Bu da maliyetli bir islemdir.
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun startCamera(){

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun stopCamera(){

    }

}