import com.ipp.sckeedoo.builder.prototype.TechCache;
import com.ipp.sckeedoo.builder.tech.Tech;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BuilderPatternTest {

    @Before
    @Test
    public void prepare() {
        TechCache.loadCache();
        assertNotNull(TechCache.getTechMap());
    }


    @Test
    public void testNumberOfPortables() {
        List<Tech> portable = TechCache.getTech("Portable");
        assertTrue(portable.size() == 3);
    }



    @Test
    public void testNumberOfStationary() {
        List<Tech> portable = TechCache.getTech("Stationary");
        assertTrue(portable.size() == 1);
    }


    @Test
    public void testNumberOfUnknown() {
        List<Tech> portable = TechCache.getTech("Alien Tech");
        assertTrue(portable == null);
    }


}
