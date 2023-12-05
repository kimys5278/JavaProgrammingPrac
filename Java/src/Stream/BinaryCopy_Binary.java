package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Spotlight\\img14.jpg");
		File dest = new File("C:\\Temp\\dest.jpg");
		
		int c ;
		try {
		FileInputStream fi = new FileInputStream(src);
		FileOutputStream fo = new FileOutputStream(dest);
		
		while((c=fi.read())!=-1) {
			fo.write((byte)c);
		}
		fi.close();
		fo.close();
		System.out.println(src.getPath()+" 를 "+dest.getPath()+"로 복사 하였습니다.");
		
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
