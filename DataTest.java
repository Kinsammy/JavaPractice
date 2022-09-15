public class DataTest {
	
	public static void main(String[] args) {
		// create Construction Object for Three Users
		Data data1 = new Data("Emmanuel Jane");
		Data data2 = new Data("Samuel Fanu");
		Data data3 = new Data("Idowu Ade");

		// initial Object
		System.out. printf("The First Data is, %s%n", data1.getName());
		System.out. printf("The Second Data is, %s%n", data2.getName());
		System.out. printf("The Third Data is, %s%n", data3.getName());
	}
}