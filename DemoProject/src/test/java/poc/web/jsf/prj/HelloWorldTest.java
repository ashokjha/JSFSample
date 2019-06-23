/**
 * 
 */
package poc.web.jsf.prj;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author  Ashok Kumar Jha 
 *
 */
public class HelloWorldTest {

    /**
     * Test method for {@link poc.web.jsf.prj.HelloWorld#HelloWorld()}.
     */
    @Test
    public void testHelloWorld() {
        
        assertNotNull(new HelloWorld() );
    }

    /**
     * Test method for {@link poc.web.jsf.prj.HelloWorld#getMessage()}.
     */
    @Test
    public void testGetMessage() {
        assertEquals((new HelloWorld()).getMessage(), "Hello World from NIC KOLKATA to Digital India!");;
    }

}
