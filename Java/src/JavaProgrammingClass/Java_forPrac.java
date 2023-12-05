package JavaProgrammingClass;

public class Java_forPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*****
		
		for(int i =0;i<5;i++) {
			System.out.print("*");
		}
		System.out.println("/////////////////////////////////////////");
		for(int i =0;i<50;i+=10) {
			System.out.print("*");
		}
		System.out.println("/////////////////////////////////////////");
		/*  *
		 	*  
		 	* 
		 	* 
		 	*  */
		for(int i =0;i<5;i++) {
			System.out.println("*");
		}
		 
		//* 이 5x5 로
		System.out.println("/////////////////////////////////////////");
		for(int i =0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//11111
		//22222
		//33333
		//44444
		//55555
		
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		System.out.println("/////////////////////////////////////////");

		//12345
		//12345
		//12345
		//12345
		//12345
		
		for(int i =0;i<5;i++) {
			for(int j =1;j<6;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		System.out.println("/////////////////////////////////////////");

		//*
		//**
		//***
		//****
		//*****
		
		
		for(int i =1;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("/////////////////////////////////////////");

		//*****
		// ****
		//  ***
		//   **
		//    *
		
		for(int i =0;i<5;i++) {
			//빈칸
			for(int j = 0;j<i;j++) {
				System.out.print(" ");
			}
			//별
			for(int a =5;a<i;a--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
