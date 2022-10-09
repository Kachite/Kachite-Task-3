public class HorizontalParabola {
    public double x0;
    public double y0;
    public double a;

    public HorizontalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isBelowParabola(double x, double y) {
        return y < a * Math.pow(x - x0, 2) + y0;
    }
}
