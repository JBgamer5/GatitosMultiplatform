package com.alejandro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform