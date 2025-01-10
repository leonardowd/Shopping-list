import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ShoppingList item = new ShoppingList();
		Boolean isFinished = false;
		
		System.out.println("Welcome to your shopping list!");
		
		while (isFinished == false) {
			
			System.out.print("item: ");
			String name = sc.nextLine();
			
			System.out.print("Quantity: ");
			Double qt = sc.nextDouble();
			
			item.setName(name);
			item.setQuantity(qt);
			item.save();
			
			System.out.print("Add another item? (Y/N)");
			char response = sc.next().charAt(0);
			Character.toUpperCase(response);
			sc.nextLine();
			
			if (Character.toUpperCase(response) == 'N') {
				isFinished = true;
			}
			
		} 
		
		sc.close();
		
	}

}
