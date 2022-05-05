package baekjoon.step3;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

//		N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
//		첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n < 1 || n > 9) {
			System.out.println("잘못된 수 입니다.");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(n + " * " + i + " = " + (n*i));
			}
		}
		
		
	}

}
