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
				textArea.setText("למטופל יש בעיית זיהום מומלץ לתת לו אנטיביוטיקה ייעודית");
				textArea.append("\n");

			}
			if(age>=18 && WBCC>11000&&tempertor==false)
			{
				textArea.setText("יש לבדוק למטופל אם קיימת מחלת דם או סרטן\n טיפול מומלץ על מחלת דם הוא: שילוב של ציקלופוספאמיד וקורטיקוסרואידים \nוטיפול של מחלת סרטן הוא: אנטרקטיניב");
				textArea.append("\n");

			}
			if(age>=4&&age<=17 && WBCC>15500&&tempertor==true)
			{
				textArea.setText("למטופל יש בעיית זיהום מומלץ לתת לו אנטיביוטיקה ייעודית");
				textArea.append("\n");

			}
			if(age>=4&&age<=17 && WBCC>15500&&tempertor==false)
			{
				textArea.setText("יש לבדוק למטופל אם קיימת מחלת דם או סרטן\n טיפול מומלץ על מחלת דם הוא: שילוב של ציקלופוספאמיד וקורטיקוסרואידים \nוטיפול של מחלת סרטן הוא: אנטרקטיניב");
				textArea.append("\n");

			}
			if(age>=0&&age<=3 && WBCC>17500&&tempertor==true)
			{
				textArea.setText("למטופל יש בעיית זיהום מומלץ לתת לו אנטיביוטיקה ייעודית");
				textArea.append("\n");

			}
			if(age>=0&&age<=3 && WBCC>17500&&tempertor==false)
			{
				textArea.setText("יש לבדוק למטופל אם קיימת מחלת דם או סרטן\n טיפול מומלץ על מחלת דם הוא: שילוב של ציקלופוספאמיד וקורטיקוסרואידים \nוטיפול של מחלת סרטן הוא: אנטרקטיניב");
				textArea.append("\n");

			}
			//low values
			if(age>=18 && WBCC<4500)
			{
				textArea.setText("למטופל יש מחלה ויראלית מומלץ לנוח בבית \n יש לבדוק אם קיים מחלה סרטנית אם כן טיפול מומלץ \nאנטרקטיניב ");
				textArea.append("\n");

			}
			if(age>=4&&age<=17 && WBCC<5500)
			{
				textArea.setText("למטופל יש מחלה ויראלית מומלץ לנוח בבית \n יש לבדוק אם קיים מחלה סרטנית אם כן טיפול מומלץ \nאנטרקטיניב ");
				textArea.append("\n");

			}
			if(age>=0&&age<=3 && WBCC<6000)
			{
				textArea.setText("למטופל יש מחלה ויראלית מומלץ לנוח בבית \n יש לבדוק אם קיים מחלה סרטנית אם כן טיפול מומלץ \nאנטרקטיניב ");
				textArea.append("\n");

			}
			if(NEUTT>52)
			{
				textArea.append("למטופל כניראה יש זיהום חיידקי \n טיפול מומלץ: אנטיביוטיקה ייעודית");
				textArea.append("\n");

			}
			if(NEUTT<28)
			{
				textArea.append("למטופל כניראה יש בעיה ביצית הדם כמו כן יש גם לבדוק אם יש זיהום למטופל ובמקרה נדיר מומלץ לבדוק אם קיים תהליך סרטי\n טיפול מומלץ אם קיים בעיה ביצירת דם:\n כדור של 10 מיליגרם של בי 12 ביום למשך חודש \n וכדור 5 מיליגרם של חומצה פולית ביום למשך חודש\n טיפול סרטני אנטרקטיניב\n זיהום אנטייביוטיקה");
				textArea.append("\n");

			}
			if(SexPP=="נקבה"&&HCTT>47)
			{
				textArea.append("המטופלת ככל הנראה מעשנת ולכן טיפול מומלץ\n להפסיק לעשן");
				textArea.append("\n");

			}
			if(SexPP=="זכר"&&HCTT>54)
			{
				textArea.append("המטופל ככל הנראה מעשן ולכן טיפול מומלץ\n להפסיק לעשן");
				textArea.append("\n");

			}
			if(SexPP=="נקבה"&&HCTT<33)
			{
				textArea.append("יש לבדוק אם המטופלת קיבלה חבלה אם כן להפנות למיון במידי \n מקרה נוסף יש לבדוק אם יש אנמיה אם כן \n טיפול מומלץ: שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש");
				textArea.append("\n");

			}
			if(SexPP=="זכר"&&HCTT<37)
			{
				textArea.append("יש לבדוק אם המטופל קיבל חבלה אם כן להפנות למיון במידי \n מקרה נוסף יש לבדוק אם יש אנמיה אם כן \n טיפול מומלץ: שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש");
				textArea.append("\n");

			}
			if(Ureaa>43)
			{
				textArea.append("יש לבדוק אם המטופל התייבש או עשה דיאטה עתירת חלבון \n טיפול מומלץ:"
						+ "התייבשות: מנוחה מוחלטת בשכיבה והחזרת נוזלים בשתייה\n"
						+ "אם קיימת מחלת כלייה: איזון את רמות הסוכר בדם\n"
						+ "אם עשה דיאטה עתירת חלבונים :הפסקה מידית של הדיאטה\n");
				textArea.append("\n");
			}
			if(Ureaa>17)
			{
				textArea.append("יש לראות אם המטופל בתת תזונה\n"
						+ "אם בתת תזונה: מומלץ להפגיש אותו עם תזונאי \n"
						+ "אם עשה דיאטה דלת חלבון: מומלץ להפגיש עם תזונאי"
						+ "יש לבדוק אם קיימת מחלת כבד או הריון\n");
				textArea.append("\n");
			}
			//low hb
			if(SexPP=="נקבה"&&Hbb<12&&age>17)
			{
				textArea.append("יש לבדוק אם למטופלת יש אנמיה אם כן טיפול מומלץ:\n"
						+ "שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש\n"
						+ "אם המטופלת קיבלה חבלה יש להפנות במידי למיון לבדיקת דימומים\n"
						+ "אם למטופל יש מחסור בברזל יש לתת טיפול:\n"
						+ "שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש\n");
				textArea.append("\n");
			}
			if(SexPP=="זכר"&&Hbb<12&&age>17)
			{
				textArea.append("יש לבדוק אם למטופל יש אנמיה אם כן טיפול מומלץ:\n"
						+ "שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש\n"
						+ "אם המטופל קיבל חבלה יש להפנות במידי למיון לבדיקת דימומים\n"
						+ "אם למטופל יש מחסור בברזל יש לתת טיפול:\n"
						+ "שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש\n");
				textArea.append("\n");
			}
			if(Hbb<11.5&&age<17&&age>0)
			{
				textArea.append("יש לבדוק אם למטופל יש אנמיה אם כן טיפול מומלץ:\n"
						+ "שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש\n"
						+ "אם המטופל קיבל חבלה יש להפנות במידי למיון לבדיקת דימומים\n"
						+ "אם למטופל יש מחסור בברזל יש לתת טיפול:\n"
						+ "שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש\n");
				textArea.append("\n");
			}
			if(KRR>0.5&&age>=0&&age<=2)
			{
				textArea.append("יש לבדקות אם קיימת בעיה כלייתית\n"
						+ "אם קיימת טיפול מומלץ: איזון רמות הסוכר בדם\n"
						+ "אם יש בעיה של אי ספיקת כליות להפנות למיון במידי\n"
						+ "יש לבדוק אם יש שלשולים והקאות אם כן\n"
						+ "טיפול מומלץ: מנוחה\n"
						+ "אם קיימת מחלת שריר טיפול מומלץ:\n"
						+ "שני כדורי 5 מיליגרם של כורכום סי 3 של אלטמן ביום למשך חודש\n"
						+ "אם המטופל צרך יותר מידי בשר לאחרונה:\n"
						+ "טיפול מומלץ: להוריד את צריכת כמות הבשר\n");
				textArea.append("\n");
			}
			if(KRR>1&&age>=3&&age<=59)
			{
				textArea.append("יש לבדקות אם קיימת בעיה כלייתית\n"
						+ "אם קיימת טיפול מומלץ: איזון רמות הסוכר בדם\n"
						+ "אם יש בעיה של אי ספיקת כליות להפנות למיון במידי\n"
						+ "יש לבדוק אם יש שלשולים והקאות אם כן\n"
						+ "טיפול מומלץ: מנוחה\n"
						+ "אם קיימת מחלת שריר טיפול מומלץ:\n"
						+ "שני כדורי 5 מיליגרם של כורכום סי 3 של אלטמן ביום למשך חודש\n"
						+ "אם המטופל צרך יותר מידי בשר לאחרונה:\n"
						+ "טיפול מומלץ: להוריד את צריכת כמות הבשר\n");
				textArea.append("\n");
			}
			if(KRR>1.2&&age>=60)
			{
				textArea.append("יש לבדקות אם קיימת בעיה כלייתית\n"
						+ "אם קיימת טיפול מומלץ: איזון רמות הסוכר בדם\n"
						+ "אם יש בעיה של אי ספיקת כליות להפנות למיון במידי\n"
						+ "יש לבדוק אם יש שלשולים והקאות אם כן\n"
						+ "טיפול מומלץ: מנוחה\n"
						+ "אם קיימת מחלת שריר טיפול מומלץ:\n"
						+ "שני כדורי 5 מיליגרם של כורכום סי 3 של אלטמן ביום למשך חודש\n"
						+ "אם המטופל צרך יותר מידי בשר לאחרונה:\n"
						+ "טיפול מומלץ: להוריד את צריכת כמות הבשר\n");
				textArea.append("\n");
			}
			if(KRR<0.2&&age>=0&&age<=2)
			{
				textArea.append("יש לבדוק אם קיימת מסת שריר ירודה או הבנאדם בתת תזונה או שאינו צורך חלבון\n"
						+ "טיפול מומלץ: פגישה עם תזונאית\n");
				textArea.append("\n");
			}
			if(KRR<0.5&&age>=3&&age<=17)
			{
				textArea.append("יש לבדוק אם קיימת מסת שריר ירודה או הבנאדם בתת תזונה או שאינו צורך חלבון\n"
						+ "טיפול מומלץ: פגישה עם תזונאית\n");
				textArea.append("\n");
			}
			if(KRR<0.6&&age>=18&&age<=59)
			{
				textArea.append("יש לבדוק אם קיימת מסת שריר ירודה או הבנאדם בתת תזונה או שאינו צורך חלבון\n"
						+ "טיפול מומלץ: פגישה עם תזונאית\n");
				textArea.append("\n");
			}
			if(KRR<0.6&&age>=60)
			{
				textArea.append("יש לבדוק אם קיימת מסת שריר ירודה או הבנאדם בתת תזונה או שאינו צורך חלבון\n"
						+ "טיפול מומלץ: פגישה עם תזונאית\n");
				textArea.append("\n");
			}
			if(SexPP=="זכר"&&IRONN>160)
			{
				textArea.append("למטופל עלול להיות הרעת ברזל:"
						+ "טיפול מומלץ: הפנייה מידית למיון\n");
				textArea.append("\n");
			}
			if(SexPP=="נקבה"&&IRONN>128)
			{
				textArea.append("למטופל עלול להיות הרעת ברזל:"
						+ "טיפול מומלץ: הפנייה מידית למיון\n");
				textArea.append("\n");
			}
			if(SexPP=="זכר"&&IRONN<60)
			{
				textArea.append("יש לבדוק את התזונה של המטופל ואם לא תקינה להפנות לתזונאי\n"
						+ "בנוסף יש לבדוק אם איבד דם בעקבות דימום או קיבל חבלה\n"
						+ "במקרה שקיים חשש לדימום להפנות במידי למיון עם השגחה רפואית\n");
				textArea.append("\n");
			}
			if(SexPP=="נקבה"&&IRONN<48)
			{
				textArea.append("יש לבדוק את התזונה של המטופל ואם לא תקינה להפנות לתזונאי\n"
						+ "בנוסף יש לבדוק אם המטופלת בהריון\n"
						+ "בנוסף יש לבדוק אם איבד דם בעקבות דימום אם קיבל חבלה\n"
						+ "במקרה שקיים חשש לדימום להפנות במידי למיון עם השגחה רפואית\n");
				textArea.append("\n");
			}
			if(SexPP=="נקבה"&&HDLL<34)
			{
				textArea.append("יש סיכון של מחלות לב או יתר שומנים בדם או סכרת\n"
						+ "יש לבדוק את הבעיות הרשמות טיפולים מומלצים:\n"
						+ "מחלות לב:לתאם פגישה עם תזונאי\n"
						+ "שומנים בדם: לתאם פגישה עם תזונאי וכדור 5 מיליגרם של סימוביל ביום למשך שבוע\n"
						+ "סכרת: התאמת אינסולין למטפול\n");
				textArea.append("\n");
			}
			if(SexPP=="זכר"&&HDLL<29)
			{
				textArea.append("יש סיכון של מחלות לב או יתר שומנים בדם או סכרת\n"
						+ "יש לבדוק את הבעיות הרשמות טיפולים מומלצים:\n"
						+ "מחלות לב:לתאם פגישה עם תזונאי\n"
						+ "שומנים בדם: לתאם פגישה עם תזונאי וכדור 5 מיליגרם של סימוביל ביום למשך שבוע\n"
						+ "סכרת: התאמת אינסולין למטפול\n");
				textArea.append("\n");
			}
			if(APP>90)
			{
				textArea.append("יש לבדוק אם קיימות מחלות כבד למטופל או מחלות בדרכי המרה או הריון או פעילות יתר של בלוטת התריס או תרופה חדשה\n"
						+ "טיפול מומלץ למחלות כבד: הפניה לאבחנה ספציפית לצורך קביעת טיפול\n"
						+ "טיפול מומלץ למחלות בדרכי המרה: הפנייה לטיפול כירוגי\n"
						+ "טיפול מומלץ למחלת יתר בלוטת התריס: Propylthiouracil להקטנת פעילות בלוטת התריס\n");
				textArea.append("\n");
			}
			if(APP<30)
			{
				textArea.append("למטופל יכול להיות תזונה לקויה שחסרה בה חלבונים בנוסף יכול להיות שיש חוסר בויטמנים\n"
						+ "טיפול מומלץ לתזונה: הפניה לתזונאי\n"
						+ "אם קיים חוסר בויטמנים: הפנייה לבדיקת דם לזיהוי הוויטמינים החסרים");
				textArea.append("\n");
			}
			if(RBCC>6)
			{
				textArea.append("יש לבדוק אם קיימת הפרעה במערכת ייצור הדם בנוסף יש לבדוק אם החולה מעשן או עם בעיית ריאות\n"
						+ "טיפול מומלץ לבעית ייצור דם: כדור 10 מיליגרם של בי 12 ביום למשך חודש וכדור 5 מיליגרם של חומצה פולית ביום למשך חודש\n"
						+ "טיפול מומלץ לחולה מעשן: הפסקת עישון\n"
						+ "טיפול מומלץ לחולה עם בעיית ריאות: להפסיק לעשן והפנייה לצילום רנטגן של ריאות\n");
				textArea.append("\n");
			}
			if(RBCC<4.5)
			{
				textArea.append("יש לבדוק לחולה יש אנמיה או קיבלה חבלה\n"
						+ "טיפול מומלץ לאנמיה: שני כדורי 10 מיליגרם של בי 12 ביום למשך חודש\n"
						+ "אם קיים חשש לחבלה או דימום : הפנייה מידית למיון עם השגחה רפואית\n");
				textArea.append("\n");
			}
			if(LYMPHH>52)
			{
				textArea.append("למטופל יש בעיה ביצירת תאי דם\n"
						+ "טיפול מומלץ: כדור 10 מילגירם של בי 12 ביום למשך חודש וכדור 5 מיליגרם של חומצה פולית ביום למשך חודש\n");
				textArea.append("\n");
			}
			if(LYMPHH<36)
			{
				textArea.append("יש לבדוק אם קיים זיהום חיידקי ממושך או ביצוע בדיקה של סרטן הלימפומה\n"
						+ "טיפול מומלץ לחיידק זיהומי: אנטיביוטיקה"
						+ "טיפול מומלץ לסרטן הלימפומה: אנטרקטיניב\n");
				textArea.append("\n");
			}
				
			writer.append("טיפול מומלץ: ");
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
