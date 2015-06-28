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
	static JButton bt1 = new JButton("��");
	static JButton bt2 = new JButton("����");
	public Opensavefil()
	{
		chooser = new JFileChooser();
		chooser1 = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//����ѡ��ģʽ���ȿ���ѡ���ļ��ֿ���ѡ���ļ���
        chooser1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        String extj[] = { "txt","TXT" };
        filter = new FileNameExtensionFilter( "*.TXT",extj);
        chooser.setFileFilter(filter);//�����ļ���׺������
        chooser1.setFileFilter(filter);//�����ļ���׺������
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
		frm.setSize(450,450);   // ���ô��ڵĳ�Ϊ500����Ϊ500�����د�
		//frm.setBackground(Color.green);  // ���ɫ�ı���
		frm.setTitle("�ļ�demo");
		frm.setLocation(300,200);     // ���ô��ڵ�λ��
		frm.setVisible(true);         // ��������ʾ����
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int retval;
        String selection = e.getActionCommand();
        if(selection.equals("��")) {
            retval = chooser.showOpenDialog(this);//��ʾ"�����ļ�"�Ի���
            if(retval == JFileChooser.APPROVE_OPTION) {//���ɹ���
                File file = chooser.getSelectedFile();//�õ�ѡ����ļ���
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
        else if(selection.equals("����")) {
            File file = new File("save.txt");
            FileWriter writer;
            
            chooser1.setSelectedFile(file);//����Ĭ���ļ���
            retval = chooser1.showSaveDialog(this);//��ʾ�������ļ����Ի���
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
