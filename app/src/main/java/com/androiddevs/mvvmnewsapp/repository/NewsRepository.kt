package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import com.androiddevs.mvvmnewsapp.models.NewsResponse

class NewsRepository(
    val db : ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode : String, pageNumber : Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)


    suspend fun searchNews(searchQuery : String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article : NewsResponse.Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: NewsResponse.Article) = db.getArticleDao().deleteArticle(article)
}