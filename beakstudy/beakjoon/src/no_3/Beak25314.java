package no_3;

import java.util.Scanner;

public class Beak25314 {

	public static void main(String[] args) {

		/*
		본문 확인
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int su = N/4;
		String dap = "";
		for(int i=0; i<su; i++) {
			dap += "long ";
		}
		
		System.out.println(dap + "int");
		
	}

}
