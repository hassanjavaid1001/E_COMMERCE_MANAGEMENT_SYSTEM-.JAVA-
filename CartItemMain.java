//package view;

import controller.CartItemController;
import model.CartItem;

import java.util.Scanner;

public class CartItemMain {
    public static void main(String[] args) {
        CartItemController controller = new CartItemController();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cart ID: ");
        int cartId = scanner.nextInt();

        System.out.print("Product ID: ");
        int productId = scanner.nextInt();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        CartItem item = new CartItem(0, cartId, productId, quantity);
        controller.addCartItem(item);
        System.out.println("Cart item added.");
    }
}
