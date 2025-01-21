package com.daviddowdy.composewebviewpoc.data

import android.webkit.JavascriptInterface
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WebRepositoryImpl @Inject constructor() : WebRepository, WebInterface {

    private var userInput: UserInput? = null

    override fun saveUserInput(input: UserInput) {
        userInput = input
    }

    override fun getUserInput(): UserInput? = userInput

    @JavascriptInterface
    override fun showMessage(firstName: String, password: String) {
        saveUserInput(UserInput(firstName, password))
    }
}