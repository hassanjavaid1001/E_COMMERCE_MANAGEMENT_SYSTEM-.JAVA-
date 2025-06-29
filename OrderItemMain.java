//package view;

import controller.OrderItemController;
import model.OrderItem;

import java.math.BigDecimal;
import java.util.Scanner;

public class OrderItemMain {
    public static void main(String[] args) {
        OrderItemController controller = new OrderItemController();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Order ID: ");
        int orderId = scanner.nextInt();

        System.out.print("Product ID: ");
        int productId = scanner.nextInt();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Unit Price: ");
        double unitPrice = scanner.nextDouble();

        OrderItem item = new OrderItem(0, orderId, productId, quantity, BigDecimal.valueOf(unitPrice));
        controller.addOrderItem(item);
        System.out.println("Order item added.");
        scanner.close();
    }
}
