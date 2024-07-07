package objectExercise;

public class Apartment extends Property{
	private String space;
	
	public Apartment(String name, String owner, String type, int price, String space) {
		super(name, owner, type, price);
		this.space = space;
	}
	public String getSpace(){
		return space;
	}
	public void setSpace() {
		this.space = space;
	}
	public void details(){
		super.details();
		System.out.println("間取り：" + space);

	}
}
