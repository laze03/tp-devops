import org.example.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTranslater0_0 {

    @Test
    public final void testTranslater0_0() {
        Point a = new Point (1, 2);
        Point expected = new Point(1,2);
        Point obtained = a.translater(0,0);
        assertEquals(expected, obtained);

    }
}
