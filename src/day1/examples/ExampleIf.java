package day1.examples;

public class ExampleIf {

	public static void main(String[] args) {
		int x = 20;
		int y = 20;
		
		if(x<y){
			System.out.println("X is less than Y");
		}
		if(x==y){
			System.out.println("X is equal to Y");
		}
		if(x>y){
			System.out.println("X is greater than y");
		}
		
		/*
		 * the above 'if' statement isn't efficient b/c the program runs
		 * all 3 'if' statement even though it found correct answer in the 2nd 'if' statement
		 * 
		 * Below is example of much efficient 'if' statement
		 */
		
	}

}
