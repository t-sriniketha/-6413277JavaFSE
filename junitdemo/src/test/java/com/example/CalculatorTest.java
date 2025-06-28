package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method: runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator(); // Arrange: create a new Calculator
        System.out.println("Setting up calculator...");
    }

    // Teardown method: runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Cleaning up calculator...");
    }

    // Test using AAA pattern
    @Test
    public void testAddition() {
        // Arrange done in setUp()

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
}

