package myshape;

public class Square extends Shape {
	public double side;
	public Square(double side)
	{
		this.side = side;
	}
    public double calculateArea()//���������뷽���̳�
    {
        return side * side;
    }
}
