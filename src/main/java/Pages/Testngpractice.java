package Pages;


import org.testng.annotations.*;

public class Testngpractice {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void tearDownAfterSuite() throws Exception {
        System.out.println("After suite");
    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Class setup");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Class cleanup");
    }
    @BeforeTest
    public void setUpBeforeTest() throws Exception {
        System.out.println("Before test");
    }
    @BeforeMethod
    void setUpMethod() throws Exception {
        System.out.println("Method setup");
    }
    @Test
    public void test1() {
        System.out.println("test 1 executing");
    }
    @AfterMethod
    void tearDownMethod() throws Exception {
        System.out.println("Method tear down");
    }
    @AfterTest
    public void tearDownAfterTest() throws Exception {
        System.out.println("After test");
    }


}
