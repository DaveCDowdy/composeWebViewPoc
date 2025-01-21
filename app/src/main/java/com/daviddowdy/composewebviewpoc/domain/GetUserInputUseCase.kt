package com.daviddowdy.composewebviewpoc.domain

import com.daviddowdy.composewebviewpoc.domain.UserInput
import com.daviddowdy.composewebviewpoc.domain.WebRepository
import javax.inject.Inject

class GetUserInputUseCase @Inject constructor(
    private val repository: WebRepository
) {
    fun execute(): UserInput? = repository.getUserInput()
}