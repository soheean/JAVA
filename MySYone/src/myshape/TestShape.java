package myshape;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle RT = new Rectangle(10, 9);
        Square SR = new Square(8);
        Circle CC = new Circle(7);

        SR.showArea();
        CC.showArea();
        RT.showArea();//方法实现
	}

}
