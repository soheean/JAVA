package formex;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.*;

import javax.swing.*;

public class Formtt extends JFrame{
	JButton jt1 = new JButton("打开");
	JButton jt2 = new JButton("保存");
	public Formtt()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel jn = new JPanel();
		this.setLayout(new BorderLayout());
		jn.setLayout(new FlowLayout());
		paintpanel pt1 = new paintpanel();
		this.getContentPane().add(pt1);
		this.add(jn,BorderLayout.SOUTH);
		jn.add(jt1,FlowLayout.LEFT);
		jn.add(jt2,FlowLayout.CENTER);
		
		
		this.setSize(400, 400);
		this.setTitle("综合练习DEMO");
		this.setLocation(400, 100);
	}
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Formtt ft = new Formtt();
		JFrame ft1 = null;
		try
		{
			FileOutputStream fout = new FileOutputStream("draw.txt");
			ObjectOutputStream os =  new ObjectOutputStream(fout);
			os.writeObject(ft);
			os.close();
			fout.close();
		}
		catch (IOException ex)
		{
			
		}
		try
		{
			FileInputStream fi = new FileInputStream("draw.txt");
			ObjectInputStream is =  new ObjectInputStream(fi);
			ft1 = (JFrame) is.readObject();
			ft1.setTitle("对象流DEMO");
			ft1.setLocation(800, 200);
			is.close();
			fi.close();
		}
		catch (IOException ex)
		{
			
		}
		ft1.setVisible(true);
		ft.setVisible(true);
	}
	class paintpanel extends Canvas implements MouseListener, MouseMotionListener 
	{

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
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
		//实例化点、线、面
		pointdm pt = new pointdm(250,50);
		linedm ln = new linedm(20,20,200,200);
		linedm ln1 = new linedm(50,30,250,90);
		
		int xnum[] = {10,20,50,60,150};
		int ynum[] = {50,90,100,200,40};
		
		int xnum1[] = {100,100,200,200};
		int ynum1[] = {100,200,200,100};
		polygondm pg = new polygondm(xnum,ynum,5);
		polygondm pg1 = new polygondm(xnum1,ynum1,4);
		
		//调用ObjectInputStream和ObjectOutputStream
		public void paint(Graphics g)
		{
			pt.Draw(g);
			ln.Draw(g);
			ln1.Draw(g);
			pg.Draw(g);
			pg1.Draw(g);
		}
		
		public void update(Graphics g)                         //更新组件
        {
            this.paint(g);
        }
		
	}
}
abstract class DrawShape
{
	abstract void Draw(Graphics g);
}
class pointdm extends DrawShape implements Serializable
{
	Point sx;
	
	public pointdm(int x1, int y1)
	{
		 this.sx = new Point(x1,y1);
	}
	@Override
	void Draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(sx.x, sx.y, 1, 1);
	}
}
class linedm extends DrawShape implements Serializable
{
	Point start,end;
	public linedm(int x1, int y1, int x2, int y2)
	{
		 this.start = new Point(x1,y1);
		 this.end = new Point(x2,y2);
	}
	@Override
	void Draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);                        //设置画线颜色
        g.drawLine(start.x, start.y, end.x, end.y);
	}	
}
class polygondm extends DrawShape implements Serializable
{
	int xn[];
	int yn[];
	int num;	
	
	public polygondm(int[] x1, int[] y1, int num)
	{
		xn = new int[num];
		yn = new int[num];
		for (int i = 0; i < num;i++)
		{
			xn[i] = x1[i];
			yn[i] = y1[i];
		}
		this.num = num;
	}
	@Override
	void Draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawPolygon(xn, yn, num);
	}
}
