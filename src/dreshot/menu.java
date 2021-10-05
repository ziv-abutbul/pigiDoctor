package dreshot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.Label;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JMenu;
import java.awt.Panel;
import javax.swing.JToggleButton;
import javax.swing.JButton;

public class menu {

	
	static String ph=".txt";
	private JFrame getPatint;
	private JLabel txtWelcomeToSystem;
	private JLabel usernameaftherlogin;
	private JLabel lblNewLabel;
	private JTextField namePatient;
	private JLabel lblNewLabel_1;
	static JTextField idPatient;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField heightPatient;
	private JLabel lblNewLabel_4;
	private JTextField phonePatient;
	private JComboBox zipPhonePatient;
	private JLabel lblNewLabel_5;
	private JLabel textField_4;
	private JTextField emailPatient;
	private JLabel lblNewLabel_6;
	private JTextField weightPatient;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextArea textArea;
	private JScrollPane scrollBar;
	private JLabel lblNewLabel_9;
	private JTextArea textArea_1;
	private JScrollPane scrollBar_1;
	private TextArea infoAllergyPatient;
	private TextArea DiseasesPatient;
	private JLabel lblNewLabel_10;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton yesSmoke;
	private JRadioButton noSmoke;
	private final ButtonGroup yesNoSmoke = new ButtonGroup();
	private JPanel panel_1;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JTextField WBC;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JTextField NEUT;
	private JLabel lblNewLabel_16;
	private JTextField LYMPH;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JTextField RBC;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JTextField HCT;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JTextField UREA;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JTextField HB;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JTextField KR;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JTextField IRON;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JTextField HDL;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JTextField AP;
	private JLabel lblNewLabel_34;
	private JLabel ifsport;
	private JRadioButton noSport;
	private JLabel lblNewLabel_36;
	private JRadioButton sport1to3;
	private JRadioButton sport4;
	private JLabel lblNewLabel_37;
	private final ButtonGroup sport = new ButtonGroup();
	private JPanel panel_2;
	private JLabel lblNewLabel_38;
	private JTextField temper;
	private JLabel lblNewLabel_42_1_2_2;
	static JComboBox t14;
	private JLabel lblNewLabel_42_1_3;
	static JComboBox t10;
	private JLabel lblNewLabel_43;
	private JComboBox lowWe;
	private JLabel lblNewLabel_44;
	private JLabel lblNewLabel_42_1_2_3;
	static JComboBox t15;
	private JLabel lblNewLabel_45;
	private TextArea medicen;
	private JLabel lblNewLabel_46;
	static JComboBox t6;
	private JLabel vitamin;
	private JRadioButton b12;
	private JLabel lblNewLabel_48;
	private JRadioButton vC;
	private JLabel lblNewLabel_49;
	private JRadioButton b6;
	private JLabel lblNewLabel_42_1_2_4;
	static JComboBox t16;
	private JLabel lblNewLabel_42_1_4;
	static JComboBox t11;
	private JLabel lblNewLabel_42_1_5;
	static JComboBox t12;
	private JLabel lblNewLabel_50;
	static JComboBox t5;
	private JLabel lblNewLabel_42_1_6;
	static JComboBox t13;
	private JLabel lblNewLabel_51;
	private Panel panel;
	private JLabel lblNewLabel_52;
	private JLabel lblNewLabel_53;
	private JToggleButton done;
	private JPanel panel_3;
	private JLabel lblNewLabel_54;
	static JTextField ageP;
	private JButton btnNewButton;
	private JTextField BMI;
	private JComboBox sexP;
	private JComboBox tempPe;
	private JComboBox allergPatientBool;
	static JComboBox t1;
	static JComboBox t2;
	static JComboBox t3;
	static JComboBox t4;
	static JComboBox t7;
	static JComboBox t8;
	static JComboBox t9;
	static int age,WBCC,NEUTT,HCTT,Ureaa,IRONN,HDLL,APP,RBCC,LYMPHH;
	static float KRR,Hbb,we,he;
	static boolean tempertor;
	static String id;
	static String SexPP;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.getPatint.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getPatint = new JFrame();
		getPatint.setBounds(100, 100, 960, 750);
		//getPatint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getPatint.getContentPane().setLayout(null);
		
		JPanel panelDetails = new JPanel();
		panelDetails.setBounds(0, 0, 222, 711);
		panelDetails.setBackground(new Color(0, 0, 102));
		getPatint.getContentPane().add(panelDetails);
		panelDetails.setLayout(null);
		
