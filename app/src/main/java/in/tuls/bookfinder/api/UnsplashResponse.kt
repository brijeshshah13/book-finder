package `in`.tuls.bookfinder.api

import `in`.tuls.bookfinder.data.UnsplashPhoto

data class UnsplashResponse(
    val items: List<UnsplashPhoto> = listOf()
)