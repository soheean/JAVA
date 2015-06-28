package myline;

public class River extends Line {
	public String riverlevel;
	public double riverdepth;
	public River(String riverlevel, String name, double riverdepth, int x1, int x2, int y1, int y2) {
		super(name, x1, x2, y1, y2);
		this.riverlevel = riverlevel;
		this.riverdepth = riverdepth;
	}
	
    public void prname(String name)
    {
        System.out.println(name);
        System.out.println("====起点坐标====");
        System.out.print("X:" + x1 + " ");
        System.out.println("Y:" +y1);
        System.out.println("====终点坐标====");
        System.out.print("X:" + x2 + " ");
        System.out.println("Y:" + y2);
        System.out.println("====河流等级====");
        System.out.println(riverlevel);
        System.out.println("====河流水深====");
        System.out.println(riverdepth);
        System.out.print("====================================================\n");

    }
}
