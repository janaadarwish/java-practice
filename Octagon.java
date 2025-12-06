public class Octagon implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon(double side) { this.side = side; }

    public double getArea() {
        return (2 + 4/Math.sqrt(2)) * side * side;
    }

    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void demo() {
        Octagon o = new Octagon(5);
        Octagon c = (Octagon) o.clone();

        System.out.println("Area: " + o.getArea());
        System.out.println("Compare: " + o.compareTo(c));
    }
}
