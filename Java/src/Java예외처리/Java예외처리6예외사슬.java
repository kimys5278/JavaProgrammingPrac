package Java예외처리;

import java.io.*;


class bb{
	void run()throws FileNotFoundException, IOException{
	BufferedReader b = null; // try  문안에 넣으면 지역변수가 되어서 중괄호 밖으로 빼어야됨.
	String input =null; // try  문안에 넣으면 지역변수가 되어서 중괄호 밖으로 빼어야됨.
	b  = new BufferedReader(new FileReader("out.txt"));
	System.out.println(input);}
}
class cc{
	void run() throws FileNotFoundException, IOException {
		bb b = new bb();
		b.run();
	}
}

public class Java예외처리6예외사슬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cc c = new cc();
		try {
			c.run();
		}catch(FileNotFoundException e) { 
			System.out.println("out.txt파일이 필요합니다.");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
