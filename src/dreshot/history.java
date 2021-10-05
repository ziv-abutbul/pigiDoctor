package dreshot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class history {

	private JFrame frame;
	private JTextField idforhistory;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main()  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					history window = new history();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public history() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 603);
		frame.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 123, 743, 431);
		frame.getContentPane().add(textArea);
		
		idforhistory = new JTextField();
		idforhistory.setBounds(411, 82, 86, 20);
		frame.getContentPane().add(idforhistory);
		idforhistory.setColumns(10);
		JLabel error = new JLabel("\u05EA\u05E2\u05D5\u05D3\u05EA \u05D6\u05D4\u05D5\u05EA \u05DC\u05D0 \u05E7\u05D9\u05D9\u05DE\u05EA \u05D1\u05DE\u05E2\u05E8\u05DB\u05EA");
		error.setHorizontalAlignment(SwingConstants.RIGHT);
		error.setForeground(Color.RED);
		error.setBounds(126, 85, 176, 14);
		error.setVisible(false);
		frame.getContentPane().add(error);
		btnNewButton = new JButton("\u05D7\u05D9\u05E4\u05D5\u05E9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File fileR2= new File(idforhistory.getText()+".txt");
				FileReader fr;
				String s;
				//String[] words=null;
				try {
					error.setVisible(false);
					fr = new FileReader(fileR2);
					BufferedReader br = new BufferedReader(fr);
					while((s=br.readLine())!=null)
					{
						textArea.append(s);
						textArea.append("\n");
					}
				} catch (FileNotFoundException e1) {
					error.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("No mach");
				} 
				;
			}
		});
		btnNewButton.setBounds(312, 81, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("\u05D4\u05D9\u05E1\u05D8\u05D5\u05E8\u05D9\u05D4 \u05E8\u05E4\u05D5\u05D0\u05D9\u05EA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(274, 11, 190, 41);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
