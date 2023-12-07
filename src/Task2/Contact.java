package Task2;

public class Contact {
    private int phoneNumber;
    private String fullName;

    public Contact() {
    }

    public Contact(int phoneNumber, String fullName) {
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "\n🔹Contact -> " +
                "fullName: " + fullName +
                " -> phoneNumber: +996" + phoneNumber;
    }
}
