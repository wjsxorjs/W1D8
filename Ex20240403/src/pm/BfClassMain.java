package pm;

public class BfClassMain {

	public static void main(String[] args) {
		
		BfClassGen<Integer> intVal = new BfClassGen<Integer>();
		
		System.out.println(intVal.getValue());
		
		intVal.setValue(1500);
		
		System.out.println(intVal.getValue());

	}

}




/*
	리스트(list) 구조는 배열처럼 index로 접근하며 가변적이라는 특징을 가진다. 배열처럼 중복을 허용한다.
	
	셋(set) 구조는 중복을 허용하지않는다.
	
	맵(map) 구조는 키 값 - 연결된 값으로 쌍을 이루며 키 값은 중복될 수 없다.



*/