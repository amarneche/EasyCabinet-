/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycabinet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Amar
 */
public class patientController {
    private final Connection connection ;
    private Statement stmt;
    public patientController() throws SQLException, ClassNotFoundException {
      connection= DatabaseConnection.getConnection();
      stmt=DatabaseConnection.getStmt();
    }
    
    @SuppressWarnings("empty-statement")
    // this method take a string as arguments and fetch the query 
    //to find the appropriate paient nom or prenom and return all patients found
    
    public Patient[] getPatientsByName(String string) throws SQLException{
        ArrayList<Patient> tempPatients =new ArrayList(); ;
        ResultSet resultSet;
        String query ="SELECT * from PATIENT where nom LIKE %"+string+"% OR prenom LIKE %"+string+"%";
        resultSet=stmt.executeQuery(query);        
        while(resultSet.next()){
            int ID =resultSet.getInt("numPatient");            
            String nom =resultSet.getString("nom");
            String prenom=resultSet.getString("prenmo");
            String numMobile=resultSet.getString("Mobile");
            String sexe= resultSet.getString("sexe");
            int anneDeNaissance =resultSet.getInt("anneDeNaissance");    
            
            Patient patient =new Patient( nom,prenom,numMobile,sexe ,anneDeNaissance );            
            tempPatients.add(patient);
            
        } 
        return (Patient[]) tempPatients.toArray();        
    }
    
    
    
    
    
}
