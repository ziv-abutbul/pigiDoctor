package dreshot;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Utils.TextFieldPassword;
import Utils.TextFieldUsername;
public class login extends JFrame {

	private JFrame frame;
	private static TextFieldUsername txtUsername;
	private TextFieldPassword txtPassword;
	static File fileR1= new File("Users.txt");
	private final String spacepassword="&&&&";
	private JLabel txtUserNamepassword;
	private TextFieldUsername idtext;
	
	
	
	/**
	 * 
	 * Launch the application.
	 */
	//public static void main(String[] args)
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
					System.out.println(new File("."). getAbsolutePath());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 449, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnLogin = new JTextPane();
		txtpnLogin.setFont(new Font("Verdana Pro Cond Black", Font.PLAIN, 20));
		txtpnLogin.setBackground(Color.ORANGE);
		txtpnLogin.setEditable(false);
		txtpnLogin.setToolTipText("");
		txtpnLogin.setText("Login to Doctor system");
		txtpnLogin.setBounds(106, 11, 224, 31);
		frame.getContentPane().add(txtpnLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Verdana Pro Black", Font.PLAIN, 11));
		btnLogin.setBounds(106, 174, 89, 23);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
	    	@SuppressWarnings("unlikely-arg-type")
			@Override
	    	public void actionPerformed(ActionEvent e) {
	    		txtUserNamepassword.setVisible(false);
	    		try {
					@SuppressWarnings("deprecation")
					String check=getTxtUsername().getText();
					String check2=txtPassword.getText();
					String check3=idtext.getText();
					FileReader fr = new FileReader(fileR1); 
					BufferedReader br = new BufferedReader(fr);
					String s;
					String[] words=null;
					int count=0;
					while((s=br.readLine())!=null)
					{
						words=s.split(spacepassword);
						for(int i=0;i<words.length;i++)
						{
							System.out.println(words[0]);
							if(words[0].equals(check)&&words[1].equals(check2)&&words[2].equals(check3))
							{
								count++;
								
							}
						}
					}
					br.close();
					if(count!=0)
					{
						frame.dispose();
						homepage.homepagee();
					}
					else
					{
						txtUserNamepassword.setVisible(true);
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
	    	}
	    	
	    });
	    	
		
		JButton btnRegister = new JButton("register");
		btnRegister.setFont(new Font("Verdana Pro Black", Font.PLAIN, 11));
		btnRegister.setBounds(241, 175, 89, 23);
		frame.getContentPane().add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		register.registerr();
	    		   
	    	}
	    	
	    });
		
		txtUsername = new TextFieldUsername();
		getTxtUsername().setText("UserName");
		getTxtUsername().setHorizontalAlignment(SwingConstants.CENTER);
		getTxtUsername().setBounds(106, 53, 224, 33);
		frame.getContentPane().add(getTxtUsername());
		getTxtUsername().setColumns(10);
		
		txtPassword = new TextFieldPassword();
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setText("Password");
		txtPassword.setBounds(109, 137, 221, 31);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtUserNamepassword = new JLabel();
		txtUserNamepassword.setBackground(Color.RED);
		txtUserNamepassword.setForeground(new Color(255, 0, 51));
		txtUserNamepassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserNamepassword.setText("The username or password is incorrect");
		txtUserNamepassword.setBounds(59, 232, 316, 20);
		txtUserNamepassword.setVisible(false);
		frame.getContentPane().add(txtUserNamepassword);
		
		idtext = new TextFieldUsername();
		idtext.setHorizontalAlignment(SwingConstants.CENTER);
		idtext.setBounds(106, 97, 224, 33);
		idtext.setText("ID");
		frame.getContentPane().add(idtext);
		
	}

	protected void registerr() {
		// TODO Auto-generated method stub
		
	}

	public static TextFieldUsername getTxtUsername() {
		return txtUsername;
	}
}
