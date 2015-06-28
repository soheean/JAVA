package myinterDA;

public class Square extends Rectangle{
	double side;
    public Square(double side)
    {
    	this.side = side;
    }
    public double getArea()
    {
        double area;
        area = side * side;
        return area;
    }
    public double getDiagonal()
    {
        temp = 2 * side * side;
        DG = Math.sqrt(temp);
        return DG;
    }
    public double getSide()
    {
        return side;
    }
    //定义一个方法显示边长、面积和对角线长。
}
