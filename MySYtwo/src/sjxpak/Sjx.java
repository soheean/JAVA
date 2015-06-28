package sjxpak;

public class Sjx {
	int a1,b1,c1;
	public Sjx(int a, int b, int c) throws NotSjxException
	{
		this.a1 = a;
		this.b1 = b;
		this.c1 = c;
		if((a1 + b1 <= c1) || (a1 + c1 <= b1) || (b1 + c1 <= a1))
		{
			throw new NotSjxException("a，b，c不能构成三角形!!!!");
		}
	}
	public double getArea()
	{
		double temp;
		double area;
		temp = ((double)a1 + (double)b1 + (double)c1) / 2;
		area = Math.sqrt(temp * (temp - a1) * (temp - b1) * (temp - c1));
		return area;
	}
	public void showInfo()
	{	
		System.out.println("三角形边一：" + a1);
		System.out.println("三角形边二：" + b1);
		System.out.println("三角形边三：" + c1);
	}
}
