import java.util.*;
public class Rational {
    private long[] r = new long[2];

    public Rational(long num, long den) {
        if (den == 0) throw new IllegalArgumentException("Zero denominator.");
        long g = gcd(num, den);
        r[0] = num / g;
        r[1] = den / g;
    }

    private long gcd(long a, long b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    public Rational add(Rational o) {
        long n = r[0] * o.r[1] + o.r[0] * r[1];
        long d = r[1] * o.r[1];
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        return r[0] + "/" + r[1];
    }

    public static void demo() {
        Rational r1 = new Rational(1, 3);
        Rational r2 = new Rational(1, 6);
        System.out.println("Sum: " + r1.add(r2));
    }
}
