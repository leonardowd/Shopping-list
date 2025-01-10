import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ShoppingList {

	String name;
	Double quantity;
	
	public ShoppingList() {
		
	}
	
	public ShoppingList(String name, Double quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	public String save() {
		
		try {
			FileWriter fw = new FileWriter("shopping-list.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Item: " + this.name + " - Quantity: " + this.quantity);
			
			pw.close();
			fw.close();	
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return "Success";
		
	}
}
