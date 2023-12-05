package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadKoreanSuccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fr = null;
		
		try {
			fr = new FileInputStream("c:\\Temp\\hangle.txt");
			in = new InputStreamReader(fr ,"UTF-8");
			int c;
			System.out.print("인코딩 문자 집합은"+in.getEncoding()+"\n");
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			fr.close();
		}catch(IOException e){
			System.out.println("입출력 오류");
		}

	}

}
