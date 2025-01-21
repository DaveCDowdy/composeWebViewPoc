package com.daviddowdy.composewebviewpoc.domain

import com.daviddowdy.composewebviewpoc.domain.UserInput
import com.daviddowdy.composewebviewpoc.domain.WebRepository
import javax.inject.Inject

class SaveUserInputUseCase @Inject constructor(
    private val repository: WebRepository
) {
    fun execute(input: UserInput) {
        repository.saveUserInput(input)
    }
}