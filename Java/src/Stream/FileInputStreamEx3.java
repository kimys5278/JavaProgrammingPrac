package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			FileOutputStream fout = new FileOutputStream("C:\\Temp\\test.dat");
			fout.write(3);
			fout.write(2);
			fout.close();
			FileInputStream fin = new FileInputStream("C:\\Temp\\test.dat");
			int c = 0;
			c = fin.read();
			System.out.println(c+" ");
			c = fin.read();
			System.out.println(c+" ");
			fin.close();
		}catch(IOException e) {
				System.out.println("입출력오류");
			}
		}
		
	}


