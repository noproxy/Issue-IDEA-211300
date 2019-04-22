package org.jetbrains.issue


import spock.lang.Specification

import static org.junit.Assert.assertEquals

class SampleTest extends Specification {
    def "test should be run by gradle"() {
        when:
        def value = Integer.parseInt("2")

        then:
        assertEquals(2, value)
    }

}