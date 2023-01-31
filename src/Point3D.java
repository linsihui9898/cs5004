import org.junit.Test;

public class Point3D {
    private int x;
    private int y;
    private int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        this.x = 2;
        this.y = 3;
        this.z = 1;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    //Return the distance of this point and the other point
    public double distanceTo (Point3D other) {
        /**
        Get the differences between the coordinates of the
         default point and the other point and calculate
         two power of the differences
         */
        int X = (int) Math.pow(other.getX() - getX(), 2);
        int Y = (int) Math.pow(other.getY() - getY(), 2);
        int Z = (int) Math.pow(other.getZ() - getZ(), 2);
        double distance = Math.sqrt(X + Y + Z);
        return Math.round(distance * 100.0) / 100.0;
    }


    public boolean same(Point3D other) {

        return  this.getX() == (other.getX())
                && this.getY() == (other.getY())
                && this.getZ() == (other.getZ());
    }

}
