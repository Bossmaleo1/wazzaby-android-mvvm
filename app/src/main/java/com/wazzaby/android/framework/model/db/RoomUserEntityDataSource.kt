package com.wazzaby.android.framework.model.db

import android.content.Context
import com.wazzaby.android.framework.model.entity.UserEntity
import com.wazzaby.core.data.User
import com.wazzaby.core.repository.UserDataSource

class RoomUserEntityDataSource(context: Context) : UserDataSource {

    val userDAO = DatabaseService.getInstance(context).userDAO()

    override suspend fun add(user: User) = userDAO.addUserEntity(UserEntity.fromUser(user))

    override suspend fun get(id: Long) = userDAO.getUserEntity(id)?.toUser()

    override suspend fun getAll() = userDAO.getAllUserEntities().map { it.toUser() }

    override suspend fun remove(user: User) = userDAO.deleteUserEntity(UserEntity.fromUser(user))
}