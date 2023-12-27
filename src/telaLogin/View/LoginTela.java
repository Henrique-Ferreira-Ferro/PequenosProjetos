package telaLogin.View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import telaLogin.controller.LoginController;

public class LoginTela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoUsuario;
	private JPasswordField campoSenha;
	JButton btnLogin = new JButton("Login");
	LoginTela login = this;
	
	public JTextField getCampoUsuario() {
		return campoUsuario;
	}

	public void setCampoUsuario(JTextField campoUsuario) {
		this.campoUsuario = campoUsuario;
	}

	public JPasswordField getCampoSenha() {
		return campoSenha;
	}

	public void setCampoSenha(JPasswordField campoSenha) {
		this.campoSenha = campoSenha;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTela frame = new LoginTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 557);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(16, 16, 66));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(45, 165, 94, 26);
		contentPane.add(lblNewLabel);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(152, 165, 172, 26);
		contentPane.add(campoUsuario);
		campoUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 20));
		lblSenha.setBounds(45, 234, 94, 26);
		contentPane.add(lblSenha);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(152, 238, 172, 26);
		contentPane.add(campoSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginController loginC = new LoginController();
				loginC.procuraUsuario(login);
				Principal principal = new Principal();
				principal.setVisible(true);
				setVisible(false);
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(0, 153, 203));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 20));
		btnLogin.setBounds(72, 310, 252, 40);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(189, 60, 63, 55);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastrarTela().setVisible(true);
				
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Arial", Font.BOLD, 20));
		btnCadastrar.setBackground(new Color(15, 2, 87));
		btnCadastrar.setBounds(72, 412, 252, 40);
		contentPane.add(btnCadastrar);
		
	}
}
