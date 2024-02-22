/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.iesruizgijon.diurno.programacionbasedatos;



/**
 *
 * @author usuario
 */
public class ProgramacionBaseDatos {

    public static void main(String[] args) {
        final String USER = "root";
        final String PASS = "123qweASD_";
        final String nameDB = "northwind";
        
        BaseDatos bd = new BaseDatos(nameDB, USER, PASS);
        
        bd.Conecta();
       
        //bd.consultaPrueba2();

        bd.describe("customers");
        
        bd.Desconecta();
        
    }
}
