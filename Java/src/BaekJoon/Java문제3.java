package BaekJoon;

public class Java문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"이유덕", "이재영", "권종표", "이재영", "박민호", "강상희", "이재영", "김지완", "최승혁", "이성연", "박영서", "박민호", "전경헌", "송정환", "김재성", "이유덕", "전경헌"};
		// 1. 김씨와 이씨는 각각 몇 명인가?
		
		int sum_k = 0;
		int sum_l = 0;
		
		for(int i =0;i<name.length;i++) {
			String lname = name[i];
			String n = lname.substring(0,1);
			
			if(n.contains("김")) {
				sum_k = sum_k+1;
			}
			if(n.contains("이")){
				sum_l = sum_l+1;
			}

			
		}	
		System.out.println("김씨 이씨 성 합:"+(sum_k+sum_l));
	}
}


