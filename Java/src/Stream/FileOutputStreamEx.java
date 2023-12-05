package Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte [] b = {1,2,3,56,65};
		
		try{
			FileOutputStream f = new FileOutputStream("c:\\Temp\\testCode2.out");
			for(int i =0;i<b.length;i++) {
				f.write(b[i]);
			}f.close();
		}catch(IOException e){
			System.out.println("파일을 저장할 수 없습니다. 경로를 다시 확인 하세요.");
		}
		System.out.println("파일 저장완료");
	}
}
