public abstract class GeometricObject implements Comparable<GeometricObject> {
    public abstract double getArea();

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    public static GeometricObject max(GeometricObject a, GeometricObject b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }
}

class CircleGeo extends GeometricObject {
    double radius;
    CircleGeo(double r) { radius = r; }
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public String toString() {
        return "Circle area=" + getArea();
    }
}

class GeometricObjectMax {
    public static void demo() {
        CircleGeo c1 = new CircleGeo(3);
        CircleGeo c2 = new CircleGeo(5);

        System.out.println("Max is: " + GeometricObject.max(c1, c2));
    }
}
