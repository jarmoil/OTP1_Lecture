import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SampleClassTest {

    private SampleClass obj1;
    private SampleClass obj2;
    private SampleClass obj3;
    private int val1;
    private int val2;
    private String[] expectedArray;
    private String[] resultArray;

    @BeforeEach
    void setUp() {
        // Set up objects and values before each test
        obj1 = new SampleClass("abc");
        obj2 = new SampleClass("abc");
        obj3 = null; // Simulate a null object
        val1 = 5;
        val2 = 6;
        expectedArray = SampleClass.getArray();
        resultArray = SampleClass.getArray();
    }

    @AfterEach
    void tearDown() {
        // Clean up resources after each test (if necessary)
        obj1 = null;
        obj2 = null;
        obj3 = null;
        expectedArray = null;
        resultArray = null;
    }

    @Test
    void getValue() {
        assertEquals("abc", obj1.getValue());
        assertEquals("abc", obj2.getValue());
    }

    @Test
    void isValueEqual() {
        assertTrue(obj1.isValueEqual(obj2));
        assertFalse(obj1.isValueEqual(new SampleClass("def")));
    }

    @Test
    void compareIntegers() {
        assertTrue(SampleClass.compareIntegers(val1, val2));
        assertFalse(SampleClass.compareIntegers(val2, val1));
    }

    @Test
    void getArray() {
        assertArrayEquals(expectedArray, resultArray);
        String[] differentArray = {"four", "five", "six"};
        assertNotEquals(differentArray, resultArray);
    }
}
