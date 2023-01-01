package com.sametdundar.findrepo.data.repository.repo

import com.sametdundar.findrepo.data.api.ServiceInterface
import com.sametdundar.findrepo.data.model.response.RepoResponse
import io.reactivex.rxjava3.core.Single

class RepoRepositoryImpl(private val serviceInterface: ServiceInterface):RepoRepository {

    override fun fetchRepoList(user: String): Single<RepoResponse> {
        return serviceInterface.fetchRepoList(user)
    }
}