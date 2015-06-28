package bordersy;
import java.awt.*;   // ����java.awt������������

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
		
		
		frm.setSize(200,200);   // ���ô��ڵĳ�Ϊ500����Ϊ500�����د�
		//frm.setBackground(Color.green);  // ���ɫ�ı���
		frm.setLocation(250,250);     // ���ô��ڵ�λ��
		frm.setVisible(true);         // ��������ʾ����
	}
}
