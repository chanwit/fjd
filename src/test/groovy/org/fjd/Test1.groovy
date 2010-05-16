package org.fjd

import groovy.util.*

@Typed class Test1 extends GroovyTestCase {
    
    void testSomething() {
        assert 1 == 1
    }
    
    void testStructuralType() {
        // {def call()} c = new TestCall()
        // assert c.call() == "yes"
    }
}