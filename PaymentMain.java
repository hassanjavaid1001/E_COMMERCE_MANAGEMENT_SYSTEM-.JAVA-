// package view;

import controller.PaymentController;
import model.Payment;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentController controller = new PaymentController();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Order ID: ");
        int orderId = scanner.nextInt();

        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Method: ");
        String method = scanner.nextLine();

        // Payment expects: (int paymentId, int orderId, int customerId, Date paymentDate, String paymentMethod, BigDecimal amount, String paymentStatus)
        Payment payment = new Payment(0, orderId, 0, new Date(System.currentTimeMillis()), method, BigDecimal.valueOf(amount), "Completed");
        controller.makePayment(payment);
        System.out.println("Payment processed.");
        scanner.close();
    }
}
