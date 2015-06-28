package gridlaysy;
import java.awt.*;   // 载入java.awt类库里的所有类

public class Mygridcal {
	static TextField tt = new TextField("0");
	static Frame frm=new Frame("计算器");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayout gl = new GridLayout(4,4);
		BorderLayout bl = new BorderLayout();
		Panel pn = new Panel();
		
		pn.setLayout(gl);
		frm.setLayout(bl);
		Button b1 = new Button("7");
		Button b2 = new Button("8");
		Button b3 = new Button("9");
		Button b4 = new Button("/");
		Button b5 = new Button("4");
		Button b6 = new Button("5");
		Button b7 = new Button("6");
		Button b8 = new Button("*");
		Button b9 = new Button("1");
		Button b10 = new Button("2");
		Button b11 = new Button("3");
		Button b12 = new Button("-");
		Button b13 = new Button("0");
		Button b14 = new Button(".");
		Button b15 = new Button("=");
		Button b16 = new Button("+");

		frm.add(tt,BorderLayout.NORTH);
		
		frm.add(pn,BorderLayout.CENTER);
		pn.add(b1);
		pn.add(b2);
		pn.add(b3);
		pn.add(b4);
		pn.add(b5);
		pn.add(b6);
		pn.add(b7);
		pn.add(b8);
		pn.add(b9);
		pn.add(b10);
		pn.add(b11);
		pn.add(b12);
		pn.add(b13);
		pn.add(b14);
		pn.add(b15);
		pn.add(b16);
		pn.setSize(200, 200);

		frm.setSize(200,220);   // 设置窗口的长为500，宽为500个像素
		//frm.setBackground(Color.green);  // 设黄色的背景
		//frm.setLocation(250,250);     // 设置窗口的位置
		frm.setVisible(true);         // 将窗口显示出来
	}

}
