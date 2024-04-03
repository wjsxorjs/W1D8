package am;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// 예외(Exception)는 예상하지 못한 가벼운 오류를 의미하며
		// 개발자에 의해서 수정이 가능한 것

		// 예외처리는 try~catch블럭으로 해결해야한다. < 다른 방법이 없다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number1: ");
		int su1 = scan.nextInt();
		
		System.out.print("Number2: ");
		int su2 = scan.nextInt();
		
		System.out.printf("Number1 / Number2 = %d\r\n", (su1/su2));
		
		System.out.println("프로그램 끄읕");
		
		

	}

}
