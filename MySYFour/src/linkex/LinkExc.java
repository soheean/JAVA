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

	//��filename1�ļ����ݸ��Ƶ�filename2�ļ��У���д��ʽ�����������������ļ�
    public static void copy(InputStream in, OutputStream out)
    {
        try
        {   
            byte buffer[] = new byte[512];                 //�ֽڻ�����
            int count=0;                                   //��ȡ�ֽ���
            while ((count=in.read(buffer))!=-1)           //�����ֽ����飬���ض�ȡ�ֽ���������������-1
                out.write(buffer, 0, count);              //д��buffer�����0��ʼ��count��Ԫ��
            in.close();                                   //�ر�������
            //out.close();                                  //�ر������
        }
        catch (FileNotFoundException ex)                   //ָ���ļ�������
        {
            //JOptionPane.showMessageDialog(null, filename1+"\"�ļ������ڣ����ܸ��ơ�");
        }
        catch (IOException ex)                             //IO�쳣
        {
            //JOptionPane.showMessageDialog(null, "IO�쳣������\""+filename1+"\"�ļ�δ�ɹ�");
        }
    }

}

