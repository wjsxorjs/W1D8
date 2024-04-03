package pm;

import java.util.ArrayList;

public class List_Ex3 {

	public static void main(String[] args) {
		// 프로그램 시작
		
		// Drink 객체를 여러 개 저장하는 List구조를 생성하자!
		ArrayList<Drink> list = new ArrayList<>();
		
		Drink d1 = new Drink();
		d1.setName("사이다");
		d1.setPrice(500);
		
		Drink d2 = new Drink("콜라", 500);
		
		Drink d3 = new Drink("콜라", 600);
		
		list.add(d1);
		list.add(d3);
		list.add(d2);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i).getName());
			System.out.println(list.get(i).getPrice());
		}
		//600원짜리 콜라 삭제
		list.remove(d3);
		
		System.out.println("==========");
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i).getName());
			System.out.println(list.get(i).getPrice());
		}


		
		

	}

}
