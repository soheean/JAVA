package myshape;

public class Rectangle extends Shape {
	public double length,width;
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
    public double calculateArea()//方法重载与方法继承
    {
        return length * width;
    }
}
