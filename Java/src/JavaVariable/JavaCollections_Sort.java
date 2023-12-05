package JavaVariable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Com implements Comparable{
	int serial;
	String owner;
	Com(int serial,String owner){
		this.serial = serial;
		this.owner = owner;
	}
	//Comparble은 CompareTo의 메서드를 강조. 
	public int compareTo(Object o) {
		return this.serial-((Com)o).serial;
	}
	public String toString() {
		return serial+" "+owner;
	}
}

public class JavaCollections_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Com> Coms = new ArrayList<Com>();
		Coms.add(new Com(500,"egoing"));
		Coms.add(new Com(200,"leezche"));
		Coms.add(new Com(1000,"graphitte"));
		Iterator i = Coms.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(Coms);
		System.out.println("after");
		i = Coms.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
