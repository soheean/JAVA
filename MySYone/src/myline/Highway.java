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
        System.out.println("====�������====");
        System.out.print("X:" + x1 + " ");
        System.out.println("Y:" +y1);
        System.out.println("====�յ�����====");
        System.out.print("X:" + x2 + " ");
        System.out.println("Y:" + y2);
        System.out.println("====����·����====");
        System.out.println(Highwaytype);
        System.out.println("====����====");
        System.out.println(Higgwaylength);
        System.out.print("=====================================================\n");

    }
}
