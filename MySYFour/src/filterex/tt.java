package filterex;
import java.io.FileWriter;
import java.io.IOException;
public class tt {
	
	
	    public static void main(String[] args) {
	        String str="���� 0 3000\r���� 1 5000\r���� 0 4000";
	        FileWriter writer;
	        try {
	            writer = new FileWriter("1.txt");
	            writer.write(str);
	            writer.flush();
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
