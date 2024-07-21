package com.example.helloandroid.ui

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent


// bu sekidle classlara lifecycle vererek default olarak nerede start nerede stop yapılacagini vermis oluyoruz.
// 2. Yontem bu sekidle.
class CameraComponent2 : DefaultLifecycleObserver{

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        startCamera()
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        stopCamera()
    }

    fun startCamera(){}

    fun stopCamera(){}
}