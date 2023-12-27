package telaLogin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoFactory {
	private static String url = "jdbc:postgresql://localhost:5432/login";
	private static String nome = "postgres";
	private static String senha = "46182001";
	
	public Connection getConexao() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, nome, senha);
			return con;
		}catch(SQLException e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static void fechar(Connection con) {
		try {
			con.close();
		}catch(SQLException e) {
			System.out.println("Erro ao fechar a conexão: "+ e);
		}
		
	}
	
	public static void fechar(Connection con, PreparedStatement pstm) {
		try {
			fechar(con);
			pstm.close();
		}catch(SQLException e) {
			System.out.println("Erro ao fechar a conexão com PSTM: "+ e);
		}
	}
	
	
}
