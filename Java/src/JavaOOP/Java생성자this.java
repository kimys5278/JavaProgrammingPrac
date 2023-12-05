package JavaOOP;

class university{
	String name ;
	String major;
	int studentnum;
	
	university(){
		this("Kangnam","software",8000);
	}
	
	university(String name ,String major){
		this(name,major,9000);
		
	}
	
	university(String name, String major , int student){
		this.name = name;
		this.major = major;
		this.studentnum = studentnum;
	}
}
public class Java생성자this {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		university u1 = new university();
		university u2 = new university("myeong gi","Data");
		
		System.out.println( u1.name+ " 의 학교는 학생수가 "+ u1.studentnum+" 명이고,"+ "가장 지원수가 많은 학과는"+ u1.major+ " 이다." );
		System.out.println( u2.name+ " 의 학교는 학생수가 "+ u2.studentnum+" 명이고,"+ "가장 지원수가 많은 학과는"+ u2.major+ " 이다." );

	}

}
