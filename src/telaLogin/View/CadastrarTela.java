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

public class CadastrarTela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel btnCadastrar;
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	private JTextField campoNome;

	// ChatGpt aqui
	JButton btnLogin = new JButton("Cadastrar");
	CadastrarTela cadastrarTela = this;
	
	public JTextField getCampoEmail() {
		return campoEmail;
	}

	public void setCampoEmail(JTextField campoEmail) {
		this.campoEmail = campoEmail;
	}

	public JPasswordField getCampoSenha() {
		return campoSenha;
	}

	public void setCampoSenha(JPasswordField campoSenha) {
		this.campoSenha = campoSenha;
	}

	public JTextField getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(JTextField campoNome) {
		this.campoNome = campoNome;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarTela frame = new CadastrarTela();
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
	public CadastrarTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 557);
		setLocationRelativeTo(null);
		btnCadastrar = new JPanel();
		btnCadastrar.setBackground(new Color(16, 16, 66));
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(btnCadastrar);
		btnCadastrar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(45, 165, 94, 26);
		btnCadastrar.add(lblNewLabel);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(152, 165, 172, 26);
		btnCadastrar.add(campoEmail);
		campoEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 20));
		lblSenha.setBounds(45, 234, 94, 26);
		btnCadastrar.add(lblSenha);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(152, 238, 172, 26);
		btnCadastrar.add(campoSenha);
		
		JButton btnLogin = new JButton("Cadastrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginController cadastro = new LoginController();
				cadastro.cadastrarUsuario(cadastrarTela);
				setVisible(false);
				
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(0, 153, 203));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 20));
		btnLogin.setBounds(72, 310, 252, 40);
		btnCadastrar.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(181, 31, 63, 55);
		btnCadastrar.add(lblNewLabel_1);
		
		campoNome = new JTextField();
		campoNome.setColumns(10);
		campoNome.setBounds(152, 109, 172, 26);
		btnCadastrar.add(campoNome);
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(45, 109, 94, 26);
		btnCadastrar.add(lblNewLabel_2);
	}
}
