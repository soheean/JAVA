package myshape;

public class Rectangle extends Shape {
	public double length,width;
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
    public double calculateArea()//���������뷽���̳�
    {
        return length * width;
    }
}
