package codeup100;

import java.util.Scanner;

public class 년월일입력받아그대로출력하기19 {

	public static void main(String[] args) {

//		년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
	}

}
