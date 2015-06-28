package myangel;

public class ClsTriangle {
	double x, y;
    double a;
    public ClsTriangle(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.a = 30;
    }
    public ClsTriangle(int x, int y, double a)
    {
        this.x = x;
        this.y = y;
        this.a = a;
    }		
    public double GetArea()
    {
        return 0.5 * x * y * Math.sin(a * Math.PI / 180);
    }
    public void ChangeAngle(double newangle)
    {
        this.a = newangle;
    }
}
