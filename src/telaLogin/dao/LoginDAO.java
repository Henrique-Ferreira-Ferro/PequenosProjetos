package telaLogin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import telaLogin.model.Login;

public class LoginDAO {
	 
	
	public void cadastrar(Login login) {
		
		String sql = "INSERT INTO login(nome,email,senha) VALUES (?,?,?)";
		
		Connection con = null;
		PreparedStatement pstm = null;
		con = new ConexaoFactory().getConexao();

		try {

			pstm = con.prepareStatement(sql);
			pstm.setString(1, login.getNome());
			pstm.setString(2, login.getEmail());
			pstm.setString(3, login.getSenha());
			pstm.executeUpdate();
			System.out.println("Inserido com Sucesso!!");
			
		} catch (SQLException e) { 
			System.out.println("Problema no metodo cadastrar!!!! " + e);
			e.printStackTrace();
		}finally {
			ConexaoFactory.fechar(con);
		}
		
	}
	
	public void logar(Login login) {
		String sql = "SELECT email,senha FROM login WHERE email = ? AND senha = ?";
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = new ConexaoFactory().getConexao();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, login.getEmail());
			pstm.setString(2, login.getSenha());
			rs = pstm.executeQuery();
			if(rs.next()) {
				System.out.println("Existe no Banco");
			}else {
				System.out.println("Não existe no Banco");
			}
		}catch(SQLException e) {
			System.out.println("Erro na pesquisa: "+ e);
		}finally{
			ConexaoFactory.fechar(con);
		}
		
	}
	
}
