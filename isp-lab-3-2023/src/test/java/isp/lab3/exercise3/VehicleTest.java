package isp.lab3.exercise3;

import isp.lab3.exercise2.Rectangle;
import junit.framework.TestCase;
import org.junit.Test;

public class VehicleTest extends TestCase {
    private Vehicle vehicle;

    protected void setUp() {
        vehicle = new Vehicle("Dacia", "Papuc", 150, 'B');
    }

    @Test
    public void testToString() {
        String expected = "Vehicle model='Dacia', type=Papuc, speed=150, fuelType=B";
        String actual = vehicle.toString();
        assertEquals(expected, actual);
    }
}