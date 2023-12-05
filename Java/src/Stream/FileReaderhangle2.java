package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderhangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try{
			fin = new FileInputStream("c:\\Temp\\hangle2.txt");
			in = new InputStreamReader(fin,"UTF-8");
			
			System.out.println("인코딩 문자 집합은?"+in.getEncoding());
			int c;
			while((c=in.read())!= -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		}catch(IOException e){
			e.printStackTrace();
			
		}

	}

}
