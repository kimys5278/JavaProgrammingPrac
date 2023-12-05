package JavaProgrammingClass;

class TV{
	String name;
	int year;
	int inch;
	public TV(String name,int year,int inch) {
		this.name = name;
		this.year=year;
		this.inch=inch;
	}
	public  void show() {
		System.out.println(this.name+" 에서 만든 "+this.year+"년형 "+this.inch+"인치 TV");
	}
	
}


public class Java실습문제4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV myTV = new TV("LG",2017,32);
		myTV.show();
		
	}
}