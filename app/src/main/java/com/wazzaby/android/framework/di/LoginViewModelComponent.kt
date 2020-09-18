package com.wazzaby.android.framework.di

import com.wazzaby.android.framework.viewmodel.LoginViewModel
import dagger.Component

@Component(modules = [AppModule::class,RepositoryModule::class,UseCaseUserModule::class])
interface  LoginViewModelComponent {

    fun inject(loginViewModel: LoginViewModel)

}