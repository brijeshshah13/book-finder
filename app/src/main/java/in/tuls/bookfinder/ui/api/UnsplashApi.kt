package `in`.tuls.bookfinder.ui.api

import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashApi {

    companion object {
        const val BASE_URL = "https://www.googleapis.com/"
    }

    @GET("books/v1/volumes")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("startIndex") startIndex: Int,
        @Query("maxResults") maxResults: Int
    ) : UnsplashResponse

}