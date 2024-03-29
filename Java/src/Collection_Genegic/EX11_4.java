package Chapter11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class EX11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("help 를 입력하면 도움말을 볼 수 있어요.");
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.out.println("프로그램이 종료 되었습니다.");
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 5개를 보여줍니다."+MAX_SIZE+"개를 보여줍니다.");
				}else if(input.equalsIgnoreCase("history")){
					int i =0;
					save(input);
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
					
				}else {
					save(input);
					System.out.println(input);
				}
				
			}catch(Exception e) {
				System.out.println("입력오류입니다.");
				
			}
			
		}
	}
	
	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		if(q.size()>MAX_SIZE) {
			q.remove();
		}
	}

}
