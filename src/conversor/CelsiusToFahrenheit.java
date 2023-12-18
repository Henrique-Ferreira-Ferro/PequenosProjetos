package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CelsiusToFahrenheit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField valorDig;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelsiusToFahrenheit frame = new CelsiusToFahrenheit();
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
	public CelsiusToFahrenheit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(131, 10, 94, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor em Celsius: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(22, 62, 106, 28);
		contentPane.add(lblNewLabel_1);
		
		valorDig = new JTextField();
		valorDig.setBounds(131, 67, 96, 19);
		contentPane.add(valorDig);
		valorDig.setColumns(10);
		
		JLabel resultado = new JLabel("");
		resultado.setBackground(new Color(255, 255, 255));
		resultado.setFont(new Font("Arial", Font.BOLD, 12));
		resultado.setBounds(155, 175, 70, 22);
		contentPane.add(resultado);
		
		JButton convert = new JButton("Converter");
		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double val1 = Double.parseDouble(valorDig.getText());
					double far = (val1 * 1.8) + 32;
					resultado.setText(String.valueOf(far));
					
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Digite apenas numeros nos campos! ", "Atenção", JOptionPane.ERROR_MESSAGE
							);
				}
				
			}
		});
		convert.setBackground(new Color(0, 255, 0));
		convert.setFont(new Font("Arial", Font.BOLD, 12));
		convert.setBounds(131, 116, 94, 28);
		contentPane.add(convert);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor em Fahrenheit:  ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(22, 175, 123, 22);
		contentPane.add(lblNewLabel_1_1);
	}
}
