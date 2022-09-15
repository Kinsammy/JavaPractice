import java.util.Scanner;
public class ConfirmTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		Confirm myTest = new Confirm();
		
		System.out.print("The initial name is: " + myTest.getName());

		System.out.print("Enter the Name: ");
		String theName = input.nextLine();
		myTest.setName(theName);
		//System.out.print();

		System.out.println("The name in the object myTest is: " + myTest.getName());
	}
}
