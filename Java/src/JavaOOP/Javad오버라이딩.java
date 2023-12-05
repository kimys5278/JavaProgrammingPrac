package JavaOOP;

//class point3 {
//	int x ;
//	int y ;
//	
//	//생성자
//	point3(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//	
//	public String toString() {
//		return "x : " + x+", y: "+y ;
//	}
//}

class pointt3{
	int x;
	int y;
	
	String getlocation() {
		return "x:"+x+"y:"+y;
	}
}

class point3da extends pointt3{
	int z;

	
	String getlocation(){
		return "x: "+x+" y: "+y+" z: "+z;
	}
} 



public class Javad오버라이딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//        	point3 p =new point3(3,5);
//        
//        	System.out.println(p);
        	
		point3da p = new point3da();
        	 
        	  p.x = 3;
        	  p.y = 5;
        	  p.z = 10;
        	  System.out.println(p.getlocation());
        	  
        	 
        
	}

}
