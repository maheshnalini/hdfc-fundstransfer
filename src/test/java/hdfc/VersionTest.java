package hdfc;

import com.google.common.base.CharMatcher;
import org.junit.Test;
import static org.junit.Assert.*;

public class VersionTest {
    @Test
    public void versionIsDefined() {
        String version=hdfc.Version.get();
        assertNotNull(version);
        assertNotEquals("",version);

        // a version number ought to have a digit in it somewhere
        assertTrue(CharMatcher.DIGIT.matchesAnyOf(version));
    }
}