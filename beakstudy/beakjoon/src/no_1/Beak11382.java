package no_1;

import java.util.Scanner;

public class Beak11382 {

	public static void main(String[] args){

		/*
		문제 : 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

		입력 : 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
		
		출력 : A+B+C의 값을 출력한다.
		*/
		
		/*
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String three = bf.readLine();
		String[] abc = three.split(" ");
				
		int a,b,c = 0;
		
		a = Integer.parseInt(abc[0]);
		b = Integer.parseInt(abc[1]);
		c = Integer.parseInt(abc[2]);
		
		System.out.println(a+b+c);
		
		시행착오) 문자로 숫자를 입력받아 공백을 기준으로 배열을 나눠 계산해봤다
		*/
		
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(a+b+c);
		
	}

}
