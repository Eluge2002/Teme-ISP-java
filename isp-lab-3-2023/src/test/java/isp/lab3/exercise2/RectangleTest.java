package isp.lab3.exercise2;

import static org.junit.Assert.assertEquals;


import junit.framework.TestCase;
import org.junit.Test;

public class RectangleTest extends TestCase {
    Rectangle rectangle = new Rectangle();

    @Test
    public void testRectangle() {
        assertEquals("Should give the perimeter: ", 16, Rectangle.getPerimeter(2, 6));
        assertEquals("should give the area", 12, Rectangle.getArea(2, 6));
    }
}