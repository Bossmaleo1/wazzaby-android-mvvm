package com.wazzaby.android.framework.di

import com.wazzaby.android.framework.model.usecase.UseCasesUser
import com.wazzaby.core.repository.UserRepository
import com.wazzaby.core.usecase.AddUser
import com.wazzaby.core.usecase.GetAllUser
import com.wazzaby.core.usecase.GetUser
import com.wazzaby.core.usecase.RemoveUser
import dagger.Module
import dagger.Provides

@Module
class UseCaseUserModule {

    @Provides
    fun getUseCases(repository: UserRepository) = UseCasesUser(
        AddUser(repository),
        GetAllUser(repository),
        GetUser(repository),
        RemoveUser(repository)
    )

}