package JavaProgrammingClass;

import java.util.Scanner;

public class Java3_16번과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String str[] = {"가위","바위","보"};
		while(true) {
			 
			System.out.println("가위 바위 보>>");
			String me = sc.nextLine();
			int n = (int)(Math.random()*3);
			
			if( str[n].equals("가위")) {
				if(me.equals("가위")) {
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 동점입니다.");
					continue;
				}else if(me.equals("바위")) {
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 사용자가 이겼습니다.");
					continue;
				}else if(me.equals("보")){
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 사용자가 졌습니다.");
					continue;
				}else if(me.equals("그만")) {
					System.out.println("게임을 종료합니다.");
					break;
					
				}
			}else if(str[n].equals("바위")) {
				if(me.equals("바위")) {
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 동점입니다.");
					continue;
				}else if(me.equals("보")) {
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 사용자가 이겼습니다.");
					continue;		
				}else if(me.equals("가위")){
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 사용자가 졌습니다.");
					continue;					
				}else if(me.equals("그만")) {
					System.out.println("게임을 종료합니다.");
					break;
					
				}
			}else if(str[n].equals("보")) {
				if(me.equals("보")) {
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 동점입니다.");
					continue;
				}else if(me.equals("가위")) {
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 사용자가 이겼습니다.");
					continue;				
				}else if(me.equals("바위")){
					System.out.println("사용자= "+me+" 컴퓨터= "+str[n]+" 사용자가 졌습니다.");
					continue;						
				}else if(me.equals("그만")) {
					System.out.println("게임을 종료합니다.");
					break;
				}
				
			}

			
			sc.close();
		}

	}

}