		JLabel label = new JLabel("\u05E4\u05E8\u05D8\u05D9 \u05E8\u05D5\u05E4\u05D0:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setBounds(0, 0, 212, 22);
		panelDetails.add(label);
		
		usernameaftherlogin = new JLabel(login.getTxtUsername().getText());
		usernameaftherlogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameaftherlogin.setHorizontalAlignment(SwingConstants.CENTER);
		usernameaftherlogin.setForeground(Color.WHITE);
		usernameaftherlogin.setBounds(10, 25, 183, 32);
		panelDetails.add(usernameaftherlogin);
		
		lblNewLabel_52 = new JLabel("\u05D0\u05DD \u05E1\u05D9\u05D9\u05DE\u05EA \u05DC\u05D4\u05DB\u05E0\u05D9\u05E1 \u05D0\u05EA \u05DB\u05DC \u05D4\u05E4\u05E8\u05D8\u05D9\u05DD");
		lblNewLabel_52.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_52.setForeground(Color.WHITE);
		lblNewLabel_52.setBounds(0, 324, 212, 14);
		panelDetails.add(lblNewLabel_52);
		
		done = new JToggleButton("");
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 File fileR3= new File(idPatient.getText()+".txt");
				 id=idPatient.getText()+".txt";
				 try {
					BufferedWriter writer = new BufferedWriter(new FileWriter(fileR3, true));

					if(idPatient.getText().length()==9&&
							!WBC.getText().equals("")&&
							!NEUT.getText().equals("")&&
							!LYMPH.getText().equals("")&&
							!HCT.getText().equals("")&&
							!UREA.getText().equals("")&&
							!IRON.getText().equals("")&&
							!HB.getText().equals("")&&
							!KR.getText().equals("")&&
							!HDL.getText().equals("")&&
							!RBC.getText().equals("")&&
							!AP.getText().equals("")&&
							!heightPatient.getText().equals("")&&
							!ageP.getText().equals("")&&
							!phonePatient.getText().equals("")&&
							phonePatient.getText().length()==7&&
							!emailPatient.getText().equals("")&&
							!weightPatient.getText().equals("")&&
							!temper.getText().equals("")&&
							!namePatient.getText().equals("")
							)
					{
					writer.append("שם מטופל: ");
					writer.append(namePatient.getText());
					writer.newLine();
					writer.append("תעודת זהות מטופל: ");
					writer.append(idPatient.getText());
					writer.newLine();
					writer.append("מין מטופל: ");
					writer.append(sexP.getSelectedItem().toString());
					SexPP=sexP.getSelectedItem().toString();
					writer.newLine();
					writer.append("גובה מטופל: ");
					writer.append(heightPatient.getText());
					writer.newLine();
					writer.append("גיל מטופל: ");
					writer.append(ageP.getText());
					age=Integer.parseInt(ageP.getText());
					writer.newLine();
					writer.append("מספר פלאפון מטופל: ");
					writer.append(zipPhonePatient.getSelectedItem().toString()+"-"+phonePatient.getText());
					writer.newLine();
					writer.append("דואר אלקטרוני: ");
					writer.append(emailPatient.getText());
					writer.newLine();
					writer.append("מעשן: ");
					if(yesSmoke.isSelected()==true)
					{
						writer.append(yesSmoke.getText());
					}
					else
						writer.append(noSmoke.getText());
					writer.newLine();
					writer.append("משקל מטופל: ");
					writer.append(weightPatient.getText());
					writer.newLine();
					writer.append("האם המטופל בתת משקל: ");
					writer.append(lowWe.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיים חום: ");
					writer.append(tempPe.getSelectedItem().toString());
					tempertor = tempPe.getSelectedIndex()==0;
					writer.newLine();
					writer.append("חום: ");
					writer.append(temper.getText());
					writer.newLine();
					writer.append("האם יש אלרגיה: ");
					writer.append(allergPatientBool.getSelectedItem().toString());
					writer.newLine();
					if(allergPatientBool.getSelectedIndex()==0)
					{
					writer.append("פירוט אלרגיה: ");
					writer.append(infoAllergyPatient.getText());
					writer.newLine();
					}
					writer.append("פעיילות גופנים: ");
					if(noSport.isSelected()==true)
						writer.append(noSport.getText());
					else if(sport1to3.isSelected()==true)
						writer.append(sport1to3.getText());
					else
						writer.append(sport4.getText());
					
					writer.append(infoAllergyPatient.getText());
					writer.newLine();
					
					writer.append("האם יש חוסר בויטמינים: ");
					if(b12.isSelected()==true)
					{
						writer.append(b12.getText());
						writer.append(" / ");
					}
					if(vC.isSelected()==true)
					{
						writer.append(vC.getText());
						writer.append(" / ");
					}
					if(b6.isSelected()==true)
					{
						writer.append(b6.getText());
						writer.append(" / ");
					}
					writer.append(infoAllergyPatient.getText());
					writer.newLine();
					writer.append("מחלות רקע: ");
					writer.append(DiseasesPatient.getText());
					writer.newLine();
					writer.append("תרופות קבועות: ");
					writer.append(medicen.getText());
					writer.newLine();
					writer.append("בדיקות מעבדה: ");
					writer.append("WBC: ");
					writer.append(WBC.getText());
					WBCC=Integer.parseInt(WBC.getText());
					writer.newLine();
					writer.append("NEUT: ");
					writer.append(NEUT.getText());
					NEUTT=Integer.parseInt(NEUT.getText());
					writer.newLine();
					writer.append("LYMPH: ");
					writer.append(LYMPH.getText());
					LYMPHH=Integer.parseInt(LYMPH.getText());
					writer.newLine();
					writer.append("HCT: ");
					writer.append(HCT.getText());
					HCTT=Integer.parseInt(HCT.getText());
					writer.newLine();
					writer.append("UREA: ");
					writer.append(UREA.getText());
					Ureaa=Integer.parseInt(UREA.getText());
					writer.newLine();
					writer.append("IRON: ");
					writer.append(IRON.getText());
					IRONN=Integer.parseInt(IRON.getText());
					writer.newLine();
					writer.append("HB: ");
					writer.append(HB.getText());
					Hbb=Float.parseFloat(HB.getText());
					writer.newLine();
					writer.append("KR: ");
					writer.append(KR.getText());	
					KRR=Float.parseFloat(KR.getText());
					writer.newLine();
					writer.append("HDL: ");
					writer.append(HDL.getText());
					HDLL=Integer.parseInt(HDL.getText());
					writer.newLine();
					writer.append("RBC: ");
					writer.append(RBC.getText());
					RBCC=Integer.parseInt(RBC.getText());
					writer.newLine();
					writer.append("AP: ");
					writer.append(AP.getText());
					APP=Integer.parseInt(AP.getText());
					writer.newLine();
					writer.append("אנמנזה: ");
					writer.append("האם את בהריון: ");
					if(sexP.getSelectedItem().toString()=="נקבה")
					{	
					writer.append(t1.getSelectedItem().toString());
					}
					else
					{
						writer.append("לא ");
					}
					writer.newLine();
					writer.append("האם קיים שלשולים והקאות: ");
					writer.append(t2.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיימת מחלת כליות: ");
					writer.append(t3.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיימת מחלת ריאות: ");
					writer.append(t4.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם אכלת מעט חלבון בתקופה האחרונה: ");
					writer.append(t5.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיים שומנים בדם: ");
					writer.append(t6.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם הייתה במקום חם בלי שתייה: ");
					writer.append(t7.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם עשית דיאטה חלבונים: ");
					writer.append(t8.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיבלת חבלה בזמן האחרון: ");
					writer.append(t9.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם הייתה צריכה מוגברת של בשר: ");
					writer.append(t10.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיימת מחלה בדרכי המרה: ");
					writer.append(t11.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיימת צריכה של תרופה חדשה: ");
					writer.append(t12.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיימת בעיה בבלוטת התריס: ");
					writer.append(t13.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם קיימת מחלת שרירים: ");
					writer.append(t14.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם ידוע על סכרת: ");
					writer.append(t15.getSelectedItem().toString());
					writer.newLine();
					writer.append("האם ידוע על מחלת כבד: ");
					writer.append(t16.getSelectedItem().toString());
					writer.newLine();
				    writer.close();
				    getPatint.dispose();
				    diagnosis.main();
					}
					else
						getPatint.repaint();
				   
				   
					 
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
		done.setHorizontalTextPosition(SwingConstants.CENTER);
		done.setToolTipText("");
		done.setIcon(new ImageIcon("C:\\Users\\zivab\\OneDrive\\\u05E9\u05D5\u05DC\u05D7\u05DF \u05D4\u05E2\u05D1\u05D5\u05D3\u05D4\\LoginGUI-master\\dreshot\\src\\pig1.png"));
		done.setBounds(0, 358, 222, 353);
		panelDetails.add(done);
		
		lblNewLabel_53 = new JLabel("\u05EA\u05DC\u05D7\u05E5 \u05E2\u05DC\u05D9 \u05D5\u05E0\u05E0\u05E1\u05D4 \u05DC\u05D8\u05E4\u05DC \u05D1\u05DE\u05D8\u05D5\u05E4\u05DC \u05D1\u05D9\u05D7\u05D3");
		lblNewLabel_53.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_53.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_53.setForeground(Color.WHITE);
		lblNewLabel_53.setBounds(0, 340, 212, 14);
		panelDetails.add(lblNewLabel_53);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(0, 319, 222, 43);
		panelDetails.add(panel_3);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(235, 308, 701, 394);
		getPatint.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		t2 = new JComboBox();
		t2.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t2.setBounds(26, 36, 46, 22);
		panel_1.add(t2);
		
		t13 = new JComboBox();
		t13.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t13.setBounds(26, 302, 46, 22);
		panel_1.add(t13);
		
		t11 = new JComboBox();
		t11.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t11.setBounds(26, 257, 46, 22);
		panel_1.add(t11);
		
		t1 = new JComboBox();
		t1.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t1.setBounds(26, 10, 46, 22);
		panel_1.add(t1);
		
		t10 = new JComboBox();
		t10.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t10.setBounds(26, 233, 46, 22);
		panel_1.add(t10);
		
		t15 = new JComboBox();
		t15.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t15.setBounds(26, 349, 46, 22);
		panel_1.add(t15);
		
		t16 = new JComboBox();
		t16.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t16.setBounds(26, 372, 46, 22);
		panel_1.add(t16);
		
		t3 = new JComboBox();
		t3.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t3.setBounds(26, 59, 46, 22);
		panel_1.add(t3);
		
		t9 = new JComboBox();
		t9.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t9.setBounds(26, 208, 46, 22);
		panel_1.add(t9);
		
		t5 = new JComboBox();
		t5.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t5.setBounds(26, 108, 46, 22);
		panel_1.add(t5);
		
		t7 = new JComboBox();
		t7.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t7.setBounds(26, 158, 46, 22);
		panel_1.add(t7);
		
		t12 = new JComboBox();
		t12.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t12.setBounds(26, 279, 46, 22);
		panel_1.add(t12);
		
		t6 = new JComboBox();
		t6.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t6.setBounds(26, 133, 46, 22);
		panel_1.add(t6);
		
		t14 = new JComboBox();
		t14.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t14.setBounds(26, 326, 46, 22);
		panel_1.add(t14);
		
		lblNewLabel_11 = new JLabel("\u05D0\u05E0\u05DE\u05E0\u05D6\u05D4:");
		lblNewLabel_11.setBounds(92, -11, 130, 32);
		lblNewLabel_11.setForeground(SystemColor.textHighlight);
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("\u05DB\u05DE\u05D5\u05EA \u05EA\u05D0\u05D9 \u05D4\u05D3\u05DD \u05D4\u05DC\u05D1\u05E0\u05D9\u05DD \u05D4\u05DB\u05DC\u05DC\u05D9\u05EA:");
		lblNewLabel_12.setBounds(517, 47, 174, 14);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_12);
		
		WBC = new JTextField();
		WBC.setToolTipText("\u05DE\u05D1\u05D5\u05D2\u05E8\u05D9\u05DD (18+) 4500-11000\r\n\u05D9\u05DC\u05D3\u05D9\u05DD (4-17) 5500-15500\r\n\u05E4\u05E2\u05D5\u05D8\u05D5\u05EA (0-3) 6000-17500\r\n\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD");
		WBC.setBounds(439, 45, 108, 20);
		panel_1.add(WBC);
		WBC.setColumns(10);
		
		lblNewLabel_13 = new JLabel(" WBC");
		lblNewLabel_13.setBounds(645, 30, 46, 14);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("\u05DB\u05DE\u05D5\u05EA \u05EA\u05D0\u05D9 \u05D4\u05D3\u05DD \u05D4\u05DC\u05D1\u05E0\u05D9\u05DD \u05D4\u05D0\u05D7\u05E8\u05D0\u05D9\u05DD \u05D1\u05E2\u05D9\u05E7\u05E8 \u05E2\u05DC \u05D7\u05D9\u05E1\u05D5\u05DC \u05D4\u05D7\u05D9\u05D9\u05D3\u05E7\u05D9\u05DD:");
		lblNewLabel_14.setBounds(373, 87, 318, 14);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Neut");
		lblNewLabel_15.setBounds(645, 68, 46, 14);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_15);
		
		NEUT = new JTextField();
		NEUT.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD 28%-54%");
		NEUT.setBounds(349, 85, 59, 20);
		panel_1.add(NEUT);
		NEUT.setColumns(10);
		
		lblNewLabel_16 = new JLabel("\u05EA\u05D0\u05D9 \u05D3\u05DD \u05DC\u05D1\u05E0\u05D9\u05DD \u05D4\u05D0\u05D7\u05E8\u05D0\u05D9\u05DD \u05E2\u05DC \u05D4\u05E8\u05D9\u05D2\u05EA \u05E0\u05D2\u05D9\u05E4\u05D9\u05DD:");
		lblNewLabel_16.setBounds(469, 135, 222, 14);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_16);
		
		LYMPH = new JTextField();
		LYMPH.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD 36%-52%");
		LYMPH.setBounds(403, 132, 72, 20);
		panel_1.add(LYMPH);
		LYMPH.setColumns(10);
		
		lblNewLabel_17 = new JLabel("Lymph");
		lblNewLabel_17.setBounds(645, 112, 46, 14);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("\u05DB\u05D3\u05D5\u05E8\u05D9\u05D5\u05EA \u05D4\u05D3\u05DD \u05D4\u05D0\u05D3\u05D5\u05DE\u05D5\u05EA:");
		lblNewLabel_18.setBounds(406, 323, 121, 14);
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_18);
		
		RBC = new JTextField();
		RBC.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD: \u05D2\u05D1\u05E8\u05D9\u05DD: %37%-54 .\u05E0\u05E9\u05D9\u05DD: %33%-4");
		RBC.setBounds(337, 320, 59, 20);
		panel_1.add(RBC);
		RBC.setColumns(10);
		
		lblNewLabel_19 = new JLabel("RBC");
		lblNewLabel_19.setBounds(460, 298, 46, 14);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("\u05E0\u05E4\u05D7 \u05DB\u05D3\u05D5\u05E8\u05D9\u05D5\u05EA \u05D4\u05D3\u05DD \u05D4\u05D0\u05D3\u05D5\u05DE\u05D5\u05EA \u05D1\u05EA\u05D5\u05DA \u05DB\u05DC\u05DC \u05E0\u05D5\u05D6\u05DC \u05D4\u05D3\u05DD:");
		lblNewLabel_20.setBounds(439, 175, 252, 14);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_20);
		
		HCT = new JTextField();
		HCT.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD: \u05D2\u05D1\u05E8\u05D9\u05DD \u05D1\u05D9\u05DF 37%-54% \u05D5\u05D0\u05E6\u05DC \u05E0\u05E9\u05D9\u05DD \u05D1\u05D9\u05DF 33%-47%");
		HCT.setBounds(388, 169, 59, 20);
		HCT.setColumns(10);
		panel_1.add(HCT);
		
		lblNewLabel_21 = new JLabel("HCT");
		lblNewLabel_21.setBounds(645, 158, 46, 14);
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("\u05E8\u05DE\u05EA \u05D4\u05E9\u05EA\u05E0\u05DF \u05D1\u05D3\u05DD:");
		lblNewLabel_22.setBounds(590, 222, 101, 14);
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_22);
		
		UREA = new JTextField();
		UREA.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD: 17 \u05E2\u05D3 43 \u05DE\u05D9\u05DC\u05D9\u05D2\u05E8\u05DD (\u05D0\u05E6\u05DC \u05D9\u05D5\u05E6\u05D0\u05D9 \u05E2\u05D3\u05D5\u05EA \u05D4\u05DE\u05D6\u05E8\u05D7 \u05D4\u05E2\u05E8\u05DB\u05D9\u05DD \u05D2\u05D1\u05D5\u05D4\u05D9\u05DD \u05D1\u05E2\u05D3 %10)");
		UREA.setBounds(537, 219, 59, 20);
		UREA.setColumns(10);
		panel_1.add(UREA);
		
		lblNewLabel_23 = new JLabel("Urea");
		lblNewLabel_23.setBounds(645, 197, 46, 14);
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("Hb");
		lblNewLabel_24.setBounds(645, 247, 46, 14);
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("\u05D4\u05DE\u05D5\u05D2\u05DC\u05D5\u05D1\u05D9\u05DF:");
		lblNewLabel_25.setBounds(632, 272, 59, 14);
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_25);
		
		HB = new JTextField();
		HB.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD: \u05E0\u05E9\u05D9\u05DD \u05D1\u05D9\u05DF 12-16 \u05DE\u05D9\u05DC\u05D2\u05E8\u05DD \u05D5\u05D2\u05D1\u05E8\u05D9\u05DD \u05D1\u05D9\u05DF 12-18 \u05DE\u05D9\u05DC\u05D9\u05D2\u05E8\u05DD \u05D5\u05D0\u05E6\u05DC \u05D9\u05DC\u05D3\u05D9\u05DD \u05DE\u05D2\u05D9\u05DC 0-17 \u05D1\u05D9\u05DF 11.5-15.5 \u05DE\u05D9\u05DC\u05D9\u05D2\u05E8\u05DD");
		HB.setBounds(576, 269, 59, 20);
		HB.setColumns(10);
		panel_1.add(HB);
		
		lblNewLabel_26 = new JLabel("KR");
		lblNewLabel_26.setBounds(460, 247, 46, 14);
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_26);
		
		lblNewLabel_27 = new JLabel("\u05E7\u05E8\u05D9\u05D8\u05D0\u05D9\u05E0\u05D9\u05DF:");
		lblNewLabel_27.setBounds(447, 272, 59, 14);
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_27);
		
		KR = new JTextField();
		KR.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD: \u05EA\u05D9\u05E0\u05D5\u05E7\u05D5\u05EA \u05DE\u05D2\u05D9\u05DC 0-2 \u05D1\u05D9\u05DF 0.2-0.5 \u05D5\u05D1\u05D9\u05DC\u05D3\u05D9\u05DD \u05D0\u05D5 \u05E0\u05D5\u05E2\u05E8 \u05DE\u05D2\u05D9\u05DC 3-17 \u05D1\u05D9\u05DF 0.5-1 \u05D0\u05E6\u05DC \u05DE\u05D1\u05D5\u05D2\u05E8\u05D9\u05DD \u05DE\u05D2\u05D9\u05DC 18-59 \u05D1\u05D9\u05DF 0.6-1 \u05D0\u05E6\u05DC \u05E7\u05E9\u05D9\u05E9\u05D9\u05DD \u05DE\u05D2\u05D9\u05DC 60 \u05D5\u05DE\u05E2\u05DC\u05D4 \u05D1\u05D9\u05DF 0.2-1.2");
		KR.setBounds(400, 269, 59, 20);
		KR.setColumns(10);
		panel_1.add(KR);
		
		lblNewLabel_28 = new JLabel("Iron");
		lblNewLabel_28.setBounds(460, 203, 46, 14);
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_28);
		
		lblNewLabel_29 = new JLabel("\u05D1\u05E8\u05D6\u05DC:");
		lblNewLabel_29.setBounds(458, 225, 59, 14);
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_29);
		
		IRON = new JTextField();
		IRON.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD: 60 -120 \u05D0\u05E6\u05DC \u05E0\u05E9\u05D9\u05DD \u05E0\u05DE\u05D5\u05DA \u05D120%");
		IRON.setBounds(400, 219, 59, 20);
		IRON.setColumns(10);
		panel_1.add(IRON);
		
		lblNewLabel_30 = new JLabel("HDL");
		lblNewLabel_30.setBounds(645, 298, 46, 14);
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_30);
		
		lblNewLabel_31 = new JLabel("\u05D4\u05DB\u05D5\u05DC\u05E1\u05D8\u05E8\u05D5\u05DC \u05D4\u05D8\u05D5\u05D1:");
		lblNewLabel_31.setBounds(590, 323, 101, 14);
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_31);
		
		HDL = new JTextField();
		HDL.setToolTipText("\u05E2\u05E8\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD: \u05D2\u05D1\u05E8\u05D9\u05DD \u05D1\u05D9\u05DF 29-62 \u05D0\u05E6\u05DC \u05E0\u05E9\u05D9\u05DD \u05D1\u05D9\u05DF 34-82 \u05D0\u05E6\u05DC \u05D0\u05EA\u05D9\u05D5\u05E4\u05D9\u05DD \u05D2\u05D1\u05D5\u05D4\u05D4 \u05D120%");
		HDL.setBounds(537, 317, 59, 20);
		HDL.setColumns(10);
		panel_1.add(HDL);
		
		lblNewLabel_32 = new JLabel("Alkaline Phosphatase");
		lblNewLabel_32.setBounds(549, 348, 152, 14);
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_32);
		
		lblNewLabel_33 = new JLabel("\u05D0\u05D9\u05E0\u05D6\u05D9\u05DE\u05D9\u05DD:");
		lblNewLabel_33.setBounds(632, 373, 59, 14);
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_33);
		
		AP = new JTextField();
		AP.setToolTipText("\u05E2\u05E8\u05D9\u05DB\u05D9\u05DD \u05EA\u05E7\u05D9\u05E0\u05D9\u05DD: \u05D0\u05E6\u05DC \u05D9\u05D5\u05E6\u05D0\u05D9 \u05E2\u05D3\u05D5\u05EA \u05D4\u05DE\u05D6\u05E8\u05D7 \u05D1\u05D9\u05DF 60-120 \u05E9\u05D0\u05E8 \u05D4\u05D0\u05D5\u05DB\u05DC\u05E1\u05D9\u05D9\u05D4 \u05D1\u05D9\u05DF 30-90 \u05D9\u05D7\u05D9\u05D3\u05D5\u05EA");
		AP.setBounds(576, 370, 59, 20);
		AP.setColumns(10);
		panel_1.add(AP);
		
		JLabel lblNewLabel_39_1 = new JLabel("\u05D0\u05DD \u05E7\u05D9\u05D9\u05DE\u05EA \u05DE\u05D7\u05DC\u05E7\u05EA \u05E8\u05D9\u05D0\u05D5\u05EA:");
		lblNewLabel_39_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_39_1.setBounds(162, 89, 130, 14);
		panel_1.add(lblNewLabel_39_1);
		
		t4 = new JComboBox();
		t4.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		t4.setBounds(26, 83, 46, 22);
		panel_1.add(t4);
		
		JLabel lblNewLabel_41 = new JLabel("\u05D0\u05DD \u05E7\u05D9\u05D9\u05DE\u05EA \u05DE\u05D7\u05DC\u05E7\u05EA \u05DB\u05DC\u05D9\u05D5\u05EA:");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_41.setBounds(162, 66, 130, 14);
		panel_1.add(lblNewLabel_41);
		
		JLabel lblNewLabel_42 = new JLabel("\u05D4\u05D0\u05DD \u05D4\u05D9\u05D9\u05EA\u05D4 \u05D1\u05DE\u05E7\u05D5\u05DD \u05D7\u05DD \u05D1\u05DC\u05D9 \u05E9\u05EA\u05D9\u05D9\u05D4:");
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42.setBounds(118, 162, 174, 14);
		panel_1.add(lblNewLabel_42);
		
		JLabel lblNewLabel_42_1 = new JLabel("\u05D4\u05D0\u05DD \u05E2\u05E9\u05D9\u05EA \u05D3\u05D9\u05D0\u05D8\u05D4  \u05D7\u05DC\u05D1\u05D5\u05E0\u05D9\u05DD:");
		lblNewLabel_42_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1.setBounds(128, 187, 164, 14);
		panel_1.add(lblNewLabel_42_1);
		
		t8 = new JComboBox();
		t8.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF \u05E2\u05EA\u05D9\u05E8\u05EA \u05D7\u05DC\u05D1\u05D5\u05DF", "\u05DB\u05DF \u05D3\u05DC\u05EA \u05D7\u05DC\u05D1\u05D5\u05DF", "\u05DC\u05D0"}));
		t8.setBounds(26, 183, 99, 22);
		panel_1.add(t8);
		
		JLabel lblNewLabel_42_1_1 = new JLabel("\u05D4\u05D0\u05DD \u05D0\u05EA \u05D1\u05D4\u05E8\u05D9\u05D5\u05DF:");
		lblNewLabel_42_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_1.setBounds(197, 18, 92, 14);
		panel_1.add(lblNewLabel_42_1_1);
		
		JLabel lblNewLabel_42_1_2 = new JLabel("\u05D4\u05D0\u05DD \u05E7\u05D9\u05D1\u05DC\u05EA \u05D7\u05D1\u05DC\u05D4 \u05D1\u05D6\u05DE\u05DF \u05D4\u05D0\u05D7\u05E8\u05D5\u05DF:");
		lblNewLabel_42_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_2.setBounds(118, 212, 174, 14);
		panel_1.add(lblNewLabel_42_1_2);
		
		JLabel lblNewLabel_42_1_2_1 = new JLabel("\u05D4\u05D0\u05DD \u05E7\u05D9\u05D9\u05DD \u05E9\u05DC\u05E9\u05D5\u05DC\u05D9\u05DD \u05D5\u05D4\u05E7\u05D0\u05D5\u05EA:");
		lblNewLabel_42_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_2_1.setBounds(140, 43, 152, 14);
		panel_1.add(lblNewLabel_42_1_2_1);
		
		lblNewLabel_42_1_2_2 = new JLabel("\u05D4\u05D0\u05DD \u05E7\u05D9\u05D9\u05DE\u05EA \u05DE\u05D7\u05DC\u05EA \u05E9\u05E8\u05D9\u05E8\u05D9\u05DD:");
		lblNewLabel_42_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_2_2.setBounds(140, 328, 152, 14);
		panel_1.add(lblNewLabel_42_1_2_2);
		
		lblNewLabel_42_1_3 = new JLabel("\u05D4\u05D0\u05DD \u05D4\u05D9\u05D9\u05EA\u05D4 \u05E6\u05E8\u05D9\u05DB\u05D4 \u05DE\u05D5\u05D2\u05D1\u05E8\u05EA \u05E9\u05DC \u05D1\u05E9\u05E8:");
		lblNewLabel_42_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_3.setBounds(105, 237, 187, 14);
		panel_1.add(lblNewLabel_42_1_3);
		
		lblNewLabel_42_1_2_3 = new JLabel("\u05D4\u05D0\u05DD \u05D9\u05D3\u05D5\u05E2 \u05E2\u05DC \u05E1\u05DB\u05E8\u05EA:");
		lblNewLabel_42_1_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_2_3.setBounds(171, 348, 121, 14);
		panel_1.add(lblNewLabel_42_1_2_3);
		
		lblNewLabel_46 = new JLabel("\u05D4\u05D0\u05DD \u05E7\u05D9\u05D9\u05DD \u05E9\u05D5\u05DE\u05E0\u05D9\u05DD \u05D1\u05D3\u05DD:");
		lblNewLabel_46.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_46.setBounds(175, 137, 117, 14);
		panel_1.add(lblNewLabel_46);
		
		lblNewLabel_42_1_2_4 = new JLabel("\u05D4\u05D0\u05DD \u05D9\u05D3\u05D5\u05E2 \u05E2\u05DC \u05DE\u05D7\u05DC\u05EA \u05DB\u05D1\u05D3:");
		lblNewLabel_42_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_2_4.setBounds(158, 373, 134, 14);
		panel_1.add(lblNewLabel_42_1_2_4);
		
		lblNewLabel_42_1_4 = new JLabel("\u05D4\u05D0\u05DD \u05E7\u05D9\u05D9\u05DE\u05EA \u05DE\u05D7\u05DC\u05D4 \u05D1\u05D3\u05E8\u05DB\u05D9 \u05D4\u05DE\u05E8\u05D4:");
		lblNewLabel_42_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_4.setBounds(115, 262, 177, 14);
		panel_1.add(lblNewLabel_42_1_4);
		
		lblNewLabel_42_1_5 = new JLabel("\u05D4\u05D0\u05DD \u05E7\u05D9\u05D9\u05DE\u05EA \u05E6\u05E8\u05D9\u05DB\u05D4 \u05E9\u05DC \u05EA\u05E8\u05D5\u05E4\u05D4 \u05D7\u05D3\u05E9\u05D4:");
		lblNewLabel_42_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_5.setBounds(105, 285, 190, 14);
		panel_1.add(lblNewLabel_42_1_5);
		
		lblNewLabel_50 = new JLabel("\u05D4\u05D0\u05DD \u05D0\u05DB\u05DC\u05EA \u05DE\u05E2\u05D8 \u05D7\u05DC\u05D1\u05D5\u05DF \u05D1\u05EA\u05E7\u05D5\u05E4\u05D4 \u05D4\u05D0\u05D7\u05E8\u05D5\u05E0\u05D4:");
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_50.setBounds(70, 112, 222, 14);
		panel_1.add(lblNewLabel_50);
		
		lblNewLabel_42_1_6 = new JLabel("\u05D4\u05D0\u05DD \u05E7\u05D9\u05D9\u05DE\u05EA \u05D1\u05E2\u05D9\u05D4 \u05D1\u05D1\u05DC\u05D5\u05D8\u05EA \u05D4\u05EA\u05E8\u05D9\u05E1:");
		lblNewLabel_42_1_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42_1_6.setBounds(118, 306, 177, 14);
		panel_1.add(lblNewLabel_42_1_6);
		
		lblNewLabel_51 = new JLabel("\u05D1\u05D3\u05D9\u05E7\u05D5\u05EA \u05DE\u05E2\u05D1\u05D3\u05D4:");
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_51.setForeground(SystemColor.textHighlight);
		lblNewLabel_51.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_51.setBounds(469, -11, 130, 32);
		panel_1.add(lblNewLabel_51);
		
		panel = new Panel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(319, 0, 4, 394);
		panel_1.add(panel);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(222, 0, 722, 637);
		getPatint.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_38 = new JLabel("");
		lblNewLabel_38.setIcon(new ImageIcon("C:\\Users\\zivab\\OneDrive\\\u05E9\u05D5\u05DC\u05D7\u05DF \u05D4\u05E2\u05D1\u05D5\u05D3\u05D4\\LoginGUI-master\\dreshot\\src\\pig3.png"));
		lblNewLabel_38.setBounds(0, 0, 145, 85);
		panel_2.add(lblNewLabel_38);
		
		lblNewLabel_43 = new JLabel("\u05D4\u05D0\u05DD \u05D4\u05DE\u05D8\u05D5\u05E4\u05DC \u05D1\u05EA\u05EA \u05EA\u05D6\u05D5\u05E0\u05D4:");
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_43.setBounds(462, 144, 132, 14);
		panel_2.add(lblNewLabel_43);
		
		lowWe = new JComboBox();
		lowWe.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		lowWe.setBounds(422, 140, 48, 22);
		panel_2.add(lowWe);
		
		lblNewLabel_44 = new JLabel("/");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_44.setBounds(82, 167, 25, 17);
		panel_2.add(lblNewLabel_44);
		
		lblNewLabel_45 = new JLabel("\u05EA\u05E8\u05D5\u05E4\u05D5\u05EA \u05E7\u05D5\u05D1\u05E2\u05D5\u05EA:");
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_45.setBounds(123, 225, 136, 14);
		panel_2.add(lblNewLabel_45);
		
		medicen = new TextArea();
		medicen.setBounds(10, 245, 247, 61);
		panel_2.add(medicen);
		
		DiseasesPatient = new TextArea();
		DiseasesPatient.setBounds(263, 245, 256, 61);
		panel_2.add(DiseasesPatient);
		

		
		lblNewLabel_9 = new JLabel("\u05DE\u05D7\u05DC\u05D5\u05EA \u05E8\u05E7\u05E2:");
		lblNewLabel_9.setBounds(344, 225, 136, 14);
		panel_2.add(lblNewLabel_9);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		
		infoAllergyPatient = new TextArea();
		infoAllergyPatient.setBounds(525, 245, 182, 61);
		panel_2.add(infoAllergyPatient);
		
		lblNewLabel_8 = new JLabel("\u05D0\u05DD \u05E1\u05D5\u05DE\u05DF \u05DB\u05DF \u05D1\u05D0\u05DC\u05E8\u05D2\u05D9\u05D4 \u05E4\u05E8\u05D8:");
		lblNewLabel_8.setBounds(550, 225, 136, 14);
		panel_2.add(lblNewLabel_8);
		
		vitamin = new JLabel("\u05D4\u05D0\u05DD \u05D9\u05E9 \u05D7\u05D5\u05E1\u05E8 \u05D1\u05D5\u05D9\u05DE\u05D9\u05E0\u05D9\u05DD:");
		vitamin.setBounds(295, 187, 117, 14);
		panel_2.add(vitamin);
		vitamin.setHorizontalAlignment(SwingConstants.RIGHT);
		
		b12 = new JRadioButton("\u05D5\u05D9\u05D8\u05DE\u05D9\u05DF B12");
		b12.setBackground(Color.WHITE);
		b12.setBounds(214, 183, 75, 23);
		panel_2.add(b12);
		
		lblNewLabel_48 = new JLabel("/");
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_48.setBounds(183, 186, 25, 17);
		panel_2.add(lblNewLabel_48);
		
		vC = new JRadioButton("\u05D5\u05D9\u05D8\u05DE\u05D9\u05DF C");
		vC.setBackground(Color.WHITE);
		vC.setBounds(113, 183, 75, 23);
		panel_2.add(vC);
		
		lblNewLabel_49 = new JLabel("/");
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_49.setBounds(92, 186, 25, 17);
		panel_2.add(lblNewLabel_49);
		
		b6 = new JRadioButton("\u05D5\u05D9\u05D8\u05DE\u05D9\u05DF B6");
		b6.setBackground(Color.WHITE);
		b6.setBounds(21, 183, 75, 23);
		panel_2.add(b6);
		
		JLabel lblNewLabel_39 = new JLabel("\u05D0\u05DD \u05E7\u05D9\u05D9\u05DD \u05D7\u05D5\u05DD:");
		lblNewLabel_39.setBounds(604, 168, 82, 14);
		panel_2.add(lblNewLabel_39);
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_40 = new JLabel("\u05D7\u05D5\u05DD:");
		lblNewLabel_40.setBounds(535, 169, 23, 14);
		panel_2.add(lblNewLabel_40);
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.RIGHT);
		
