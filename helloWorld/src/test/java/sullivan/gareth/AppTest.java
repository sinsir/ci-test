package sullivan.gareth;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testgetHelloWorldString()
    {
        App test = new App();
        assertNotNull(test);
        assertEquals("Hello World, Gareth here!",test.getHelloWorldString());
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testgetHelloWorldString2()
    {
        App test = new App();
        assertNotNull(test);
        assertEquals("Hello World, master branch here!",test.getHelloWorldString2());
    }
}
