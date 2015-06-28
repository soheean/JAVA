package myshape;

public class Square extends Shape {
	public double side;
	public Square(double side)
	{
		this.side = side;
	}
    public double calculateArea()//方法重载与方法继承
    {
        return side * side;
    }
}
