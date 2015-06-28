package filterex; //按行读取
import java.io.*;
public class Flexc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Exp6_Gis.txt");
	    BufferedReader reader = null;
	    String tempString = null;
	    int line =1;
	    
	    try {
	        System.out.println("以行为单位读取文件内容，一次读一整行：");
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
