package JumptoJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class JavaBufferReader연습 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\User\\임시.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			List<String> lines =br.lines().collect(Collectors.toList());
			for(String line : lines) {
				System.out.println(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
