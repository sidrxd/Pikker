package com.sidrxd.kimage.photopicker

import androidx.compose.runtime.Composable

@Composable
expect fun rememberGalleryManager(onResult: (Kimage?) -> Unit): GalleryManager


expect class GalleryManager(
    onLaunch: () -> Unit
) {
    fun launch()
}