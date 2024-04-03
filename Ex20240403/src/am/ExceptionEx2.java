package am;

public class ExceptionEx2 {

	public static void main(String[] args) {
		//프로그램 시작
		int ar[] = new int[3];
		try {
			for(int i=0; i<=ar.length; i++) {
				ar[i] = (i+1) * 100;
				System.out.println(ar[i]);
			}
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("예외처리!");
		}
		
		System.out.println("~~반복문 끝~~");
		
		
		
		
	}

}
