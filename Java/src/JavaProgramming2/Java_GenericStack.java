package JavaProgramming2;

class GStack<T> {

	int tos;

	Object [] stck;

	public GStack() {
		tos = 0;
		stck = new Object [10];
	}
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
	return (T)stck[tos]; 
		}
	}

public class Java_GenericStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GStack<String> stringstack = new GStack<String>();
 		stringstack.push("seoul");
		stringstack.push("busan");
		stringstack.push("LA");
		
		for(int n=0;n<3;n++) {
			System.out.println(stringstack.pop());
		}
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for (int n =0;n<3;n++) {
			System.out.println(intStack.pop());
		}
		
	}
	
}