package com.eahm.testing.data

object FakeData {

    val users = listOf(
        Users(
            providerId = "A1",
            status = 1,
        ),
        Users(
            providerId = "A2",
            status = 1,
        ),
        Users(
            providerId = "A3",
            status = 1,
        ),
    )
}

data class Users(
    val providerId: String,
    val status: Int,
)