package BaekJoon;

import java.util.Scanner;

public class Java10809알파벳찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int [26];
		String a = in.nextLine();
		
		for(int i =0;i<arr.length;i++){
			arr[i]=-1;
		}
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			if(arr [ch-'a']== -1) {
				arr[ch - 'a']=i;
				}
			}
		for(int var:arr) {
			System.out.print(var+" ");
			}
		}
		
	}

