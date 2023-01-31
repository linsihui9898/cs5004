import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Point3DTest {

    private static final double DELTA = 1e-15;
    private Point3D ONE;
    private Point3D TWO;

    @Before
    public void setUp() {
        this.ONE = new Point3D();
        this.TWO = new Point3D(-3, 1, 2);
    }

    @Test
    public void test_getX() {
        assertEquals(2, ONE.getX());
        assertEquals(-3, TWO.getX());
    }

    @Test
    public void test_getY() {
        assertEquals(3, ONE.getY());
        assertEquals(1, TWO.getY());
    }

    @Test
    public void test_getZ() {
        assertEquals(1, ONE.getZ());
        assertEquals(2, TWO.getZ());
    }

    @Test
    public void test_distanceTo() {
        Point3D other = new Point3D(-1, 0, 4);
        assertEquals(5.20, ONE.distanceTo(other),DELTA);
        assertEquals(3, TWO.distanceTo(other),DELTA);
    }

    @Test
    public void testSamePoint() {
        Point3D a = new Point3D(9,-2,5);
        Point3D b = new Point3D(-8,7,-10);
        Point3D c = new Point3D(-8,7,-10);
        Point3D d = new Point3D(0,0,0);
        Point3D e = new Point3D();

        assertFalse(a.same(b));
        assertFalse(a.same(e));
        assertFalse(d.same(e));
        assertTrue(b.same(c));
    }

}
