package JavaProgrammingClass;

class Book{
	String title;
	String author; 
	
	public Book(String t) {
		title = t;
		author = "작가미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
}

public class Java4_3클래스와객체_생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
		Book lovestory = new Book("준향전");
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(lovestory.title+" "+lovestory.author);
		
		

	}

}
