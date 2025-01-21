package com.daviddowdy.composewebviewpoc.ui.view

import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.daviddowdy.composewebviewpoc.data.WebRepositoryImpl

@Composable
fun WebViewScreen(webRepository: WebRepositoryImpl) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                //This isn't good. It's a security concern. Look at the official documentation to look at alternatives
                settings.javaScriptEnabled = true
                settings.setSupportZoom(true)
                addJavascriptInterface(webRepository, "Dialog")
                loadUrl("file:///android_asset/test.html")
            }
        }
    )
}