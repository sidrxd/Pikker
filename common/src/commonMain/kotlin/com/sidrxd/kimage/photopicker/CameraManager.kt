package com.sidrxd.kimage.photopicker

import androidx.compose.runtime.Composable

@Composable
expect fun rememberCameraManager(onResult: (Kimage?) -> Unit): CameraManager


expect class CameraManager(
    onLaunch: () -> Unit
) {
    fun launch()
}