		temper = new JTextField();
		temper.setToolTipText("\u05D7\u05D5\u05DD \u05EA\u05E7\u05D9\u05DF \u05D1\u05D9\u05DF 36 \u05DC37");
		temper.setBounds(488, 169, 46, 20);
		panel_2.add(temper);
		temper.setColumns(10);
		
		txtWelcomeToSystem = new JLabel();
		txtWelcomeToSystem.setBounds(219, 11, 363, 44);
		panel_2.add(txtWelcomeToSystem);
		txtWelcomeToSystem.setFont(new Font("Tahoma", Font.PLAIN, 33));
		txtWelcomeToSystem.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToSystem.setText("\u05D4\u05DB\u05E0\u05E1\u05EA \u05E4\u05E8\u05D8\u05D9 \u05DE\u05D8\u05D5\u05E4\u05DC\\\u05EA");
		
		lblNewLabel = new JLabel("\u05E9\u05DD \u05DE\u05D8\u05D5\u05E4\u05DC:");
		lblNewLabel.setBounds(592, 88, 94, 20);
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblNewLabel_4 = new JLabel("\u05DE\u05E1\u05E4\u05E8 \u05E4\u05DC\u05D0\u05E4\u05D5\u05DF:");
		lblNewLabel_4.setBounds(602, 119, 84, 14);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		namePatient = new JTextField();
		namePatient.setToolTipText("\u05D4\u05D6\u05E0\u05D4 \u05E9\u05DD \u05D5\u05E9\u05DD \u05DE\u05E9\u05E4\u05D7\u05D4");
		namePatient.setBounds(498, 88, 129, 20);
		panel_2.add(namePatient);
		namePatient.setColumns(10);
		
