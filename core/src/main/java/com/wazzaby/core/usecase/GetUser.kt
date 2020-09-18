package com.wazzaby.core.usecase

import com.wazzaby.core.repository.UserRepository

class GetUser (private val userRepository: UserRepository) {

    suspend operator fun invoke(id : Long) = userRepository.getUser(id)

}