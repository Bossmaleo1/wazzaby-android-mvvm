package com.wazzaby.core.usecase

import com.wazzaby.core.repository.UserRepository

class GetAllUser (private val userRepository: UserRepository) {

    suspend operator fun invoke() = userRepository.getAllUsers()

}