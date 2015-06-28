package sjxpak;

public class Test {

	public static void main(String[] args) {
		
		double area;
		Sjx triangel = null;
		try {
			triangel = new Sjx(3, 4, 5);
			
		} 
		catch (NotSjxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally
		{
			area = triangel.getArea();
			System.out.println(area);
			triangel.showInfo();
		}

	}

}