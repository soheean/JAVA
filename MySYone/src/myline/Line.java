package myline;

public abstract class Line {
	public double x1, x2, y1, y2;
    public String name;
    public Line(String name, int x1, int x2, int y1, int y2){
    	this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.name = name;
    }
    public void prname(String name)
    {
    	System.out.println(name);
    }
}
