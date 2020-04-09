/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.spp.npm119.databaseutility;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DatabaseUtility {
    private static Connection connection;
    
    
    static {
            MysqlDataSource db_daniel = new MysqlDataSource();
            db_daniel.setServerName("localhost");
            db_daniel.setDatabaseName("perpustakaan");
            db_daniel.setUser("root");
            db_daniel.setPassword("");
                
            try {
            connection = db_daniel.getConnection();
        } catch (SQLException ex) {
            System.out.println("Error " +ex.getMessage());
        }
    }
    
    public static Connection getConnection() {
        return connection;
    }
}
