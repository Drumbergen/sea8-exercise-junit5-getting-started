/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.wildcodeschool.sea8.exercise.junit_jupiter_getting_started;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
