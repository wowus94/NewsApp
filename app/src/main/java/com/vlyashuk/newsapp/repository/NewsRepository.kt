package com.vlyashuk.newsapp.repository

import com.vlyashuk.newsapp.api.RetrofitInstance
import com.vlyashuk.newsapp.db.ArticleDatabase
import com.vlyashuk.newsapp.models.Article

class NewsRepository(
    val database: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = database.getArticleDao().upsert(article)

    fun getSavedNews() = database.getArticleDao().getAllArticles()
    suspend fun deleteArticle(article: Article) = database.getArticleDao().deleteArticle(article)
}