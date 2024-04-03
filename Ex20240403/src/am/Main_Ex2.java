package am;

public class Main_Ex2 {

	public static void main(String[] args) {
		// 원하는 객체 생성
		
		Gen_Ex2<String> dataStr = new Gen_Ex2<String>(); 	// <>는 생성하고싶은 자료형이 무엇이냐고 묻는 것과 동일하다.
															// 해당 자료형은 객체로 내가 만든 클래스도 가능하다.
															// <Integer>처럼 기본 자료형이 아닌 클래스 형으로 넣어주어야한다. 
		
		dataStr.setValue("100");
		
		System.out.println(dataStr.getValue() + 1);

		Gen_Ex2<Integer> dataInt = new Gen_Ex2<Integer>();
		
		dataInt.setValue(100);
		
		System.out.println(dataInt.getValue() + 1);
		
		
		

	}

}
