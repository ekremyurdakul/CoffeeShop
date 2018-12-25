package models;

public class User {
    public String username;

    public User(String username, String password, String name, String address, String city, String email, String telno, String creditcard, String securitycode, String usertype) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.city = city;
        this.email = email;
        this.telno = telno;
        this.creditcard = creditcard;
        this.securitycode = securitycode;
        this.usertype = usertype;
    }

    public String password;
    public String name;
    public String address;
    public String city;
    public String email;
    public String telno;
    public String creditcard;
    public String securitycode;
    public String usertype;
}
