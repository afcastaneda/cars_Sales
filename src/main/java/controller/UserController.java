package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.User;
import connection.DBConnection;

public class UserController implements IUserController {

    @Override
    public String login(String username, String password) {
        Gson gson = new Gson();
        DBConnection connect = new DBConnection();
        String sql = "SELECT * FROM user WHERE username ='" + username
                + "' AND password = '" + password + "'";

        try {
            Statement st = connect.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String phone_Number = rs.getString("phone_number");
                double balance = rs.getDouble("balance");
                User user = new User(username, password, name, lastName, email, phone_Number, balance);
                return gson.toJson(user);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            connect.Disconnect();
        }
        return "false";
    }

}
