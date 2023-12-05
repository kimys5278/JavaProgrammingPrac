package Java배열과반복문;

public class Java배열연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] classGroup = {"사과","배","포도","토마토","오렌지"};
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		System.out.println(classGroup[4]);
		
		String[] calssGroup2 = new String[5];
		calssGroup2[0] = "사과";
		System.out.println(classGroup.length);
		calssGroup2[1] = "배";
		System.out.println(classGroup[1]);
		calssGroup2[2] = "포도";
		System.out.println(classGroup[2]);
		calssGroup2[3] = "토마토";
		System.out.println(classGroup[3]); 
		calssGroup2[4] = "오렌지";
		System.out.println(classGroup.length);
		
		
	}

}
