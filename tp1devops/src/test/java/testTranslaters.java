import org.example.Point;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTranslaters {

    static Point a;

    @BeforeAll
    public static void initialisation() {
        a = new Point (3,2);
    }

    @Test
    public final void testTranslater0_0() {
        Point expected = new Point(3,2);
        Point obtained = a.translater(0,0);
        assertEquals(expected, obtained);
    }

    @Test
    public final void testTranslater1_3() {
        Point expected = new Point(2,5);
        Point obtained = a.translater(1,3);
        assertEquals(expected, obtained);
    }
}
