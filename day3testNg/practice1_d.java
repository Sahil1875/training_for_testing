package day3TestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice1_d {
    @Test
    public void ApiLoginHome() {
        System.out.println("6th_Hidden_Test_Case");
    }
    @Test
    public void ApiLoginHome_a() {
        System.out.println("Below_Hidden_Test_Case");
    }
    @BeforeTest
    public void ApiLoginHome_b() {
        System.out.println("Before_Test");
    }
}
