import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

public class Login {

    private JFrame frame;
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JPasswordField passwordField_1;
    private JPasswordField passwordField_2;
    private JPanel panelLogin;
    private JPanel panelRegistro;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                    window.panelRegistro.setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        initialize();
        panelRegistro.setVisible(false);
        frame.pack();
        frame.setMinimumSize(new Dimension(415, 663));
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        panelLogin = new JPanel();
        panelLogin.setBackground(Color.BLACK);
        panelLogin.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelLogin);
        panelLogin.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu mnInicio = new JMenu("Inicio");
        menuBar.add(mnInicio);
        
        JMenuItem mnLogin = new JMenuItem("Login");
        mnInicio.add(mnLogin);

        JMenuItem mnRegistro = new JMenuItem("Registro");
        mnInicio.add(mnRegistro);
       
        JMenu mnAyuda = new JMenu("Ayuda");
        menuBar.add(mnAyuda);
        
        JLabel lblNewLabel = new JLabel("Iniciar Sesión");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(88, 29, 152, 41);
        panelLogin.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Ingrese el nombre de usuario");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(57, 107, 230, 14);
        panelLogin.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(57, 132, 230, 20);
        panelLogin.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Ingrese la contraseña");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(35, 163, 230, 14);
        panelLogin.add(lblNewLabel_2);

        passwordField = new JPasswordField();
        passwordField.setBounds(57, 188, 230, 20);
        panelLogin.add(passwordField);

        JButton btnNewButton_1 = new JButton("Login");
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBackground(Color.BLACK);
        btnNewButton_1.setBounds(112, 245, 89, 30);
        panelLogin.add(btnNewButton_1);

        btnNewButton_1.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "ERROR: verifica la información.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        });
        
        JButton btnRegistro = new JButton("Crear cuenta");
        btnRegistro.setForeground(Color.WHITE);
        btnRegistro.setBackground(Color.BLACK);
        btnRegistro.setBounds(100, 346, 112, 30);  
        panelLogin.add(btnRegistro);

        btnRegistro.addActionListener(e -> {
            panelLogin.setVisible(false);
            panelRegistro.setVisible(true);
        });
        
        JLabel lblNewLabel_7_1 = new JLabel("¿No tiene una cuenta?. de CLICK aqui.");
        lblNewLabel_7_1.setForeground(Color.WHITE);
        lblNewLabel_7_1.setBounds(88, 377, 221, 20);  //(100,400,112,30); btnIniciarSesion
        panelLogin.add(lblNewLabel_7_1);

        panelRegistro = new JPanel();
        panelRegistro.setBackground(Color.WHITE);
        panelRegistro.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelRegistro);
        panelRegistro.setLayout(null);

        textField_1 = new JTextField();
        textField_1.setBounds(31, 99, 99, 20);
        panelRegistro.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(159, 99, 99, 20);
        panelRegistro.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(68, 160, 143, 20);
        panelRegistro.add(textField_3);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Acepta términos y condiciones");
        chckbxNewCheckBox.setBackground(Color.WHITE);
        chckbxNewCheckBox.setBounds(31, 295, 214, 23);
        panelRegistro.add(chckbxNewCheckBox);

        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setBackground(Color.WHITE);
        btnRegistrarse.setBounds(68, 323, 107, 28);
        panelRegistro.add(btnRegistrarse);

        JLabel lblNewLabel_3 = new JLabel("Ingrese su nombre");
        lblNewLabel_3.setBounds(31, 82, 117, 14);
        panelRegistro.add(lblNewLabel_3);

        JLabel lblNewLabel_3_1 = new JLabel("Ingrese su apellido");
        lblNewLabel_3_1.setBounds(159, 79, 117, 20);
        panelRegistro.add(lblNewLabel_3_1);

        JLabel lblNewLabel_4 = new JLabel("Correo electrónico");
        lblNewLabel_4.setBounds(68, 145, 143, 14);
        panelRegistro.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Contraseña");
        lblNewLabel_5.setBounds(71, 196, 140, 14);
        panelRegistro.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Confirmar contraseña");
        lblNewLabel_6.setBounds(71, 239, 140, 14);
        panelRegistro.add(lblNewLabel_6);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(68, 211, 143, 20);
        panelRegistro.add(passwordField_1);

        passwordField_2 = new JPasswordField();
        passwordField_2.setBounds(68, 254, 143, 20);
        panelRegistro.add(passwordField_2);
        
        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.setBackground(Color.WHITE);
        btnIniciarSesion.setBounds(100,400,112,30);
        panelRegistro.add(btnIniciarSesion);
        
        btnIniciarSesion.addActionListener(e -> {
            panelRegistro.setVisible(false);
            panelLogin.setVisible(true);
        });
        
        JLabel lblRegistro = new JLabel("Registro");
        lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblRegistro.setBounds(89, 30, 152, 41);
        panelRegistro.add(lblRegistro);
        
        JLabel lblNewLabel_7 = new JLabel("¿Ya tiene una cuenta?. de CLICK aqui.");
        lblNewLabel_7.setBounds(68, 430, 221, 20);
        panelRegistro.add(lblNewLabel_7);        
    }
}
