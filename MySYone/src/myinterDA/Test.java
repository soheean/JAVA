package myinterDA;

public class Test {

	public static void main(String[] args) {
		Rectangle RT = new Rectangle(2,3);
        Square SR = new Square(4);
        
        double area1 = RT.getArea();
        double area2 = SR.getArea();
        double Diagonal1 = RT.getDiagonal();
        double Diagonal2 = SR.getDiagonal();
        double side = SR.getSide();
        
        System.out.print("���������Ϣ\n");
        System.out.println(area1);
        System.out.println(Diagonal1);
        System.out.print("�����������Ϣ:\n");
        System.out.println(area2);
        System.out.println(Diagonal2);
        System.out.println(side);
	}

}
