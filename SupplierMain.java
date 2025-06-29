import controller.SupplierController;
import model.Supplier;

import java.util.List;
import java.util.Scanner;

public class SupplierMain {
    public static void main(String[] args) {
        SupplierController controller = new SupplierController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Supplier Management ===");
            System.out.println("1. Add Supplier");
            System.out.println("2. View All Suppliers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Supplier ID: ");
                    int supplierId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Company Name: ");
                    String companyName = scanner.nextLine();

                    System.out.print("Contact No: ");
                    String contactNo = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Supplier supplier = new Supplier(supplierId, companyName, contactNo, email);
                    controller.addSupplier(supplier);
                    System.out.println("Supplier added.");
                    break;

                case 2:
                    List<Supplier> suppliers = controller.getAllSuppliers();
                    for (Supplier s : suppliers) {
                        System.out.println(s.getSupplierId() + ": " + s.getCompanyName() + ", " + s.getContactNo() + ", " + s.getEmail());
                    }
                    break;

                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
