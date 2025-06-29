//package view;

import controller.InventoryController;
import model.Inventory;

import java.time.LocalDate;
import java.util.Scanner;

public class InventoryMain {
    public static void main(String[] args) {
        InventoryController controller = new InventoryController();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product ID: ");
        int productId = scanner.nextInt();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Inventory inventory = new Inventory(0, productId, quantity, "Default", LocalDate.now());
        controller.addInventory(inventory);
        System.out.println("Inventory updated.");
        scanner.close();
    }
}
