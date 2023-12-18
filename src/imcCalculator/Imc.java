package imcCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Imc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campo1;
	private JTextField campo2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imc frame = new Imc();
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
	public Imc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 242, 223));
		panel.setBounds(0, 0, 437, 89);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Indice de Massa Corporal");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(130, 32, 204, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(91, 32, 29, 24);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Imc.class.getResource("/imcCalculator/imgs/coracao.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(245, 242, 223));
		panel_1.setBounds(0, 99, 437, 255);
		contentPane.add(panel_1);
		
		JLabel lblTamanhom = new JLabel("Height: ");
		lblTamanhom.setFont(new Font("Arial", Font.BOLD, 17));
		lblTamanhom.setBounds(10, 35, 82, 32);
		panel_1.add(lblTamanhom);
		
		JLabel lblWe = new JLabel("Weight:");
		lblWe.setFont(new Font("Arial", Font.BOLD, 17));
		lblWe.setBounds(10, 95, 82, 32);
		panel_1.add(lblWe);
		
		campo1 = new JTextField();
		campo1.setBounds(112, 44, 131, 19);
		panel_1.add(campo1);
		campo1.setColumns(10);
		
		campo2 = new JTextField();
		campo2.setColumns(10);
		campo2.setBounds(112, 104, 131, 19);
		panel_1.add(campo2);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setColumns(10);
		resultado.setBounds(112, 155, 113, 19);
		panel_1.add(resultado);
		
		

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(245, 242, 223));
		panel_2.setBounds(0, 364, 437, 181);
		contentPane.add(panel_2);
		
		
		
		JLabel Icone = new JLabel("");
		Icone.setIcon(new ImageIcon(Imc.class.getResource("/imcCalculator/imgs/user.png")));
		Icone.setBounds(178, 48, 64, 75);
		panel_2.add(Icone);
	
		
	
		
		JButton calcular = new JButton("Calculate");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double altura = Double.parseDouble(campo1.getText());
					double peso = Double.parseDouble(campo2.getText());
					
					double imc = (peso / (altura * altura));
					
					if(imc <= 18.5) {
						resultado.setText("Abaixo do peso");
						resultado.setBackground(Color.BLUE);
						resultado.setOpaque(true);
						Icone.setIcon(new ImageIcon(Imc.class.getResource("/imcCalculator/imgs/cramps.png")));
						Icone.setBounds(178, 48, 64, 75);
						panel_2.add(Icone);
					}else if(imc > 18.5 && imc <= 24.9) {
						resultado.setText("Normal");
						resultado.setBackground(Color.GREEN);
						resultado.setOpaque(true);
					}else if(imc > 24.9 && imc <= 29.9 ) {
						resultado.setText("Sobrepeso");
						resultado.setBackground(Color.orange);
						resultado.setOpaque(true);
					}else if(imc > 30) {
						resultado.setText("Obesidade");
						resultado.setBackground(Color.RED);
						resultado.setOpaque(true);
					}
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Não digite letras onde não se deve", "Atenção",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		calcular.setForeground(Color.BLACK);
		calcular.setFont(new Font("Arial", Font.BOLD, 13));
		calcular.setBounds(97, 208, 103, 21);
		panel_1.add(calcular);
		
		JButton limpar = new JButton("Clear");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo1.setText("");
				resultado.setBackground(null);
				resultado.setOpaque(true);
				campo2.setText("");
				resultado.setText("");
				Icone.setIcon(new ImageIcon(Imc.class.getResource("/imcCalculator/imgs/user.png")));
				Icone.setBounds(178, 48, 64, 75);
				panel_2.add(Icone);
			}
		});
		limpar.setForeground(Color.BLACK);
		limpar.setFont(new Font("Arial", Font.BOLD, 13));
		limpar.setBounds(222, 208, 85, 21);
		panel_1.add(limpar);
		
		JButton sair = new JButton("Exit");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saindo do sistema", "Atenção", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});
		sair.setForeground(Color.BLACK);
		sair.setFont(new Font("Arial", Font.BOLD, 13));
		sair.setBounds(328, 208, 85, 21);
		panel_1.add(sair);
		
		JLabel lblImc = new JLabel("IMC: ");
		lblImc.setFont(new Font("Arial", Font.BOLD, 17));
		lblImc.setBounds(10, 146, 45, 32);
		panel_1.add(lblImc);
		
		
		
	}
}
