package form2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Testform extends JFrame implements MouseListener,ChangeListener{
	static JTextField jt = new JTextField("5000");
	static JButton bt = new JButton("确定");	
	static JLabel jl = new JLabel("当前计算进度：0%");
	static JProgressBar pgsb = new JProgressBar();
	static long num;
	public Testform(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pgsb.setOrientation(JProgressBar.HORIZONTAL);
		pgsb.setMinimum(0);
		pgsb.setMaximum(100);
		pgsb.setValue(0);
		pgsb.setStringPainted(true);
		pgsb.addChangeListener(this);
		pgsb.setPreferredSize(new Dimension(300,20));
		pgsb.setBorderPainted(true);
		pgsb.setBackground(Color.green);
		
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
		Testform My = new Testform();
		My.setSize(300, 200);
		My.setTitle("计算结果");
		My.setLocation(400, 200);
		My.setVisible(true);
		//String text = jt.getText();
		//num = Long.parseLong(text);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		num = Long.parseLong(jt.getText());
		totalnum tn = new totalnum(num);
		cThread ct = new cThread(tn);
		new Thread(ct).start();
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
class totalnum
{
	long num = 0;
	long sum = 0;
	public totalnum(long num1)
	{
		this.num = num1;
	}
	/** 
     * 减少公共资源 
     */  
    public synchronized long decreace() {  
        while (num == 0) {  
            try {  
                wait();  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }
        sum += num;
        num--;  
        System.out.println(num);  
        notify();
        return sum;  
    }  
}
/** 
 * 消费者线程，负责消费公共资源 
 */  
class cThread implements Runnable {  
    private totalnum tnum;  
    private long sum = 0;
    public cThread(totalnum tnum) {  
        this.tnum = tnum;  
    }  
  
    @Override  
    public void run() {  
        for (int i = 1; i <= form2.Testform.num ; i++) {  
            try {  
                Thread.sleep((long) (Math.random() * 10));
                //Thread.sleep((long) (20));
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }
            double tt = (double)form2.Testform.num;
            int tt1 = (int) (i/tt * 100);
            form2.Testform.pgsb.setValue(tt1);
            form2.Testform.jl.setText("当前计算进度：" + tt1 + "%");
            //form2.Testform.pgsb.setValue(55);
            sum = tnum.decreace();
            form2.Testform.jt.setText(String.valueOf(sum));
        }
        //form2.Testform.jt.setText(String.valueOf(sum));
    }  
}  
