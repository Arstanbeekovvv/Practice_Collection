package Task2;

import java.util.List;

public interface PhoneInterface {
    boolean turnOn(String password);
    void call(int numberPhone);
    void call(String name);
    void searchContact(String name);
    void updateName();
    void getAllContacts();
    void addContact(Contact contact);
}
