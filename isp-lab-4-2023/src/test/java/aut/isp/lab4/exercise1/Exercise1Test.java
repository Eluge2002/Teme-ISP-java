package aut.isp.lab4.exercise1;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Exercise1Test extends TestCase {
    AquariumController aquariumController= new AquariumController("lada","3c",12.3F);
@Test
    public void TestEx1()
{
    assertEquals("AquariumController{manufacturer='lada', model='3c', currentTime=12.3F}",aquariumController);
}

}