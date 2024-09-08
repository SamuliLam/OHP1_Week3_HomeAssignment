package org.example;

import org.junit.jupiter.api.*;

class StringManipulatorSamuliTest {
    private StringManipulatorSamuli stringManipulator;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }

    @BeforeEach
    public void setUp() {
        stringManipulator = new StringManipulatorSamuli();
    }

    @AfterEach
    public void tearDown() {
        stringManipulator = null;
    }

    @Test
    public void testReverse() {
        Assertions.assertEquals("tset", stringManipulator.reverse("test"));
    }

    @Test
    public void testCapitalize() {
        Assertions.assertEquals("TEST", stringManipulator.capitalize("test"));
    }
}