/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danyllopenna.factory;

import java.sql.*;

/**
 *
 * @author danyl
 */
public class Conexao {
    
    public static String CAMINHO = "jdbc:postgresql://localhost:5432/banco_escola";
	public static String USUARIO = "postgres";
	public static String SENHA = "shevchenko";
	public static Connection conectar = null;
        
        public static Connection conectando(){
            try {
                DriverManager.registerDriver(new org.postgresql.Driver());
                conectar = DriverManager.getConnection(CAMINHO, USUARIO, SENHA);
                System.out.println("conectado com sucesso");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return conectar;
        }
        public static void main(String[] args) {
        Connection conecte = Conexao.conectando();
    }
    
}
