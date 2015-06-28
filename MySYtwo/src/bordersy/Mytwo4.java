package bordersy;
import java.awt.*;   // 载入java.awt类库里的所有类

public class Mytwo4 {
	static Frame frm=new Frame("BorderLayout Sample");
	public static void main(String args[])
	{
		BorderLayout bdl = new BorderLayout();
		BorderLayout bdl1 = new BorderLayout();
		Panel pn = new Panel();
		pn.setLayout(bdl1);
		frm.setLayout(bdl);
		
		TextArea ta = new TextArea("TextArea");
		
		frm.add(ta, BorderLayout.CENTER);
		frm.add(pn,BorderLayout.EAST);
		pn.add(new Button("Button1"),BorderLayout.NORTH);
		pn.add(new Button("Button2"),BorderLayout.WEST);
		pn.add(new Button("Button3"),BorderLayout.CENTER);
		Choice ch = new Choice();
		ch.add("Linden");
		pn.add(ch,BorderLayout.SOUTH);
		frm.add(new TextField("TextField"), BorderLayout.SOUTH);
		
		
		frm.setSize(200,200);   // 设置窗口的长为500，宽为500个像素
		//frm.setBackground(Color.green);  // 设黄色的背景
		frm.setLocation(250,250);     // 设置窗口的位置
		frm.setVisible(true);         // 将窗口显示出来
	}
}
