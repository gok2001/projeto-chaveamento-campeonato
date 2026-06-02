import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Canvas;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class InterfaceChaveamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField JtfTime1;
	private JTextField JtfTime2;
	private JTextField JtfTime3;
	private JTextField JtfTime4;
	private JTextField JtfTime5;
	private JTextField JtfTime6;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private Component horizontalStrut_8;
	private JTextField textField_14;
	private JTextField JtfPontoTime2;
	private JTextField JtfPontoTime1;
	private JTextField JtfPontoTime3;
	private JTextField JtfPontoTime4;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField JtfPontoTime5;
	private JTextField JtfPontoTime6;
	private JTextField JtfTime7;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceChaveamento frame = new InterfaceChaveamento();
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
	public InterfaceChaveamento() {
		setForeground(new Color(60, 179, 113));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(15, 5, 15, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JtfTime1 = new JTextField();
		JtfTime1.setEditable(false);
		JtfTime1.setBounds(41, 65, 86, 20);
		contentPane.add(JtfTime1);
		JtfTime1.setColumns(10);
		
		JtfTime5 = new JTextField();
		JtfTime5.setEditable(false);
		JtfTime5.setBounds(755, 65, 86, 20);
		JtfTime5.setColumns(10);
		contentPane.add(JtfTime5);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(212, 79, 86, 20);
		textField_10.setColumns(10);
		contentPane.add(textField_10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(585, 79, 86, 20);
		textField_8.setColumns(10);
		contentPane.add(textField_8);
		
		JtfTime2 = new JTextField();
		JtfTime2.setEditable(false);
		JtfTime2.setBounds(41, 93, 86, 20);
		JtfTime2.setColumns(10);
		contentPane.add(JtfTime2);
		
		JtfTime6 = new JTextField();
		JtfTime6.setEditable(false);
		JtfTime6.setBounds(755, 93, 86, 20);
		JtfTime6.setColumns(10);
		contentPane.add(JtfTime6);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(339, 209, 86, 20);
		textField_13.setColumns(10);
		contentPane.add(textField_13);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(458, 209, 86, 20);
		textField_12.setColumns(10);
		contentPane.add(textField_12);
		
		JtfTime3 = new JTextField();
		JtfTime3.setEditable(false);
		JtfTime3.setBounds(41, 325, 86, 20);
		JtfTime3.setColumns(10);
		contentPane.add(JtfTime3);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(755, 325, 86, 20);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(212, 338, 86, 20);
		textField_11.setColumns(10);
		contentPane.add(textField_11);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(585, 338, 86, 20);
		textField_9.setColumns(10);
		contentPane.add(textField_9);
		
		JtfTime4 = new JTextField();
		JtfTime4.setEditable(false);
		JtfTime4.setBounds(41, 352, 86, 20);
		JtfTime4.setColumns(10);
		contentPane.add(JtfTime4);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(755, 352, 86, 20);
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(176, 77, 34, 20);
		contentPane.add(horizontalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(176, 338, 34, 20);
		contentPane.add(horizontalStrut_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setBounds(672, 338, 34, 20);
		contentPane.add(horizontalStrut_2);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setBounds(672, 79, 34, 20);
		contentPane.add(horizontalStrut_3);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setBounds(546, 209, 34, 20);
		contentPane.add(horizontalStrut_4);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setBounds(303, 209, 34, 20);
		contentPane.add(horizontalStrut_5);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		horizontalStrut_6.setBounds(704, 54, 48, 45);
		contentPane.add(horizontalStrut_6);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		horizontalStrut_7.setBounds(704, 80, 48, 45);
		contentPane.add(horizontalStrut_7);
		
		Component horizontalStrut_6_1 = Box.createHorizontalStrut(20);
		horizontalStrut_6_1.setBounds(704, 313, 48, 45);
		contentPane.add(horizontalStrut_6_1);
		
		Component horizontalStrut_6_2 = Box.createHorizontalStrut(20);
		horizontalStrut_6_2.setBounds(704, 339, 48, 45);
		contentPane.add(horizontalStrut_6_2);
		
		horizontalStrut_8 = Box.createHorizontalStrut(20);
		horizontalStrut_8.setBounds(130, 53, 48, 45);
		contentPane.add(horizontalStrut_8);
		
		Component horizontalStrut_6_3 = Box.createHorizontalStrut(20);
		horizontalStrut_6_3.setBounds(130, 78, 48, 45);
		contentPane.add(horizontalStrut_6_3);
		
		Component horizontalStrut_6_3_1 = Box.createHorizontalStrut(20);
		horizontalStrut_6_3_1.setBounds(130, 313, 48, 45);
		contentPane.add(horizontalStrut_6_3_1);
		
		Component horizontalStrut_6_3_2 = Box.createHorizontalStrut(20);
		horizontalStrut_6_3_2.setBounds(130, 339, 48, 45);
		contentPane.add(horizontalStrut_6_3_2);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(287, 87, 34, 133);
		contentPane.add(verticalStrut);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setBounds(561, 87, 34, 133);
		contentPane.add(verticalStrut_1);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setBounds(287, 218, 34, 133);
		contentPane.add(verticalStrut_2);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setBounds(561, 218, 34, 133);
		contentPane.add(verticalStrut_3);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setBounds(391, 271, 102, 30);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("WIN!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBounds(420, 311, 48, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Campeonato");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(377, 26, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grupo 1");
		lblNewLabel_2.setBounds(81, 40, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Grupo 2");
		lblNewLabel_2_1.setBounds(81, 300, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Grupo 3");
		lblNewLabel_2_2.setBounds(755, 40, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Grupo 4");
		lblNewLabel_2_3.setBounds(755, 300, 46, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JtfPontoTime2 = new JTextField();
		JtfPontoTime2.setBounds(41, 113, 34, 20);
		contentPane.add(JtfPontoTime2);
		JtfPontoTime2.setColumns(10);
		
		JtfPontoTime1 = new JTextField();
		JtfPontoTime1.setColumns(10);
		JtfPontoTime1.setBounds(41, 45, 34, 20);
		contentPane.add(JtfPontoTime1);
		
		JtfPontoTime3 = new JTextField();
		JtfPontoTime3.setColumns(10);
		JtfPontoTime3.setBounds(41, 305, 34, 20);
		contentPane.add(JtfPontoTime3);
		
		JtfPontoTime4 = new JTextField();
		JtfPontoTime4.setColumns(10);
		JtfPontoTime4.setBounds(41, 372, 34, 20);
		contentPane.add(JtfPontoTime4);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(212, 358, 34, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(212, 59, 34, 20);
		contentPane.add(textField_20);
		
		JtfPontoTime5 = new JTextField();
		JtfPontoTime5.setColumns(10);
		JtfPontoTime5.setBounds(807, 45, 34, 20);
		contentPane.add(JtfPontoTime5);
		
		JtfPontoTime6 = new JTextField();
		JtfPontoTime6.setColumns(10);
		JtfPontoTime6.setBounds(807, 113, 34, 20);
		contentPane.add(JtfPontoTime6);
		
		JtfTime7 = new JTextField();
		JtfTime7.setColumns(10);
		JtfTime7.setBounds(807, 305, 34, 20);
		contentPane.add(JtfTime7);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(807, 372, 34, 20);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(637, 59, 34, 20);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(637, 358, 34, 20);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(339, 189, 34, 20);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(510, 189, 34, 20);
		contentPane.add(textField_28);

	}
}
