package pm;

public class Drink {
	private String name;
	private int price;
	
	public Drink() {};
	
	public Drink(String n, int p) { // 생성자를 만들면 컴파일러가 만들어 주던 기본 생성자를 만들어주지않는다. 
		this.name = n;
		this.price = p;
	}
	
	public Drink(int p, String n) { // 인자 순서만 달라도 오버로딩이 가능하다.
		this.name = n;
		this.price = p;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
