public class WhileCounter {
	public static void main(String[] args) {
		int counter = 10;
		
		while (counter >= 1) {
			System.out.printf("%d ", counter);
			--counter;
		}
		

		int count = 1;

		while (count <= 10) {
			System.out.printf("%n%d ", count);
			++count;
		}
			
		System.out.println();
	}	
}