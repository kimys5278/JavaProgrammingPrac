package Stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Stream8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini")); // 파일로부터 읽기 위한 목적
			int lineNumber = 1;
			while(fScanner.hasNext()) { // 파일에 읽을 것이 있는 동안 
				String line = fScanner.nextLine();
				System.out.printf("%4d", lineNumber++); // 행번호 출력
				System.out.println(": "+line); // 소스 한행 출력
			}
			fScanner.close();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}

}
