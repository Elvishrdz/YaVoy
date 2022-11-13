package com.eahm.testing

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun createUsers() {
        val result = 1 + 1
        assertThat(result).isEqualTo(2)
    }
}