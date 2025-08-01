import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private static final String FILE_PATH = "contacts.dat";

    // writeContactToFile
    public void writeContactToFile(List<Contact> contacts) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            oos.writeObject(contacts);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error writing contacts to file" + e.getMessage());
        }
    }

    // readContactFromFile
    public List<Contact> readContactsFromFile() {
        List<Contact> contactList = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return contactList; // Trả về danh sách rỗng nếu file chưa có
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            contactList = (List<Contact>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return contactList;
    }

    // addContact
    public void addContact(Contact contact) {
        List<Contact> contacts = readContactsFromFile();
        contacts.add(contact);
        writeContactToFile(contacts);
    }

    // displayAllContact
    public void displayAllContacts() {
        List<Contact> contacts = readContactsFromFile();
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    // updateContact
    public void updateContact(Contact updatedContact) {
        List<Contact> contacts = readContactsFromFile();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(updatedContact.getPhoneNumber())) {
                contacts.set(i, updatedContact);
                writeContactToFile(contacts);
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại trong danh bạ.");
    }

    // deleteContact
    public void deleteContact(String phoneNumber) {
        List<Contact> contacts = readContactsFromFile();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(i);
                break;
            }
        }
        writeContactToFile(contacts);
    }

    // searchContact
    public void searchContact(String keyword) {
        List<Contact> contacts = readContactsFromFile();
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy contact phù hợp!!!");
        }
    }
}
