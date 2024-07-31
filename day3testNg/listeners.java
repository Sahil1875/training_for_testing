package day3TestNg;

import org.testng.ITestListener;
import org.testng.annotations.*;

public class listeners implements ITestListener {

    @AfterMethod
    public void tearDown() {
        System.out.println("Tear Down");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @Test
    public void testName() {
        System.out.println("testName");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("setUp");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
}
