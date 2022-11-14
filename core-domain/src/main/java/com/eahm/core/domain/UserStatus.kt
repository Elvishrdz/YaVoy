package com.eahm.core.domain

public enum class UserStatus(val code: Int) {
    UNDEFINED(0),
    ACTIVE(1),
    INACTIVE(2),
    BANNED(3),
}
