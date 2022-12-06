package com.example.com.example

import com.example.Foo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class BugTest(@Autowired private val foo: Foo) {

    @Test
    fun test() {
        foo.save()
    }
}
