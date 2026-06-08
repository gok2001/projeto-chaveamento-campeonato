package chaveamentoDev;
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
import java.awt.Dialog.ModalityType;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceChaveamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField JtfTime1;
	private JTextField JtfTime2;
	private JTextField JtfTime3;
	private JTextField JtfTime4;
	private JTextField JtfTime5;
	private JTextField JtfTime6;
	private JTextField JtfTime7;
	private JTextField JtfTime8;
	private JTextField JtfTime11;
	private JTextField JtfTime12;
	private JTextField JtfTime9;
	private JTextField JtfTime10;
	private JTextField JtfTime14;
	private JTextField JtfTime13;
	private JTextField JtfTimeVencedor;
	private JTextField JtfPontoTime2;
	private JTextField JtfPontoTime1;
	private JTextField JtfPontoTime3;
	private JTextField JtfPontoTime4;
	private JTextField JtfPontoTime10;
	private JTextField JtfPontoTime9;
	private JTextField JtfPontoTime5;
	private JTextField JtfPontoTime6;
	private JTextField JtfPontoTime8;
	private JTextField JtfPontoTime11;
	private JTextField JtfPontoTime12;
	private JTextField JtfPontoTime13;
	private JTextField JtfPontoTime14;
	private Canvas canvasGrup3Chaveamento2;
	private Canvas canvasGrup4Chaveamento1;
	private Canvas canvasGrup4Chaveamento2;
	private Canvas canvasGrup2Chaveamento2;
	private Canvas canvasGrup2Chaveamento1;
	private Canvas canvasGrup1Chaveamento2;
	private Canvas canvasGrup1Chaveamento1;
	private Canvas canvasGrup1Inter;
	private Canvas canvasGrup2Inter;
	private Canvas canvasGrup3Inter;
	private Canvas canvasGrup4Inter;
	private Canvas canvasSemiInter1;
	private Canvas canvasSemi1;
	private Canvas canvasSemi2;
	private Canvas canvasSemiInter2;
	private Canvas canvasSemi3;
	private Canvas canvasSemi4;
	private Canvas canvasGrup3Chaveamento1Inter;
	private Canvas canvasGrup3Chaveamento2Inter;
	private Canvas canvasGrup4Chaveamento1Inter;
	private Canvas canvasGrup4Chaveamento2Inter;
	private Canvas canvasGrup1Chaveamento1Inter;
	private Canvas canvasGrup1Chaveamento2Inter;
	private Canvas canvasGrup2Chaveamento1Inter;
	private Canvas canvasGrup2Chaveamento2Inter;
	private JTextField JtfPontoTime7;
	private JButton btnSair;

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
		Logica logica = new Logica();
		
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
		JtfTime1.setText(logica.montarJogosQuartas(0, 0));
		
		JtfTime2 = new JTextField();
		JtfTime2.setEditable(false);
		JtfTime2.setBounds(41, 93, 86, 20);
		JtfTime2.setColumns(10);
		contentPane.add(JtfTime2);
		JtfTime2.setText(logica.montarJogosQuartas(0, 1));
		
		JtfPontoTime1 = new JTextField();
		JtfPontoTime1.setColumns(10);
		JtfPontoTime1.setBounds(41, 45, 34, 20);
		contentPane.add(JtfPontoTime1);
		
		JtfPontoTime2 = new JTextField();
		JtfPontoTime2.setBounds(41, 113, 34, 20);
		contentPane.add(JtfPontoTime2);
		JtfPontoTime2.setColumns(10);
		
		
		
		JtfTime3 = new JTextField();
		JtfTime3.setEditable(false);
		JtfTime3.setBounds(41, 325, 86, 20);
		JtfTime3.setColumns(10);
		contentPane.add(JtfTime3);
		JtfTime3.setText(logica.montarJogosQuartas(1, 0));
		
		JtfTime4 = new JTextField();
		JtfTime4.setEditable(false);
		JtfTime4.setBounds(41, 352, 86, 20);
		JtfTime4.setColumns(10);
		contentPane.add(JtfTime4);
		JtfTime4.setText(logica.montarJogosQuartas(1, 1));
		
		JtfPontoTime3 = new JTextField();
		JtfPontoTime3.setColumns(10);
		JtfPontoTime3.setBounds(41, 305, 34, 20);
		contentPane.add(JtfPontoTime3);
		
		JtfPontoTime4 = new JTextField();
		JtfPontoTime4.setColumns(10);
		JtfPontoTime4.setBounds(41, 372, 34, 20);
		contentPane.add(JtfPontoTime4);
		
		
		
		JtfTime5 = new JTextField();
		JtfTime5.setEditable(false);
		JtfTime5.setBounds(755, 65, 86, 20);
		JtfTime5.setColumns(10);
		contentPane.add(JtfTime5);
		JtfTime5.setText(logica.montarJogosQuartas(2, 0));
		
		JtfTime6 = new JTextField();
		JtfTime6.setEditable(false);
		JtfTime6.setBounds(755, 93, 86, 20);
		JtfTime6.setColumns(10);
		contentPane.add(JtfTime6);
		JtfTime6.setText(logica.montarJogosQuartas(2, 1));
		
		JtfPontoTime5 = new JTextField();
		JtfPontoTime5.setColumns(10);
		JtfPontoTime5.setBounds(807, 45, 34, 20);
		contentPane.add(JtfPontoTime5);
		
		JtfPontoTime6 = new JTextField();
		JtfPontoTime6.setColumns(10);
		JtfPontoTime6.setBounds(807, 113, 34, 20);
		contentPane.add(JtfPontoTime6);
		
		
		
		JtfTime7 = new JTextField();
		JtfTime7.setEditable(false);
		JtfTime7.setBounds(755, 325, 86, 20);
		JtfTime7.setColumns(10);
		contentPane.add(JtfTime7);
		JtfTime7.setText(logica.montarJogosQuartas(3, 0));
		
		JtfTime8 = new JTextField();
		JtfTime8.setEditable(false);
		JtfTime8.setBounds(755, 352, 86, 20);
		JtfTime8.setColumns(10);
		contentPane.add(JtfTime8);
		JtfTime8.setText(logica.montarJogosQuartas(3, 1));
		
		JtfPontoTime7 = new JTextField();
		JtfPontoTime7.setColumns(10);
		JtfPontoTime7.setBounds(807, 305, 34, 20);
		contentPane.add(JtfPontoTime7);
		
		JtfPontoTime8 = new JTextField();
		JtfPontoTime8.setColumns(10);
		JtfPontoTime8.setBounds(807, 372, 34, 20);
		contentPane.add(JtfPontoTime8);
		
		
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
		
				Canvas canvasGrup3Chaveamento1 = new Canvas();
				canvasGrup3Chaveamento1.setBackground(new Color(0, 0, 0));
				canvasGrup3Chaveamento1.setBounds(699, 65, 57, 6);
				contentPane.add(canvasGrup3Chaveamento1);
				
				canvasGrup3Inter = new Canvas();
				canvasGrup3Inter.setBackground(Color.BLACK);
				canvasGrup3Inter.setBounds(671, 85, 34, 6);
				contentPane.add(canvasGrup3Inter);
				
				canvasGrup3Chaveamento2 = new Canvas();
				canvasGrup3Chaveamento2.setBackground(Color.BLACK);
				canvasGrup3Chaveamento2.setBounds(699, 107, 57, 6);
				contentPane.add(canvasGrup3Chaveamento2);
				
				canvasGrup3Chaveamento1Inter = new Canvas();
				canvasGrup3Chaveamento1Inter.setBackground(Color.BLACK);
				canvasGrup3Chaveamento1Inter.setBounds(699, 65, 6, 20);
				contentPane.add(canvasGrup3Chaveamento1Inter);
				
				canvasGrup3Chaveamento2Inter = new Canvas();
				canvasGrup3Chaveamento2Inter.setBackground(Color.BLACK);
				canvasGrup3Chaveamento2Inter.setBounds(699, 90, 6, 20);
				contentPane.add(canvasGrup3Chaveamento2Inter);
				
		
		// GRUPO 4
				
				canvasGrup4Inter = new Canvas();
				canvasGrup4Inter.setBackground(Color.BLACK);
				canvasGrup4Inter.setBounds(671, 345, 34, 6);
				contentPane.add(canvasGrup4Inter);
				
				canvasGrup4Chaveamento1 = new Canvas();
				canvasGrup4Chaveamento1.setBackground(Color.BLACK);
				canvasGrup4Chaveamento1.setBounds(699, 326, 57, 6);
				contentPane.add(canvasGrup4Chaveamento1);
				
				canvasGrup4Chaveamento2 = new Canvas();
				canvasGrup4Chaveamento2.setBackground(Color.BLACK);
				canvasGrup4Chaveamento2.setBounds(699, 366, 57, 6);
				contentPane.add(canvasGrup4Chaveamento2);
				
				canvasGrup4Chaveamento1Inter = new Canvas();
				canvasGrup4Chaveamento1Inter.setBackground(Color.BLACK);
				canvasGrup4Chaveamento1Inter.setBounds(699, 326, 6, 20);
				contentPane.add(canvasGrup4Chaveamento1Inter);
				
				canvasGrup4Chaveamento2Inter = new Canvas();
				canvasGrup4Chaveamento2Inter.setBackground(Color.BLACK);
				canvasGrup4Chaveamento2Inter.setBounds(699, 350, 6, 20);
				contentPane.add(canvasGrup4Chaveamento2Inter);
				
	
				
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
				
		
				JtfTime9 = new JTextField();
				JtfTime9.setEditable(false);
				JtfTime9.setBounds(212, 79, 86, 20);
				JtfTime9.setColumns(10);
				contentPane.add(JtfTime9);
				
				JtfTime10 = new JTextField();
				JtfTime10.setEditable(false);
				JtfTime10.setBounds(212, 338, 86, 20);
				JtfTime10.setColumns(10);
				contentPane.add(JtfTime10);
				
				JtfPontoTime9 = new JTextField();
				JtfPontoTime9.setEditable(false);
				JtfPontoTime9.setColumns(10);
				JtfPontoTime9.setBounds(212, 59, 34, 20);
				contentPane.add(JtfPontoTime9);
				
				JtfPontoTime10 = new JTextField();
				JtfPontoTime10.setEditable(false);
				JtfPontoTime10.setColumns(10);
				JtfPontoTime10.setBounds(212, 358, 34, 20);
				contentPane.add(JtfPontoTime10);
				
				
				
				JtfTime11 = new JTextField();
				JtfTime11.setEditable(false);
				JtfTime11.setBounds(585, 79, 86, 20);
				JtfTime11.setColumns(10);
				contentPane.add(JtfTime11);
				
				JtfTime12 = new JTextField();
				JtfTime12.setEditable(false);
				JtfTime12.setBounds(585, 338, 86, 20);
				JtfTime12.setColumns(10);
				contentPane.add(JtfTime12);
				
				JtfPontoTime11 = new JTextField();
				JtfPontoTime11.setEditable(false);
				JtfPontoTime11.setColumns(10);
				JtfPontoTime11.setBounds(637, 59, 34, 20);
				contentPane.add(JtfPontoTime11);
				
				JtfPontoTime12 = new JTextField();
				JtfPontoTime12.setEditable(false);
				JtfPontoTime12.setColumns(10);
				JtfPontoTime12.setBounds(637, 358, 34, 20);
				contentPane.add(JtfPontoTime12);
				
				
				
				JtfTime13 = new JTextField();
				JtfTime13.setEditable(false);
				JtfTime13.setBounds(339, 209, 86, 20);
				JtfTime13.setColumns(10);
				contentPane.add(JtfTime13);
				
				JtfTime14 = new JTextField();
				JtfTime14.setEditable(false);
				JtfTime14.setBounds(458, 209, 86, 20);
				JtfTime14.setColumns(10);
				contentPane.add(JtfTime14);
				
				JtfPontoTime13 = new JTextField();
				JtfPontoTime13.setEditable(false);
				JtfPontoTime13.setColumns(10);
				JtfPontoTime13.setBounds(339, 189, 34, 20);
				contentPane.add(JtfPontoTime13);
				
				JtfPontoTime14 = new JTextField();
				JtfPontoTime14.setEditable(false);
				JtfPontoTime14.setColumns(10);
				JtfPontoTime14.setBounds(510, 189, 34, 20);
				contentPane.add(JtfPontoTime14);
				
				
				
				JtfTimeVencedor = new JTextField();
				JtfTimeVencedor.setEditable(false);
				JtfTimeVencedor.setFont(new Font("Tahoma", Font.PLAIN, 16));
				JtfTimeVencedor.setBounds(391, 271, 102, 30);
				contentPane.add(JtfTimeVencedor);
				JtfTimeVencedor.setColumns(10);
				
				JLabel lblNomeCampeonato = new JLabel("Nome Campeonato");
				lblNomeCampeonato.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNomeCampeonato.setBounds(377, 26, 153, 14);
				contentPane.add(lblNomeCampeonato);
				lblNomeCampeonato.setText(logica.nomeCampeonato);
				
				
		JButton btnCalcularPonto = new JButton("Calcular Quartas");
		btnCalcularPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnCalcularPonto.getText() == "Calcular Quartas") {
					
					if (JtfPontoTime1.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 1!");
			            JtfPontoTime1.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacao(0, 0, Integer.parseInt(JtfPontoTime1.getText()));
			        }
					
					
					if (JtfPontoTime2.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 2!");
			            JtfPontoTime2.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacao(0, 1, Integer.parseInt(JtfPontoTime2.getText()));
			        }
					
					
					if (JtfPontoTime3.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 3!");
			            JtfPontoTime3.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacao(1, 0, Integer.parseInt(JtfPontoTime3.getText()));
			        }
					
					
					if (JtfPontoTime4.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 4!");
			            JtfPontoTime4.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacao(1, 1, Integer.parseInt(JtfPontoTime4.getText()));
			        }
					
					
					if (JtfPontoTime5.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 5!");
			            JtfPontoTime5.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacao(2, 0, Integer.parseInt(JtfPontoTime5.getText()));
					}
					
					
					if (JtfPontoTime6.getText().trim().isEmpty()) {
						JOptionPane.showMessageDialog(null,
								"Preencher Ponto do Time 6!");
						JtfPontoTime6.requestFocus();
						return;
					} else {
						logica.registrarPontuacao(2, 1, Integer.parseInt(JtfPontoTime6.getText()));
					}
					
					
					if (JtfPontoTime7.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 7!");
			            JtfPontoTime7.requestFocus();
			            return;
			        } else {	
						logica.registrarPontuacao(3, 0, Integer.parseInt(JtfPontoTime7.getText()));
			        }
					
					
					if (JtfPontoTime8.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 8!");
			            JtfPontoTime8.requestFocus();
			            return;
			        } else {
						logica.registrarPontuacao(3, 1, Integer.parseInt(JtfPontoTime8.getText()));
			        }
					
					logica.calcularPontuacao(0);			
					logica.calcularPontuacao(1);		
					logica.calcularPontuacao(2);		
					logica.calcularPontuacao(3);
				
				
					JtfPontoTime1.setEditable(false);
					JtfPontoTime2.setEditable(false);
					JtfPontoTime3.setEditable(false);
					JtfPontoTime4.setEditable(false);
					JtfPontoTime5.setEditable(false);
					JtfPontoTime6.setEditable(false);
					JtfPontoTime7.setEditable(false);
					JtfPontoTime8.setEditable(false);
					JtfPontoTime9.setEditable(true);
					JtfPontoTime10.setEditable(true);
					JtfPontoTime11.setEditable(true);
					JtfPontoTime12.setEditable(true);	
				
				
					JtfTime9.setText(logica.montarJogosSemi(0, 0));
					JtfTime10.setText(logica.montarJogosSemi(0, 1));
					JtfTime11.setText(logica.montarJogosSemi(1, 0));
					JtfTime12.setText(logica.montarJogosSemi(1,1));
				
					btnCalcularPonto.setName("Calcular Semi");
					btnCalcularPonto.setText("Calcular Semi");
			
				}
				
				if(btnCalcularPonto.getText() == "Calcular Semi") {
					
					if (JtfPontoTime9.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 1!");
			            JtfPontoTime9.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacaoSemi(0, 0, Integer.parseInt(JtfPontoTime9.getText()));
			        }
					
					if (JtfPontoTime10.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 2!");
			            JtfPontoTime10.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacaoSemi(0, 1, Integer.parseInt(JtfPontoTime10.getText()));
			        }
					
					if (JtfPontoTime11.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 3!");
			            JtfPontoTime11.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacaoSemi(1, 0, Integer.parseInt(JtfPontoTime11.getText()));
			        }
					
					if (JtfPontoTime12.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Ponto do Time 4!");
			            JtfPontoTime12.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacaoSemi(1, 1, Integer.parseInt(JtfPontoTime12.getText()));
			        }
					
					
					logica.calcularPontuacaoSemi(0);
					logica.calcularPontuacaoSemi(1);
					
					JtfPontoTime9.setEditable(false);
					JtfPontoTime10.setEditable(false);
					JtfPontoTime11.setEditable(false);
					JtfPontoTime12.setEditable(false);
					JtfPontoTime13.setEditable(true);
					JtfPontoTime14.setEditable(true);
					
					
					JtfTime13.setText(logica.montarJogoFinal(0, 0));
					JtfTime14.setText(logica.montarJogoFinal(0, 1));
					
					btnCalcularPonto.setName("Calcular Final");
					btnCalcularPonto.setText("Calcular Final");
				}
				
				if(btnCalcularPonto.getText() == "Calcular Final") {
					
					if (JtfPontoTime13.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Nome Time Grupo 1!");
			            JtfPontoTime13.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacaoFinal(0, 0, Integer.parseInt(JtfPontoTime13.getText()));
			        }
					
					if (JtfPontoTime14.getText().trim().isEmpty()) {
			            JOptionPane.showMessageDialog(null,
			                    "Preencher Nome Time Grupo 2!");
			            JtfPontoTime14.requestFocus();
			            return;
			        } else {
			        	logica.registrarPontuacaoFinal(0, 1, Integer.parseInt(JtfPontoTime14.getText()));
			        }
					
					JtfPontoTime13.setEditable(false);
					JtfPontoTime14.setEditable(false);
			        	
					String vencedor = logica.calcularPontuacaoFinal(0);
					JtfTimeVencedor.setText(vencedor);
					
					btnCalcularPonto.setName("Sair");
					btnCalcularPonto.setText("Sair");
					
				}
				
				if(btnCalcularPonto.getText() == "Sair") {
					btnCalcularPonto.addActionListener(x -> System.exit(0));
			        contentPane.add(btnCalcularPonto);;
				}
			}
		});
		btnCalcularPonto.setBounds(377, 420, 139, 30);
		contentPane.add(btnCalcularPonto);
		

