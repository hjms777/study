package no_6;

import java.util.Scanner;

public class Baek1157 {

	public static void main(String[] args) {
		/*
		문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
		단, 대문자와 소문자를 구분하지 않는다.

		입력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
		주어지는 단어의 길이는 1,000,000을 넘지 않는다.

		출력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다
		 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		*/
		
		Scanner sc = new Scanner(System.in);

		String ans = sc.next().toUpperCase();
		
		int eng[] = new int[26];

		for (int i = 0; i < ans.length(); i++) {
			char chr = ans.charAt(i);

			for (int j = 0; j < eng.length; j++) {
				if (chr == 65 + j) {
					eng[j] += 1;
				}
			}
		}

		int chk = -1;
		int askii = 0;
		char a = '?';

		for (int i = 0; i < eng.length; i++) {
			if (eng[i] > chk) {
				askii = 56 + i;
				chk = eng[i];
			}

		}


		System.out.println(a);
		
	}

}
