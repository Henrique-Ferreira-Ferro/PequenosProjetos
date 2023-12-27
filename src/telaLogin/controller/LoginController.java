package telaLogin.controller;

import java.sql.Connection;

import telaLogin.View.CadastrarTela;
import telaLogin.View.LoginTela;
import telaLogin.dao.ConexaoFactory;
import telaLogin.dao.LoginDAO;
import telaLogin.model.Login;

public class LoginController {


	public void cadastrarUsuario(CadastrarTela cadastrar) {
		LoginDAO cadastro = new LoginDAO();
		Login login = new Login();
		login.setNome(cadastrar.getCampoNome().getText());
		login.setEmail(cadastrar.getCampoEmail().getText());
		login.setSenha(cadastrar.getCampoSenha().getText());
		cadastro.cadastrar(login);
	}
	
	public void procuraUsuario(LoginTela telaLogin) {
		LoginDAO loginDao = new LoginDAO();
		Login login = new Login();
		login.setEmail(telaLogin.getCampoUsuario().getText());
		login.setSenha(telaLogin.getCampoSenha().getText());
		loginDao.logar(login);
		
	}
	
}
