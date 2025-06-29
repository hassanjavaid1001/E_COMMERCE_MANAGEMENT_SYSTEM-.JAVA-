import controller.AddressController;
import model.Address;

import java.util.List;
import java.util.Scanner;

public class AddressMain {
    public static void main(String[] args) {
        AddressController controller = new AddressController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Address Management ===");
            System.out.println("1. Add Address");
            System.out.println("2. View All Addresses");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Address ID: ");
                    int addressId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Street: ");
                    String street = scanner.nextLine();

                    System.out.print("City: ");
                    String city = scanner.nextLine();

                    System.out.print("State: ");
                    String state = scanner.nextLine();

                    System.out.print("Zip Code: ");
                    String zipCode = scanner.nextLine();

                    Address address = new Address(addressId, customerId, street, city, state, zipCode);
                    controller.addAddress(address);
                    System.out.println("Address added.");
                    break;

                case 2:
                    List<Address> addresses = controller.getAllAddresses();
                    for (Address a : addresses) {
                        System.out.println(a.getAddressId() + ": " + a.getCustomerId() + ", " + a.getStreet() + ", " + a.getCity() + ", " + a.getState() + ", " + a.getZipCode());
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