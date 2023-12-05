package BaekJoon;

import java.util.Scanner;

public class Java문제2 {

	public static void main(String[] args) {
		/*
		 * A씨는 게시판 프로그램을 작성하고 있다.
		 * A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 
		 * 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int pan = sc.nextInt();
		int page = 0;
		System.out.println("총 게시물 건수는"+total+"입니다.");
		System.out.println("한 페이지에 올릴 수 있는 게시물은 "+pan+"개 입니다.");
		System.out.println("총 "+total/pan+"페이지 입니다.");
		}

	}


