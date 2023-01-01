package com.sametdundar.findrepo.ui.fragment.repomain

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.blankj.utilcode.util.LogUtils
import com.sametdundar.findrepo.R
import com.sametdundar.findrepo.base.BaseFragment
import com.sametdundar.findrepo.databinding.FragmentRepoMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoMainFragment : BaseFragment<FragmentRepoMainBinding>() {

    companion object {
        fun newInstance() = RepoMainFragment()
    }

    private val viewModel: RepoMainViewModel by viewModels()


    override fun getLayoutId(): Int = R.layout.fragment_repo_main

    override fun prepareView(savedInstanceState: Bundle?) {
        binding.button.setOnClickListener {
            showProgressDialog()
            viewModel.fetchRepoRequest(binding.edittext.text.toString())
        }

        observeRepo()
    }

    private fun observeRepo() {
        viewModel.observeRepoResponse.observe(viewLifecycleOwner){
            LogUtils.d("samsamsamsam",it)
            hideProgressDialog()
        }
    }

}