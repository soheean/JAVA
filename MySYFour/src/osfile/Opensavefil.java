package osfile;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class Opensavefil extends JFrame implements ActionListener{
	JFileChooser chooser;
	JFileChooser chooser1;
	FileFilter filter;
	static JTextArea jt = new JTextArea();
	static JButton bt1 = new JButton("打开");
	static JButton bt2 = new JButton("保存");
	public Opensavefil()
	{
		chooser = new JFileChooser();
		chooser1 = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//设置选择模式，既可以选择文件又可以选择文件夹
        chooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String extj[] = { "txt","TXT" };
        filter = new FileNameExtensionFilter( "*.TXT",extj);
        chooser.setFileFilter(filter);//设置文件后缀过滤器
        chooser1.setFileFilter(filter);//设置文件后缀过滤器
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gl = new GridLayout(1,2);
		JPanel pn = new JPanel();
		pn.setLayout(gl);
		Container c=this.getContentPane();
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		JScrollPane jp=new JScrollPane(jt);
		
		c.add(jp);
		c.add(pn,BorderLayout.SOUTH);
		pn.add(bt1);
		pn.add(bt2);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Opensavefil frm = new Opensavefil();
		frm.setSize(450,450);   // 设置窗口的长为500，宽为500个像素
		//frm.setBackground(Color.green);  // 设黄色的背景
		frm.setTitle("文件demo");
		frm.setLocation(300,200);     // 设置窗口的位置
		frm.setVisible(true);         // 将窗口显示出来
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int retval;
        String selection = e.getActionCommand();
        if(selection.equals("打开")) {
            retval = chooser.showOpenDialog(this);//显示"保存文件"对话框
            if(retval == JFileChooser.APPROVE_OPTION) {//若成功打开
                File file = chooser.getSelectedFile();//得到选择的文件名
                try {
                	BufferedReader reader = new BufferedReader(new FileReader(file));
                	String tempString = null;
        	        while ((tempString = reader.readLine()) != null) {
        	            jt.setText(jt.getText() + "\n" + tempString);
        	        }
        	        reader.close();
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
                System.out.println("File to open " + file);
            }
        } 
        else if(selection.equals("保存")) {
            File file = new File("save.txt");
            FileWriter writer;
            
            chooser1.setSelectedFile(file);//设置默认文件名
            retval = chooser1.showSaveDialog(this);//显示“保存文件”对话框
            if(retval == JFileChooser.APPROVE_OPTION) {
                file = chooser1.getSelectedFile();
                System.out.println("File to save " + file);
                try {
    				writer = new FileWriter(file);
    				writer.write(jt.getText() +"\n");
    				
    	            writer.flush();
    	            writer.close();
    			} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            }
        }
	}

}
