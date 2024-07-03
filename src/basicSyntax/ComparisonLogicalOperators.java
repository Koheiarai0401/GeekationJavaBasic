package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 6;
		int b = 5;
		
		boolean isGreaterA = (a > b);
		boolean isGreaterB = (a < b);
		
		System.out.println(isGreaterA);
		
		boolean isSunny = true;
		boolean isWarm =  true;
		
		boolean andResultA = (isSunny == true && isWarm == true);
		
		System.out.println(andResultA);
		
		int x = 5;
		int y = 10;
		
		boolean isMoreOrEqual = (x >= 0 && y %2 == 0);
		
		System.out.println(isMoreOrEqual);
		
		boolean hasPermission = false;
		
		boolean Answer = (hasPermission == false);
		
		System.out.println(!hasPermission);
		
		
	}

}
