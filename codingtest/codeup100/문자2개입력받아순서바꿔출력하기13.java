package codeup100;

import java.util.Scanner;

public class 문자2개입력받아순서바꿔출력하기13 {

	public static void main(String[] args) {

//		2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
		
		Scanner s = new Scanner(System.in);
		
		char a = s.next().charAt(0);
		char b = s.next().charAt(0);
		
		System.out.printf("%c %c", b, a); // printf를 사용해서 출력순서 바꾸기
		
	}

}
