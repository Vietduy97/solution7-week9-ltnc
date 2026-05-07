
import com.practice.maven.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils m = new MathUtils();
        assertEquals(5, m.add(2, 3));
    }

    @Test
    void testDivideNormal() {
        MathUtils m = new MathUtils();
        assertEquals(2, m.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        MathUtils m = new MathUtils();
        assertEquals(0, m.divide(4, 0));
    }
    @Test
    void testAddMultipleCases() {
        MathUtils m = new MathUtils();
        assertEquals(0, m.add(0, 0));
        assertEquals(5, m.add(2, 3));
        assertEquals(-1, m.add(2, -3));
        assertEquals(10, m.add(2,3));
        assertEquals(100,m.add(36,18));
    }
}