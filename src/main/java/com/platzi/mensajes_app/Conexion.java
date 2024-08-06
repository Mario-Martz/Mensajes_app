package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Variables staticas 
    private static final String USER = "postgres";
    private static final String PASS = "postgres";
    private static final String DB = "DB_Peliculas";
    private static final String URL = "jdbc:postgresql://127.0.0.1:5432/" + DB;
   
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
