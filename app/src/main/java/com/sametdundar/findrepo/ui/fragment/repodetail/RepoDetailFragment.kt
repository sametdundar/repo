package com.sametdundar.findrepo.ui.fragment.repodetail

import android.os.Bundle
import androidx.navigation.fragment.navArgs
import com.sametdundar.findrepo.R
import com.sametdundar.findrepo.base.BaseFragment
import com.sametdundar.findrepo.databinding.FragmentRepoDetailBinding
import com.sametdundar.findrepo.util.loadImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepoDetailFragment : BaseFragment<FragmentRepoDetailBinding>() {

    companion object {
        fun newInstance() = RepoDetailFragment()
    }

    private lateinit var viewModel: RepoDetailViewModel

    private val args : RepoDetailFragmentArgs by navArgs()



    override fun getLayoutId(): Int = R.layout.fragment_repo_detail

    override fun prepareView(savedInstanceState: Bundle?) {
        args.item?.apply {
            binding.ivAvatar.loadImage(this.owner?.avatar_url)
            binding.tvStart.text = this.stargazers_count.toString()
            binding.tvOpenIssue.text = this.open_issues_count.toString()
            binding.tvRepoCount.text = this.watchers_count.toString()
            binding.tvFollowing.text = this.forks_count.toString()
            binding.tvFollowers.text = this.forks_count.toString()
            binding.tvUsername.text = this.name.toString()
        }
    }

}