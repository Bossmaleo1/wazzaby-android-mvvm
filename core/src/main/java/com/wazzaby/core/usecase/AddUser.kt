package com.wazzaby.core.usecase

import com.wazzaby.core.data.User
import com.wazzaby.core.repository.UserRepository

class AddUser (private val userRepository: UserRepository) {

    suspend operator fun invoke(user : User) = userRepository.addUser(user)
}