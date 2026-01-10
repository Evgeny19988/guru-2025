package junit;

import org.junit.jupiter.api.*;

public class JunitTest1 {
    @BeforeAll
    static void BeforeAll() {
        System.out.println("Это метод BeforeAll");
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("Это метод AfterAll");
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("Это метод BeforeEach");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("Это метод AfterEach");
    }

    @Test
    void JunitTest1() {
        System.out.println("Это JunitTest1()");
        Assertions.assertTrue(3>2);
    }

    @Test
    void JunitTest2() {
        System.out.println("Это JunitTest2()");
        Assertions.assertTrue(3>1);
    }
}
