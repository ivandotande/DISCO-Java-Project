/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodordering;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wktoh
 */
public class userdb {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "user_db";
    private static int portnumber = 3306;
    private static String password = "";
    private static String servertimezone= "UTC";
    
    public static Connection getConnection() throws SQLException
    {
        Connection user = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setServerTimezone(servertimezone);
        user = (Connection) datasource.getConnection();
        return user;
    }
}
