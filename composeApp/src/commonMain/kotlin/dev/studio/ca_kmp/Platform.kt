package dev.studio.ca_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform