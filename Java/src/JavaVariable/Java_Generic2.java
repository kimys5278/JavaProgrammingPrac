package JavaVariable;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}



class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person12{
	public Object info;
	Person12(Object info){
		this.info = info;
	}
}

//코드중복 -> 바꾸기
//class EmployeePerson{
//	public EmployeeInfo info;
//	EmployeePerson(EmployeeInfo info){
//		this.info = info;
//	}
//}
//class StudentPerson{
//	public StudentInfo info;
//	StudentPerson(StudentInfo info){
//		this.info = info;
//	}
//}


public class Java_Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person12 p1 = new Person12("부장");
		EmployeeInfo ei = (EmployeeInfo)p1.info;
		System.out.println(ei.rank);
	}

}
