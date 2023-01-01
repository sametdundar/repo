package com.sametdundar.findrepo.util.star

import com.sametdundar.findrepo.data.model.response.RepoResponseItem

interface StarInterface {

    fun add(item: RepoResponseItem)
    fun remove(item: RepoResponseItem)
    fun getList(): ArrayList<RepoResponseItem>
    fun isSelected(item:RepoResponseItem): Boolean
}