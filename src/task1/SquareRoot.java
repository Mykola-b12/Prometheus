package task1;

public class SquareRoot {

    public static void main(String[] args) {
        double a = 3d;
        double b = 2.5;
        double c = -0.5;
        double x1;
        double x2;

        double d = (double) (b * b) - 4 * a * c;
        if (a == 0 || d < 0) {
            System.out.println("x1=" + "\nx2=");
        } else if (d > 0) {
            x1 = (double)(-b + Math.sqrt(d)) / (2 * a);
            x2 = (double)(-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1 + "\nx2=" + x2);
        } else if (d == 0) {
            x1 = (double)(-b) / (2 * a);
            x2 = x1;
            System.out.println("x1=" + x1 + "\nx2=" + x2);

        }
    }
}