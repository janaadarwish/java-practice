class ComparableCircle implements Comparable<ansComparableCircle> {
    double radius;

    ComparableCircle(double r) { radius = r; }
    double getArea() { return Math.PI * radius * radius; }

    @Override
    public int compareTo(ansComparableCircle o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ansComparableCircle)) return false;
        return this.radius == ((ansComparableCircle) obj).radius;
    }

    public String toString() {
        return "Circle r=" + radius + " area=" + getArea();
    }
}

public class ansComparableCircle {
    public static void demo() {
        ansComparableCircle c1 = new ansComparableCircle(3);
        ansComparableCircle c2 = new ansComparableCircle(3);

        System.out.println("Compare: " + c1.compareTo(c2));
        System.out.println("Equals: " + c1.equals(c2));
    }
}
