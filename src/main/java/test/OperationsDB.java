package test;

import beans.Cars;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperationsDB {

    public static void main(String[] args) {
        toListCars();

    }

    public static void updateCar(int id_car, String brand) {
        DBConnection conect = new DBConnection();
        String sql = "UPDATE cars SET brand = " + "'" + brand + "'WHERE id_car = " + id_car;

        try {
            Statement st = conect.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            conect.Disconnect();
        }
    }

    public static void toListCars() {
        DBConnection conect = new DBConnection();
        String sql = "SELECT * FROM cars";

        try {
            Statement st = conect.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id_car = rs.getInt("id_car");
                String name_car = rs.getString("name_car");
                String brand = rs.getString("brand");
                int model = rs.getInt("model");
                String type_fuel = rs.getString("type_fuel");
                String color = rs.getString("color");
                int cylinder_capacity = rs.getInt("cylinder_capacity");
                int stock = rs.getInt("stock");

                Cars car = new Cars(id_car, name_car, brand, model, type_fuel,
                        color, cylinder_capacity, stock);
                System.out.println(car.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            conect.Disconnect();
        }
    }

}
