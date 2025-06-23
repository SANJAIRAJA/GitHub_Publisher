package com.example.sample_demo

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.util.AttributeSet
import android.view.KeyEvent
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.sample_demo.utils.ExtensionFunClass.webViewDeclarationSetUp

class CustomWebView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
    ) : WebView(context,attrs) {
    init {
        webViewDeclarationSetUp()
    }

    fun loadWebUrl(url: String){
        loadUrl(url)
    }

    fun webViewProp() {
        webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {

                super.onPageStarted(view, url, favicon)

            }

            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return super.shouldOverrideUrlLoading(view, request)

            }

            override fun shouldOverrideKeyEvent(view: WebView?, event: KeyEvent?): Boolean {
                return super.shouldOverrideKeyEvent(view, event)

            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)

            }


        }

        webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView?,
                filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams?
            ): Boolean {
                return super.onShowFileChooser(webView, filePathCallback, fileChooserParams)

            }
        }
    }

}
