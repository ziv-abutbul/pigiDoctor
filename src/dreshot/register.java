package dreshot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.JProgressBar;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import javax.swing.JToggleButton;

public class register {
	ImageIcon imagedog= new ImageIcon("stethoscope-icon-2316460_640.png");
	private JFrame frame;
	private JTextField txtUsername;
	static File fileR= new File("Users.txt");
	private final String spacepassword="&&&&";
	private JPasswordField txtPassword;
	private static JLabel txtAUserIs;
	private JPasswordField passwordconfim;
	private static JLabel passlenerror;
	private static JLabel errorpass;
	private static JLabel passSepError;
	private static JLabel passcharError;
	private JLabel textField;
	private JTextField idDoctor;
	private static JLabel errorIdtext;
	private static JLabel existid;
	private JLabel userdeatils;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JToggleButton btnAccept_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private static JLabel usererror;
	

	/**
	 * Launch the application.
	 */
	public static void registerr() {

			register window = new register();
			window.frame.setVisible(true);
    		txtAUserIs.setVisible(false);
    		errorpass.setVisible(false);
    		passlenerror.setVisible(false);
    		passSepError.setVisible(false);
    		passcharError.setVisible(false);
			errorIdtext.setVisible(false);
			existid.setVisible(false);

	}

	/**
	 * Create the application.
	 */
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().setBackground(new Color(0, 102, 102));
		frame.setBounds(100, 100, 499, 530);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(SystemColor.desktop);
		txtUsername.setToolTipText("UserName");
		txtUsername.setFont(new Font("Verdana Pro Black", Font.PLAIN, 15));
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setBackground(SystemColor.window);
		txtUsername.setBounds(234, 184, 218, 22);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setForeground(SystemColor.desktop);
		txtPassword.setBackground(SystemColor.text);
		txtPassword.setToolTipText("Password");
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setBounds(234, 241, 218, 22);
		frame.getContentPane().add(txtPassword);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setForeground(new Color(0, 0, 51));
		btnAccept.setBackground(Color.GREEN);
		btnAccept.setFont(new Font("Verdana Pro Black", Font.PLAIN, 24));
		btnAccept.setBounds(34, 407, 199, 48);
		frame.getContentPane().add(btnAccept);
		btnAccept.addActionListener(new ActionListener() {
	    	@SuppressWarnings("deprecation")
			@Override
	    	public void actionPerformed(ActionEvent e) {
	    		txtAUserIs.setVisible(false);
	    		errorpass.setVisible(false);
	    		passlenerror.setVisible(false);
	    		passSepError.setVisible(false);
	    		passcharError.setVisible(false);
				errorIdtext.setVisible(false);
				existid.setVisible(false);
				usererror.setVisible(false);

	    		try {
	    			//check id
	    			boolean checkID=false;
	    			String id=idDoctor.getText();
	    			boolean letterInId = id.chars().anyMatch(Character::isLetter);
	    			
	    			if(id.length()==9&&letterInId==false)
	    			{
	    				checkID=true;
	    			}
	    			//check for password
	    			boolean passwordFlag=false;
	    			boolean passwordLength=false;
	    			boolean passwordSpecialcharacter=false;
	    			boolean passwordAllGood=false;
	    			
	    			String pass1=txtPassword.getText();
	    			String pass2=passwordconfim.getText();
	    			String[] pascheck= {"!","@","#","$","%","^","&","*"};
	    			boolean allLetters = pass1.chars().anyMatch(Character::isLetter);
	    			
	    			if(pass1.equals(pass2))//if pass1 == pass2
	    			{
	    				passwordFlag=true;
	    				if(pass1.length()>7&&pass1.length()<11)//if password between 8-10 chars
	    				{
	    					passwordLength=true;
	    					for(int i=0;i<pass1.length()-1;i++)
	    					{
	    						if(pass1.contains(pascheck[i]))//if password have "!","@","#","$","%","^","&","*"
	    						{
	    							passwordSpecialcharacter=true;
	    							if(allLetters)//if password have At least one character in English
	    							{
	    								passwordAllGood=true;
	    							}
	    						}
	    					}
	    				}
	    			}
	    			//check if user name in the system
					String check=txtUsername.getText();
					int countUser=0;
					boolean userIsOk=false;
					for(int i=0;i<check.length();i++)
					{
					    if (Character.isDigit(check.charAt(i))) {
					    	countUser++;
					    }
					}
					//System.out.println(countUser);
					if(countUser<=2&&check.length()>5&&check.length()<9)
						userIsOk=true;
					
				
					FileReader fr = new FileReader(fileR); 
					BufferedReader br = new BufferedReader(fr);
					String s;
					String[] words=null;
					
					int count=0;
					int countid=0;
					while((s=br.readLine())!=null)
					{
						words=s.split("&&&&");
						for(int i=0;i<words.length;i+=3)
						{

							if(words[i].equals(check))
							{
								count++;
							}
						}

							if(words[2].equals(id))
							{
								countid++;

							}
					}
					br.close();
					//create user or print error
					if(count==0&&passwordAllGood==true&&checkID==true&&countid==0&&userIsOk)
					{
	    			BufferedWriter writer = new BufferedWriter(new FileWriter(fileR, true));
				    writer.append(txtUsername.getText());
				    writer.append(spacepassword);
				    writer.append(txtPassword.getText());
				    writer.append(spacepassword);
				    writer.append(idDoctor.getText());
				    writer.newLine();
				    writer.close();
				    frame.dispose();
					}
					 if(count>=1)
					{
						txtAUserIs.setVisible(true);
					}
					 if(passwordFlag==false)
					{
						errorpass.setVisible(true);
					}
					if(passwordLength==false)
					{
						passlenerror.setVisible(true);
					}
					if(passwordSpecialcharacter==false)
					{
						passSepError.setVisible(true);
					}
					if(passwordAllGood==false)
					{
						passcharError.setVisible(false);
					}
					if(checkID==false)
					{
						errorIdtext.setVisible(true);
					}
					if(countid>=1)
					{
						existid.setVisible(true);
					}
					if(userIsOk==false)
					{
						usererror.setVisible(true);
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
	    		   
	    	}
	    	
	    });
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.red);
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.setFont(new Font("Verdana Pro Black", Font.PLAIN, 24));
		btnCancel.setBounds(253, 407, 199, 48);
		frame.getContentPane().add(btnCancel);
		
		txtAUserIs = new JLabel();
		txtAUserIs.setBackground(Color.LIGHT_GRAY);
		txtAUserIs.setForeground(Color.RED);
		txtAUserIs.setHorizontalAlignment(SwingConstants.CENTER);
		txtAUserIs.setText("\u05E9\u05DD \u05D4\u05DE\u05E9\u05EA\u05DE\u05E9 \u05E7\u05D9\u05D9\u05DD \u05D1\u05DE\u05E2\u05E8\u05DB\u05EA");
		txtAUserIs.setBounds(15, 33, 437, 20);
		frame.getContentPane().add(txtAUserIs);
		
		passwordconfim = new JPasswordField();
		passwordconfim.setToolTipText("Password");
		passwordconfim.setHorizontalAlignment(SwingConstants.CENTER);
		passwordconfim.setForeground(SystemColor.desktop);
		passwordconfim.setBackground(SystemColor.text);
		passwordconfim.setBounds(234, 288, 218, 22);
		frame.getContentPane().add(passwordconfim);
		
		passlenerror = new JLabel();
		passlenerror.setForeground(new Color(255, 0, 0));
		passlenerror.setBackground(new Color(204, 204, 204));
		passlenerror.setHorizontalAlignment(SwingConstants.CENTER);
		passlenerror.setText("\u05D0\u05D5\u05E8\u05DA \u05D4\u05E1\u05D9\u05E1\u05DE\u05D4 \u05E9\u05D2\u05D5\u05D9 \u05D0\u05D9\u05E0\u05D5 \u05D1\u05D9\u05DF: 8-10  \u05EA\u05D5\u05D9\u05DD");
		passlenerror.setBounds(15, 73, 437, 20);
		frame.getContentPane().add(passlenerror);
		
		errorpass = new JLabel();
		errorpass.setText("\u05D4\u05E1\u05D9\u05E1\u05DE\u05D4 \u05D4\u05E8\u05D0\u05E9\u05D5\u05E0\u05D4 \u05DC\u05D0 \u05EA\u05D5\u05D0\u05DE\u05EA \u05D0\u05EA \u05D4\u05E9\u05E0\u05D9\u05D4");
		errorpass.setHorizontalAlignment(SwingConstants.CENTER);
		errorpass.setForeground(new Color(204, 0, 0));
		errorpass.setBackground(new Color(204, 204, 204));
		errorpass.setBounds(15, 53, 437, 20);
		frame.getContentPane().add(errorpass);
		
		passSepError = new JLabel();
		passSepError.setHorizontalAlignment(SwingConstants.CENTER);
		passSepError.setText("\u05D4\u05E1\u05D9\u05E1\u05DE\u05D4 \u05D0\u05D9\u05E0\u05D4 \u05DE\u05DB\u05D9\u05DC \u05EA\u05D5 \u05DE\u05D9\u05D5\u05D7\u05D3 - !,@,#.. \u05D9\u05E9 \u05DC\u05D4\u05D5\u05E1\u05D9\u05E3 \u05EA\u05D5 ");
		passSepError.setForeground(new Color(255, 51, 51));
		passSepError.setBackground(new Color(204, 204, 204));
		passSepError.setBounds(15, 93, 437, 20);
		frame.getContentPane().add(passSepError);
		
		passcharError = new JLabel();
		passcharError.setText("\u05D4\u05E1\u05D9\u05E1\u05DE\u05D4 \u05D0\u05D9\u05E0\u05D4 \u05DE\u05DB\u05D9\u05DC\u05D4 \u05DC\u05E4\u05D7\u05D5\u05EA \u05EA\u05D5 \u05D0\u05D7\u05D3 \u05D1\u05D0\u05E0\u05D2\u05DC\u05D9\u05EA");
		passcharError.setHorizontalAlignment(SwingConstants.CENTER);
		passcharError.setForeground(new Color(255, 51, 51));
		passcharError.setBackground(new Color(204, 204, 204));
		passcharError.setBounds(15, 113, 437, 20);
		frame.getContentPane().add(passcharError);
		
		usererror = new JLabel();
		usererror.setText("\u05E9\u05DD \u05D4\u05DE\u05E9\u05EA\u05DE\u05E9 \u05DC\u05D0 \u05DE\u05DB\u05D9\u05DC \u05D1\u05D9\u05DF:6-8 \u05EA\u05D5\u05D5\u05D9\u05DD \u05D0\u05D5 \u05DE\u05DB\u05D9\u05DC \u05D9\u05D5\u05EA\u05E8 \u05DE-2 \u05E1\u05E4\u05E8\u05D5\u05EA");
		usererror.setHorizontalAlignment(SwingConstants.CENTER);
		usererror.setForeground(new Color(255, 51, 51));
		usererror.setBackground(new Color(204, 204, 204));
		usererror.setBounds(15, 133, 437, 20);
		usererror.setVisible(false);
		frame.getContentPane().add(usererror);
		
		textField = new JLabel();
		textField.setBackground(new Color(204, 153, 204));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u05D1\u05D9\u05DF 8 \u05DC 10 \u05EA\u05D5\u05D5\u05D9\u05DD. \u05DE\u05DB\u05D9\u05DC \u05DC\u05E4\u05D7\u05D5\u05EA \u05D0\u05D5\u05EA \u05D0\u05D7\u05EA, \u05E1\u05D9\u05E4\u05E8\u05D4 \u05D0\u05D7\u05EA \u05D5\u05EA\u05D5 \u05DE\u05D9\u05D5\u05D7\u05D3 \u05D0\u05D7\u05D3 (!,#,$ \u05D5\u05DB\u05D5)");
		textField.setBounds(15, 210, 437, 20);
		frame.getContentPane().add(textField);
		
		idDoctor = new JTextField();
		idDoctor.setToolTipText("ID 9 digits");
		idDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		idDoctor.setForeground(SystemColor.desktop);
		idDoctor.setBackground(SystemColor.text);
		idDoctor.setBounds(234, 331, 218, 22);
		frame.getContentPane().add(idDoctor);
		
		errorIdtext = new JLabel();
		errorIdtext.setBackground(Color.LIGHT_GRAY);
		errorIdtext.setForeground(new Color(255, 51, 51));
		errorIdtext.setHorizontalAlignment(SwingConstants.CENTER);
		errorIdtext.setText("\u05EA\u05E2\u05D5\u05D3\u05EA \u05D6\u05D4\u05D5\u05EA \u05D7\u05D9\u05D9\u05D1\u05EA \u05DC\u05D4\u05D9\u05D5\u05EA \u05D1\u05EA \u05EA\u05E9\u05E2 \u05E1\u05E4\u05E8\u05D5\u05EA \u05D5\u05D1\u05DC\u05D9 \u05D0\u05D5\u05EA\u05D9\u05D5\u05EA");
		errorIdtext.setBounds(15, 357, 437, 20);
		frame.getContentPane().add(errorIdtext);
		
		existid = new JLabel();
		existid.setForeground(new Color(255, 0, 0));
		existid.setText("\u05D4\u05EA\u05E2\u05D5\u05D3\u05EA \u05D6\u05D4\u05D5\u05EA \u05E7\u05D9\u05D9\u05DE\u05EA \u05D1\u05DE\u05E2\u05E8\u05DB\u05EA");
		existid.setHorizontalAlignment(SwingConstants.CENTER);
		existid.setBackground(Color.LIGHT_GRAY);
		existid.setBounds(15, 376, 437, 20);
		frame.getContentPane().add(existid);
		
		userdeatils = new JLabel();
		userdeatils.setText("\u05E9\u05DD \u05DE\u05E9\u05EA\u05DE\u05E9 \u05D7\u05D9\u05D9\u05D1 \u05DC\u05D4\u05D9\u05D5\u05EA \u05D1\u05D9\u05DF- 6 \u05DC- 8 \u05EA\u05D5\u05D5\u05D9\u05DD \u05D5\u05DC\u05D0 \u05D9\u05D5\u05EA\u05E8 \u05DE- 2 \u05E1\u05E4\u05E8\u05D5\u05EA");
		userdeatils.setHorizontalAlignment(SwingConstants.CENTER);
		userdeatils.setBackground(new Color(204, 153, 204));
		userdeatils.setBounds(15, 154, 437, 20);
		frame.getContentPane().add(userdeatils);
		
		lblNewLabel = new JLabel("User Name:");
		lblNewLabel.setFont(new Font("Verdana Pro Black", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(34, 183, 199, 20);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Verdana Pro Black", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(15, 232, 218, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password Confirm:");
		lblNewLabel_2.setFont(new Font("Verdana Pro Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(15, 281, 218, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Id Doctor:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Verdana Pro Black", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(24, 322, 209, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Register Doctor");
		lblNewLabel_4.setForeground(new Color(255, 153, 51));
		lblNewLabel_4.setFont(new Font("Verdana Pro Black", Font.PLAIN, 22));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(15, 0, 437, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("*");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(391, 148, 23, 32);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("*");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(432, 204, 23, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		btnAccept_1 = new JToggleButton("");
		btnAccept_1.setEnabled(false);
		btnAccept_1.setIcon(new ImageIcon("C:\\Users\\zivab\\OneDrive\\\u05E9\u05D5\u05DC\u05D7\u05DF \u05D4\u05E2\u05D1\u05D5\u05D3\u05D4\\LoginGUI-master\\dreshot\\src\\stethoscope-icon-2316460_640.png"));
		btnAccept_1.setForeground(new Color(0, 0, 51));
		btnAccept_1.setFont(new Font("Verdana Pro Black", Font.PLAIN, 11));
		btnAccept_1.setBackground(Color.WHITE);
		btnAccept_1.setBounds(0, 0, 483, 491);
		frame.getContentPane().add(btnAccept_1);

		
		btnCancel.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		frame.dispose();
	    	}
	    	
	    });
	}
}
