package com.wazzaby.core.repository

import com.wazzaby.core.data.User

class UserRepository(private val userDataSource: UserDataSource) {

    suspend fun addUser(user: User) = userDataSource.add(user)

    suspend fun getUser(id: Long) = userDataSource.get(id)

    suspend fun getAllUsers() = userDataSource.getAll()

    suspend fun removeUser(user : User) = userDataSource.remove(user)

}