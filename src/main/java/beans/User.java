package beans;

public class User {
    private String username;
    private String password;
    private String name;
    private String last_name;
    private String email;
    private String phone_number;
    private double balance;

    public User(String username, String password, String name, String last_name, String email, String phone_number, double balance) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", name=" + name + ", last_name=" + last_name + ", email=" + email + ", phone_number=" + phone_number + ", balance=" + balance + '}';
    }   
    
}
