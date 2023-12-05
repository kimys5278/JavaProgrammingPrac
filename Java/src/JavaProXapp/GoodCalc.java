package JavaProXapp;

import JavaProXlib.Calculator;

//GoodCalc는 Calculator의 서브 클래스
public class GoodCalc extends Calculator {
	public int add( int a, int b) {
		return a+b;	
		}
	public int substract( int a, int b) {
		return a-b;	
		}
	public double average( int [] a) {
		double sum = 0;
		for(int i =0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;	
		}
	public static void main(String[] args) {
		
		Calculator c = new GoodCalc();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.substract(20,3));
		System.out.println(c.average(new int[] {1,2,3}));
		
		
		}
	
	}

