package com.androiddevs.mvvmnewsapp.models


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NewsResponse(
    @SerializedName("articles")
    var articles: MutableList<Article>,
    @SerializedName("status")
    var status: String? = null,
    @SerializedName("totalResults")
    var totalResults: Int
) {
    @Entity(
        tableName = "articles"
    )
    data class Article(
        @PrimaryKey(autoGenerate = true)
        var id : Int? = null,
        @SerializedName("author")
        var author: String? = null,
        @SerializedName("content")
        var content: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("publishedAt")
        var publishedAt: String? = null,
        @SerializedName("source")
        var source: Source? = null,
        @SerializedName("title")
        var title: String? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("urlToImage")
        var urlToImage: String? = null
    ) : Serializable {
        data class Source(
            @SerializedName("id")
            var id: Any? = null,
            @SerializedName("name")
            var name: String? = null
        )
    }
}