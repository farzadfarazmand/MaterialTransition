package ir.farzadfarazmand.materialtransition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Farzad Farazmand on 16,July,2017
 * farzad.farazmand@gmail.com
 */

public class Contact implements Serializable {

    private String name;
    private String color;
    private String phone;
    private String email;
    private String city;

    public Contact(String name, String color, String phone, String email, String city) {
        this.name = name;
        this.color = color;
        this.phone = phone;
        this.email = email;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getColor() {
        return color;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public static List<Contact> createContactList() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("John", "#33b5e5", "+01 123456789", "john@example.com", "Venice"));
        contactList.add(new Contact("Valter", "#ffbb33", "+01 987654321", "valter@example.com", "Bologna"));
        contactList.add(new Contact("Eadwine", "#ff4444", "+01 123456789", "eadwin@example.com", "Verona"));
        contactList.add(new Contact("Teddy", "#99cc00", "+01 987654321", "teddy@example.com", "Rome"));
        contactList.add(new Contact("Ives", "#33b5e5", "+01 11235813", "ives@example.com", "Milan"));
        contactList.add(new Contact("Alajos", "#ffbb33", "+01 123456789", "alajos@example.com", "Bologna"));
        contactList.add(new Contact("Gianluca", "#ff4444", "+01 11235813", "me@gian.lu", "Padova"));
        contactList.add(new Contact("Fane", "#99cc00", "+01 987654321", "fane@example.com", "Venice"));

        return contactList;
    }

}
