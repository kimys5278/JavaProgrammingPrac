package Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] b = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\binaryEx");
			int n=0,c;
			while((c=fin.read())!=-1) {
				b[n] =(byte)c;
				n++;
			}
			System.out.println("C:\\\\Temp\\\\binaryEx에서 읽은 데이터를 출력합니다.");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
			
		}catch(IOException e) {
			System.out.println("경로명을 확인하세요.");
			
		}

	}

}
