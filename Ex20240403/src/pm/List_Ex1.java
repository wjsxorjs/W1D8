package pm;

import java.util.ArrayList;

public class List_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 정수만 저장하는 List구조 생성
		ArrayList<Integer> list_1 = new ArrayList<>();
		/* 
			위는 배열과 같은 구조를 찾았으며
			차이점은 생성 시 크기를 지정하지않고,
			추가될 때(add)마다 크기가 늘어난다.
			삭제시(remove)에는 크기가 줄어든다.
		*/ 
		
		System.out.printf("list_1.size(): %d\r\n", list_1.size());
		
		list_1.add(1);
		
		for(int i = 2; i<=10; i++) {
			list_1.add(i);
		}
		
		System.out.printf("list_1.size(): %d\r\n", list_1.size());
		
		//반복문을 이용하여 출력하자
		System.out.println("------------------");
		System.out.println("------------------");
		for(int i=0; i<list_1.size();i++) {
			// list구조에서 요소를 하나씩 얻어낸다.
			int n = list_1.get(i);
			System.out.println(n);
		}
		
		System.out.println("============================");
		list_1.remove(4);
		for(int i=0; i<list_1.size();i++) {
			// list구조에서 요소를 하나씩 얻어낸다.
			int n = list_1.get(i);
			System.out.println(n);
		}

		System.out.println("============================");
		list_1.add(6, 100);
		for(int i=0; i<list_1.size();i++) {
			// list구조에서 요소를 하나씩 얻어낸다.
			int n = list_1.get(i);
			System.out.println(n);
		}
		
		System.out.println("============================");
		int index = list_1.indexOf(7);
		System.out.printf("list_1.indexOf(7): %d\r\n", index);
		System.out.println();
		
		System.out.println("============================");
		// 현재 list구조가 비었는지 판단
		if(list_1.isEmpty()) {
			System.out.println("list_1은 비어있습니다.");
		} else {
			System.out.println("list_1은 비어있지 않습니다.");
		}
		System.out.println();
		System.out.println("============================");
		list_1.clear();
		if(list_1.isEmpty()) {
			System.out.println("list_1은 비어있습니다.");
		} else {
			System.out.println("list_1은 비어있지 않습니다.");
		}
		System.out.printf("list_1.size(): %d\r\n", list_1.size());
		System.out.println("============================");
		System.out.println();

	}

}
