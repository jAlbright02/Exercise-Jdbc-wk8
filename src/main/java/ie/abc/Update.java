package ie.abc;

import java.sql.*;

public class Update {
    public static void main(String[] args) {
        String updateSQL = "DELETE FROM customers WHERE id = '6'";

        try (Connection connection = DatabaseSettings.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsUpdated = statement.executeUpdate(updateSQL);
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}