package JavaProgrammingClass;

public class Java3_2배열_2차원배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][] = {
				{3.3,3.4},
				{3.5,3.6},
				{3.7,4.0},
				{4.1,4.2}
			};
		
		double sum = 0;
		for(int year = 0; year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				sum+=score[year][term];
			}
			
		}
		int n = score.length;
		int m = score[0].length;
		System.out.println("행: "+n);
		System.out.println("열: "+m);
		
		System.out.println("4년 전체 평균 학점은 "+sum/(n*m)+" 입니다.");
	}

}
