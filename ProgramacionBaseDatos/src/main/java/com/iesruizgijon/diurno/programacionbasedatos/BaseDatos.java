/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iesruizgijon.diurno.programacionbasedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class BaseDatos {
    
    private Connection conexion;
    private String USER;    
    private String PASS ;
        private String nameDB ;
        private String URL = "jdbc:mysql://localhost:3306/";

    public BaseDatos(String USER, String PASS, String nameDB) {
        this.USER = USER;
        this.PASS = PASS;
        this.nameDB = nameDB;
    }

    public void Conecta(){
        try {
            conexion = DriverManager.getConnection(URL + nameDB,USER,PASS);
            System.out.println("Conexión establecida...");
        } catch (SQLException ex) {
            Logger.getLogger(ProgramacionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Desconecta(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
        
    
}
