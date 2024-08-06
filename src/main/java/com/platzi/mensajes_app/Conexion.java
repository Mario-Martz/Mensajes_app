package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Variables staticas 
    private static final String USER = "";
    private static final String PASS = "";
    private static  final String DB = "";
    private static  final String URL = "";
   
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
