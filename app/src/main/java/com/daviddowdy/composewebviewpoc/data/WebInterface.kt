package com.daviddowdy.composewebviewpoc.data

import android.webkit.JavascriptInterface

interface WebInterface {
    @JavascriptInterface
    fun showMessage(firstName: String, password: String)
}