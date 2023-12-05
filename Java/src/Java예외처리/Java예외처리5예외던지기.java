package Java예외처리;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java예외처리5예외던지기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader b = null; // try  문안에 넣으면 지역변수가 되어서 중괄호 밖으로 빼어야됨.
		String input = null; // try  문안에 넣으면 지역변수가 되어서 중괄호 밖으로 빼어야됨.
		try {
			b = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = b.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
	

}
