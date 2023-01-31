import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PhysicsTest {

    private Point3D one;
    private Point3D two;
    private static final double DELTA = 1e-15;

    @Before
    public void setUp() {
        one = new Point3D(4, 5, 2);
        two = new Point3D(0, -1, 1);
    }

    @Test
    public void velocityTest() {
        double elapsedTime1 = 3;
        assertEquals(2.43, Physics.velocity(one, two, elapsedTime1), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalVelocity() {
        double elapsedTime2 = 0;
        Physics.velocity(one, two, elapsedTime2);
    }

}
