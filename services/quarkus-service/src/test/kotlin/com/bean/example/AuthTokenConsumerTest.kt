package com.bean.example

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@QuarkusTest
class AuthTokenConsumerTest {
    @Inject lateinit var consumer: AuthTokenConsumer

    @Test
    fun testFn () {
        assertEquals("so secure", consumer.tokenProvider.myToken)
        assertEquals("so secure", consumer.main())
    }
}