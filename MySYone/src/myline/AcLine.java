package myline;

public class AcLine {

	public static void main(String[] args) {
		String name1 = "���ظ���";
        String name2 = "�ƺ�";
        String Highwaytype = "ʡ�ʸ���";
        String riverle = "һ������";
        Highway HW = new Highway(12580, Highwaytype, name1, 2, 3, 5, 4);
        River RV = new River(riverle, name2, 50, 5, 8, 1, 3);
        HW.prname(name1);//��������
        RV.prname(name2);
	}

}
