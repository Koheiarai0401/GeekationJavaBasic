package objectExercise;

public class Land extends Property{
	private double size;
	
	public Land(String name, String owner, String type, int price, double size) {
		super(name, owner, type, price);
		this.size = size;
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size=size;
	}
	
	public void details() {
		super.details();
		System.out.println("広さ：" + size + "㎡");
	}
}
