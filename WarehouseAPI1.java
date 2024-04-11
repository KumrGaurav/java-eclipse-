import java.util.Scanner;

public class WarehouseAPI1 {
    
    // Method to authenticate a user
    public boolean login(String username, String password) {
        // Replace this with your own user authentication logic
        if (username.equals("admin") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
    
    // Method to check the quantity of packages in the warehouse
    public String checkQuantity(int quantity) {
        String count = "";
        if (quantity > 400) {
            count = "Overloaded, not enough space in warehouse";
        } else if (quantity == 400) {
            count = "Warehouse is full";
        } else {
            count = "Space available in warehouse";
        }
        return count;
    }
    
    // Method to check the condition of the warehouse
    public String checkCondition(String warehouseId, String temperature, String humidity, String powerStatus, int quantity) {
        String condition = "";
        
        if (temperature.equalsIgnoreCase("high") || humidity.equalsIgnoreCase("high") || powerStatus.equalsIgnoreCase("off")) {
            condition = "Poor";
        } else if (temperature.equalsIgnoreCase("moderate") || humidity.equalsIgnoreCase("moderate")) {
            condition = "Fair";
        } else if (temperature.equalsIgnoreCase("low") && humidity.equalsIgnoreCase("low") && powerStatus.equalsIgnoreCase("on")) {
            condition = "Good";
        } else {
            condition = "Unknown";
        }
        
        return condition;
    }
    
    // Main method to test the WarehouseAPI class
    public static void main(String[] args) {
        WarehouseAPI api = new WarehouseAPI();
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to login
        System.out.println("Please login to continue");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        // Authenticate the user
        if (!api.login(username, password)) {
            System.out.println("Invalid username or password");
            return;
        }
        
        // Read input from the user
        System.out.println("Enter the Warehouse ID:");
        String warehouseId = scanner.nextLine();
        System.out.println("Enter the temperature (high, moderate, low):");
        String temperature = scanner.nextLine();
        System.out.println("Enter the humidity (high, moderate, low):");
        String humidity = scanner.nextLine();
        System.out.println("Enter the power status (on, off):");
        String powerStatus = scanner.nextLine();
        System.out.println("Enter the quantity of packages:");
        int quantity = scanner.nextInt();
        
        // Call the checkCondition method and display the result
        String condition = api.checkCondition(warehouseId, temperature, humidity, powerStatus, quantity);
        String count = api.checkQuantity(quantity);
        System.out.println("The condition of the warehouse is " + condition);
        System.out.println(count);
    }
    public boolean login1(String username, String password) {
		// TODO Auto-generated method stub
		return true;
	}
}

