package com.example

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@Component
class Foo(ctx: ApplicationContext) : AbstractFoo(ctx) {

    @SchedulerLock(name = "cronjob", lockAtLeastFor = "PT1M", lockAtMostFor = "PT10M")
    fun myCronjob() {
    }

}