		phonePatient = new JTextField();
		phonePatient.setToolTipText("\u05D4\u05D6\u05E0\u05D4 \u05E9\u05DC 7 \u05E1\u05E4\u05E8\u05D5\u05EA \u05DC\u05DC\u05D0 \u05E7\u05D9\u05D3\u05D5\u05DE\u05EA");
		phonePatient.setBounds(525, 119, 86, 20);
		panel_2.add(phonePatient);
		phonePatient.setColumns(10);
		
		lblNewLabel_5 = new JLabel("-");
		lblNewLabel_5.setBounds(508, 119, 18, 14);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		zipPhonePatient = new JComboBox();
		zipPhonePatient.setBounds(465, 115, 48, 22);
		panel_2.add(zipPhonePatient);
		zipPhonePatient.setModel(new DefaultComboBoxModel(new String[] {"050", "052", "054", "058", "077", "09", "08", "07", "04", "03", "02", ""}));
		
		textField_4 = new JLabel();
		textField_4.setBounds(373, 116, 82, 20);
		panel_2.add(textField_4);
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setText("\u05D3\u05D5\u05D0\"\u05DC:");
		
		emailPatient = new JTextField();
		emailPatient.setToolTipText("name@domain.com");
		emailPatient.setBounds(115, 116, 297, 20);
		panel_2.add(emailPatient);
		emailPatient.setColumns(10);
		
