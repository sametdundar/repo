package com.sametdundar.findrepo.ui.fragment.repodetail

import android.os.Bundle
import com.sametdundar.findrepo.R
import com.sametdundar.findrepo.base.BaseFragment
import com.sametdundar.findrepo.databinding.FragmentRepoDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoDetailFragment : BaseFragment<FragmentRepoDetailBinding>() {

    companion object {
        fun newInstance() = RepoDetailFragment()
    }

    private lateinit var viewModel: RepoDetailViewModel


    override fun getLayoutId(): Int = R.layout.fragment_repo_detail

    override fun prepareView(savedInstanceState: Bundle?) {
    }

}