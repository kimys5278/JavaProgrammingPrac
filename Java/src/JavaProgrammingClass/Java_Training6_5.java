package JavaProgrammingClass;

import java.util.Calendar;

public class Java_Training6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar now =  Calendar.getInstance();
		int h_time =  now.get(Calendar.HOUR_OF_DAY);
		int m_time = now.get(Calendar.MINUTE);
		System.out.println("현재 시간은 " + h_time + "시 " + m_time + "분입니다.");
		
		if(h_time > 4 && h_time < 12) 
			System.out.println("Good Morning");
		else if(h_time >= 12 && h_time < 18) 
			System.out.println("Good Afternoon");
		else if(h_time >= 18 && h_time < 22) 
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");		
		}
		
	}


