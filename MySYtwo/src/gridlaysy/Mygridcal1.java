package gridlaysy;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Mygridcal1 extends JFrame implements ActionListener {
	
	static JTextField tt =new JTextField("0");
	
	public Mygridcal1()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gl = new GridLayout(4,4);
		JPanel pn = new JPanel();
		pn.setLayout(gl);
		Container c=this.getContentPane(); //JFrame.getContentPane()�ķ���ֵ��Container���͵�  
		c.add(tt,BorderLayout.NORTH); //���ı������ӵ��������  
        c.add(pn,BorderLayout.CENTER); //��������ӵ��������  
		
		JButton b = null;
		
		b = new JButton("7");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("8");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("9");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("/");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("4");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("5");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("6");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("*");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("1");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("2");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("3");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("-");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("0");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton(".");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("=");
		b.addActionListener(this);
		pn.add(b);
		b = new JButton("+");
		b.addActionListener(this);
		pn.add(b);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mygridcal1 frm = new Mygridcal1();
		frm.setSize(200,220);   // ���ô��ڵĳ�Ϊ500����Ϊ500�����د�
		//frm.setBackground(Color.green);  // ���ɫ�ı���
		frm.setTitle("������");
		frm.setLocation(250,250);     // ���ô��ڵ�λ��
		frm.setVisible(true);         // ��������ʾ����
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tt.setText(tt.getText()+e.getActionCommand()); //jtf.setText()�����ı���������ݡ�jtf.getText()��ȡ�ı���������ݡ�e.getActionCommand��ȡ�¼����������  
	}

}
