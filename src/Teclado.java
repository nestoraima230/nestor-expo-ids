import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Teclado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado frame = new Teclado();
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
	public Teclado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Esperando",SwingConstants.LEFT);
		lblNewLabel.setBackground(new Color(51, 255, 0));
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_30 = new JLabel("0");
		lblNewLabel_30.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel.add(lblNewLabel_30, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 9, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Q");
		lblNewLabel_2.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("W");
		lblNewLabel_3.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("E");
		lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_5);
		
		JLabel lblNewLabel_5 = new JLabel("R");
		lblNewLabel_5.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_6);
		
		JLabel lblNewLabel_6 = new JLabel("T");
		lblNewLabel_6.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_6.add(lblNewLabel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_7);
		
		JLabel lblNewLabel_7 = new JLabel("Y");
		lblNewLabel_7.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_7.add(lblNewLabel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_8);
		
		JLabel lblNewLabel_8 = new JLabel("U");
		lblNewLabel_8.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_8.add(lblNewLabel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_9);
		
		JLabel lblNewLabel_9 = new JLabel("I");
		lblNewLabel_9.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_9.add(lblNewLabel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_10);
		
		JLabel lblNewLabel_10 = new JLabel("O");
		lblNewLabel_10.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_10.add(lblNewLabel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_11);
		
		JLabel lblNewLabel_11 = new JLabel("P");
		lblNewLabel_11.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_11.add(lblNewLabel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_12);
		
		JLabel lblNewLabel_12 = new JLabel("A");
		lblNewLabel_12.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_12.add(lblNewLabel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_13);
		
		JLabel lblNewLabel_13 = new JLabel("S");
		lblNewLabel_13.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_13.add(lblNewLabel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_14);
		
		JLabel lblNewLabel_14 = new JLabel("D");
		lblNewLabel_14.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_14.add(lblNewLabel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_15);
		
		JLabel lblNewLabel_15 = new JLabel("F");
		lblNewLabel_15.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_15.add(lblNewLabel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_16);
		
		JLabel lblNewLabel_16 = new JLabel("G");
		lblNewLabel_16.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_16.add(lblNewLabel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_17);
		
		JLabel lblNewLabel_17 = new JLabel("H");
		lblNewLabel_17.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_17.add(lblNewLabel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_18);
		
		JLabel lblNewLabel_18 = new JLabel("J");
		lblNewLabel_18.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_18.add(lblNewLabel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_19);
		
		JLabel lblNewLabel_19 = new JLabel("K");
		lblNewLabel_19.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_19.add(lblNewLabel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_20);
		
		JLabel lblNewLabel_20 = new JLabel("L");
		lblNewLabel_20.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_20.add(lblNewLabel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_21);
		
		JLabel lblNewLabel_21 = new JLabel("Ñ");
		lblNewLabel_21.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_21.add(lblNewLabel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_22);
		
		JLabel lblNewLabel_22 = new JLabel("Z");
		lblNewLabel_22.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_22.add(lblNewLabel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_23);
		
		JLabel lblNewLabel_24 = new JLabel("X");
		lblNewLabel_24.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_23.add(lblNewLabel_24);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_24);
		
		JLabel lblNewLabel_25 = new JLabel("C");
		lblNewLabel_25.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_24.add(lblNewLabel_25);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_25);
		
		JLabel lblNewLabel_26 = new JLabel("V");
		lblNewLabel_26.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_25.add(lblNewLabel_26);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_26);
		
		JLabel lblNewLabel_27 = new JLabel("B");
		lblNewLabel_27.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_26.add(lblNewLabel_27);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_27);
		
		JLabel lblNewLabel_28 = new JLabel("N");
		lblNewLabel_28.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_27.add(lblNewLabel_28);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_28);
		
		JLabel lblNewLabel_23 = new JLabel("M");
		lblNewLabel_23.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_28.add(lblNewLabel_23);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_29, BorderLayout.SOUTH);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("ESPACIO ");
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 20));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		panel_29.add(lblNewLabel_1);
		
		JLabel lblNewLabel_29 = new JLabel("BORRANDO");
		lblNewLabel_29.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_29.add(lblNewLabel_29, BorderLayout.EAST);
	}

}
