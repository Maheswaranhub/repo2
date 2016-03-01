package org.munvegi.mywebapp;

import org.junit.*;

/**
 * Created by admin on 26/02/2016.
 */
public class ExampleJUnit4Test {

    private static int i = 5;

    @BeforeClass
    public static void setUpClass() throws Exception {
        i = 1;
        System.out.println("First line");
        System.out.println("@BeforeClass method will be executed before JUnit test for a Class starts");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@AfterClass method will be executed after JUnit test fo a Class Completed");
    }

    @Before
    public void setUp() {
        System.out.println("@Before method will execute before every JUnit4 test");
    }

    @After
    public void tearDown() {
        System.out.println("@After method will execute after every JUnit4 test");
    }


    @Test
    public void test1() {
        System.out.println("i = " + i);
        assert true;
    }

    @Test(timeout = 500)
    public void test2() {
        assert true;
    }

    @Test(expected=IllegalArgumentException.class)
    public void testException() {
        System.out.println("@Test(expected) will check for specified exception during its run");
        throw new IllegalArgumentException();

    }


}