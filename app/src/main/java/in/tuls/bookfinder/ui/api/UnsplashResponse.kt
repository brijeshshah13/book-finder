package `in`.tuls.bookfinder.ui.api

import `in`.tuls.bookfinder.ui.data.UnsplashPhoto

data class UnsplashResponse(
    val items: List<UnsplashPhoto> = listOf()
)