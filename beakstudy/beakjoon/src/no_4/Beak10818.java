package no_4;

import java.util.Arrays;
import java.util.Scanner;

public class Beak10818 {

	public static void main(String[] args) {
		
		/*
		문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		입력 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고,
		1,000,000보다 작거나 같은 정수이다.
		
		출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int input[] = new int[N];
		
		for(int i = 0; i<N; i++) {
			input[i] = sc.nextInt();
		}
		
		/*처리속도가 느려 시간초과
		//Bubble Sort
		for(int j = 1; j<N; j++) {
			for(int k = 0; k<N-1; k++) {
				if(input[k]>input[k+1]) {
					int temp = input[k+1];
					input[k+1] = input[k];
					input[k] = temp;
				}
			}
		}
		*/
		/*일반 정렬도 시간초과
		for(int j = 0; j<N-1; j++) {
			for(int k = j+1; k<N; k++) {
				if(input[j]>input[k]) {
					int temp = input[k];
					input[k] = input[j];
					input[j] = temp;
				}
			}
		}
		*/
		
		//Arrays 클래스를 사용해 정렬
		Arrays.sort(input);
		
		System.out.println(input[0] + " " + input[N-1]);
		
	}

}
