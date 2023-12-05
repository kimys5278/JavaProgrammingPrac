package JavaProgrammingClass;

public class Java3_1반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////////for//////////////////
		int sum=0;
		
		for( int i =0;i<=10;i++) {
			sum+=i;
			System.out.print(i);
		if(i<=9) {
			System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum);
			}
		
		}
		//////////while///////////////
		int b=0;
		while(b<10) {
			System.out.println(b);
			b++;
		}
		/////////do-while/////////////
		char c ='a';
		do {
			System.out.print(c+" ");
			c = (char)(c+1);
		}while(c <='z'); 
		
	}

}
