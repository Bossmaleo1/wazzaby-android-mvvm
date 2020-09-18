package com.wazzaby.android.framework.model.usecase

import com.wazzaby.core.usecase.AddUser
import com.wazzaby.core.usecase.GetAllUser
import com.wazzaby.core.usecase.GetUser
import com.wazzaby.core.usecase.RemoveUser

data class UseCasesUser(
    val addUser: AddUser,
    val getAllUser: GetAllUser,
    val getUser: GetUser,
    val removeUser: RemoveUser
)