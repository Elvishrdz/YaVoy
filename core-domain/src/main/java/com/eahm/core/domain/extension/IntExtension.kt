package com.eahm.core.domain.extension

import com.eahm.core.domain.ProductStatus
import com.eahm.core.domain.UserStatus

val Int.userStatus: UserStatus
    get() = when (this) {
        1 -> UserStatus.ACTIVE
        2 -> UserStatus.INACTIVE
        3 -> UserStatus.BANNED
        else -> UserStatus.UNDEFINED
    }


val Int.productStatus: ProductStatus
    get() = when (this) {
        1 -> ProductStatus.AVAILABLE
        2 -> ProductStatus.UNAVAILABLE
        3 -> ProductStatus.PRIVATE
        4 -> ProductStatus.BANNED
        else -> ProductStatus.UNDEFINED
    }
