package com.platzi.mensajes_app;

import java.sql.SQLException;

public class Inicio {
    public static void main(String[] args) {
        try {
            Conexion.getConexion();
            System.out.println("Genial nos conectamos");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
