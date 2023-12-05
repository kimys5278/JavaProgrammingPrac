package JavaProgrammingClass;

import java.util.StringTokenizer;

public class Java6_5모듈_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qurey ="name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(qurey,"&");
		
		int n = st.countTokens();
		System.out.println("token 개수 ="+n);
		for(int i=0;i<n;i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
