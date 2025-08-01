import java.io.Serializable;

public class Contact implements Serializable {
    private String phoneNumber;
    private String name;
    private String email;

    public Contact() {
    }

    public Contact(String phoneNumber, String name, String email) {
        this.setPhoneNumber(phoneNumber);
        this.setName(name);
        this.setEmail(email);
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
