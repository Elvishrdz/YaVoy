package com.eahm.testing.data.fake

import com.eahm.core.domain.User
import com.eahm.core.domain.UserStatus

internal object FakeUsers {

    internal val users = listOf(
        User(
            providerId = "providerA1",
            status = UserStatus.ACTIVE,
        ),
        User(
            providerId = "providerA2",
            status = UserStatus.INACTIVE,
        ),
        User(
            providerId = "providerA3",
            status = UserStatus.ACTIVE,
        ),
        User(
            providerId = "providerA4",
            status = UserStatus.ACTIVE,
        ),
    )
}
