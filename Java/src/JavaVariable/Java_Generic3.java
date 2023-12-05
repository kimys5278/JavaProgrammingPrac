package JavaVariable;

class EmployeeInfo1{
	public int rank;
	EmployeeInfo1(int rank){this.rank = rank;}
}

class Person3<T,S>{
	public T info;
	public S id;
	Person3(T info,S id){
		this.info = info;
		this.id = id;
	}
}


public class Java_Generic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo1 e =new EmployeeInfo1(1);
		Integer id = new Integer(1);
		Person3<EmployeeInfo1,Integer> p1 = new Person3<EmployeeInfo1,Integer>(e,id); 
		System.out.println(p1.id.intValue());
	}

}
