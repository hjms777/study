package no_4;

import java.util.Arrays;
import java.util.Scanner;

public class Baek5597 {

	public static void main(String[] args) {

		/*
		문제 : X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데,
		 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
		
		교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
		
		입력 : 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
		
		출력 : 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int su[] = new int[28];
		int n2[] = new int[2];
		String find = "N";
		for(int i = 0; i<28; i++) {
			su[i] = sc.nextInt();
		}
		
		Arrays.sort(su);
		
		/*배열의 최대값을 넘게 비교할수없어서 에러발생
		for(int j = 0; j<28; j++) {
			if(su[j]+1 != su[j+1]) {
				if(min!=0) {
					max = su[j]+1;
				}
				min = su[j]+1;
			}
		}
		*/	
		
		/*
		이 식이 정석은 아니겠지만 풀이를 해본다면
		출석이 담길 28칸의 배열과 1 ~ 30까지의 숫자를 비교한다
		이때 String find라는 변수를 생성해 기본값을 N을 부여해준다
		1 ~ 30까지 총 30번을 28칸의 배열과 비교한 뒤 만약 같은 값이 있다면 find를 "Y"로 변경한다
		28번의 반복을 지난 후에도 같은 값이 없어 find가 "N" 이라면
		두 개의 변수가 들어갈 n2[]배열에 i의 변수를 입력한다 이 때 다시 한번 조건을 걸어
		n2[0]번의 값이 존재할땐 n2[1]번에 값을 넣고 그외에는 n2[0]번에 값을 넣게한다
		*/
		for(int i = 1; i<=30; i++) {
			
			for(int j = 0; j<28; j++) {
				
				if(su[j]==i) {
					find = "Y";
				}
				
			}
			
			if(find.equals("N")) {
				if(n2[0]!=0) {
					n2[1] = i;
				}else {
					n2[0] = i;
				}
			}
			
			find = "N";
		}
		
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		
		
		
	}
}
