package linkex;
import java.io.*;

import javax.swing.JOptionPane;

public class LinkExc {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream inp1 = new FileInputStream("Exp6_1.txt");
		InputStream inp2 = new FileInputStream("Exp6_2.txt");
		OutputStream out = new FileOutputStream("Exp6_x.txt");
		copy(inp1,out);
		copy(inp2,out);
		out.close();
	}

	//将filename1文件内容复制到filename2文件中，重写方式，适用于任意类型文件
    public static void copy(InputStream in, OutputStream out)
    {
        try
        {   
            byte buffer[] = new byte[512];                 //字节缓冲区
            int count=0;                                   //读取字节数
            while ((count=in.read(buffer))!=-1)           //读满字节数组，返回读取字节数，流结束返回-1
                out.write(buffer, 0, count);              //写入buffer数组从0开始的count个元素
            in.close();                                   //关闭输入流
            //out.close();                                  //关闭输出流
        }
        catch (FileNotFoundException ex)                   //指定文件不存在
        {
            //JOptionPane.showMessageDialog(null, filename1+"\"文件不存在，不能复制。");
        }
        catch (IOException ex)                             //IO异常
        {
            //JOptionPane.showMessageDialog(null, "IO异常，复制\""+filename1+"\"文件未成功");
        }
    }

}

