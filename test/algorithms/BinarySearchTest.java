package algorithms;

import java.util.Arrays;
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
public class BinarySearchTest {
    
    public BinarySearchTest() {
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
     * Test of rank method, of class BinarySearch.
     */
    @Test
    public void testRank_1() {
        int x = 0;
        int[] y = {23,15,-2,46,0,-13};
        Arrays.sort(y);
        int expResult = 2;
        int result = BinarySearch.rank(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRank_2() {
        int x = 15;
        int[] y = {23,15,-2,46,0,-13};
        Arrays.sort(y);
        int expResult = 3;
        int result = BinarySearch.rank(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRank_invalid() {
        int x = 25;
        int[] y = {23,15,-2,46,0,-13};
        Arrays.sort(y);
        int expResult = -1;
        int result = BinarySearch.rank(x, y);
        assertEquals(expResult, result);
    }
    
}