///////////////////////////////////////////////////////////////////////////////////////////////		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("WIN!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setBounds(420, 311, 48, 14);
		contentPane.add(lblNewLabel);
		
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
		
		
		
		
		
		
		
		
		canvasSemiInter1 = new Canvas();
		canvasSemiInter1.setBackground(Color.BLACK);
		canvasSemiInter1.setBounds(292, 216, 48, 6);
		contentPane.add(canvasSemiInter1);
		
		canvasSemi1 = new Canvas();
		canvasSemi1.setBackground(Color.BLACK);
		canvasSemi1.setBounds(292, 98, 6, 121);
		contentPane.add(canvasSemi1);
		
		
		
		canvasSemi2 = new Canvas();
		canvasSemi2.setBackground(Color.BLACK);
		canvasSemi2.setBounds(292, 217, 6, 121);
		contentPane.add(canvasSemi2);
		
		canvasSemiInter2 = new Canvas();
		canvasSemiInter2.setBackground(Color.BLACK);
		canvasSemiInter2.setBounds(543, 216, 48, 6);
		contentPane.add(canvasSemiInter2);
		
		
		
		canvasSemi3 = new Canvas();
		canvasSemi3.setBackground(Color.BLACK);
		canvasSemi3.setBounds(585, 98, 6, 121);
		contentPane.add(canvasSemi3);
		
		canvasSemi4 = new Canvas();
		canvasSemi4.setBackground(Color.BLACK);
		canvasSemi4.setBounds(585, 217, 6, 121);
		contentPane.add(canvasSemi4);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSair.addActionListener(t -> System.exit(0));
		        contentPane.add(btnSair);
			}
		});
		btnSair.setBounds(752, 427, 89, 23);
		contentPane.add(btnSair);
		
		

	}

	public void setModalityType(ModalityType applicationModal) {
		// TODO Auto-generated method stub
		
	}
}
