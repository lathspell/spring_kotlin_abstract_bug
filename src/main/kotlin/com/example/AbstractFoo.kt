package com.example

import org.springframework.context.ApplicationContext

abstract class AbstractFoo(private val ctx: ApplicationContext) {

    fun save() {
        checkNotNull(ctx) { "Injected variable is NULL!" }
    }
}
