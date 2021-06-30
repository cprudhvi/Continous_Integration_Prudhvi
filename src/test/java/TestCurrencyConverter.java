
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCurrencyConverter{
    private static CurrencyConverter cc;

    @BeforeClass
    public static void setup(){
        cc = new CurrencyConverter();
    }

    // test case 1
    @Test
    public void test_dlr_to_rs(){
        assertEquals(350, cc.dollar_to_rs(5));
    }

    @Test
    public void test_sek_to_rs() { assertEquals( 90, cc.sek_to_rs(10)); }

    @Test
    public void test_euro_to_rs() { assertEquals( 300, cc.euro_to_rs(3)); }

}

// this recording is about Test driven development in ST_final Project.
// first i am going to write the test case and then commit, push build in jenkins.
// committing and pushing the code with correct code....

// performing similar tasks for test cases 2 and test case 3.....!!