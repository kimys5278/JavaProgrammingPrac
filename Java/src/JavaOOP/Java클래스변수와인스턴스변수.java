package JavaOOP;

class card1{
	int num;
	String shape;
	String color;
	
	static int width = 200;
	static int height = 300;
	
	
}
public class Java클래스변수와인스턴스변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("card1의 넓이와 높이는 각각"+card1.height+" , "+card1.width+"입니다.");
		
		card1 c1 =new card1();
		c1.color="red";
		c1.num = 8;
		c1.shape="circle";
		
		card1 c2 =new card1();
		c2.color="blue";
		c2.num = 3;
		c2.shape="heart";
		
		card1 c3 =new card1();
		c3.color="green";
		c3.num = 7;
		c3.shape="triangle";
		
		card1.height = 300;
		card1.width = 500;
		
		System.out.println("c1카드의 색과 모양은 각각"+c1.color+" , "+c1.shape+" ,이고 숫자는 "+c1.num+"입니다."+ "추가적으로 넓이와 높이는 각각"+card1.height +" , "+card1.width+"입니다.");
		System.out.println("c2카드의 색과 모양은 각각"+c2.color+" , "+c2.shape+" ,이고 숫자는 "+c2.num+"입니다."+ "추가적으로 넓이와 높이는 각각"+card1.height +" , "+card1.width+"입니다.");
		System.out.println("c3카드의 색과 모양은 각각"+c3.color+" , "+c3.shape+" ,이고 숫자는 "+c3.num+"입니다."+ "추가적으로 넓이와 높이는 각각"+card1.height +" , "+card1.width+"입니다.");
		
	}

}
