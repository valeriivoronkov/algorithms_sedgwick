package algorithms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xcoder
 */
public class Euklid_GCDTest {
    
    public Euklid_GCDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gcd method, of class Euklid_GCD.
     */
    @Test
    public void testGcd_Result_1() {
        int a = 17;
        int b = 13;
        int expResult = 1;
        int result = Euklid_GCD.gcd(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGcd_Result_30() {
        int a = 180;
        int b = 150;
        int expResult = 30;
        int result = Euklid_GCD.gcd(a, b);
        assertEquals(expResult, result);
    }
    
}
