import java.util.Scanner;

public class Main {
    public static final Line L1 = new Line(-3, 2, -1);
    public static final HorizontalParabola P1 = new HorizontalParabola(3, -2, -1);
    public static final Circle C1 = new Circle(2, -2, 3);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = sc.nextDouble();
        printColorForPoint(x, y);
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
    }

    public static SimpleColor getColor(double x, double y) {
        if ((P1.isBelowParabola(x, y) && C1.isWithinCircle(x, y))
                || (L1.isPointAboveLine(x, y) && C1.isWithinCircle(x, y))) {
            return SimpleColor.YELLOW;
        }
        if (L1.isPointAboveLine(x, y) && !C1.isWithinCircle(x, y) && !P1.isBelowParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if ((!L1.isPointAboveLine(x, y) && C1.isWithinCircle(x, y) && !P1.isBelowParabola(x, y))
                || (!C1.isWithinCircle(x, y) && P1.isBelowParabola(x, y))
                || (x > 5 && !L1.isPointAboveLine(x, y))) {
            return SimpleColor.BLUE;
        }
        return SimpleColor.GRAY;
    }
}