		lblNewLabel_1 = new JLabel("\u05EA\u05E2\u05D5\u05D3\u05EA \u05D6\u05D4\u05D5\u05EA:");
		lblNewLabel_1.setBounds(411, 91, 82, 14);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		idPatient = new JTextField();
		idPatient.setToolTipText("\u05D4\u05D6\u05E0\u05D4 \u05E9\u05DC 9 \u05E1\u05E4\u05E8\u05D5\u05EA");
		idPatient.setBounds(334, 88, 86, 20);
		panel_2.add(idPatient);
		idPatient.setColumns(10);
		
		lblNewLabel_2 = new JLabel("\u05DE\u05D9\u05DF:");
		lblNewLabel_2.setBounds(299, 91, 25, 14);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblNewLabel_3 = new JLabel("\u05D2\u05D5\u05D1\u05D4:");
		lblNewLabel_3.setBounds(190, 91, 36, 14);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		
		heightPatient = new JTextField();
		heightPatient.setBounds(127, 88, 53, 20);
		panel_2.add(heightPatient);
		heightPatient.setColumns(10);
		
		lblNewLabel_6 = new JLabel("\u05DE\u05E9\u05E7\u05DC:");
		lblNewLabel_6.setBounds(640, 144, 46, 14);
		panel_2.add(lblNewLabel_6);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		weightPatient = new JTextField();
		weightPatient.setBounds(597, 144, 48, 20);
		panel_2.add(weightPatient);
		weightPatient.setColumns(10);
		
