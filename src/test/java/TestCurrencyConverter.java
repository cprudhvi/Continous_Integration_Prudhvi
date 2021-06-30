
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

}

// this recording is about Test driven development in ST_final Project.
// first i am going to write the test case and then commit, push build in jenkins.
// committing and pushing the code with correct code.....