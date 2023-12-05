package Stream;

import java.io.FileReader;
import java.io.IOException;

public class Stream8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader f = null;
		try {
			f = new FileReader("c:\\windows\\system.ini");
			int c;
			while((c = f.read())!= -1) {
				c = Character.toUpperCase(c);
			System.out.print((char)c);	
			}
		f.close();
		}
		
		catch(IOException e) {
			System.out.println("입출력오류");
		}
	}

}
