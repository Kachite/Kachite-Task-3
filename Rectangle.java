public class Rectangle {
    public double left_x;
    public double right_x;
    public double upper_y;
    public double lower_y;

    public Rectangle(double left_x, double right_x,double upper_y,double lower_y){
        this.left_x = left_x;
        this.right_x = right_x;
        this.upper_y = upper_y;
        this.lower_y = lower_y;
    }

    public boolean isWithinRectangle(double x, double y){
        return x >= left_x && x <= right_x && y >= lower_y && y <= upper_y;
    }
}
