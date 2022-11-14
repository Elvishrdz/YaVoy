package com.eahm.core.domain

val Int.userStatus: UserStatus
    get() = when (this) {
        1 -> UserStatus.ACTIVE
        2 -> UserStatus.INACTIVE
        3 -> UserStatus.BANNED
        else -> UserStatus.UNDEFINED
    }