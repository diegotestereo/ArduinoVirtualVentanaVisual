package ArduinoVirtualVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;

public class Ventana1 extends JFrame {

	public JPanel contentPane;
	public JButton btnNewButton;
	public JLabel lblNewLabel;
	public JScrollPane scrollPane;
	public JTextArea textAreaConsola;
	private JLabel lblNewLabel_2;
	public JLabel lblTemperatura;

	
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Alarma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnNewButton.setBounds(215, 11, 65, 52);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 134, 23);
		contentPane.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 80, 270, 154);
		contentPane.add(scrollPane);
		
		textAreaConsola = new JTextArea();
		scrollPane.setViewportView(textAreaConsola);
		DefaultCaret caret = (DefaultCaret)textAreaConsola.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		lblNewLabel_2 = new JLabel("Temperatura: ");
		lblNewLabel_2.setBounds(10, 55, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		lblTemperatura = new JLabel("00");
		lblTemperatura.setForeground(Color.RED);
		lblTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTemperatura.setBounds(81, 55, 51, 14);
		contentPane.add(lblTemperatura);
		
	}
}
