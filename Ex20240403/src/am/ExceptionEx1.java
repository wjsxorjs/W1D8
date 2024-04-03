package am;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// 예외(Exception)는 예상하지 못한 가벼운 오류를 의미하며
		// 개발자에 의해서 수정이 가능한 것

		// 예외처리는 try~catch블럭으로 해결해야한다. < 다른 방법이 없다.
		
		int su1, su2;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Number1: ");
			su1 = scan.nextInt();
		
			System.out.print("Number2: ");
			su2 = scan.nextInt();
		} catch (InputMismatchException ex) {
			// InputMismatchException이 발생했을 때만 수행하는 곳
			su1 = 1;
			su2 = 1;
			System.out.println("예의발생 처리! ");
			
		}
		
		// try문과 catch문은 서로 다른 영역이다.
		// catch문은 여러 개를 만들 수 있다. 다만, 순서를 맞추어야하는데
		// 										   해당 순서는 밑으로 내려갈 수록 상위 클래스(예외)를 사용해야한다.
		try {
			System.out.printf("Number1 / Number2 = %d\r\n", (su1/su2));
		} catch (ArithmeticException ex) {
			// ArithmeticException이 발생했을 때만 수행하는 곳
			su2 = 1;
			System.out.println("예의발생 처리: "+(su1/su2));
		} /*finally {
			
		}*/
		
		System.out.println("프로그램 끄읕");
		
		

	}

}
