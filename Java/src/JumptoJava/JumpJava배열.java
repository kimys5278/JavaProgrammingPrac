package JumptoJava;

public class JumpJava배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] week = {"월","화","수","목","금","토","일"};
		int [] num = new int[7];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;
		System.out.println(num[3]+week[0]);
		for(int i = 0 ; i<week.length;i++) {
			System.out.println(week[i]);
		}
		

	}

}
