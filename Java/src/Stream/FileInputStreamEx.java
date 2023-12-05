package Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\testCode2.out");
			int n =0,c;
			while((c = fin.read())!= -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("위 주소에서 읽은 배열을 출력합니다.");
			for(int i =0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}System.out.println();
		}catch(IOException e){
			System.out.println("입출력 오류");
		}

	}

}
