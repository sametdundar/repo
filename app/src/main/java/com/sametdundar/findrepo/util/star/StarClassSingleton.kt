package com.sametdundar.findrepo.util.star

import com.sametdundar.findrepo.data.model.response.RepoResponseItem

class StarClassSingleton: StarInterface {

    companion object {
        private var INSTANCE: StarClassSingleton? = null
        fun getInstance() = INSTANCE ?: StarClassSingleton().also { INSTANCE = it }
    }

    private var selectedArrayList = arrayListOf<RepoResponseItem>()

    override fun add(item: RepoResponseItem) {
        selectedArrayList.add(item)
    }

    override fun remove(item: RepoResponseItem) {
        selectedArrayList.remove(item)

    }

    override fun getList(): ArrayList<RepoResponseItem> {
        return selectedArrayList
    }

    override fun isSelected(item: RepoResponseItem): Boolean {
        return selectedArrayList.contains(item)
    }


}