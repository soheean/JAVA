package myangel;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClsTriangle obj1 = new ClsTriangle(3, 4);
        ClsTriangle obj2 = new ClsTriangle(10, 12, 90);

        double area1 = obj1.GetArea();
        double area2 = obj2.GetArea();
        
        System.out.println((int)area1);
        System.out.println((int)area2);
        //修改角度求面积
        obj2.ChangeAngle(60);
        double area3 = obj2.GetArea();
        System.out.println((int)area3);
	}

}
