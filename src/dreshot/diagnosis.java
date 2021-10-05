package dreshot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import javax.swing.ImageIcon;

public class diagnosis extends menu{

	private JFrame diagnos;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diagnosis window = new diagnosis();
					window.diagnos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public diagnosis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		diagnos = new JFrame();
		diagnos.getContentPane().setBackground(Color.WHITE);
		diagnos.setBounds(100, 100, 1133, 580);
		diagnos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u05D0\u05D1\u05D7\u05E0\u05D4 \u05DC\u05DE\u05D8\u05D5\u05E4\u05DC:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(462, 11, 206, 45);
		diagnos.getContentPane().add(lblNewLabel);
		//int number =Integer.parseInt(this.getAgeP().getText().toString());

		
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Dialog", Font.PLAIN, 23));
		textArea.setEditable(false);
		textArea.setBounds(10, 62, 1097, 469);
		
		diagnos.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\zivab\\OneDrive\\\u05E9\u05D5\u05DC\u05D7\u05DF \u05D4\u05E2\u05D1\u05D5\u05D3\u05D4\\LoginGUI-master\\dreshot\\src\\pig3.png"));
		lblNewLabel_1.setBounds(0, 0, 155, 85);
		diagnos.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\zivab\\OneDrive\\\u05E9\u05D5\u05DC\u05D7\u05DF \u05D4\u05E2\u05D1\u05D5\u05D3\u05D4\\LoginGUI-master\\dreshot\\src\\pig1.png"));
		lblNewLabel_2.setBounds(894, 0, 213, 286);
		diagnos.getContentPane().add(lblNewLabel_2);
		File fileR1= new File(id);
		System.out.println(id);
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileR1, true));
			if(age>=18 && WBCC>11000&&tempertor==true)
			{
				textArea.setText("������ �� ����� ����� ����� ��� �� ����������� �������");
				textArea.append("\n");

			}
			if(age>=18 && WBCC>11000&&tempertor==false)
			{
				textArea.setText("�� ����� ������ �� ����� ���� �� �� ����\n ����� ����� �� ���� �� ���: ����� �� ������������� ���������������� \n������ �� ���� ���� ���: ����������");
				textArea.append("\n");

			}
			if(age>=4&&age<=17 && WBCC>15500&&tempertor==true)
			{
				textArea.setText("������ �� ����� ����� ����� ��� �� ����������� �������");
				textArea.append("\n");

			}
			if(age>=4&&age<=17 && WBCC>15500&&tempertor==false)
			{
				textArea.setText("�� ����� ������ �� ����� ���� �� �� ����\n ����� ����� �� ���� �� ���: ����� �� ������������� ���������������� \n������ �� ���� ���� ���: ����������");
				textArea.append("\n");

			}
			if(age>=0&&age<=3 && WBCC>17500&&tempertor==true)
			{
				textArea.setText("������ �� ����� ����� ����� ��� �� ����������� �������");
				textArea.append("\n");

			}
			if(age>=0&&age<=3 && WBCC>17500&&tempertor==false)
			{
				textArea.setText("�� ����� ������ �� ����� ���� �� �� ����\n ����� ����� �� ���� �� ���: ����� �� ������������� ���������������� \n������ �� ���� ���� ���: ����������");
				textArea.append("\n");

			}
			//low values
			if(age>=18 && WBCC<4500)
			{
				textArea.setText("������ �� ���� ������� ����� ���� ���� \n �� ����� �� ���� ���� ������ �� �� ����� ����� \n���������� ");
				textArea.append("\n");

			}
			if(age>=4&&age<=17 && WBCC<5500)
			{
				textArea.setText("������ �� ���� ������� ����� ���� ���� \n �� ����� �� ���� ���� ������ �� �� ����� ����� \n���������� ");
				textArea.append("\n");

			}
			if(age>=0&&age<=3 && WBCC<6000)
			{
				textArea.setText("������ �� ���� ������� ����� ���� ���� \n �� ����� �� ���� ���� ������ �� �� ����� ����� \n���������� ");
				textArea.append("\n");

			}
			if(NEUTT>52)
			{
				textArea.append("������ ������ �� ����� ������ \n ����� �����: ����������� �������");
				textArea.append("\n");

			}
			if(NEUTT<28)
			{
				textArea.append("������ ������ �� ���� ����� ��� ��� �� �� �� ����� �� �� ����� ������ ������ ���� ����� ����� �� ���� ����� ����\n ����� ����� �� ���� ���� ������ ��:\n ���� �� 10 ������� �� �� 12 ���� ���� ���� \n ����� 5 ������� �� ����� ����� ���� ���� ����\n ����� ����� ����������\n ����� ������������");
				textArea.append("\n");

			}
			if(SexPP=="����"&&HCTT>47)
			{
				textArea.append("������� ��� ����� ����� ���� ����� �����\n ������ ����");
				textArea.append("\n");

			}
			if(SexPP=="���"&&HCTT>54)
			{
				textArea.append("������ ��� ����� ���� ���� ����� �����\n ������ ����");
				textArea.append("\n");

			}
			if(SexPP=="����"&&HCTT<33)
			{
				textArea.append("�� ����� �� ������� ����� ���� �� �� ������ ����� ����� \n ���� ���� �� ����� �� �� ����� �� �� \n ����� �����: ��� ����� 10 ������� �� �� 12 ���� ���� ����");
				textArea.append("\n");

			}
			if(SexPP=="���"&&HCTT<37)
			{
				textArea.append("�� ����� �� ������ ���� ���� �� �� ������ ����� ����� \n ���� ���� �� ����� �� �� ����� �� �� \n ����� �����: ��� ����� 10 ������� �� �� 12 ���� ���� ����");
				textArea.append("\n");

			}
			if(Ureaa>43)
			{
				textArea.append("�� ����� �� ������ ������ �� ��� ����� ����� ����� \n ����� �����:"
						+ "��������: ����� ������ ������ ������ ������ ������\n"
						+ "�� ����� ���� �����: ����� �� ���� ����� ���\n"
						+ "�� ��� ����� ����� ������� :����� ����� �� ������\n");
				textArea.append("\n");
			}
			if(Ureaa>17)
			{
				textArea.append("�� ����� �� ������ ��� �����\n"
						+ "�� ��� �����: ����� ������ ���� �� ������ \n"
						+ "�� ��� ����� ��� �����: ����� ������ �� ������"
						+ "�� ����� �� ����� ���� ��� �� �����\n");
				textArea.append("\n");
			}
			//low hb
			if(SexPP=="����"&&Hbb<12&&age>17)
			{
				textArea.append("�� ����� �� ������� �� ����� �� �� ����� �����:\n"
						+ "��� ����� 10 ������� �� �� 12 ���� ���� ����\n"
						+ "�� ������� ����� ���� �� ������ ����� ����� ������ �������\n"
						+ "�� ������ �� ����� ����� �� ��� �����:\n"
						+ "��� ����� 10 ������� �� �� 12 ���� ���� ����\n");
				textArea.append("\n");
			}
			if(SexPP=="���"&&Hbb<12&&age>17)
			{
				textArea.append("�� ����� �� ������ �� ����� �� �� ����� �����:\n"
						+ "��� ����� 10 ������� �� �� 12 ���� ���� ����\n"
						+ "�� ������ ���� ���� �� ������ ����� ����� ������ �������\n"
						+ "�� ������ �� ����� ����� �� ��� �����:\n"
						+ "��� ����� 10 ������� �� �� 12 ���� ���� ����\n");
				textArea.append("\n");
			}
			if(Hbb<11.5&&age<17&&age>0)
			{
				textArea.append("�� ����� �� ������ �� ����� �� �� ����� �����:\n"
						+ "��� ����� 10 ������� �� �� 12 ���� ���� ����\n"
						+ "�� ������ ���� ���� �� ������ ����� ����� ������ �������\n"
						+ "�� ������ �� ����� ����� �� ��� �����:\n"
						+ "��� ����� 10 ������� �� �� 12 ���� ���� ����\n");
				textArea.append("\n");
			}
			if(KRR>0.5&&age>=0&&age<=2)
			{
				textArea.append("�� ������ �� ����� ���� �������\n"
						+ "�� ����� ����� �����: ����� ���� ����� ���\n"
						+ "�� �� ���� �� �� ����� ����� ������ ����� �����\n"
						+ "�� ����� �� �� ������� ������ �� ��\n"
						+ "����� �����: �����\n"
						+ "�� ����� ���� ���� ����� �����:\n"
						+ "��� ����� 5 ������� �� ������ �� 3 �� ����� ���� ���� ����\n"
						+ "�� ������ ��� ���� ���� ��� �������:\n"
						+ "����� �����: ������ �� ����� ���� ����\n");
				textArea.append("\n");
			}
			if(KRR>1&&age>=3&&age<=59)
			{
				textArea.append("�� ������ �� ����� ���� �������\n"
						+ "�� ����� ����� �����: ����� ���� ����� ���\n"
						+ "�� �� ���� �� �� ����� ����� ������ ����� �����\n"
						+ "�� ����� �� �� ������� ������ �� ��\n"
						+ "����� �����: �����\n"
						+ "�� ����� ���� ���� ����� �����:\n"
						+ "��� ����� 5 ������� �� ������ �� 3 �� ����� ���� ���� ����\n"
						+ "�� ������ ��� ���� ���� ��� �������:\n"
						+ "����� �����: ������ �� ����� ���� ����\n");
				textArea.append("\n");
			}
			if(KRR>1.2&&age>=60)
			{
				textArea.append("�� ������ �� ����� ���� �������\n"
						+ "�� ����� ����� �����: ����� ���� ����� ���\n"
						+ "�� �� ���� �� �� ����� ����� ������ ����� �����\n"
						+ "�� ����� �� �� ������� ������ �� ��\n"
						+ "����� �����: �����\n"
						+ "�� ����� ���� ���� ����� �����:\n"
						+ "��� ����� 5 ������� �� ������ �� 3 �� ����� ���� ���� ����\n"
						+ "�� ������ ��� ���� ���� ��� �������:\n"
						+ "����� �����: ������ �� ����� ���� ����\n");
				textArea.append("\n");
			}
			if(KRR<0.2&&age>=0&&age<=2)
			{
				textArea.append("�� ����� �� ����� ��� ���� ����� �� ������ ��� ����� �� ����� ���� �����\n"
						+ "����� �����: ����� �� �������\n");
				textArea.append("\n");
			}
			if(KRR<0.5&&age>=3&&age<=17)
			{
				textArea.append("�� ����� �� ����� ��� ���� ����� �� ������ ��� ����� �� ����� ���� �����\n"
						+ "����� �����: ����� �� �������\n");
				textArea.append("\n");
			}
			if(KRR<0.6&&age>=18&&age<=59)
			{
				textArea.append("�� ����� �� ����� ��� ���� ����� �� ������ ��� ����� �� ����� ���� �����\n"
						+ "����� �����: ����� �� �������\n");
				textArea.append("\n");
			}
			if(KRR<0.6&&age>=60)
			{
				textArea.append("�� ����� �� ����� ��� ���� ����� �� ������ ��� ����� �� ����� ���� �����\n"
						+ "����� �����: ����� �� �������\n");
				textArea.append("\n");
			}
			if(SexPP=="���"&&IRONN>160)
			{
				textArea.append("������ ���� ����� ���� ����:"
						+ "����� �����: ������ ����� �����\n");
				textArea.append("\n");
			}
			if(SexPP=="����"&&IRONN>128)
			{
				textArea.append("������ ���� ����� ���� ����:"
						+ "����� �����: ������ ����� �����\n");
				textArea.append("\n");
			}
			if(SexPP=="���"&&IRONN<60)
			{
				textArea.append("�� ����� �� ������ �� ������ ��� �� ����� ������ �������\n"
						+ "����� �� ����� �� ���� �� ������ ����� �� ���� ����\n"
						+ "����� ����� ��� ������ ������ ����� ����� �� ����� ������\n");
				textArea.append("\n");
			}
			if(SexPP=="����"&&IRONN<48)
			{
				textArea.append("�� ����� �� ������ �� ������ ��� �� ����� ������ �������\n"
						+ "����� �� ����� �� ������� ������\n"
						+ "����� �� ����� �� ���� �� ������ ����� �� ���� ����\n"
						+ "����� ����� ��� ������ ������ ����� ����� �� ����� ������\n");
				textArea.append("\n");
			}
			if(SexPP=="����"&&HDLL<34)
			{
				textArea.append("�� ����� �� ����� �� �� ��� ������ ��� �� ����\n"
						+ "�� ����� �� ������ ������ ������� �������:\n"
						+ "����� ��:���� ����� �� ������\n"
						+ "������ ���: ���� ����� �� ������ ����� 5 ������� �� ������� ���� ���� ����\n"
						+ "����: ����� �������� ������\n");
				textArea.append("\n");
			}
			if(SexPP=="���"&&HDLL<29)
			{
				textArea.append("�� ����� �� ����� �� �� ��� ������ ��� �� ����\n"
						+ "�� ����� �� ������ ������ ������� �������:\n"
						+ "����� ��:���� ����� �� ������\n"
						+ "������ ���: ���� ����� �� ������ ����� 5 ������� �� ������� ���� ���� ����\n"
						+ "����: ����� �������� ������\n");
				textArea.append("\n");
			}
			if(APP>90)
			{
				textArea.append("�� ����� �� ������ ����� ��� ������ �� ����� ����� ���� �� ����� �� ������ ��� �� ����� ����� �� ����� ����\n"
						+ "����� ����� ������ ���: ����� ������ ������� ����� ����� �����\n"
						+ "����� ����� ������ ����� ����: ������ ������ ������\n"
						+ "����� ����� ����� ��� ����� �����: Propylthiouracil ������ ������ ����� �����\n");
				textArea.append("\n");
			}
			if(APP<30)
			{
				textArea.append("������ ���� ����� ����� ����� ����� �� ������� ����� ���� ����� ��� ���� ��������\n"
						+ "����� ����� ������: ����� �������\n"
						+ "�� ���� ���� ��������: ������ ������ �� ������ ���������� ������");
				textArea.append("\n");
			}
			if(RBCC>6)
			{
				textArea.append("�� ����� �� ����� ����� ������ ����� ��� ����� �� ����� �� ����� ���� �� �� ����� �����\n"
						+ "����� ����� ����� ����� ��: ���� 10 ������� �� �� 12 ���� ���� ���� ����� 5 ������� �� ����� ����� ���� ���� ����\n"
						+ "����� ����� ����� ����: ����� �����\n"
						+ "����� ����� ����� �� ����� �����: ������ ���� ������� ������ ����� �� �����\n");
				textArea.append("\n");
			}
			if(RBCC<4.5)
			{
				textArea.append("�� ����� ����� �� ����� �� ����� ����\n"
						+ "����� ����� ������: ��� ����� 10 ������� �� �� 12 ���� ���� ����\n"
						+ "�� ���� ��� ����� �� ����� : ������ ����� ����� �� ����� ������\n");
				textArea.append("\n");
			}
			if(LYMPHH>52)
			{
				textArea.append("������ �� ���� ������ ��� ��\n"
						+ "����� �����: ���� 10 ������� �� �� 12 ���� ���� ���� ����� 5 ������� �� ����� ����� ���� ���� ����\n");
				textArea.append("\n");
			}
			if(LYMPHH<36)
			{
				textArea.append("�� ����� �� ���� ����� ������ ����� �� ����� ����� �� ���� ��������\n"
						+ "����� ����� ������ ������: �����������"
						+ "����� ����� ����� ��������: ����������\n");
				textArea.append("\n");
			}
				
			writer.append("����� �����: ");
			writer.append(textArea.getText());
			writer.newLine();
			 writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//High values WBC

		
	}
}
