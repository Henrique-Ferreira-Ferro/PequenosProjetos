package conversor;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConversorV2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorV2 frame = new ConversorV2();
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
	public ConversorV2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 255));
		panel.setBounds(0, 0, 447, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(165, 10, 101, 36);
		panel.add(lblNewLabel);
		
		
		JComboBox caixa1 = new JComboBox();
		caixa1.setFont(new Font("Arial", Font.BOLD, 14));
		caixa1.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit"}));
		caixa1.setToolTipText("");
		caixa1.setBounds(34, 144, 85, 21);
		contentPane.add(caixa1);
		
		
		JComboBox caixa2 = new JComboBox();
		caixa2.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Fahrenheit"}));
		caixa2.setToolTipText("");
		caixa2.setFont(new Font("Arial", Font.BOLD, 14));
		caixa2.setBounds(34, 259, 85, 21);
		contentPane.add(caixa2);
		

		valor2 = new JTextField();
		valor2.setEditable(false);
		valor2.setFont(new Font("Arial", Font.BOLD, 12));
		valor2.setColumns(10);
		valor2.setBounds(212, 261, 110, 19);
		contentPane.add(valor2);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String box1 = (String)caixa1.getSelectedItem();
				String box2 = (String)caixa2.getSelectedItem();
				
				DecimalFormat dec = new DecimalFormat("0.00");
				
				if(box1.equals("Celsius") && box2.equals("Fahrenheit")) {
					double val1 = Double.parseDouble(valor1.getText());
					double far = (val1 * 1.8) + 32;
					String format = dec.format(far);
					valor2.setText(String.valueOf(format));
				}else if(box1.equals("Fahrenheit") && box2.equals("Celsius")) {
					double val1 = Double.parseDouble(valor1.getText());
					double far = (val1 - 32) / 1.8;
					String format = dec.format(far);
					valor2.setText(String.valueOf(format));
				}else {
					JOptionPane.showMessageDialog(null, "Não pode colocar dois do mesmo tipo","Atenção", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		btnNewButton.setBounds(237, 183, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1.setText("");
				valor2.setText("");
				
			}
		});
		btnNewButton_1.setBounds(237, 214, 85, 21);
		contentPane.add(btnNewButton_1);
		
		
		
		valor1 = new JTextField();
		valor1.setFont(new Font("Arial", Font.BOLD, 12));
		valor1.setBounds(212, 146, 110, 21);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		
		
		
		JButton sair = new JButton("Exit");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saida do sistema", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});
		sair.setBounds(341, 312, 85, 21);
		contentPane.add(sair);
	}
}
