package com.sametdundar.findrepo.data.usecase

import com.sametdundar.findrepo.base.BaseUseCase
import com.sametdundar.findrepo.data.model.response.RepoResponse
import com.sametdundar.findrepo.data.repository.repo.RepoRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class RepoUseCase@Inject constructor(
    private val repository: RepoRepository
) : BaseUseCase<RepoResponse>()  {

    private var user : String? = null

    fun setUser(user: String) {
        this.user = user
    }

    override fun buildUseCaseSingle(): Single<RepoResponse> {
        return repository.fetchRepoList(user = user?:"")
    }
}