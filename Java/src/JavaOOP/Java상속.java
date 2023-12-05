package JavaOOP;


class TV1{
	int channel;
	boolean power;
	
	void power() {power = ! power ;}
	void channelUP () {++channel;}
	void channelDOWN () {--channel;}
}

class smartTV extends TV1{
	boolean caption ;
	
	void displaycaption(String text) { 
		if(caption) {
	       
			System.out.println(text);
		}
	}
}
public class Java상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		smartTV stv = new smartTV();
		stv.channel = 10;
		stv.channelUP ();
		System.out.println(stv.channel);
		stv.displaycaption(" Hi. Nice to meet you");
		stv.caption = true;		
		stv.displaycaption(" Hi. Nice to meet you");
	}

}

