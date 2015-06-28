package prg1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[] = {"abc", "123", "a123"};
		System.out.println("数组下标索引越界异常");
		try{
			System.out.println("第1个数组元数值为:" + x[0]);
			System.out.println("第2个数组元数值为:" + x[1]);
			System.out.println("第4个数组元数值为:" + x[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//连接或者操作时产生异常
		    //打印异常情况，调用Exception对象的printStackTrace（）方法
			System.out.println("数组越界!!越界数："+ e.getMessage());
			//e.printStackTrace();
		}
		finally
		{
			
		}
		try
		{
			int aa = Integer.parseInt(x[0]);
			System.out.println("“转为整形的值为 " + aa);	
		}
		catch (NumberFormatException e)
		{
			System.out.println("字符串不能转换为整数" + e.getMessage());
		}
		finally
		{
			
		}
	}

}
