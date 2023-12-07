package Task2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class PhoneServiceImpl implements PhoneInterface {
    Phone phones = new Phone("Apple", "Phone x", "258");


    @Override
    public boolean turnOn(String password) {
        try {
                if (password.equalsIgnoreCase(phones.getPassword())) {
                    System.out.println(phones);
                    return true;
                } else throw new Exception();
        }catch (Exception e){

           System.out.println("Invalid password!!!");
        }
        return false;
    }

    @Override
    public void call(int numberPhone) {
        for (int i = 0; i < phones.getContacts().size(); i++) {
            if(phones.getContacts().get(i).getPhoneNumber() == numberPhone){
                System.out.println(STR."""
                        \{phones.getContacts().get(i).getFullName()}
                                ♻️Соединение♻️
                        """);
                return;
            }
        }
        System.out.println("We have not this phone number!!! ");
    }

    @Override
    public void call(String name) {
        for (int i = 0; i < phones.getContacts().size(); i++) {
            if(phones.getContacts().get(i).getFullName().equalsIgnoreCase(name)){
                System.out.println(STR."""
                        +996\{phones.getContacts().get(i).getPhoneNumber()}
                                ♻️Соединение♻️
                        """);
                return;
            }
        }
        System.out.println("We have not this phone number!!! ");
    }

    @Override
    public void searchContact(String name) {
        for (int i = 0; i < phones.getContacts().size(); i++) {
            if(phones.getContacts().get(i).getFullName().equalsIgnoreCase(name)){
                System.out.println(STR."""
                               ♻️Contact♻️
                        \{phones.getContacts().get(i)}  || Successful search contact ✅""");

            }
            if (i == phones.getContacts().size()-1) return;
        }
        System.out.println("We have not this phone number!!! ");
    }

    @Override
    public void updateName() {
        for (int i = 0; i < phones.getContacts().size(); i++) {
            System.out.println(i+1 + ". " + phones.getContacts().get(i));
        }
        System.out.print("Enter your queue number: ");
        try {
            int index = new Scanner(System.in).nextInt();
            while(true) {
                System.out.println(phones.getContacts().get(index - 1) + "1 or 2 '0' -> EXIT");
                switch (new Scanner(System.in).nextLine()) {
                    case "2" -> {
                        System.out.print("Enter new number phone: 996");
                        phones.getContacts().get(index - 1).setPhoneNumber(new Scanner(System.in).nextInt());
                    }
                    case "1" -> {
                        System.out.print("Enter new contact full name: ");
                        phones.getContacts().get(index - 1).setFullName(new Scanner(System.in).nextLine());
                    }
                    case "0" -> {
                        return;
                    }
                }
            }
        }catch (InputMismatchException ime){
            System.out.println("Enter numbers only!");
        }

    }

    @Override
    public void getAllContacts() {
        for (Contact contact : phones.getContacts()) {
            System.out.println(contact);
        }
    }

    @Override
    public void addContact(Contact contact) {
        phones.getContacts().add(contact);
        System.out.print(contact);
        System.out.println("     Successful add contact ✅");
    }
}
