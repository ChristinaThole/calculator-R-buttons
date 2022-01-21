package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class calculators extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btn2;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculators frame = new calculators();
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
	public calculators() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 378);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(24, 5, 307, 63);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(15, 79, 89, 49);
		contentPane.add(btn9);
		
		btn2 = new JButton("8");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBounds(118, 79, 89, 44);
		contentPane.add(btn2);
		
		btnNewButton_2 = new JButton("7");
		btnNewButton_2.setBounds(221, 79, 89, 44);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(15, 139, 89, 49);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(118, 139, 89, 49);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("4");
		btnNewButton_5.setBounds(221, 139, 89, 49);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(15, 199, 89, 56);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("2");
		btnNewButton_7.setBounds(118, 199, 89, 56);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(221, 199, 89, 56);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("+");
		btnNewButton_9.setBounds(320, 79, 46, 43);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("-");
		btnNewButton_10.setBounds(320, 139, 46, 43);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("/");
		btnNewButton_11.setBounds(320, 199, 46, 43);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton(".");
		btnNewButton_12.setBounds(15, 268, 89, 31);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("0");
		btnNewButton_13.setBounds(118, 266, 83, 31);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("c");
		btnNewButton_14.setBounds(222, 266, 83, 31);
		contentPane.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("=");
		btnNewButton_15.setBounds(320, 253, 46, 75);
		contentPane.add(btnNewButton_15);
	}
}
