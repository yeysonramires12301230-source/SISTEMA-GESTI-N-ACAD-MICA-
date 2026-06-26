package com.sga.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection con;

    public Connection conectar() {

        try {

            String url =
            "jdbc:oracle:thin:@localhost:1521:XE";

            String usuario = "TU_USUARIO";
            String password = "TU_PASSWORD";

            con = DriverManager.getConnection(
                    url,
                    usuario,
                    password);

            System.out.println("Conexion Exitosa");

        } catch (Exception e) {

            System.out.println(e);

        }

        return con;
    }
}