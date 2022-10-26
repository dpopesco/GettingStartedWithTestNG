package unit;

import baseclasses.UnitTestBaseClass;
import org.testng.annotations.Test;

public class DisabledTest extends UnitTestBaseClass {

    @Test
    public void unstableTest1() {
        System.out.println("Test 1");
    }

    @Test(enabled = false)
    public void unstableTest2() {
        System.out.println("Test 2");
    }

}
