package com.inspirecoding.currencyconverter.di.module

import com.inspirecoding.currencyconverter.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
        modules = [
            MainActivityViewModelModule::class
        ]
    )
    abstract fun bindMainActivity(): MainActivity

}