		lblNewLabel_7 = new JLabel("\u05D4\u05D0\u05DD \u05E7\u05D9\u05D9\u05DE\u05EA \u05D0\u05DC\u05E8\u05D2\u05D9\u05D4:");
		lblNewLabel_7.setBounds(577, 202, 109, 14);
		panel_2.add(lblNewLabel_7);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblNewLabel_10 = new JLabel("\u05DE\u05E2\u05E9\u05DF:");
		lblNewLabel_10.setBounds(373, 147, 36, 14);
		panel_2.add(lblNewLabel_10);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		
		ifsport = new JLabel("\u05E4\u05E2\u05D9\u05DC\u05D5\u05EA \u05D2\u05D5\u05E4\u05E0\u05D9\u05EA:");
		ifsport.setBounds(336, 168, 76, 14);
		panel_2.add(ifsport);
		ifsport.setHorizontalAlignment(SwingConstants.RIGHT);
		
		yesSmoke = new JRadioButton("\u05DB\u05DF");
		yesSmoke.setBounds(325, 143, 42, 23);
		panel_2.add(yesSmoke);
		yesSmoke.setBackground(Color.WHITE);
		yesNoSmoke.add(yesSmoke);
		yesSmoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		yesSmoke.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblNewLabel_34 = new JLabel("/");
		lblNewLabel_34.setBounds(299, 147, 25, 17);
		panel_2.add(lblNewLabel_34);
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		
		noSmoke = new JRadioButton("\u05DC\u05D0");
		noSmoke.setBounds(249, 143, 53, 23);
		panel_2.add(noSmoke);
		noSmoke.setBackground(Color.WHITE);
		noSmoke.setSelected(true);
		yesNoSmoke.add(noSmoke);
		noSmoke.setHorizontalAlignment(SwingConstants.RIGHT);
		
