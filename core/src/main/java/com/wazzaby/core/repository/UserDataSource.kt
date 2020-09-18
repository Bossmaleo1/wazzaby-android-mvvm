package com.wazzaby.core.repository

import com.wazzaby.core.data.User

interface UserDataSource {

    suspend fun add(user: User)

    suspend fun get(id: Long) : User?

    suspend fun getAll() : List<User>

    suspend fun remove(user: User)
}