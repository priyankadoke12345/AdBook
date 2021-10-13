package AdBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<AllContacts> arrayList = new ArrayList<AllContacts>();
    Scanner scanner;

    public AddressBook() {
        this.scanner = new Scanner(System.in);
    }

    public void addData() {


        System.out.println("Details are here");

        System.out.println("First Name");
        String fname = scanner.nextLine();

        System.out.println("Last Name");
        String lname = scanner.nextLine();

        System.out.println("Address");
        String address = scanner.nextLine();

        System.out.println("City");
        String city = scanner.nextLine();

        System.out.println("state");
        String state = scanner.nextLine();

        System.out.println("zip");
        String zip = scanner.nextLine();

        System.out.println("PhoneNumber");
        String phone = scanner.nextLine();
        System.out.println("Email");

        String email = scanner.nextLine();

        arrayList.add(new AllContacts(fname, lname, address, city, state, zip, phone, email));
        System.out.println("Data added Successfully");
    }


}
