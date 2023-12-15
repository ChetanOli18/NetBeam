/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library_mgmt_system;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
//        String driverClass = "com.mysql.cj.jdbc.Driver";

        // Database connection URL
        String url = "jdbc:mysql://localhost:3306/";

        // Username and password
        String username = "root";
         String password = "";
         String DbName = "ChetanDb2222222";
         String TbName = "GYANJYOTI";

        // Register the driver class
//        Class.forName(driverClass);

        // Establish a connection
//        Connection connection = DriverManager.getConnection(url, username, password);
        Connection conn = DriverManager.getConnection(url + DbName, username, password);

           // Create database statement
        Statement stm = conn.createStatement();
        
        
//        String sql = "CREATE DATABASE IF NOT EXISTS " + DbName; 
//        String sql = "CREATE TABLE IF NOT EXISTS " + TbName + " (";
//        sql += "id INT PRIMARY KEY AUTO_INCREMENT,";
//        sql += "name VARCHAR(255) NOT NULL,";
//        sql += "email VARCHAR(255) UNIQUE,";
//        sql += "created_at DATETIME DEFAULT CURRENT_TIMESTAMP";
//        sql += ")";
          String sql = "INSERT INTO " + TbName + " (name, email) VALUES " +
        "('John Doe', 'john.doe@example.com')," +
        "('Jane Smith', 'jane.smith@example.com')," +
        "('Bob Johnson', 'bob.johnson@example.com')," +
        "('Alice Brown', 'alice.brown@example.com')," +
        "('Charlie Wilson', 'charlie.wilson@example.com')";

            
        // Check if connection is established
//        if (conn != null) {
//            System.out.println("Connection established successfully!");
//        } else {
//            System.out.println("Connection failed!");
//        }

        // Close the connection
//        conn.close();

        stm.executeUpdate(sql);
        
//        System.out.println("Database " + DbName + " created successfully!");
        System.out.println("Table " + TbName + " created successfully in " + DbName + "!");
        stm.close();
        conn.close();
    }
    
}

