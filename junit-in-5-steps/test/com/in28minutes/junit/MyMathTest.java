package com.in28minutes.junit;


import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    MyMath myMath = new MyMath();

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    // class level method, should be static
    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }

    @Test
    public void sum_with3numbers() {
        System.out.println("test1");
        assertEquals(6, myMath.sum(new int[]{1, 2, 3}));
    }

    @Test
    public void sum_with1number() {
        System.out.println("test2");
        assertEquals(3, myMath.sum(new int[]{3}));
    }

}

