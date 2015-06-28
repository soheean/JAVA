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
		Container c=this.getContentPane(); //JFrame.getContentPane()的返回值是Container类型的  
		c.add(tt,BorderLayout.NORTH); //将文本框增加到主框架上  
        c.add(pn,BorderLayout.CENTER); //将面板增加到主框架上  
		
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
		frm.setSize(200,220);   // 设置窗口的长为500，宽为500个像素
		//frm.setBackground(Color.green);  // 设黄色的背景
		frm.setTitle("计算器");
		frm.setLocation(250,250);     // 设置窗口的位置
		frm.setVisible(true);         // 将窗口显示出来
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tt.setText(tt.getText()+e.getActionCommand()); //jtf.setText()设置文本框里的内容。jtf.getText()获取文本框里的内容。e.getActionCommand获取事件组件的名字  
	}

}
