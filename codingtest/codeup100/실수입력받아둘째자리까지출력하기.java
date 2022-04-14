package codeup100;

import java.util.Scanner;

public class 실수입력받아둘째자리까지출력하기 {

	public static void main(String[] args) {

//		실수(float) 1개를 입력받아 저장한 후,
//		저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
//		소수점 이하 둘 째 자리까지 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		float f = sc.nextFloat();
		
		System.out.println(String.format("%.2f", f));
		
		// String.format("%.nf", a); -> n+1의 자리에서 반올림
		// Math.round() 반올림해서 int형으로 리턴
		
	}

}
