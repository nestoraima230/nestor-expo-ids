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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

public class Login  {

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
    private JPanel panelRecuperarCuenta;
    private JPanel panelAltaUsuario;
    private JPanel panelBajaUsuario;
    private JPanel panelConsultarUsuario;
    private JPanel panelAyudaCrearUsuario;
    private JPanel panelAyudaAccederSistema;
    private JPanel panelAyudaOlvidarContrasena;
    private JMenuBar menuBar;
    private JMenu mnInicio;
    private JMenu mnUsuarios;
    private JMenu mnAyuda;
    private JMenuItem mnLogin;
    private JMenuItem mnRegistro;
    private JMenuItem mnRecuperarCuenta;
    private JMenuItem mnAltaUsuario;
    private JMenuItem mnBajaUsuario;
    private JMenuItem mnConsultarUsuario;
    private JMenuItem mnAyudaCrearUsuario;
    private JMenuItem mnAyudaAccederSistema;
    private JMenuItem mnAyudaOlvidarContrasena;
    private JLabel lblRecuperarCuenta;
    private JLabel lblAltaUsuario;
    private JLabel lblBajaUsuario;
    private JLabel lblAyudaCrearUsuario;
    private JLabel lblAyudaAccederSistema;
    private JLabel lblConsultarUsuario;
    private JLabel lblAyudaOlvidarContrasena;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                    //window.panelRegistro.setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        initialize();
        panelLogin.setVisible(true);
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
        panelLogin.setVisible(true);
       
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        mnInicio = new JMenu("Inicio");
        menuBar.add(mnInicio);
        mnLogin = new JMenuItem("Login");
        mnInicio.add(mnLogin);
        mnRegistro = new JMenuItem("Registro");
        mnInicio.add(mnRegistro);
        mnRecuperarCuenta = new JMenuItem("Recuperación de cuenta");

        mnInicio.add(mnRecuperarCuenta);

        mnUsuarios = new JMenu("Usuarios");
        menuBar.add(mnUsuarios);
        mnAltaUsuario = new JMenuItem("Alta");
        mnUsuarios.add(mnAltaUsuario);
        mnBajaUsuario = new JMenuItem("Baja");
        mnUsuarios.add(mnBajaUsuario);
        mnConsultarUsuario = new JMenuItem("Consultar");
        mnUsuarios.add(mnConsultarUsuario);

        mnAyuda = new JMenu("Ayuda");
        menuBar.add(mnAyuda);
        mnAyudaCrearUsuario = new JMenuItem("¿Cómo crear un usuario?");
        mnAyuda.add(mnAyudaCrearUsuario);
        mnAyudaAccederSistema = new JMenuItem("¿Cómo acceder al sistema?");
        mnAyuda.add(mnAyudaAccederSistema);
        mnAyudaOlvidarContrasena = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
        mnAyuda.add(mnAyudaOlvidarContrasena);
        
        //LoginMenuListener menuListener = new LoginMenuListener(panelLogin, panelRegistro,menuBar,mnInicio, mnLogin, mnRegistro, mnAyuda);
        
        
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
        panelRegistro.setVisible(false);
        
        panelRecuperarCuenta = new JPanel();
        panelRecuperarCuenta.setBackground(Color.WHITE);
        panelRecuperarCuenta.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelRecuperarCuenta);
        panelRecuperarCuenta.setLayout(null);
        panelRecuperarCuenta.setVisible(false);
        
        panelAltaUsuario = new JPanel();
        panelAltaUsuario.setBackground(Color.WHITE);
        panelAltaUsuario.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelAltaUsuario);
        panelAltaUsuario.setLayout(null);
        panelAltaUsuario.setVisible(false);
               
        panelBajaUsuario = new JPanel();
        panelBajaUsuario.setBackground(Color.WHITE);
        panelBajaUsuario.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelBajaUsuario);
        panelBajaUsuario.setLayout(null);
        panelBajaUsuario.setVisible(false);
        
        panelAyudaCrearUsuario = new JPanel();
        panelAyudaCrearUsuario.setBackground(Color.WHITE);
        panelAyudaCrearUsuario.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelAyudaCrearUsuario);
        panelAyudaCrearUsuario.setLayout(null);
        panelAyudaCrearUsuario.setVisible(false);
        
        panelConsultarUsuario = new JPanel();
        panelConsultarUsuario.setBackground(Color.WHITE);
        panelConsultarUsuario.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelConsultarUsuario);
        panelConsultarUsuario.setLayout(null);
        panelConsultarUsuario.setVisible(false);
        
        panelAyudaAccederSistema = new JPanel();
        panelAyudaAccederSistema.setBackground(Color.WHITE);
        panelAyudaAccederSistema.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelAyudaAccederSistema);
        panelAyudaAccederSistema.setLayout(null);
        panelAyudaAccederSistema.setVisible(false);
        
        panelAyudaOlvidarContrasena = new JPanel();
        panelAyudaOlvidarContrasena.setBackground(Color.WHITE);
        panelAyudaOlvidarContrasena.setBounds(0, 0, frame.getWidth() / 2, frame.getHeight());
        frame.getContentPane().add(panelAyudaOlvidarContrasena);
        panelAyudaOlvidarContrasena.setLayout(null);
        panelAyudaOlvidarContrasena.setVisible(false);
        
        LoginMenuListener menuListener = new LoginMenuListener(panelLogin,panelRegistro,panelRecuperarCuenta,panelAltaUsuario,panelBajaUsuario,panelConsultarUsuario,panelAyudaCrearUsuario,panelAyudaAccederSistema,panelAyudaOlvidarContrasena,menuBar,mnInicio,mnUsuarios,mnAyuda,mnLogin,mnRegistro,mnRecuperarCuenta,mnAltaUsuario,mnBajaUsuario,mnConsultarUsuario,mnAyudaCrearUsuario,mnAyudaAccederSistema,mnAyudaOlvidarContrasena);
        
        lblAyudaOlvidarContrasena = new JLabel("¿Qué pasa si olvidé mi contraseña?");
        lblAyudaOlvidarContrasena.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblAyudaOlvidarContrasena.setBounds(20, 30, 353, 41);
        panelAyudaOlvidarContrasena.add(lblAyudaOlvidarContrasena);
        
        lblAyudaAccederSistema = new JLabel("¿Cómo acceder al sistema?");
        lblAyudaAccederSistema.setHorizontalAlignment(SwingConstants.CENTER);
        lblAyudaAccederSistema.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblAyudaAccederSistema.setBounds(20, 30, 299, 41);
        panelAyudaAccederSistema.add(lblAyudaAccederSistema);
        
        lblConsultarUsuario = new JLabel("Consultar");
        lblConsultarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblConsultarUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblConsultarUsuario.setBounds(89, 30, 152, 41);
        panelConsultarUsuario.add(lblConsultarUsuario);
        
        lblAyudaCrearUsuario = new JLabel("¿Cómo crear un usuario?");
        lblAyudaCrearUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblAyudaCrearUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblAyudaCrearUsuario.setBounds(20, 30, 299, 41);
        panelAyudaCrearUsuario.add(lblAyudaCrearUsuario);
        
        lblBajaUsuario = new JLabel("Baja");
        lblBajaUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblBajaUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblBajaUsuario.setBounds(89, 30, 152, 41);
        panelBajaUsuario.add(lblBajaUsuario);
        
        lblAltaUsuario = new JLabel("Alta");
        lblAltaUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblAltaUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblAltaUsuario.setBounds(89, 30, 152, 41);
        panelAltaUsuario.add(lblAltaUsuario);
        
        lblRecuperarCuenta = new JLabel("Recuperar cuenta");
        lblRecuperarCuenta.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblRecuperarCuenta.setBounds(89, 30, 209, 41);
        panelRecuperarCuenta.add(lblRecuperarCuenta);
        
        JLabel lblCorreoElectronicoRecuperacion = new JLabel("Correo Electrónico:");
        lblCorreoElectronicoRecuperacion.setBounds(30, 100, 150, 20);
        panelRecuperarCuenta.add(lblCorreoElectronicoRecuperacion);

        JTextField txtCorreoElectronicoRecuperacion = new JTextField();
        txtCorreoElectronicoRecuperacion.setBounds(180, 100, 200, 20);
        panelRecuperarCuenta.add(txtCorreoElectronicoRecuperacion);

        JButton btnEnviarCorreoRecuperacion = new JButton("Enviar Correo");
        btnEnviarCorreoRecuperacion.setBounds(180, 150, 150, 30);
        btnEnviarCorreoRecuperacion.setBackground(Color.WHITE);
        panelRecuperarCuenta.add(btnEnviarCorreoRecuperacion);
        
        btnEnviarCorreoRecuperacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "Se ha enviado un correo de recuperación", "Correo Enviado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JLabel lblNombreUsuario = new JLabel("Nombre de Usuario:");
        lblNombreUsuario.setBounds(30, 100, 150, 20);
        panelAltaUsuario.add(lblNombreUsuario);

        JTextField txtNombreUsuario = new JTextField();
        txtNombreUsuario.setBounds(180, 100, 200, 20);
        panelAltaUsuario.add(txtNombreUsuario);

        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(30, 140, 150, 20);
        panelAltaUsuario.add(lblContraseña);

        JPasswordField txtContraseña = new JPasswordField();
        txtContraseña.setBounds(180, 140, 200, 20);
        panelAltaUsuario.add(txtContraseña);

        JLabel lblCorreoElectronico = new JLabel("Correo Electrónico:");
        lblCorreoElectronico.setBounds(30, 180, 150, 20);
        panelAltaUsuario.add(lblCorreoElectronico);

        JTextField txtCorreoElectronico = new JTextField();
        txtCorreoElectronico.setBounds(180, 180, 200, 20);
        panelAltaUsuario.add(txtCorreoElectronico);
        
        JLabel lblNombreUsuarioBaja = new JLabel("Nombre de Usuario:");
        lblNombreUsuarioBaja.setBounds(30, 100, 150, 20);
        panelBajaUsuario.add(lblNombreUsuarioBaja);

        JTextField txtNombreUsuarioBaja = new JTextField();
        txtNombreUsuarioBaja.setBounds(180, 100, 200, 20);
        panelBajaUsuario.add(txtNombreUsuarioBaja);
        
        JButton btnConfirmarBaja = new JButton("Confirmar Baja");
        btnConfirmarBaja.setBounds(150, 250, 150, 30);
        btnConfirmarBaja.setBackground(Color.RED);
        btnConfirmarBaja.setForeground(Color.WHITE);
        panelBajaUsuario.add(btnConfirmarBaja);

        btnConfirmarBaja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Usuario dado de baja exitosamente.", "Baja de Usuario", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JLabel lblNombreUsuarioConsulta = new JLabel("Nombre de Usuario:");
        lblNombreUsuarioConsulta.setBounds(30, 100, 150, 20);
        panelConsultarUsuario.add(lblNombreUsuarioConsulta);

        JTextField txtNombreUsuarioConsulta = new JTextField();
        txtNombreUsuarioConsulta.setBounds(180, 100, 200, 20);
        panelConsultarUsuario.add(txtNombreUsuarioConsulta);
        
        JButton btnIniciarConsulta = new JButton("Iniciar Consulta");
        btnIniciarConsulta.setBackground(Color.WHITE);
        btnIniciarConsulta.setBounds(150, 250, 150, 30);
        panelConsultarUsuario.add(btnIniciarConsulta);

        btnIniciarConsulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Consulta de usuario iniciada.", "Consulta de Usuario", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        mnLogin.addActionListener(menuListener);
        mnRegistro.addActionListener(menuListener);
        mnRecuperarCuenta.addActionListener(menuListener);
        mnAltaUsuario.addActionListener(menuListener);
        mnBajaUsuario.addActionListener(menuListener);
        mnConsultarUsuario.addActionListener(menuListener);
        mnAyudaCrearUsuario.addActionListener(menuListener);
        mnAyudaAccederSistema.addActionListener(menuListener);
        mnAyudaOlvidarContrasena.addActionListener(menuListener);

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

class LoginMenuListener implements ActionListener {
    private JPanel panelLogin;
    private JPanel panelRegistro;
    private JPanel panelRecuperarCuenta;
    private JPanel panelAltaUsuario;
    private JPanel panelBajaUsuario;
    private JPanel panelConsultarUsuario;
    private JPanel panelAyudaCrearUsuario;
    private JPanel panelAyudaAccederSistema;
    private JPanel panelAyudaOlvidarContrasena;
    private JMenuBar menuBar;
    private JMenu mnInicio;
    private JMenu mnUsuarios;
    private JMenu mnAyuda;
    private JMenuItem mnLogin;
    private JMenuItem mnRegistro;
    private JMenuItem mnRecuperarCuenta;
    private JMenuItem mnAltaUsuario;
    private JMenuItem mnBajaUsuario;
    private JMenuItem mnConsultarUsuario;
    private JMenuItem mnAyudaCrearUsuario;
    private JMenuItem mnAyudaAccederSistema;
    private JMenuItem mnAyudaOlvidarContrasena;

    public LoginMenuListener(JPanel panelLogin, JPanel panelRegistro, JPanel panelRecuperarCuenta, JPanel panelAltaUsuario, JPanel panelBajaUsuario, JPanel panelConsultarUsuario, JPanel panelAyudaCrearUsuario, JPanel panelAyudaAccederSistema, JPanel panelAyudaOlvidarContrasena, JMenuBar menuBar, JMenu mnInicio, JMenu mnUsuarios, JMenu mnAyuda, JMenuItem mnLogin, JMenuItem mnRegistro, JMenuItem mnRecuperarCuenta, JMenuItem mnAltaUsuario, JMenuItem mnBajaUsuario, JMenuItem mnConsultarUsuario, JMenuItem mnAyudaCrearUsuario, JMenuItem mnAyudaAccederSistema, JMenuItem mnAyudaOlvidarContrasena) {
        this.panelLogin = panelLogin;
        this.panelRegistro = panelRegistro;
        this.panelRecuperarCuenta = panelRecuperarCuenta;
        this.panelAltaUsuario = panelAltaUsuario;
        this.panelBajaUsuario = panelBajaUsuario;
        this.panelConsultarUsuario = panelConsultarUsuario;
        this.panelAyudaCrearUsuario = panelAyudaCrearUsuario;
        this.panelAyudaAccederSistema = panelAyudaAccederSistema;
        this.panelAyudaOlvidarContrasena = panelAyudaOlvidarContrasena;
        this.menuBar = menuBar;
        this.mnInicio = mnInicio;
        this.mnUsuarios = mnUsuarios;
        this.mnAyuda = mnAyuda;
        this.mnLogin = mnLogin;
        this.mnRegistro = mnRegistro;
        this.mnRecuperarCuenta = mnRecuperarCuenta;
        this.mnAltaUsuario = mnAltaUsuario;
        this.mnBajaUsuario = mnBajaUsuario;
        this.mnConsultarUsuario = mnConsultarUsuario;
        this.mnAyudaCrearUsuario = mnAyudaCrearUsuario;
        this.mnAyudaAccederSistema = mnAyudaAccederSistema;
        this.mnAyudaOlvidarContrasena = mnAyudaOlvidarContrasena;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Login")) {
            ocultarPaneles();
            panelLogin.setVisible(true);
        } else if (e.getActionCommand().equals("Registro")) {
            ocultarPaneles();
            panelRegistro.setVisible(true);
        } else if (e.getActionCommand().equals("Recuperación de cuenta")) {
            ocultarPaneles();
            panelRecuperarCuenta.setVisible(true);
        } else if (e.getActionCommand().equals("Alta")) {
            ocultarPaneles();
            panelAltaUsuario.setVisible(true);
        }else if (e.getActionCommand().equals("Baja")) {
            ocultarPaneles();
            panelBajaUsuario.setVisible(true);
        }else if (e.getActionCommand().equals("Consultar")) {
            ocultarPaneles();
            panelConsultarUsuario.setVisible(true);
        }else if (e.getActionCommand().equals("¿Cómo crear un usuario?")) {
            ocultarPaneles();
            panelAyudaCrearUsuario.setVisible(true);
        }else if (e.getActionCommand().equals("¿Cómo acceder al sistema?")) {
            ocultarPaneles();
            panelAyudaAccederSistema.setVisible(true);
        }else if (e.getActionCommand().equals("¿Qué pasa si olvidé mi contraseña?")) {
            ocultarPaneles();
            panelAyudaOlvidarContrasena.setVisible(true);
        }
    }
    
    private void ocultarPaneles() {
        panelLogin.setVisible(false);
        panelRegistro.setVisible(false);
        panelRecuperarCuenta.setVisible(false);
        panelAltaUsuario.setVisible(false);
        panelBajaUsuario.setVisible(false);
        panelConsultarUsuario.setVisible(false);
        panelAyudaCrearUsuario.setVisible(false);
        panelAyudaAccederSistema.setVisible(false);
        panelAyudaOlvidarContrasena.setVisible(false);
    }
}
