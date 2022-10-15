import java.util.Scanner;

public class Main {
    public static final Line L1 = new Line(0, 3, 0.5);
    public static final LeftParabola P1 = new LeftParabola(-1, -1, -0.5);
    public static final RightParabola P2 = new RightParabola(-5, 2, 0.5);
    public static final Rectangle R1 = new Rectangle(-2,0,2,-6);
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
        if ((!L1.isPointAboveLine(x, y) && !P1.isLeftOfParabola(x, y) && !R1.isWithinRectangle(x, y) && !P2.isRightOfParabola(x, y))
        || (R1.isWithinRectangle(x, y) && !P1.isLeftOfParabola(x, y) && P2.isRightOfParabola(x, y))){
            return SimpleColor.ORANGE;
        }
        if (P1.isLeftOfParabola(x,y) && !P2.isRightOfParabola(x,y) && !L1.isPointAboveLine(x,y)){
            return SimpleColor.GRAY;
        }
        if ((L1.isPointAboveLine(x,y) && !P1.isLeftOfParabola(x,y) && !P2.isRightOfParabola(x,y))
                || (L1.isPointAboveLine(x,y) && P1.isLeftOfParabola(x,y) && P2.isRightOfParabola(x,y))) {
            return SimpleColor.GREEN;
        }
        return SimpleColor.YELLOW;
   }
}

