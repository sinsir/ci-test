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
        assertEquals("Hello World!",test.getHelloWorldString());
    }
}
