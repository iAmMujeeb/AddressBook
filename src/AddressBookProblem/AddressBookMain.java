package AddressBookProblem;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook1 = new AddressBook();
        System.out.println("Enter Your Options:");
        System.out.println("1.Add a Contact");
        System.out.println("2.Edit a Contact");
        System.out.println("3.Delete a Contact");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
        switch (options){
            case 1:
                addressBook1.addContact();
                break;
            case 2:
                System.out.println("Enter Your Options:");
                System.out.println("1.First Name");
                System.out.println("2.Last Name");
                System.out.println("3.Address");
                System.out.println("4.City");
                System.out.println("5.State");
                System.out.println("6.Zip");
                System.out.println("7.Phone Number");
                System.out.println("8.Email Id");
                int temp = scanner.nextInt();
                addressBook1.editPerson(temp);
            case 3:
                addressBook1.deletePerson();
                break;
            default:
                System.out.println("Wrong Number");
        }
    }
}