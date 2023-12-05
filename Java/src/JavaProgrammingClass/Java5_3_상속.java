package JavaProgrammingClass;

class Persona{}
class Studenta extends Persona{}
class Researcher extends Persona{}
class Professor extends Researcher{}

class instanceOfEx{
	static void print(Persona p) {
		if(p instanceof Persona) {
			System.out.println("Person");
		}
		if(p instanceof Studenta) {
			System.out.println("Student");
		}
		if(p instanceof Researcher) {
			System.out.println("Researcher");
		}
		if(p instanceof Professor) {
			System.out.println("Professor");
		}
		System.out.println();
		
	}
}

public class Java5_3_상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("new Student() -> \t");
		System.out.print(new Studenta());
		System.out.println("new Researcher() -> \t");
		System.out.print(new Studenta());
		System.out.println("new Professor() -> \t");
		System.out.print(new Studenta());
		
	}

}
