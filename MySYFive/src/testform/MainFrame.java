package testform;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class MainFrame extends JFrame{
	private JPanel contentPane;
	private BorderLayout borderLayout1 = new BorderLayout();
	private JPanel jPanel1 = new JPanel();
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JScrollPane jScrollPane1 = new JScrollPane();
	private JTextArea jTextArea1 = new JTextArea();
	//创建要读写的数据对象，并定义文件读写流
	DataObject dataObject = new DataObject("008","Zhou Xingchi","30","HongKong");
	File file = null ;
	FileOutputStream fos = null;
	FileInputStream fis = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	String[][] data = {{"ID","008"},{"Name","Zhou Xingchi"},{"age","30"},{"Address","HongKong"}};//显示的数据……
	private void jbInit() throws Exception {
		for (int i=0;i<data.length;i++){
		this.jTextArea1.append(data[i][0]+"="+data[i][1]+"\n"); //显示要保存的数据信息
		}
		//各组件的初始属性设置，并在窗口中添加各组件
		//setIconImage(Toolkit.getDefaultToolkit().createImage(MainFrame.class.getResource("[Your Icon]")));
		contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(borderLayout1);
		this.setSize(new Dimension(382, 112));
		this.setTitle("JObjectStreamDemo");
		jButton1.setText("Save");
		jButton1.addActionListener(new java.awt.event.ActionListener() {//添加事件监听器
		public void actionPerformed(ActionEvent e) {
			jButton1_actionPerformed(e);

		}
		});
		jButton2.setText("Read");
		jButton2.addActionListener(new java.awt.event.ActionListener() {//添加事件监听器
		public void actionPerformed(ActionEvent e) {
			jButton2_actionPerformed(e);

		}
		});
		contentPane.add(jPanel1, BorderLayout.SOUTH);
		jPanel1.add(jButton1, null);
		jPanel1.add(jButton2, null);
		contentPane.add(jScrollPane1, BorderLayout.CENTER);
		jScrollPane1.getViewport().add(jTextArea1, null);
		}
	void jButton1_actionPerformed(ActionEvent e) {
		try{
		file = File.createTempFile("DataObject",".tmp"); //创建一个临时文件
		fos = new FileOutputStream(file); //打开文件输出流
		oos = new ObjectOutputStream(fos); // 将文件输出流和对象输出流衔接
		oos.writeObject(dataObject); //将dataObject 对象保存到文件中
		oos.close(); //关闭流
		}catch(Exception err){
		err.printStackTrace();
		}
		}
	void jButton2_actionPerformed(ActionEvent e) {
		this.jTextArea1.setText("");//清空
		try{
		fis =new FileInputStream(file); //打开文件输入流
		ois = new ObjectInputStream(fis); //将文件输入流和对象输入流衔接
		DataObject dataReaded = (DataObject)ois.readObject();//读取对象
		ois.close(); //关闭流
		//显示对象中的信息数据
		this.jTextArea1.append(dataReaded.getID()+"\n");
		this.jTextArea1.append(dataReaded.getName()+"\n");
		this.jTextArea1.append(dataReaded.getAge()+"\n");
		this.jTextArea1.append(dataReaded.getAddress()+"\n");
		}catch(Exception err){
		err.printStackTrace();
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame tt = new MainFrame();
		tt.setVisible(true);
	}

}


class DataObject implements Serializable {
private String ID;
private String name;
private String age;
private String address;
public DataObject(){
this.ID = null;
this.name = null;
this.age = null;
this.address = null;
}
public DataObject(String ID , String name , String age , String address){
this.ID = ID;
this.name = name;
this.age = age;
this.address = address;
}
String getID(){
return this.ID;
}
void setID(String ID){
this.ID = ID;
}
String getName(){
return this.name;
}
void setName(String name){
this.name = name;
}
String getAge(){
return this.age;
}
void setAge(String age){
this.age = age;
}
String getAddress(){
return this.address;
}
void setAddress(String address){
this.address = address;
}
}


