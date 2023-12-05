package JavaProgrammingClass;

class Song {
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {}
	public Song(String t , String a, int y ,String c) {
		this.title =t;
		this.artist =a;
		this.year =y;
		this.country =c;
		
	}
	public void show() {
		System.out.println(this.year+"년 "+this.country+"국적의 "+this.artist+"가 부른 "+this.title);
	}
	
}
public class Java실습문제4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();
		

	}

}
