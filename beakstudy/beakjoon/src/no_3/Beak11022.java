package no_3;

import java.util.Scanner;

public class Beak11022 {

	public static void main(String[] args) {

		/*
		문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		
		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		출력 : 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		*/
		
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		int[] a = new int[su],b = new int[su];
		int hap[] = new int[su]; 
		
		for(int i=0; i<su; i++) {
			
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			hap[i] = a[i]+b[i];
		}
		
		for(int j = 0; j<su; j++) {
			
			System.out.printf("Case #%d: %d + %d = %d%n",j+1,a[j],b[j],hap[j]);
			
		}
	}

}
