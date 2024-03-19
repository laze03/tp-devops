import org.example.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTranslater1_3 {

    @Test
    public final void testTranslater1_3() {
        Point a = new Point (1, 2);
        Point expected = new Point(2,5);
        Point obtained = a.translater(1,3);
        assertEquals(expected, obtained);

    }
}
