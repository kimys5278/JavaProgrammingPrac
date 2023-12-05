package JavaVariable;

class Students{
	String name;
	Students(String name){
		this.name=name;
	}
    public boolean equals(Object obj) {
    	Students s = (Students)obj;
    	/*(Students)obj -> obj변수를 강제 형변환
    	Object obj = s2 ->  자식이 부모가 될땐 자동으로 형변환
    	Students s = (Students)obj; 부모가 자식이 될때는 강제 형변환.
    	다형성
    	*/
        return this.name == s.name;
    }
}
public class Javaequlas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students("kim");
		Students s2 = new Students("kim");
		Students s3 = new Students("park");
		// 숫자 비교할땐 == 비교연산자
		// 문자나 객체 비교할땐 equals사용 권장
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}

}
