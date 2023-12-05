package Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BinaryCopy_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:\\Temp\\test2.txt");
		File dest = new File("C:\\Temp\\hangle.txt");
		
		int c;
		try {
			FileReader fin = new FileReader(src);
			FileWriter out = new FileWriter(dest);
			
			while((c=fin.read())!=-1) {
				out.write((char)c);
			}
			fin.close();
			out.close();
			System.out.println(src.getPath()+" 를 "+dest.getPath()+"로 복사하였습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
