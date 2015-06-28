package gridlaysy;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Mygridcal1 extends JFrame implements ActionListener {
	
	static JTextField tt =new JTextField("0");
	
	public Mygridcal1()
	{
		//使JFrame点击关闭时什么也不做，自己实现windowClosing的所有操作
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new MyListener());
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
	public class MyListener implements WindowListener{

        @Override
        public void windowActivated(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowClosed(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowClosing(WindowEvent e) {
            // TODO Auto-generated method stub
            //System.out.println("试图关闭时调用,this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);一起使用");
            //JOptionPane.showMessageDialog(null, "你要关闭窗体了", "警告", JOptionPane.WARNING_MESSAGE );
            int j = JOptionPane.showConfirmDialog(null, "是否退出？", "警告", JOptionPane.YES_NO_OPTION);
        	if (j == 0){
        		//dispose();
        		System.exit(0);
        	}
        	
            /*int i = JOptionPane.showConfirmDialog(null, 
                    "你没有保存", "choose one", JOptionPane.YES_NO_CANCEL_OPTION);
             if(i==1){
                 JOptionPane.showMessageDialog(null, "你点了否", "警告", JOptionPane.WARNING_MESSAGE );
                 return;
             }
             if(i==2){
                 JOptionPane.showMessageDialog(null, "你点了取消", "警告", JOptionPane.WARNING_MESSAGE );
                 return;
             }
             if(i==0){
                 JOptionPane.showMessageDialog(null, "你点了是", "警告", JOptionPane.WARNING_MESSAGE );
                 System.exit(0);
             }*/

        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowIconified(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void windowOpened(WindowEvent e) {
            // TODO Auto-generated method stub
            
        }
        
        
        
    }

}
