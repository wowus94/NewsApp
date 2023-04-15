package com.vlyashuk.newsapp.ui

import androidx.lifecycle.ViewModel
import com.vlyashuk.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}