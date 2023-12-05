package JavaOOP;

interface Animal{
	public void start();
}

class Dogs implements Animal{
	String lang = "멍멍";
	public void start() {
		System.out.println(this.lang);
	}
}

class Tigers implements Animal{
	String lang = "어흥";
	public void start() {
		System.out.println(this.lang);
	}
}
class Lions implements Animal{
	String lang = "으르렁";
	public void start() {
		System.out.println(this.lang);
	}
}
class Cat implements Animal{
	String lang = "야옹";
	public void start() {
		System.out.println(this.lang);
	}
}

class Barks {
	void bark(Animal animal) {
		animal.start();
	}
}
public class Java_매개변수의다형성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tigers t = new Tigers();
        Lions l = new Lions();
        Dogs d = new Dogs();
        Cat c = new Cat();
        
        Barks b = new Barks();
        b.bark(t);
        b.bark(l);
        b.bark(d);
        b.bark(c);
        
        

	}

}
