package com.vlyashuk.newsapp.repository

import com.vlyashuk.newsapp.api.RetrofitInstance
import com.vlyashuk.newsapp.db.ArticleDatabase

class NewsRepository(
    val database: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}