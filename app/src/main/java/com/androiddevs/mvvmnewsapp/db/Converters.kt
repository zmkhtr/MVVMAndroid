package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.models.NewsResponse

class Converters {

    @TypeConverter
    fun fromSource(source : NewsResponse.Article.Source) : String? {
        return source.name
    }

    @TypeConverter
    fun toSource(name : String) : NewsResponse.Article.Source {
        return NewsResponse.Article.Source(name, name)
    }
}