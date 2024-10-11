package com.fjr.measuremate.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module


@Module
@ComponentScan(value = "com.fjr.measuremate.data")
class DataModule

@Module
@ComponentScan(value = "com.fjr.measuremate.domain")
class DomainModule

@Module
@ComponentScan(value = "com.fjr.measuremate.presentation")
class PresentationModule

@Module(includes = [DataModule::class, DomainModule::class, PresentationModule::class])
class AppModule