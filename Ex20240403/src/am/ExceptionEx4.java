package am;

public class ExceptionEx4 {
	
	
	public boolean test() { // static이 아닌 애들(멤버들)은 해당 클래스를 생성하고 사용할 수 있다.
							// 생성해야만 자리를 잡을 수 있기 때문이다.
		boolean chk = false;
		try {
			System.out.println("try: "+(10/3));
			return chk; // 이게 있더라도 finally를 수행한다.
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			// 예외발생 여부와 상관없이 무조건 수행하는 영역
			// 위의 return이 있다고 하더라도 무조건 처리를 한다.
			System.out.println("finally");
		}
		return true;
	}

	public static void main(String[] args) {
		// Start of the Program
		
		ExceptionEx4 ex4 = new ExceptionEx4(); // 이래야만 static이 아닌 test() 함수를 사용할 수 있다.
		
		boolean chk = ex4.test(); // 멤버함수 호출
		
		System.out.println(chk);
		
		

	}

}
