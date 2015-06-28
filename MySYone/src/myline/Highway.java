package myline;

public class Highway extends Line {
	public String Highwaytype;
	public double Higgwaylength;
	public Highway(double Higgwaylength, String Highwaytype, String name, int x1, int x2, int y1, int y2) {
		super(name, x1, x2, y1, y2);
		this.Highwaytype = Highwaytype;
		this.Higgwaylength = Higgwaylength;
	}
    public String roadname;
    public void prname(String name)
    {
        System.out.println(name);
        System.out.println("====起点坐标====");
        System.out.print("X:" + x1 + " ");
        System.out.println("Y:" +y1);
        System.out.println("====终点坐标====");
        System.out.print("X:" + x2 + " ");
        System.out.println("Y:" + y2);
        System.out.println("====高速路类型====");
        System.out.println(Highwaytype);
        System.out.println("====长度====");
        System.out.println(Higgwaylength);
        System.out.print("=====================================================\n");

    }
}
