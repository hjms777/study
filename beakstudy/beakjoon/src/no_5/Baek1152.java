package no_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1152 {

	public static void main(String[] args) throws IOException {

		/*
		문제 : 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
		 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
		  단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
		
		입력 : 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
		 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며,
		  공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
		
		출력 : 첫째 줄에 단어의 개수를 출력한다.
		*/
		
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in)); 
		/* 예제 입,출력은 같지만 정답이 아니라고한다 너무 꼼수인가? 싶다
		 * 검색해본 결과 trim(), strip()을 사용해 지운 공백은 null이 아닌 ""이란 빈 문자열이 된다
		String a = bf.readLine().trim();
		String b[] = a.split(" ");
		System.out.println(b.length);
		*/
		
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		System.out.println(st.countTokens());
		
		
	}

}
