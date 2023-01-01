package com.sametdundar.findrepo.data.api

import com.sametdundar.findrepo.data.model.response.RepoResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceInterface {

    @GET("users/{user}/repos")
    fun fetchRepoList(
        @Path("user") user: String
    ) : Single<RepoResponse>

}