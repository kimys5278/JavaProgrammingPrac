package Java배열과반복문;

public class Java배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] score = {90,95,98,86,87,95};
		int sum = 0;
		for(int i = 0 ; i < score.length;++i) {
			sum+=score[i];
		}
		double avg = (double)sum/score.length;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
	}

}
 