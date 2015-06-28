package myline;

public class AcLine {

	public static void main(String[] args) {
		String name1 = "夏蓉高速";
        String name2 = "黄河";
        String Highwaytype = "省际高速";
        String riverle = "一级河流";
        Highway HW = new Highway(12580, Highwaytype, name1, 2, 3, 5, 4);
        River RV = new River(riverle, name2, 50, 5, 8, 1, 3);
        HW.prname(name1);//方法调用
        RV.prname(name2);
	}

}
