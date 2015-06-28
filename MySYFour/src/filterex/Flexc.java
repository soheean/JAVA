package filterex; //按字节读取
import java.io.*;
import java.util.StringTokenizer;
public class Flexc {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		File file = new File("Exp6_Gis.txt");
        InputStream in = null;
        byte[] tempByte = new byte[1024];
        int byteread = 0;
        
        //OutputStream out = new FileOutputStream("Exp6_GisNew.txt");
       
        try {
            System.out.println("以字节为单位读取文件内容，一次读多个字节：");
            in = new FileInputStream(file);
            while ((byteread = in.read(tempByte)) != -1 ) {
                System.out.write(tempByte, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        FileWriter writer;
        writer = new FileWriter("Exp6_GisNew.txt");
        try {
        	//BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
        	BufferedReader in1 = new BufferedReader(new FileReader(file));
        	String s = in1.readLine();
			StringBuffer s1 = new StringBuffer();
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				String str = st.nextToken();
				char c = (str).charAt(0);
				if (c == 't' || c == 'T') {
					//c = (char) ((int) c - 32);
					//s1.append(c);
					for (int i = 0; i < (str).length(); i++) {
						char c1 = (str).charAt(i);
						s1.append(c1);
					}
					s1.append(" ");
				}		
				
					
			}
			writer.write(s1.toString());
            writer.flush();
            writer.close();	
			
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            /*if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }*/
        }
        
	}
	

}
