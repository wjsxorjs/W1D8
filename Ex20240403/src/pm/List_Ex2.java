package pm;

import java.util.ArrayList;

public class List_Ex2 {

	public static void main(String[] args) {
		// 문자열을 저장하는 리스트
		ArrayList<String> list = new ArrayList<>();
		
		list.add("TEST");
		list.add("테스트");
		list.add("123");
		list.add("테스트");
		
		System.out.println(list.size());
		
		System.out.println("---------");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------");
		
		list.remove("테스트");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}

}
