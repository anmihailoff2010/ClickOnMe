package com.example.clickonme

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient


class WebViewActivity : Activity() {
    private var webView: WebView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.webview)
        val i = intent
        val url = i.getStringExtra("url")
        webView = findViewById<View>(R.id.webview) as WebView
        webView!!.settings.javaScriptEnabled = true
        webView!!.webViewClient = WebViewClient()
        webView!!.loadUrl(url!!)
    }
}