package filterex; //���ж�ȡ
import java.io.*;
public class Flexc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Exp6_Gis.txt");
	    BufferedReader reader = null;
	    String tempString = null;
	    int line =1;
	    
	    try {
	        System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
	        reader = new BufferedReader(new FileReader(file));
	        while ((tempString = reader.readLine()) != null) {
	            System.out.println("Line"+ line + ":" +tempString);
	            line ++ ;
	        }
	        reader.close();
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }finally{
	        if(reader != null){
	            try {
	                reader.close();
	            } catch (IOException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	    }
	}

}
