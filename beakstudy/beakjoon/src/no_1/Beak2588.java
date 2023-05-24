package no_1;

import java.util.Scanner;

public class Beak2588 {

	public static void main(String[] args) {
		
		/*
		문제 : 본문 확인
		입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
		출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,e,f;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = b/100;
		d = (b%100) / 10;
		e = b%10;
		f = (e*a) + ((d*a)*10) + ((c*a)*100);
		// 3) 첫째자리 : b/100
		// 4) 둘째자리 : (b%100) / 10
		// 5) 셋째자리 : b%10
		System.out.println(e*a);
		System.out.println(d*a);
		System.out.println(c*a);
		System.out.println(f);
		
	}

}
