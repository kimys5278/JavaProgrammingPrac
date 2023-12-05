package Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:\\Temp\\tset2.txt"); 
			while(true) {
				String line = sc.nextLine();
				if(line.length() ==0) {
					break;
				}
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
