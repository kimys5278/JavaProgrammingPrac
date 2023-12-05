package JavaMachineLearningClass;
class Circlepd{
	int radius;
	String name;
	
	public Circlepd() {
		radius =1;
		name = "";
	}
	public Circlepd(int r, String n) {
		radius = r; name = n;
	}
	public double getarea() {
		return 3.14*radius*radius;
	}
	
}

class Circlepd2 extends Circlepd{
	int price;

	public Circlepd2(int r, String n,int a) {
		radius = r; name = n; price = a;
	}
	
}

public class Java_Prac_6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlepd pizza = new Circlepd(10,"zavapizza");
		pizza.getarea();
		System.out.println(pizza.name+"의 면적은"+pizza.getarea());
		
		Circlepd donut = new Circlepd();
		donut.name="zavadonut";
		donut.getarea();
		System.out.println(donut.name+"의 면적은"+donut.getarea());
		
		Circlepd2 cc = new Circlepd2(100, "cc", 18000);
		System.out.println(cc.name+"의 면적은"+cc.getarea()+"이고 가격은,"+cc.price);
		
	
	}

}
