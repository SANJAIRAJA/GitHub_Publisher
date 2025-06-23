package com.example.sample_demo.utils

import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView

object ExtensionFunClass {


    fun WebView.webViewDeclarationSetUp(){
        this.settings.apply {
            userAgentString = ""
            javaScriptEnabled = true
            javaScriptCanOpenWindowsAutomatically = true
            domStorageEnabled = true
            mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
            loadWithOverviewMode = true
            displayZoomControls = false
            allowFileAccess = true
            allowContentAccess = true
            cacheMode = WebSettings.LOAD_DEFAULT
            visibility = View.VISIBLE
            clearCache(true)
            setLayerType(View.LAYER_TYPE_HARDWARE, null)
            canGoBack()
        }
    }
}