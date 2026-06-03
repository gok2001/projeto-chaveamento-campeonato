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
	private Canvas canvasGrup3Chaveamento2;
	private Canvas canvas_2;
	private Canvas canvas_3;
	private Canvas canvasGrup2Chaveamento2;
	private Canvas canvasGrup2Chaveamento1;
	private Canvas canvasGrup1Chaveamento2;
	private Canvas canvasGrup1Chaveamento1;
	private Canvas canvasGrup1Inter;
	private Canvas canvasGrup2Inter;
	private Canvas canvasGrup3Inter;
	private Canvas canvas_11;
	private Canvas canvas_12;
	private Canvas canvas_14;
	private Canvas canvas_15;
	private Canvas canvas_13;
	private Canvas canvas_16;
	private Canvas canvas_17;
	private Canvas canvasGrup3Chaveamento1Inter;
	private Canvas canvasGrup3Chaveamento2Inter;
	private Canvas canvas_20;
	private Canvas canvas_21;
	private Canvas canvasGrup1Chaveamento1Inter;
	private Canvas canvasGrup1Chaveamento2Inter;
	private Canvas canvasGrup2Chaveamento1Inter;
	private Canvas canvasGrup2Chaveamento2Inter;

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
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(212, 358, 34, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
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
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(637, 59, 34, 20);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(637, 358, 34, 20);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(339, 189, 34, 20);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(510, 189, 34, 20);
		contentPane.add(textField_28);
		
		Canvas canvasGrup3Chaveamento1 = new Canvas();
		canvasGrup3Chaveamento1.setBackground(new Color(0, 0, 0));
		canvasGrup3Chaveamento1.setBounds(699, 65, 57, 6);
		contentPane.add(canvasGrup3Chaveamento1);
		
		
		// GRUPO 1
		
		canvasGrup1Chaveamento2 = new Canvas();
		canvasGrup1Chaveamento2.setBackground(Color.BLACK);
		canvasGrup1Chaveamento2.setBounds(126, 107, 57, 6);
		contentPane.add(canvasGrup1Chaveamento2);
		
		canvasGrup1Chaveamento1 = new Canvas();
		canvasGrup1Chaveamento1.setBackground(Color.BLACK);
		canvasGrup1Chaveamento1.setBounds(126, 65, 57, 6);
		contentPane.add(canvasGrup1Chaveamento1);
		
		canvasGrup1Inter = new Canvas();
		canvasGrup1Inter.setBackground(Color.BLACK);
		canvasGrup1Inter.setBounds(179, 85, 34, 6);
		contentPane.add(canvasGrup1Inter);
		
		canvasGrup1Chaveamento1Inter = new Canvas();
		canvasGrup1Chaveamento1Inter.setBackground(Color.BLACK);
		canvasGrup1Chaveamento1Inter.setBounds(179, 65, 6, 20);
		contentPane.add(canvasGrup1Chaveamento1Inter);
		
		canvasGrup1Chaveamento2Inter = new Canvas();
		canvasGrup1Chaveamento2Inter.setBackground(Color.BLACK);
		canvasGrup1Chaveamento2Inter.setBounds(179, 90, 6, 23);
		contentPane.add(canvasGrup1Chaveamento2Inter);
		
		
		// GRUPO 2 
		
		canvasGrup2Chaveamento2 = new Canvas();
		canvasGrup2Chaveamento2.setBackground(Color.BLACK);
		canvasGrup2Chaveamento2.setBounds(126, 366, 57, 6);
		contentPane.add(canvasGrup2Chaveamento2);
		
		canvasGrup2Chaveamento1 = new Canvas();
		canvasGrup2Chaveamento1.setBackground(Color.BLACK);
		canvasGrup2Chaveamento1.setBounds(126, 325, 57, 6);
		contentPane.add(canvasGrup2Chaveamento1);
		
		canvasGrup2Inter = new Canvas();
		canvasGrup2Inter.setBackground(Color.BLACK);
		canvasGrup2Inter.setBounds(179, 345, 34, 6);
		contentPane.add(canvasGrup2Inter);
		
		canvasGrup2Chaveamento1Inter = new Canvas();
		canvasGrup2Chaveamento1Inter.setBackground(Color.BLACK);
		canvasGrup2Chaveamento1Inter.setBounds(179, 325, 6, 20);
		contentPane.add(canvasGrup2Chaveamento1Inter);
		
		canvasGrup2Chaveamento2Inter = new Canvas();
		canvasGrup2Chaveamento2Inter.setBackground(Color.BLACK);
		canvasGrup2Chaveamento2Inter.setBounds(179, 351, 6, 21);
		contentPane.add(canvasGrup2Chaveamento2Inter);
		
		
		// GRUPO 3
		
		canvasGrup3Chaveamento2 = new Canvas();
		canvasGrup3Chaveamento2.setBackground(Color.BLACK);
		canvasGrup3Chaveamento2.setBounds(699, 107, 57, 6);
		contentPane.add(canvasGrup3Chaveamento2);
		
		canvas_2 = new Canvas();
		canvas_2.setBackground(Color.BLACK);
		canvas_2.setBounds(699, 326, 57, 6);
		contentPane.add(canvas_2);
		
		canvas_3 = new Canvas();
		canvas_3.setBackground(Color.BLACK);
		canvas_3.setBounds(699, 366, 57, 6);
		contentPane.add(canvas_3);
		
		
		canvasGrup3Inter = new Canvas();
		canvasGrup3Inter.setBackground(Color.BLACK);
		canvasGrup3Inter.setBounds(671, 85, 34, 6);
		contentPane.add(canvasGrup3Inter);
		
		canvas_11 = new Canvas();
		canvas_11.setBackground(Color.BLACK);
		canvas_11.setBounds(671, 345, 34, 6);
		contentPane.add(canvas_11);
		
		canvas_12 = new Canvas();
		canvas_12.setBackground(Color.BLACK);
		canvas_12.setBounds(292, 216, 48, 6);
		contentPane.add(canvas_12);
		
		canvas_14 = new Canvas();
		canvas_14.setBackground(Color.BLACK);
		canvas_14.setBounds(292, 98, 6, 121);
		contentPane.add(canvas_14);
		
		canvas_15 = new Canvas();
		canvas_15.setBackground(Color.BLACK);
		canvas_15.setBounds(292, 217, 6, 121);
		contentPane.add(canvas_15);
		
		canvas_13 = new Canvas();
		canvas_13.setBackground(Color.BLACK);
		canvas_13.setBounds(543, 216, 48, 6);
		contentPane.add(canvas_13);
		
		canvas_16 = new Canvas();
		canvas_16.setBackground(Color.BLACK);
		canvas_16.setBounds(585, 98, 6, 121);
		contentPane.add(canvas_16);
		
		canvas_17 = new Canvas();
		canvas_17.setBackground(Color.BLACK);
		canvas_17.setBounds(585, 217, 6, 121);
		contentPane.add(canvas_17);
		
		canvasGrup3Chaveamento1Inter = new Canvas();
		canvasGrup3Chaveamento1Inter.setBackground(Color.BLACK);
		canvasGrup3Chaveamento1Inter.setBounds(699, 65, 6, 20);
		contentPane.add(canvasGrup3Chaveamento1Inter);
		
		canvasGrup3Chaveamento2Inter = new Canvas();
		canvasGrup3Chaveamento2Inter.setBackground(Color.BLACK);
		canvasGrup3Chaveamento2Inter.setBounds(699, 90, 6, 20);
		contentPane.add(canvasGrup3Chaveamento2Inter);
		
		canvas_20 = new Canvas();
		canvas_20.setBackground(Color.BLACK);
		canvas_20.setBounds(699, 326, 6, 20);
		contentPane.add(canvas_20);
		
		canvas_21 = new Canvas();
		canvas_21.setBackground(Color.BLACK);
		canvas_21.setBounds(699, 350, 6, 20);
		contentPane.add(canvas_21);

	}
}
