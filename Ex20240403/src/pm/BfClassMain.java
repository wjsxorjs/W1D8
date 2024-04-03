package pm;

public class BfClassMain {

	public static void main(String[] args) {
		
		BfClassGen<Integer> intVal = new BfClassGen<Integer>();
		
		System.out.println(intVal.getValue());
		
		intVal.setValue(1500);
		
		System.out.println(intVal.getValue());

	}

}
