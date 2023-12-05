package Java예외처리;

import java.io.IOException;

class EE{
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	void throwIOException1() {
		try {
			throw new IOException();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException {
		throw new IOException();
	} 
}
public class Java예외처리8예외심화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//ArithmeticException은 위에 RuntimeException 그 위에 Exception
//IOException은 위에 Exception

//ArithmeticException 은 unchecked -> 예외 처리를 안해도됨.
//IOException 은 checked -> 반드시 try,catch,throws등으로 예외를 처리해야됨.

 
