package basicSyntax;

public class basicSyntax {

	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		
		int sum = sumNumbers(a,b);
		int difference = differenceNumbers(a, b);
		int product = productNumbers(a, b);
		int divide = divideNumbers(a, b);
		
		results(sum);
		results(difference);
		results(product);
		results(divide);
	}
	
	public static int sumNumbers(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	public static int differenceNumbers(int a, int b) {
		int difference = a - b;
		
		return(int)difference;
		
	}
	
	public static int productNumbers(int a, int b) {
		int product = a * b;
		
		return (int)product;
	}
	
	public static int divideNumbers(int a, int b) {
		int divide = a / b;
		
		return(int)divide;
	}
	
	public static void results(int result) {
		System.out.println("計算結果は" + result + "です。");
	}

}

//System.out.println(sumNumbers(a, b));
//System.out.println(differenceNumbers(a, b));
//System.out.println(productNumbers(a, b));
//System.out.println(divideNumbers(a, b));