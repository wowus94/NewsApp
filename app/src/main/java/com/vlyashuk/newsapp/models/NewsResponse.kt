package com.vlyashuk.newsapp.models

import com.vlyashuk.newsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)