		noSport = new JRadioButton("\u05D0\u05E3 \u05E4\u05E2\u05DD");
		noSport.setBounds(265, 164, 65, 23);
		panel_2.add(noSport);
		noSport.setBackground(Color.WHITE);
		noSport.setSelected(true);
		sport.add(noSport);
		
		lblNewLabel_36 = new JLabel("/");
		lblNewLabel_36.setBounds(234, 167, 25, 17);
		panel_2.add(lblNewLabel_36);
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		
		sport1to3 = new JRadioButton("1-3 \u05E4\u05E2\u05DE\u05D9\u05DD \u05D1\u05E9\u05D1\u05D5\u05E2");
		sport1to3.setBounds(113, 164, 121, 23);
		panel_2.add(sport1to3);
		sport1to3.setBackground(Color.WHITE);
		sport.add(sport1to3);
		
		sport4 = new JRadioButton("\u05DE\u05E2\u05DC 4");
		sport4.setBounds(32, 164, 57, 23);
		panel_2.add(sport4);
		sport4.setBackground(Color.WHITE);
		sport.add(sport4);
		
		lblNewLabel_54 = new JLabel("\u05D2\u05D9\u05DC:");
		lblNewLabel_54.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_54.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_54.setBounds(95, 91, 36, 14);
		panel_2.add(lblNewLabel_54);
		
