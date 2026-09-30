package com.mycompany.gamingsmartsell;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/gaming_smart_sell";

    private static final String USUARIO = "root";

    // Configure a local password before running. Never commit real credentials.
    private static final String SENHA = "CHANGE_ME";

    public static Connection conectar() throws SQLException {

        return DriverManager.getConnection(
                URL,
                USUARIO,
                SENHA
        );
    }
}
