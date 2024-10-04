package jalali;

public class SumCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For Loop
		int sumFor = 0;
		for (int i = 1; i <= 10; i++ ) { sumFor += i;}
		System.out.println("Sum using For Loop" + sumFor);
		
		//While Loop
		int sumWhile = 0;
		int i = 1;
		while (i <=10) { sumWhile +=i; i++;}
		System.out.println("Sum using While Loop:" + sumWhile);
		
		//Do-While Loop
		int sumDoWhile = 0;
		i=1;
		do {sumDoWhile += i;i++;} while (i<=10);
		System.out.println("Sum using Do-While Loop;" + sumDoWhile);
		
		// Enhanced For Loop
		int sumEnhancedFor = 0;
		int[] numbers = {1,2,3,4,5,6,7,8,9,10}; for (int num : numbers) {sumEnhancedFor += num;}
		System.out.println("Sum using Enhanced For Loop:" +sumEnhancedFor);}

		
	

	}


