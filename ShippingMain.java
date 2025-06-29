//package view;

import controller.ShippingController;
import model.Shipping;

import java.time.LocalDate;
import java.util.Scanner;

public class ShippingMain {
    public static void main(String[] args) {
        ShippingController controller = new ShippingController();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Status: ");
        String status = scanner.nextLine();

        // Shipping expects: (int shippingID, int orderID, String shippingAddress, LocalDate shippingDate, LocalDate deliveryDate, String shippingStatus, String shippingMethod)
        Shipping shipping = new Shipping(0, orderId, address, LocalDate.now(), LocalDate.now().plusDays(3), status, "Standard");
        controller.addShipping(shipping);
        System.out.println("Shipping details added.");
        scanner.close();
    }
}
