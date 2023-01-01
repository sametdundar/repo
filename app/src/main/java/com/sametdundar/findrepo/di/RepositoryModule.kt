package com.sametdundar.findrepo.di

import com.sametdundar.findrepo.data.api.ServiceInterface
import com.sametdundar.findrepo.data.repository.repo.RepoRepository
import com.sametdundar.findrepo.data.repository.repo.RepoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieDetailRepository(serviceInterface: ServiceInterface): RepoRepository {
        return RepoRepositoryImpl(serviceInterface)
    }


}