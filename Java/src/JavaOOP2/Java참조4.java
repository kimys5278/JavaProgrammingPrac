package JavaOOP2;
class BBB{
	public int id;
	
	BBB(int id){
		this.id = id;
	}
	
}

public class Java참조4 {
    static void _value(int b){
        b = 2;
    }
     
    public static void runValue(){
        int a = 1;
        _value(a);
        System.out.println("runValue, "+a);
    }
     
    static void _reference1(BBB b){
        b = new BBB(2);
    }
     
    public static void runReference1(){
    	BBB a = new BBB(1);
        _reference1(a);
        System.out.println("runReference1, "+a.id);     
    }
     
    static void _reference2(BBB b){
        b.id = 2;
    }
 
    public static void runReference2(){
    	BBB a = new BBB(1);
    	_reference2(a);
        System.out.println("runReference2, "+a.id);     
    }
     
    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }
 
}