package com.sametdundar.findrepo.ui.fragment.repomain

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sametdundar.findrepo.R

class RepoMainFragment : Fragment() {

    companion object {
        fun newInstance() = RepoMainFragment()
    }

    private lateinit var viewModel: RepoMainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_repo_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RepoMainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}