package com.sidrxd.kimage.photopicker

import androidx.compose.ui.graphics.ImageBitmap

expect class Kimage {
    fun toByteArray(): ByteArray?
    fun toImageBitmap(): ImageBitmap?
}