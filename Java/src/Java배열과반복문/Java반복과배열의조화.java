package Java배열과반복문;

public class Java반복과배열의조화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] members = {"최진혁","최유빈","한이람"};
		for(int i=0;i<members.length;i++) {
			String member = members[i];
			System.out.println(member+"이 상담을 받았습니다.");
		}
		
		//for-each문
		String [] fruit = {"orange","apple","grape"};
		for( String f :fruit) {
			System.out.println(f+"을 찾았습니다.");
				
			
		}
	
	}

}
