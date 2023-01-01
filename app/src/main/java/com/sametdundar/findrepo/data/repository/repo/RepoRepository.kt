package com.sametdundar.findrepo.data.repository.repo

import com.sametdundar.findrepo.data.model.response.RepoResponse
import io.reactivex.rxjava3.core.Single

interface RepoRepository {

    fun fetchRepoList(user: String): Single<RepoResponse>

}