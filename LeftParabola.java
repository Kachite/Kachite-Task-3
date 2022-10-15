public class LeftParabola {
    public double x0;
    public double y0;
    public double a;

    public LeftParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isLeftOfParabola(double x, double y) {
        return x <= Math.pow(y - y0, 2) + x0;
    }
}