		ageP = new JTextField();
		ageP.setColumns(10);
		ageP.setBounds(32, 88, 53, 20);
		panel_2.add(ageP);
		
		btnNewButton = new JButton("\u05D7\u05D9\u05E9\u05D5\u05D1 BMI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float temp;
				we=Float.parseFloat(weightPatient.getText());
				he=Float.parseFloat(heightPatient.getText());
				temp=we/(he*he);
				String temp1=""+temp;
				BMI.setText(temp1);
				
			}
		});
		btnNewButton.setBounds(18, 115, 89, 23);
		panel_2.add(btnNewButton);
		
		BMI = new JTextField();
		BMI.setEditable(false);
		BMI.setColumns(10);
		BMI.setBounds(21, 141, 79, 20);
		panel_2.add(BMI);
		
		sexP = new JComboBox();
		sexP.setBounds(239, 87, 50, 22);
		panel_2.add(sexP);
		sexP.setModel(new DefaultComboBoxModel(new String[] {"\u05D6\u05DB\u05E8", "\u05E0\u05E7\u05D1\u05D4", "\u05D0\u05D7\u05E8"}));
		
		tempPe = new JComboBox();
		tempPe.setBounds(564, 169, 47, 22);
		panel_2.add(tempPe);
		tempPe.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		
		allergPatientBool = new JComboBox();
		allergPatientBool.setBounds(539, 198, 43, 22);
		panel_2.add(allergPatientBool);
		allergPatientBool.setModel(new DefaultComboBoxModel(new String[] {"\u05DB\u05DF", "\u05DC\u05D0"}));
		
		lblNewLabel_37 = new JLabel("/");
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_37.setBounds(283, 166, 25, 17);
		getPatint.getContentPane().add(lblNewLabel_37);
		
		rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(702, 191, 109, 23);
		
		

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	public JComboBox getT1() {
		return t1;
	}
	public JComboBox getT2() {
		return t2;
	}
	public JComboBox getT3() {
		return t3;
	}
	public JComboBox getT4() {
		return t4;
	}
	public JComboBox getT5() {
		return t5;
	}
	public JComboBox getT6() {
		return t6;
	}
	public JComboBox getT7() {
		return t7;
	}
	public JComboBox getT8() {
		return t8;
	}
	public JComboBox getT9() {
		return t9;
	}
	public JComboBox getT10() {
		return t10;
	}
	public JComboBox getT11() {
		return t11;
	}
	public JComboBox getT12() {
		return t12;
	}
	public JComboBox getT13() {
		return t13;
	}
	public JComboBox getT14() {
		return t14;
	}
	public JComboBox getT15() {
		return t15;
	}
	public JComboBox getT16() {
		return t16;
	}
}
