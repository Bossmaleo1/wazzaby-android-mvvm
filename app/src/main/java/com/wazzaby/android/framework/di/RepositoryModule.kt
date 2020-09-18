package com.wazzaby.android.framework.di

import android.app.Application
import com.wazzaby.android.framework.model.db.RoomUserEntityDataSource
import com.wazzaby.core.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application)  = UserRepository(RoomUserEntityDataSource(app))

}
