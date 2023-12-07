package Task2;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String brand;
    private String name;
    private String password;
    private List<Contact> contacts = new ArrayList<>();

    public Phone(String brand, String name, String password) {
        this.brand = brand;
        this.name = name;
        this.password = password;
    }

    public Phone() {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone: " +
                "\n1. brand = " + brand +
                "\n2. name = " + name +
                "\n3. password = " + password +
                "\n4. contacts = " + contacts;
    }
}
