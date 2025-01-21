package com.daviddowdy.composewebviewpoc.domain

import com.daviddowdy.composewebviewpoc.domain.UserInput

interface WebRepository {
    fun saveUserInput(input: UserInput)
    fun getUserInput(): UserInput?
}