package `in`.tuls.bookfinder.ui.gallery

import `in`.tuls.bookfinder.ui.data.UnsplashRepository
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {
}