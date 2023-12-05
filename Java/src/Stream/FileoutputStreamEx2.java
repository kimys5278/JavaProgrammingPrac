package Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte [] b = {1,2,3,4,5};
		
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("c:\\Temp\\binaryEx");
			for(int i =0;i<b.length;i++) {
				fout.write(b[i]);
			}
			fout.close();
	
			
		}catch(IOException e) {
			System.out.println("파일을 저장할수 없음. 경로 확인하세요!");
			e.printStackTrace();
			
		return;
		}
		System.out.println("파일 저장 완료");

	}

}
