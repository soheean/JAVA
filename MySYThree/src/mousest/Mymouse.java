package mousest;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Mymouse extends JFrame implements MouseListener,MouseMotionListener{
	static JTextField tt = new JTextField();
	public Mymouse(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//BorderLayout bl = new BorderLayout();
		this.add(tt,BorderLayout.SOUTH);
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymouse mf = new Mymouse();
		mf.setSize(400, 400);
		mf.setTitle("鼠标监测");
		mf.setLocation(400, 50);
		mf.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == MouseEvent.BUTTON3)//右键按下：e.isMetaDown()
		{
			tt.setText(tt.getText() + "鼠标右键按下");
		}
		if (e.getButton() == MouseEvent.BUTTON1)
		{
			tt.setText(tt.getText() + "鼠标左键按下");
		}
	
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
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		tt.setText("光标坐标:X='" + e.getX() + "'" + "Y='" + e.getY() + "'");
	}

}
