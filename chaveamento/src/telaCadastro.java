import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaCadastro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private JTextField textCampeonato;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                telaCadastro frame = new telaCadastro();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public telaCadastro() {
    	
        setTitle("Cadastro de Times");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);

        setContentPane(contentPane);

        JLabel lblCampeonato = new JLabel("Campeonato");
        lblCampeonato.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblCampeonato.setBounds(197, 11, 120, 25);
        contentPane.add(lblCampeonato);

        textCampeonato = new JTextField();
        textCampeonato.setHorizontalAlignment(SwingConstants.CENTER);
        textCampeonato.setBounds(136, 40, 212, 20);
        contentPane.add(textCampeonato);

        JLabel lblChaveamentoA = new JLabel("Chaveamento A");
        lblChaveamentoA.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblChaveamentoA.setBounds(45, 94, 120, 14);
        contentPane.add(lblChaveamentoA);

        JLabel lblChaveamentoB = new JLabel("Chaveamento B");
        lblChaveamentoB.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblChaveamentoB.setBounds(340, 94, 120, 14);
        contentPane.add(lblChaveamentoB);

        JLabel lblGrupo1 = new JLabel("Grupo 1");
        lblGrupo1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblGrupo1.setBounds(55, 127, 55, 14);
        contentPane.add(lblGrupo1);

        JLabel lblGrupo2 = new JLabel("Grupo 2");
        lblGrupo2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblGrupo2.setBounds(55, 255, 55, 14);
        contentPane.add(lblGrupo2);

        JLabel lblGrupo3 = new JLabel("Grupo 3");
        lblGrupo3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblGrupo3.setBounds(350, 127, 55, 14);
        contentPane.add(lblGrupo3);

        JLabel lblGrupo4 = new JLabel("Grupo 4");
        lblGrupo4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblGrupo4.setBounds(350, 255, 55, 14);
        contentPane.add(lblGrupo4);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBounds(45, 152, 86, 20);
        contentPane.add(textField);

        textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setBounds(45, 201, 86, 20);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setBounds(45, 280, 86, 20);
        contentPane.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_3.setBounds(45, 329, 86, 20);
        contentPane.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setBounds(340, 152, 86, 20);
        contentPane.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setHorizontalAlignment(SwingConstants.CENTER);
        textField_5.setBounds(340, 201, 86, 20);
        contentPane.add(textField_5);

        textField_6 = new JTextField();
        textField_6.setHorizontalAlignment(SwingConstants.CENTER);
        textField_6.setBounds(340, 280, 86, 20);
        contentPane.add(textField_6);

        textField_7 = new JTextField();
        textField_7.setHorizontalAlignment(SwingConstants.CENTER);
        textField_7.setBounds(340, 329, 86, 20);
        contentPane.add(textField_7);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		validarECadastrar();
        	}
        	
			private void validarECadastrar() {
				 
				if (textField.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Preencher Nome Time Grupo 1!");
		            textField.requestFocus();
		            return;
		        }
				
				if (textField_1.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Preencher Nome Time Grupo 1!");
		            textField_1.requestFocus();
		            return;
		        }
				
				if (textField_2.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Preencher Nome Time Grupo 2!");
		            textField_2.requestFocus();
		            return;
		        }
				
				if (textField_3.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Preencher Nome Time Grupo 2!");
		            textField_3.requestFocus();
		            return;
		        }
				
				if (textField_4.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Preencher Nome Time Grupo 3!");
		            textField_4.requestFocus();
		            return;
		        }
				
				if (textField_5.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Preencher Nome Time Grupo 3!");
		            textField_5.requestFocus();
		            return;
		        }
				
				if (textField_6.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Preencher Nome Time Grupo 4!");
		            textField_6.requestFocus();
		            return;
		        }
				
				if (textField_7.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Preencher Nome Time Grupo 4!");
		            textField_7.requestFocus();
		            return;
		        }
				
				if (textCampeonato.getText().trim().isEmpty()) {
		            JOptionPane.showMessageDialog(null,
		                    "Coloque um nome para o Campeonato !!");
		            textCampeonato.requestFocus();
		            return;
		        }
				
		        JOptionPane.showMessageDialog(null, "Pronto para começar a Pelada!");
		    }
		});
        btnCadastrar.setBounds(337, 411, 100, 39);
        contentPane.add(btnCadastrar);

        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(222, 411, 89, 39);

        btnSair.addActionListener(e -> System.exit(0));

        contentPane.add(btnSair);

        JLabel lblImagem = new JLabel();

        try {
            lblImagem.setIcon(
                new ImageIcon(telaCadastro.class.getResource("/imagens/aq (1).png"))
            );
        } catch (Exception e) {
            System.out.println("Imagem não encontrada.");
        }

        lblImagem.setBounds(147, 91, 170, 258);
        contentPane.add(lblImagem);
    }
}