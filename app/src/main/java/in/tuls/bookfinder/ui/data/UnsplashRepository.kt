package `in`.tuls.bookfinder.ui.data

import `in`.tuls.bookfinder.ui.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}