package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneServiceImpl ps = new PhoneServiceImpl();
        while(true) {
            System.out.print("Enter your phone password: ");
            if (ps.turnOn(new Scanner(System.in).nextLine())) {
                ps.addContact(new Contact(771900091, "Mirlan"));
                ps.addContact(new Contact(555750042, "Urmat"));
                ps.addContact(new Contact(702966345, "Jigit"));
                ps.addContact(new Contact(500389438, "Aliaskar"));
                myPhone(ps);
            }
        }
    }
    public static void myPhone(PhoneInterface ps){
        while (true){
            System.out.println("""
                
                1. Call by number phone
                2. Call by name
                3. searchContact
                4. updateName
                5. get All contacts
                6. add Contact
                your choice: """);
            switch (new Scanner(System.in).nextLine()) {
                case "1" -> {
                    System.out.print("Enter number phone: +996");
                    try {
                        ps.call(new Scanner(System.in).nextInt());
                    }catch (InputMismatchException ime){
                        System.out.println("Enter phone number only with numbers!!! ");
                    }
                }
                case "2" -> {
                    System.out.print("Enter name contact: ");
                    ps.call(new Scanner(System.in).nextLine());
                }
                case "3" -> {
                    System.out.print("Enter name contact for search: ");
                    ps.searchContact(new Scanner(System.in).nextLine());
                }
                case "4" -> {
                    ps.updateName();
                }
                case "5" -> {
                    System.out.println("All contacts: ");
                    ps.getAllContacts();
                }
                case "6" -> {
                    Contact contact = new Contact();
                    try {
                        System.out.print("Enter number phone: +996");
                        contact.setPhoneNumber(new Scanner(System.in).nextInt());
                    }catch (InputMismatchException ime){
                        System.out.println("Enter phone number only with numbers!!! ");
                    }
                    System.out.print("Enter full name contact: ");
                    contact.setFullName(new Scanner(System.in).nextLine());
                    ps.addContact(contact);
                }
                case "0" -> {
                    return;
                }
            }
        }
    }
}
