package dreshot;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class homepage {

	private JFrame home;
	private JLabel textField;

	/**
	 * Launch the application.
	 */
	public static void homepagee() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
					window.home.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		home = new JFrame();
		home.getContentPane().setBackground(Color.WHITE);
		home.setBounds(100, 100, 875, 676);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 0, 222, 637);
		home.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u05E4\u05E8\u05D8\u05D9 \u05E8\u05D5\u05E4\u05D0:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setBounds(0, 0, 212, 22);
		panel.add(label);
		
		JLabel usernameaftherlogin = new JLabel(login.getTxtUsername().getText());
		usernameaftherlogin.setForeground(Color.WHITE);
		usernameaftherlogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameaftherlogin.setHorizontalAlignment(SwingConstants.CENTER);
		usernameaftherlogin.setBounds(10, 25, 183, 32);
		panel.add(usernameaftherlogin);
		
		JButton patHome = new JButton("\u05D9\u05E6\u05D9\u05E8\u05EA \u05DE\u05D8\u05D5\u05E4\u05DC \u05D7\u05D3\u05E9");
		patHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.main();
			}
		});
		patHome.setBackground(Color.LIGHT_GRAY);
		patHome.setBounds(10, 85, 202, 23);
		panel.add(patHome);
		
		JButton history1 = new JButton("\u05D4\u05D9\u05E1\u05D8\u05D5\u05E8\u05D9\u05D4 \u05E8\u05E4\u05D5\u05D0\u05D9\u05EA \u05E9\u05DC \u05DE\u05D8\u05D5\u05E4\u05DC");
		history1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				history.main();
			}
		});
		history1.setBackground(Color.LIGHT_GRAY);
		history1.setBounds(10, 124, 202, 23);
		panel.add(history1);
		
		textField = new JLabel();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u05E9\u05DC\u05D5\u05DD \u05E9\u05DE\u05D9 \u05E4\u05D9\u05D2\u05D9 \u05D5\u05D0\u05E0\u05D9 \u05DE\u05E2\u05E8\u05DB\u05EA \u05D7\u05DB\u05DE\u05D4 \u05E9\u05D1\u05D0\u05D4 \u05DC\u05E2\u05D6\u05D5\u05E8 \u05DC\u05DA \u05DC\u05D8\u05E4\u05DC \u05D1\u05DE\u05D8\u05D5\u05E4\u05DC\u05D9\u05DD \u05E9\u05DC\u05DA");
		textField.setBounds(322, 47, 403, 20);
		home.getContentPane().add(textField);
		
		JLabel textField_1 = new JLabel();
		textField_1.setText("\u05EA\u05D5\u05DB\u05DC/\u05DC\u05D9 \u05DC\u05D4\u05DB\u05E0\u05D9\u05E1 \u05D0\u05EA \u05E4\u05E8\u05D8\u05D9 \u05D4\u05DE\u05D8\u05D5\u05E4\u05DC/\u05EA \u05DC\u05E2\u05E0\u05D5\u05EA \u05E2\u05DC \u05DE\u05E1\u05E4\u05E8 \u05E9\u05D0\u05DC\u05D5\u05EA \u05D5\u05D0\u05E0\u05D9 \u05D0\u05E0\u05E1\u05D4 \u05DC\u05E2\u05D6\u05D5\u05E8 \u05DC\u05DA");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(303, 73, 422, 20);
		home.getContentPane().add(textField_1);
		
		JLabel textField_1_1 = new JLabel();
		textField_1_1.setText("\u05DC\u05D4\u05EA\u05D0\u05D9\u05DD \u05DC\u05DE\u05D8\u05D5\u05E4\u05DC \u05D0\u05EA \u05D4\u05D8\u05D9\u05E4\u05D5\u05DC \u05D4\u05D8\u05D5\u05D1 \u05D1\u05D9\u05D5\u05EA\u05E8 \u05E2\u05DC \u05E1\u05DE\u05DA \u05D4\u05E0\u05EA\u05D5\u05E0\u05D9\u05DD \u05E9\u05D4\u05D5\u05DB\u05E0\u05E1\u05D5");
		textField_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1_1.setBounds(322, 104, 403, 20);
		home.getContentPane().add(textField_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\zivab\\OneDrive\\\u05E9\u05D5\u05DC\u05D7\u05DF \u05D4\u05E2\u05D1\u05D5\u05D3\u05D4\\LoginGUI-master\\dreshot\\src\\pig1.png"));
		lblNewLabel.setBounds(606, 294, 301, 343);
		home.getContentPane().add(lblNewLabel);
		

		

	}
}
