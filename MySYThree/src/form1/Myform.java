package form1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Myform extends JFrame implements MouseListener,ChangeListener{
	static JTextField jt = new JTextField();
	static JButton bt = new JButton("确定");	
	static JLabel jl = new JLabel("当前计算进度：0%");
	JProgressBar pgsb;
	public Myform(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pgsb = new JProgressBar();
		pgsb.setOrientation(JProgressBar.HORIZONTAL);
		pgsb.setMinimum(0);
		pgsb.setMaximum(100);
		pgsb.setValue(0);
		pgsb.setStringPainted(true);
		pgsb.addChangeListener(this);
		pgsb.setPreferredSize(new Dimension(300,20));
		pgsb.setBorderPainted(true);
		pgsb.setBackground(Color.pink);
		
		this.add(pgsb);
		pgsb.setBounds(130, 60, 70, 40);
		this.add(jt);
		jt.setBounds(10, 10, 100, 40);
		this.add(bt);
		bt.addMouseListener(this);
		bt.setBounds(130, 10, 70, 40);
		this.add(jl);
		jl.setBounds(50, 20, 70, 40);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myform My = new Myform();
		My.setSize(300, 200);
		My.setTitle("计算结果");
		My.setLocation(400, 50);
		My.setVisible(true);
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		long i,sum=0;
		int temp;
		String text = jt.getText();
		long num1 = Long.parseLong(text);
		
		for (i = 1;i<=num1;i++)
		{
			sum += i;
			temp = (int) (i/num1 * 100);
			pgsb.setValue(temp);
		}
		//jl.setText(jl.getText()+String.valueOf(sum));
		jt.setText(String.valueOf(sum));
		
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
class xc1 extends Thread
{
	long ed;
	long sum = 0;
	public xc1(long endnum)
	{
		this.ed = endnum;
	}
	public void run() {
		int i;
		for (i=0;i<ed;i++)
		{
			sum += i;
		}
		
	}
}
class xc2 extends Thread
{
	long ed;
	long sum2 = 0;
	public xc2(long endnum)
	{
		this.ed = endnum;
	}
	public void run() {
		int i;
		for (i=(int) (ed/2);i<ed;i++)
		{
			sum2 += i;
		}
	}
}
