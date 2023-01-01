package com.sametdundar.findrepo.ui.fragment.repomain

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.blankj.utilcode.util.LogUtils
import com.github.nitrico.lastadapter.LastAdapter
import com.github.nitrico.lastadapter.Type
import com.sametdundar.findrepo.BR
import com.sametdundar.findrepo.R
import com.sametdundar.findrepo.base.BaseFragment
import com.sametdundar.findrepo.data.model.response.RepoResponseItem
import com.sametdundar.findrepo.databinding.FragmentRepoMainBinding
import com.sametdundar.findrepo.databinding.ItemRepoListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoMainFragment : BaseFragment<FragmentRepoMainBinding>() {

    companion object {
        fun newInstance() = RepoMainFragment()
    }

    private val viewModel: RepoMainViewModel by viewModels()


    override fun getLayoutId(): Int = R.layout.fragment_repo_main

    override fun prepareView(savedInstanceState: Bundle?) {
        clickListener()
        observeRepo()
    }

    private fun clickListener() {
        binding.button.setOnClickListener {
            showProgressDialog()
            viewModel.fetchRepoRequest(binding.edittext.text.toString())
        }
    }

    private fun observeRepo() {
        viewModel.observeRepoResponse.observe(viewLifecycleOwner) {
            LogUtils.d("samsamsamsam", it)
            hideProgressDialog()
            initAdapter(it)
        }
    }

    private fun initAdapter(list: ArrayList<RepoResponseItem>) {

        LastAdapter(
            list, BR.item
        ).map<RepoResponseItem>(Type<ItemRepoListBinding>(R.layout.item_repo_list).onBind { holder ->
            val data = holder.binding.item
            data?.let { item ->

            }
        }.onClick {
//                findNavController().navigate(
//                    MainScreenFragmentDirections.actionMainScreenFragmentToMovieDetailScreen(
//                        it.binding.item?.id ?: -1
//                    )
//                )

        }).into(binding.recyclerView)
    }

}