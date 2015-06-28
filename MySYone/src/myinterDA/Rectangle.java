package myinterDA;

public class Rectangle implements DiagArea {
	public double w, h, temp, DG;
    public Rectangle(double w,double h)
    {
        this.w = w;
        this.h = h;
        //¹¹Ôìº¯Êý
    }
    public Rectangle()
    { 
        
    }
    public double getArea()
    { 
        return w * h;
    }
    public double getDiagonal()
    {
        temp = w * w + h * h;
        DG = Math.sqrt(temp);
        return DG;
    }
}
