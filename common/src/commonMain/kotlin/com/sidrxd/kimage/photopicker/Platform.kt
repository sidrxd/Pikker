package com.sidrxd.kimage.photopicker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform