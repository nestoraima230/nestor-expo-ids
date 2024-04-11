import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Login {

    private JFrame frame;
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JPasswordField passwordField_1;
    private JPasswordField passwordField_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 583, 489);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panelLogin = new JPanel();
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
        lblNewLabel.setBounds(32, 28, 152, 41);
        panelLogin.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Ingrese el nombre de usuario");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(10, 98, 230, 14);
        panelLogin.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(10, 113, 230, 20);
        panelLogin.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Ingrese la contraseña");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(10, 161, 230, 14);
        panelLogin.add(lblNewLabel_2);

        passwordField = new JPasswordField();
        passwordField.setBounds(10, 177, 230, 20);
        panelLogin.add(passwordField);

        JButton btnNewButton_1 = new JButton("Login");
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBackground(Color.BLACK);
        btnNewButton_1.setBounds(78, 231, 89, 30);
        panelLogin.add(btnNewButton_1);

        JPanel panelRegistro = new JPanel();
        panelRegistro.setBackground(Color.WHITE);
        panelRegistro.setBounds(frame.getWidth() / 2, 0, frame.getWidth() / 2, frame.getHeight());
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

        JButton btnNewButton = new JButton("Registrarse");
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.setBounds(68, 323, 107, 28);
        panelRegistro.add(btnNewButton);

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
        
        JLabel lblRegistro = new JLabel("Registro");
        lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblRegistro.setBounds(89, 30, 152, 41);
        panelRegistro.add(lblRegistro);
    }
}
