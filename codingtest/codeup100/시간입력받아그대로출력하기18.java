package codeup100;

import java.util.Scanner;

public class 시간입력받아그대로출력하기18 {

	public static void main(String[] args) {

//		어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시 : ");
		int h = sc.nextInt();
		System.out.print("분 : ");
		int m = sc.nextInt();
		
		System.out.println(h + "시 " + m + "분");
		
	}

}
