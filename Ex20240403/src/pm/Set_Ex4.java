package pm;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Ex4 {

	public static void main(String[] args) {
		// 정수를 저장하는 Set구조 생성
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		System.out.printf("set1.size(): %d\r\n",set1.size());
		System.out.printf("set1.isEmpty(): %b\r\n",set1.isEmpty());
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(100); // 중복자원이므로 저장안됨
		
		System.out.println("====================");
		if(set1.add(200)) {
			System.out.println("추가완료");
		} else {
			System.out.println("중복자원");
		}
		

		System.out.println("====================");
		System.out.printf("set1.size(): %d\r\n",set1.size());
		System.out.printf("set1.isEmpty(): %b\r\n",set1.isEmpty());
		// set 구조는 index값이 없기 때문에
		// 반복자인 iterator로 얻어내어 반복처리 해야 한다.
		Iterator<Integer> it = set1.iterator();
		while(it.hasNext()) { 	// hasNext()함수는 커서가 있는 위치에서 바로 다음 칸에
								// 자원이 있으면 true, 없으면 false를 반환한다.
			
			int n = it.next(); // 다음 위치로 이동해서 해당 위치의 자원을 반환하여 n에 저장한다.
			
			System.out.printf("%-4d\r\n", n);
			
		}

		set1.remove(200);
		System.out.println("====================");
		Iterator<Integer> it2 = set1.iterator();
		while(it2.hasNext()) { 	// hasNext()함수는 커서가 있는 위치에서 바로 다음 칸에
								// 자원이 있으면 true, 없으면 false를 반환한다.
			
			int n = it2.next(); // 다음 위치로 이동해서 해당 위치의 자원을 반환하여 n에 저장한다.
								// iterator를 사용하면 값을 확인할 때 항상 한 칸씩 움직이기에 
								// index를 사용하는 것보다 depth가 깊으면 깊을수록 일정한 속도를 유지한다.
			
			System.out.printf("%-4d\r\n", n);
			
		}
		
		System.out.println("====================");
		System.out.printf("set1.size(): %d\r\n",set1.size());
		System.out.printf("set1.isEmpty(): %b\r\n",set1.isEmpty());
		
		
	}

}
