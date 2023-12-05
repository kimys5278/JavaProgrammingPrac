package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream f = new FileInputStream("c:\\Temp\\phone.txt");
			InputStreamReader in = new InputStreamReader(f,"UTF-8");
			int c;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			
			}
			in.close();
			f.close();
		}catch(IOException E) {
			System.out.println("입출력오류");
		}

	}

}
