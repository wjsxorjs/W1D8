package am;

public class ExceptionEx5 {
	
	public void ex1() /*throws Exception*/ {
		System.out.println("ex1 함수");
		
		
		try {
			this.ex2();
		} catch (Exception e) {
			// 이렇게 호출한 곳에서 예외처리를 진행해준다.
			
			//예외가 발생한 경우를 순차적으로 하나씩 출력하라
			e.printStackTrace();
		}
		
//		this.ex2();
		
		System.out.println("ex2 함수 수행 끝");
		
	}

	public void ex2() throws Exception{ // 자신을 호출한 쪽[ex1()]으로 예외를 양보한다.
		System.out.println("수행 1");
		System.out.println("수행 2");
		System.out.println("수행 3" +(10/0));
		System.out.println("수행 4");
		System.out.println("수행 5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionEx5 ex5 = new ExceptionEx5();
		try {
			ex5.ex1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");

	}

}
