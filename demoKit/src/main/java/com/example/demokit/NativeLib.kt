package com.example.demokit

class NativeLib {

    /**
     * A native method that is implemented by the 'demokit' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'demokit' library on application startup.
        init {
            System.loadLibrary("demokit")
        }
    }
}