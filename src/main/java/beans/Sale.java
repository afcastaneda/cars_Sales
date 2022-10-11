package beans;

import java.sql.Date;

public class Sale {
    private int id_car;
    private String username;
    private Date date;
    private double price;

    public Sale(int id_car, String username, Date date, double price) {
        this.id_car = id_car;
        this.username = username;
        this.date = date;
        this.price = price;
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sale{" + "id_car=" + id_car + ", username=" + username + ", date=" + date + ", price=" + price + '}';
    }
       
}
