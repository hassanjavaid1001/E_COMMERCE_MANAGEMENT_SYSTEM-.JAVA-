import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String[] options = {
                "Cart Management",
                "Cart Item Management",
                "Customer Management",
                "Inventory Management",
                "Order Management",
                "Order Item Management",
                "Payment Management",
                "Product Management",
                "Shipping Management",
                "Admin Management",
                "Supplier Management",
                "Address Management"
            };
            //while (true) {
                String choice = (String) JOptionPane.showInputDialog(
                        null,
                        "Select a module to launch:",
                        "E-Commerce Management System",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        options,
                        options[0]
                );
                if (choice == null) {
                    // User cancelled the dialog
                    return;
                }
                switch (choice) {
                    case "Cart Management":
                        new view.CartView();
                        break;
                    case "Cart Item Management":
                        new view.CartItemView();
                        break;
                    case "Customer Management":
                        new view.CustomerView();
                        break;
                    case "Inventory Management":
                        new view.InventoryView();
                        break;
                    case "Order Management":
                        new view.OrderView();
                        break;
                    case "Order Item Management":
                        new view.OrderItemView();
                        break;
                    case "Payment Management":
                        new view.PaymentView();
                        break;
                    case "Product Management":
                        new view.ProductView();
                        break;
                    case "Shipping Management":
                        new view.ShippingView();
                        break;
                    case "Admin Management":
                        new view.AdminView();
                        break;
                    case "Supplier Management":
                        new view.SupplierView();
                        break;
                    case "Address Management":
                        new view.AddressView();
                        break;
                }
            //}
            //System.exit(0);
        });
    }
}
