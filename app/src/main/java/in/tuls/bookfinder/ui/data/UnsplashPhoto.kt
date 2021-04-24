package `in`.tuls.bookfinder.ui.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashPhoto(
    val id: String,
    val volumeInfo: UnsplashVolumeInfo
) : Parcelable {

    @Parcelize
    data class UnsplashVolumeInfo(
        val authors: Array<String>,
        val description: String,
        val imageLinks: UnsplashImageLinks,
        val previewLink: String
    ) : Parcelable {

        @Parcelize
        data class UnsplashImageLinks(
            val smallThumbnail: String,
            val thumbnail: String
        ) : Parcelable

    }

}