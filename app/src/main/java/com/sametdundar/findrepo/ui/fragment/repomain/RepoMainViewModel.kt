package com.sametdundar.findrepo.ui.fragment.repomain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.blankj.utilcode.util.LogUtils
import com.sametdundar.findrepo.data.model.response.RepoResponse
import com.sametdundar.findrepo.data.usecase.RepoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RepoMainViewModel @Inject constructor(private val useCase: RepoUseCase) : ViewModel() {


    private val _repoResponse = MutableLiveData<RepoResponse>()
    val observeRepoResponse: LiveData<RepoResponse> = _repoResponse


    fun fetchRepoRequest(user: String) {
        useCase.setUser(user)
        useCase.execute(
            onSuccess = {
                _repoResponse.value = it
            },
            onError = {
                it.printStackTrace()
                LogUtils.d("samsamsamsam", it)
            }
        )
    }
}
