
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCurrencyConverter{
    private static CurrencyConverter cc;

    @BeforeClass
    public static void setup(){
        cc = new CurrencyConverter();
    }

    // writing test cases for the main source code to test in various ways;
    @Test
    public void test_dlr_to_rs(){
        assertEquals(350, cc.dollar_to_rs(5));
    }

    @Test
    public void test_sek_to_rs(){
        assertEquals(90, cc.sek_to_rs(10));
    }

    @Test
    public void test_euro_to_rs(){
        assertEquals(30, cc.euro_to_rs(3));
    }
}

//finall all the test cases are ready to commit and build...
// but first we try to build the wrong codes and test cases to check if the CI is working properly or not ....!!!
// now lets try to fix the errors in code and see if this works to ru nthe project...!!!
// it is shown that the problem is with test cases not with the code..!!!
// now lets try to fix the test case 1 and rebuild the project..!!!!!!
//now lets do the same thing with testcase 2 fix it and rebuild the proejct...!!!!