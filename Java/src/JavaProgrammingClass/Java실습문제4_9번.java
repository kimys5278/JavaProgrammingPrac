package JavaProgrammingClass;

class ArrayUtil{
	public static int[] concat(int[]a, int[] b) {
		int arr []  = new int[(a.length+b.length)];
		for(int i =0; i < a.length;i++) {
			arr[i] = a[i];
			}
		
		for( int i =0;i<b.length;i++) {
			arr[a.length+i]=b[i];
			
			}
		return arr;
		
		}
	
	public static void print(int[] a) {
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
		
		System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}
}
public class Java실습문제4_9번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {1,5,7,9};
		int [] array2 = {3,6,-1,100,77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}

}
