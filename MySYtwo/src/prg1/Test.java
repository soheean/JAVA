package prg1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[] = {"abc", "123", "a123"};
		System.out.println("�����±�����Խ���쳣");
		try{
			System.out.println("��1������Ԫ��ֵΪ:" + x[0]);
			System.out.println("��2������Ԫ��ֵΪ:" + x[1]);
			System.out.println("��4������Ԫ��ֵΪ:" + x[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//���ӻ��߲���ʱ�����쳣
		    //��ӡ�쳣���������Exception�����printStackTrace��������
			System.out.println("����Խ��!!Խ������"+ e.getMessage());
			//e.printStackTrace();
		}
		finally
		{
			
		}
		try
		{
			int aa = Integer.parseInt(x[0]);
			System.out.println("��תΪ���ε�ֵΪ " + aa);	
		}
		catch (NumberFormatException e)
		{
			System.out.println("�ַ�������ת��Ϊ����" + e.getMessage());
		}
		finally
		{
			
		}
	}

}
