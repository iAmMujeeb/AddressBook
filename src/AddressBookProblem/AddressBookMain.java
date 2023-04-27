package AddressBookProblem;

import java.util.ArrayList;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        ArrayList<AddressBook> addressBook = new ArrayList<>();
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact();
        addressBook1.addContact();
        addressBook1.addContact();
        addressBook.add(addressBook1);

        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact();
        addressBook2.addContact();
        addressBook2.addContact();
        addressBook.add(addressBook2);
        
        AddressBook addressBook3 = new AddressBook();
        addressBook3.addContact();
        addressBook3.addContact();
        addressBook3.addContact();
        addressBook.add(addressBook3);
    }
}