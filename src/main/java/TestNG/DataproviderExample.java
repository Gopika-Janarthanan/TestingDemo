package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {


    @Test
    public void example1() {
        System.out.println("This is an example1");
    }
    @Test(priority = 1)
    public void example2() {
        System.out.println("This is an example2");
    }
    @Test(dependsOnMethods = "example1")
    public void example3() {
        System.out.println("This is an example3");
    }
    @Test(dataProvider = "data")
    public void example4(String dataProvider) {
        System.out.println("This is an example4" + dataProvider);
    }

    @DataProvider
    public Object[] data(String[] d) {
      d= new String[]{"a","aa","aaa"};
      return new Object[0];
    }
}
