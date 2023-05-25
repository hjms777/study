package no_2;

import java.util.Scanner;

public class Beak14681 {

	public static void main(String[] args) {

		/*
		문제 : 본문 확인 
		 
		입력 : 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
		
		출력 : 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		if(a>0 && b>0) {
			c=1;
		}else if(a>0 && b<0) {
			c=4;
		}else if(a<0 && b>00) {
			c=2;
		}else {
			c=3;
		}
		System.out.println(c);
	}

}
