package baekjoon.step2;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {

//		시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//		첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시험점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 시험점수입니다.");
		} else if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score <= 89) {
			System.out.println("B");
		} else if(score >= 70 && score <= 79) {
			System.out.println("C");
		} else if(score >= 60 && score <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
