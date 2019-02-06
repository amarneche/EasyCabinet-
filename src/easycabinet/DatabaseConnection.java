/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycabinet;

import static java.lang.Class.forName;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amar
 */
public class DatabaseConnection {
    static final String  PATH="jdbc:sqlite:database.db";
    private static Connection connection;
    private static Statement stmt ;
    
    public DatabaseConnection() throws ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
        try {
            getConnection();
            initDatabase();
        } catch (SQLException ex) {
            
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        connection= DriverManager.getConnection(PATH);
        return connection;
    }

    public static Statement getStmt() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        stmt=connection.createStatement();
        return stmt;
    }
    public static void initDatabase() throws SQLException, ClassNotFoundException{
        String patientQuery="CREATE TABLE IF NOT EXISTS PATIENT(\n" +
                                    "	NumPatient int PRIMARY KEY ,\n" +
                                    "	Nom VARCHAR(50),\n" +
                                    "	Prenom VARCHAR(50),\n" +
                                    "   sexe VARCHAR(5),\n"+
                                    "	AnneDeNaissance int CHECK (AnneDeNaissance BETWEEN 1900 AND 2100),\n" +
                                    "	Mobile VARCHAR(11)\n" +
                                    ")";
        Statement patientStmt=getStmt();
        patientStmt.execute(patientQuery);
        
        String consultQuery="CREATE TABLE IF NOT EXISTS CONSULTATION (\n" +
                                    "	NumConsultation int PRIMARY KEY,\n" +
                                    "	NumPatient int ,	\n" +
                                    "	DateConsultation varchar(30) NOT NULL,\n" +
                                    "	Remarque TEXT,\n" +
                                    "	FOREIGN KEY('NumPatient') REFERENCES PATIENT('NumPatient') 	\n" +
                                    " )";
        Statement consultStmt=getStmt();
        consultStmt.execute(consultQuery);
       
        
        
    }
    
    
    
}
