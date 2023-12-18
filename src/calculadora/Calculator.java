package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.net.httpserver.Authenticator.Result;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;
	private JTextField operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);

		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setBounds(123, 10, 114, 24);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel label1 = new JLabel("Digite o valor: ");
		label1.setFont(new Font("Arial", Font.BOLD, 12));
		label1.setBounds(10, 69, 82, 13);
		contentPane.add(label1);
		
		valor1 = new JTextField();
		valor1.setBounds(102, 66, 96, 19);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Digite o valor: ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 114, 82, 13);
		contentPane.add(lblNewLabel_1_1);
		
		valor2 = new JTextField();
		valor2.setColumns(10);
		valor2.setBounds(102, 111, 96, 19);
		contentPane.add(valor2);
		
		
		JLabel result = new JLabel("");
		result.setFont(new Font("Arial", Font.BOLD, 12));
		result.setBounds(102, 255, 96, 24);
		contentPane.add(result);
		
		
		JButton button = new JButton("Checar resultado");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int val1 = Integer.parseInt(valor1.getText());
					int val2 = Integer.parseInt(valor2.getText());
					int oper = Integer.parseInt(operacao.getText());
					int resul;
					switch(oper){
						case 1:
							resul = val1 + val2;
							result.setText(String.valueOf(resul));
							break;
						case 2:
							resul = val1 - val2;
							result.setText(String.valueOf(resul));
							break;
						case 3:
							resul = val1 * val2;
							result.setText(String.valueOf(resul));
							break;
						case 4:
							if(val2 != 0) {
								resul = val1 / val2;
								result.setText(String.valueOf(resul));
							}else {
								System.out.println("Não é possivel realizar divisão por zero!");
							}
							break;
						default:
							result.setText("Digite numeros validos!");
					}

				}catch(NumberFormatException ex) {
					result.setText("Digite valores numéricos válidos!! " + ex);
				}
								
			}
		});
		button.setFont(new Font("Arial", Font.PLAIN, 12));
		button.setBounds(83, 199, 135, 21);
		contentPane.add(button);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Digite a operação ");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(10, 153, 102, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		operacao = new JTextField();
		operacao.setColumns(10);
		operacao.setBounds(122, 150, 96, 19);
		contentPane.add(operacao);
		
		
		
	}
}
