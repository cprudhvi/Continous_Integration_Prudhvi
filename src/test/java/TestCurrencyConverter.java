
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCurrencyConverter{
    private static CurrencyConverter cc;

    @BeforeClass
    public static void setup(){
        cc = new CurrencyConverter();
    }

    // Test
    @Test
    public void test_dlr_to_rs(){
        assertEquals(350, cc.dollar_to_rs(5));
    }

}

