package am;

public class ExceptionEx2 {

	public static void main(String[] args) {
		//프로그램 시작
		int ar[] = new int[3];
		try {
			for(int i=0; i<=ar.length; i++) {
				ar[i] = (i+1) * 100;		// 예외가 발생한 행부터 catch문 이전까지의 행의 코드들은 수행되지않는다.
				System.out.println(ar[i]);
			}
			System.out.println("~~반복문 끝~~");
		} catch(ArrayIndexOutOfBoundsException ex) {
			// ArrayIndexOutOfBoundsException가 발생할 경우 실행
			System.out.println("예외처리!"); // 할 게 없다면 비워놔도 무방하다.
		}
		
//		System.out.println("~~반복문 끝~~");
		
		System.out.println("프로그램 종료!");
		
		
		
		
		
	}

}
