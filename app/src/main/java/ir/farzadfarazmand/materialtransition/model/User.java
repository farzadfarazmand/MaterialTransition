package ir.farzadfarazmand.materialtransition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ir.farzadfarazmand.materialtransition.R;

/**
 * Created by Farzad Farazmand on 16,July,2017
 * farzad.farazmand@gmail.com
 */

public class User implements Serializable {

    private String name;
    private String color;
    private int image;
    private String phone;
    private String email;
    private String city;

    public User(String name, String color, int image, String phone, String email, String city) {
        this.name = name;
        this.color = color;
        this.image = image;
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

    public static List<User> createContactList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Ali", "#33b5e5", R.mipmap.ic_user_7, "+98 9911991199", "Ali@example.com", "Tehran"));
        userList.add(new User("Reza", "#ffbb33", R.mipmap.ic_user_2, "+98 3355112288", "Reza@example.com", "Ahwaz"));
        userList.add(new User("Fateme", "#ffbb33", R.mipmap.ic_user_6, "+98 4477551133", "Fateme@farzad.ir", "Esfahan"));
        userList.add(new User("Mahmoud", "#ff4444", R.mipmap.ic_user_4, "+98 123456789", "Mahmoud@example.com", "Tabriz"));
        userList.add(new User("Maryam", "#33b5e5", R.mipmap.ic_user_1, "+98 4545454889", "Maryam@example.com", "Shiraz"));
        userList.add(new User("Hasan", "#ff4444", R.mipmap.ic_user_5, "+98 8798978582", "Hasan@iran.ir", "Karaj"));
        userList.add(new User("Parmida", "#99cc00", R.mipmap.ic_user_3, "+98 5577662244", "Parmida@example.com", "Kashan"));

        return userList;
    }

}
