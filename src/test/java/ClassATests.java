import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * KNOWLEDGE!
 */
// test methods have to be public or package scope
// @BeforeClass should be static
// assertEquals for floating point types like double, float requires third parameter (delta)

public class ClassATests {
    public static ClassA classA;

    @BeforeClass
    public static void setUp() {
        classA = new ClassA();
    }

    //Constructor throws exception if number is negative
    @Test(expected = IllegalArgumentException.class)
    public void constructorTest() {
        ClassA testInstance = new ClassA(-1);
    }

    @Test
    public void sumTest() {
        //expected result for parameters (5,5) is 10
        assertEquals(classA.sum(5, 5), 10, 0);
    }

    @Test
    public void mulTest() {
        // expected result for parameters (5,5) is 25 !!! remember DELTA here
        assertEquals(classA.mul(5, 5), 25, 0);
    }

    @Test
    public void powerTest() {
        // expected result for parameters (5,5) is 25 !!! remember DELTA here
        assertEquals(classA.power(5, 3), 25, 1);
    }
}
