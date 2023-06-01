package no_6;

import java.util.Scanner;

public class Baek2444 {

	public static void main(String[] args) {

		/*
		문제 : 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		
		입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		
		출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
		*/
		
		/*
		 * 41
		 * 33
		 * 25
		 * 17
		 * 09
		 * 17
		 * 25
		 * 33
		 * 41
		 */
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		
		for(int i = 1; i<su; i++) {
			
			for(int j = su-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k<2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i<2*su-1; i++) {
			System.out.print("*");
		}

		System.out.println();
	
		for(int i = su-1; i>0; i--) {
			
			for(int j = 0; j<su-i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k<2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
