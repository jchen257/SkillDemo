import static org.junit.Assert.*;

import org.junit.*;

public class SkillDemoMultiplyTester {
    @Test
    public void multiply() {
        assertEquals(4, SkillDemoMultiply.multiply(2, 2));
    }
}
