package JavaProgrammingClass;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Java_8_6_BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c ;
		try{
			fin =new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream out = 
					new BufferedOutputStream(System.out,5);
			while((c=fin.read())!=-1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
