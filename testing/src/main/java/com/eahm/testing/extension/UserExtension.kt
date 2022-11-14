package com.eahm.testing.extension

import com.eahm.core.domain.User
import com.eahm.testing.api.NetworkUserEntity

val User.networkEntity
    get() = NetworkUserEntity(
        providerId = this.providerId,
        statusCode = this.status.code,
    )