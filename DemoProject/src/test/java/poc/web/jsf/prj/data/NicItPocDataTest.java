/**
 * 
 */
package poc.web.jsf.prj.data;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import poc.web.jsf.prj.bean.NicItPoc;

/**
 * @author Ashok Kumar Jha 
 * 
 *
 */
public class NicItPocDataTest {

    /**
     * Test method for {@link poc.web.jsf.prj.data.NicItPocData#getNicItPocs()}.
     */
    @Test
    public void testGetNicItPocs() {
        NicItPocData npd = new NicItPocData();
        List<NicItPoc> data = npd.getNicItPocs();
        assertFalse(data.isEmpty());
    }

}
