public class Physics {
    public static double velocity(Point3D one, Point3D two, double elapsedTime) {
        double distance = one.distanceTo(two);
        if (elapsedTime < 0 || elapsedTime == 0) {
            throw new IllegalArgumentException("elapsedTime cannot be zero or negative");
        }
        return Math.round((distance/elapsedTime) * 100.0) / 100.0;
    }

    public static void main(String [] args) {
        try{
            Point3D one = new Point3D();
            Point3D two = new Point3D(1, 1, 1);
            System.out.println("Displacement = " + one.distanceTo(two));
            double velocity = Physics.velocity(one, two, 0);
            System.out.println("Velocity =" + velocity);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Encounter an error: " + e.getMessage());
        }
    }

}

