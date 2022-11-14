package com.eahm.testing.extension

import com.eahm.core.domain.User
import com.eahm.core.domain.extension.userStatus
import com.eahm.testing.api.NetworkUserEntity

val NetworkUserEntity.user: User
    get() = User(
        providerId = this.providerId,
        status = this.statusCode.userStatus,
    )