package lan.zold;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class RombuszTest {

    private Rombusz rombusz;

    @BeforeTest
    public void setup() {
        this.rombusz = new Rombusz();
    }

    @Test
    public void testSzamolKerulet() {
        assertEquals(20.0, rombusz.szamolKerulet(5.0), 0.001);
        assertEquals(30.0, rombusz.szamolKerulet(7.5), 0.001);
    }

    @Test
    public void testSzamolTerulet() {
        assertEquals(25.0, rombusz.szamolTerulet(5.0, 90.0), 0.001);
        assertEquals(56.25, rombusz.szamolTerulet(7.5, 45.0), 0.001);
    }

    @Test
    public void testSzamolTeruletNegativOldal() {
        assertThrows(IllegalArgumentException.class, () -> rombusz.szamolTerulet(-5.0, 90.0));
    }

    @Test
    public void testSzamolTeruletTulnagySzog() {
        assertThrows(IllegalArgumentException.class, () -> rombusz.szamolTerulet(5.0, 120.0));
    }
}