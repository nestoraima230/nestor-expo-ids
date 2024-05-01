import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Timer;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;


public class Restaurante {


    private JPanel menuInicioPanel;
    private JPanel panelContainer;
    private CardLayout cardLayout;
    private JFrame frame;
    private JPasswordField passwordField;
    private JTextField nombreRegistroField;
    private JTextField apellidosReigstroField;  
    private JTextField correoRegistroField;
    private JPasswordField contraseñaRegistro;
    private JPasswordField ccontraseñaField;
    private DefaultTableModel modelTablaPlatillos;
    private DefaultTableModel modelOrden;
    private JTable tablaOrden;
    private JTextField txtTota;
    private JLabel labelImagen;
    private JLabel lblNewLabel_9;
    private JPanel miCuentaPanel;
    private JTable tablaPlatillos;
    private JTextField txtNombrePlatillo;
    private JTextField txtDescripcionPlatillo;
    private JTextField txtCategoriaPlatilo;
    private JTextField txtPrecioPlatillo;
    private boolean usuarioAutenticado = false;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JPasswordField passwordField_3;
    private User usuarioActual;   
    private JLabel lblTotal;
    private JLabel lblTotalPlatillos;
    private JPanel registroPanel;
    private JTextField txtNombreCliente;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Restaurante window = new Restaurante();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Restaurante() {
        initialize();
        cardLayout.show(panelContainer, "menuInicio");
        usuarioActual = null;
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
    	
    	try {
    	    Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\font\\Blackboard Restaurant.otf")).deriveFont(12f);
    	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	    ge.registerFont(customFont);
    	} catch (Exception e) {
    	    e.printStackTrace();
    	    // JOptionPane.showMessageDialog(null, "Error al cargar la fuente personalizada: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    	}


        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout());

        //menuInicioPanel
        menuInicioPanel = new JPanel();
        menuInicioPanel.setBackground(new Color(34, 139, 34));
        menuInicioPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        menuInicioPanel.setLayout(null);
  
        Font customFont = new Font("Blackboard Restaurant", Font.PLAIN, 12); 
        JLabel tituloLabel = new JLabel("Bienvenido", SwingConstants.CENTER);
        tituloLabel.setBounds(208, 36, 455, 69);
        tituloLabel.setFont(customFont.deriveFont(Font.BOLD, 54));
        menuInicioPanel.add(tituloLabel);

        cardLayout = new CardLayout();
        panelContainer = new JPanel(cardLayout);
        panelContainer.add(menuInicioPanel, "menuInicio");
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(85, 107, 47));
        panel_1.setBounds(0, 0, 157, 539);
        menuInicioPanel.add(panel_1);
        panel_1.setLayout(null);
        
        lblNewLabel_9 = new JLabel("Mi Cuenta");
        lblNewLabel_9.setBounds(5, 5, 142, 50);
        panel_1.add(lblNewLabel_9);
        lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\icons8-user-50.png"));
        lblNewLabel_9.setFont(customFont.deriveFont(Font.BOLD, 18));
        
        JButton btnNewButton_2 = new RoundedButton("Cerrar sesión");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	if(usuarioAutenticado) {
                    int respuesta = JOptionPane.showConfirmDialog(frame, "¿Estás seguro de que deseas cerrar la sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        frame.dispose(); 
                    }           		
            	}

            }
        });

        btnNewButton_2.setForeground(Color.WHITE);
        btnNewButton_2.setBackground(Color.RED);
        btnNewButton_2.setBounds(10, 480, 114, 23);
        panel_1.add(btnNewButton_2);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(167, 459, 0, 10);
        menuInicioPanel.add(panel_2);
        panel_2.setLayout(null);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 100, 0));
        panel_3.setBounds(132, 428, 652, 111);
        menuInicioPanel.add(panel_3);
        panel_3.setLayout(null);
        
        String rutaImagen13 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\mail.png"; 
        ImageIcon icono13 = new ImageIcon(rutaImagen13);
        Image imagenEscalada13 = icono13.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado13 = new ImageIcon(imagenEscalada13);
        JLabel lblNewLabel_20 = new JLabel(iconoEscalado13);
        lblNewLabel_20.setForeground(Color.WHITE);
        lblNewLabel_20.setText("Esquina-9161@gmail.com");
        lblNewLabel_20.setBounds(44, 41, 184, 20);
        panel_3.add(lblNewLabel_20);
        
        String rutaImagen14 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\facebook.png"; 
        ImageIcon icono14 = new ImageIcon(rutaImagen14);
        Image imagenEscalada14 = icono14.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado14 = new ImageIcon(imagenEscalada14);
        JLabel lblNewLabel_19 = new JLabel(iconoEscalado14);
        lblNewLabel_19.setBounds(372, 60, 46, 20);
        panel_3.add(lblNewLabel_19);
        

        String rutaImagen15 = "C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\instagram.png"; 
        ImageIcon icono15 = new ImageIcon(rutaImagen15);
        Image imagenEscalada15 = icono15.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado15 = new ImageIcon(imagenEscalada15);
        JLabel lblNewLabel_19_1 = new JLabel(iconoEscalado15);
        lblNewLabel_19_1.setBounds(316, 60, 46, 20);
        panel_3.add(lblNewLabel_19_1);
        
        String rutaImagen16 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\twitter.png"; 
        ImageIcon icono16 = new ImageIcon(rutaImagen16);
        Image imagenEscalada16 = icono16.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado16 = new ImageIcon(imagenEscalada16);
        JLabel lblNewLabel_19_2 = new JLabel(iconoEscalado16);
        lblNewLabel_19_2.setBounds(428, 60, 46, 20);
        panel_3.add(lblNewLabel_19_2);
        
        JLabel lblNewLabel_21 = new JLabel("Siguenos:");
        lblNewLabel_21.setForeground(Color.WHITE);
        lblNewLabel_21.setBounds(332, 24, 104, 14);
        panel_3.add(lblNewLabel_21);
       
      
        String rutaImagen3 = "C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\8b96e3f0723c96f3f4bfeb467bb593ee-removebg-preview.png";
        ImageIcon icono3 = new ImageIcon(rutaImagen3);
        Image imagenEscalada3 = icono3.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado3 = new ImageIcon(imagenEscalada3);
        JLabel lblNewLabel_18_1 = new JLabel(iconoEscalado3);
        lblNewLabel_18_1.setBounds(547, 17, 151, 88);
        menuInicioPanel.add(lblNewLabel_18_1);
        
        JLabel lblNewLabel_18 = new JLabel("");
        lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\laesquina.png"));
        lblNewLabel_18.setBounds(240, 145, 498, 216);
        menuInicioPanel.add(lblNewLabel_18);

        panel.add(panelContainer, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuAcceso = new JMenu("Acceso/Salir");
        menuAcceso.setSelectedIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\vector-users-icon.jpg"));
        JMenu menuPlatillos = new JMenu("Platillos");
        JMenu menuOrdenes = new JMenu("Órdenes");

        JMenuItem loginMenuItem = new JMenuItem("Acceso (Login)");
        menuAcceso.add(loginMenuItem);
        JMenuItem RegistroMenuItem = new JMenuItem("Registro");
        menuAcceso.add(RegistroMenuItem);


        frame.setJMenuBar(menuBar);
        menuBar.add(menuAcceso);
        menuBar.add(menuPlatillos);
        menuBar.add(menuOrdenes);

        //loginPanel
        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(new Color(255, 0, 51));
        loginPanel.setLayout(null);

        loginPanel.setVisible(true);
        
        JLabel lblIniciarSesion = new JLabel("Iniciar Sesión");
        lblIniciarSesion.setForeground(Color.WHITE);
        lblIniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
        Font customFont2 = new Font("Blackboard Restaurant", Font.PLAIN, 34);
        lblIniciarSesion.setBounds(234, 21, 253, 111);
        lblIniciarSesion.setFont(customFont2.deriveFont(Font.BOLD, 34));
        loginPanel.add(lblIniciarSesion);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(224, 181, 300, 30);
        loginPanel.add(txtNombre);
        txtNombre.setColumns(10);

        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.setForeground(Color.WHITE);
        btnIniciarSesion.setBackground(new Color(255, 0, 51));
        btnIniciarSesion.setBounds(298, 352, 150, 38);
        btnIniciarSesion.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        loginPanel.add(btnIniciarSesion);
        

        btnIniciarSesion.addActionListener(e -> {
            String nombreUsuario = txtNombre.getText().trim();
            String contraseña = new String(passwordField.getPassword()).trim();

            if (!nombreUsuario.isEmpty() && !contraseña.isEmpty()) { 
                if (verificarUsuarioDesdeArchivo(nombreUsuario, contraseña)) {
                    JOptionPane.showMessageDialog(frame, "Inicio de sesión exitoso.");
                    usuarioAutenticado = true;
                    
                    cardLayout.show(panelContainer, "menuInicio");
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos.");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Por favor, Ingresa un nombre de usuario y una contraseña.");
            }
        });

        JButton btnRegistro = new JButton("Registrarse");
        btnRegistro.setForeground(Color.WHITE);
        btnRegistro.setBackground(new Color(255, 0, 51));
        btnRegistro.setBounds(298, 453, 150, 38);
        btnRegistro.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        loginPanel.add(btnRegistro);
        
        panelContainer.add(loginPanel, "loginPanel");
        
        Font customFont3 = new Font("Blackboard Restaurant", Font.PLAIN, 20);
        
        JLabel lblNewLabel = new JLabel("Ingresa tu nombre");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(customFont3.deriveFont(Font.PLAIN, 20)); 
        lblNewLabel.setBounds(285, 145, 161, 25);
        loginPanel.add(lblNewLabel);
        
        JLabel lblIngresaTuContrasea = new JLabel("Ingresa tu contraseña");
        lblIngresaTuContrasea.setForeground(Color.WHITE);
        lblIngresaTuContrasea.setFont(customFont3.deriveFont(Font.PLAIN, 20)); 
        lblIngresaTuContrasea.setBounds(261, 242, 226, 25);
        loginPanel.add(lblIngresaTuContrasea);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(224, 278, 300, 30);
        loginPanel.add(passwordField);
        
        JLabel lblNewLabel_1 = new JLabel("¿No tienes cuenta?, da click aqui");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(customFont3.deriveFont(Font.PLAIN, 20)); 
        lblNewLabel_1.setBounds(234, 412, 290, 25);
        loginPanel.add(lblNewLabel_1);
        
        miCuentaPanel = new JPanel();
        miCuentaPanel.setBackground(Color.ORANGE);
        panelContainer.add(miCuentaPanel, "miCuentaPanel");
        miCuentaPanel.setLayout(null);
        

        JLabel lblNewLabel_10 = new JLabel("Nombre");
        lblNewLabel_10.setBounds(47, 73, 102, 14);
        lblNewLabel_10.setFont(customFont.deriveFont(Font.PLAIN, 13)); 
        miCuentaPanel.add(lblNewLabel_10);
        
        JLabel lblNewLabel_11 = new JLabel("Apellidos");
        lblNewLabel_11.setBounds(47, 111, 90, 14);
        lblNewLabel_11.setFont(customFont.deriveFont(Font.PLAIN, 13)); 
        miCuentaPanel.add(lblNewLabel_11);
        
        JLabel lblNewLabel_12 = new JLabel("Correo electronico");
        lblNewLabel_12.setBounds(23, 147, 114, 14);
        lblNewLabel_12.setFont(customFont.deriveFont(Font.PLAIN, 13));        
        miCuentaPanel.add(lblNewLabel_12);
        
        textField_3 = new JTextField();
        textField_3.setBounds(153, 70, 142, 20);
        miCuentaPanel.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(147, 108, 154, 20);
        miCuentaPanel.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(147, 144, 148, 20);
        miCuentaPanel.add(textField_5);
        textField_5.setColumns(10);
        
        String rutaImagen12 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\R (1).png"; 
        ImageIcon icono12 = new ImageIcon(rutaImagen12);
        Image imagenEscalada12 = icono12.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado12 = new ImageIcon(imagenEscalada12);
        JLabel lblNewLabel_13 = new JLabel(iconoEscalado12);
        lblNewLabel_13.setBounds(505, 57, 219, 248);
        miCuentaPanel.add(lblNewLabel_13);
        
        JLabel lblNewLabel_14 = new JLabel("DATOS GENERALES");
        lblNewLabel_14.setBounds(50, 24, 193, 32);
        lblNewLabel_14.setFont(customFont.deriveFont(Font.PLAIN, 20));  
        miCuentaPanel.add(lblNewLabel_14);
        
        JLabel lblNewLabel_15 = new JLabel("PERFIL");
        lblNewLabel_15.setBounds(516, 24, 84, 26);
        lblNewLabel_15.setFont(customFont.deriveFont(Font.PLAIN, 20));  
        miCuentaPanel.add(lblNewLabel_15);
        
        JLabel lblNewLabel_16 = new JLabel("COMENTARIOS");
        lblNewLabel_16.setBounds(47, 314, 154, 32);
        lblNewLabel_16.setFont(customFont.deriveFont(Font.PLAIN, 20));  
        miCuentaPanel.add(lblNewLabel_16);
        
        JTextPane textPane = new JTextPane();
        textPane.setBounds(47, 379, 388, 118);
        miCuentaPanel.add(textPane);
        
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(435, 379, 17, 118);
        miCuentaPanel.add(scrollBar);
        
        JLabel lblNewLabel_17 = new JLabel("Contraseña");
        lblNewLabel_17.setBounds(33, 185, 92, 14);
        lblNewLabel_17.setFont(customFont.deriveFont(Font.PLAIN, 13));  
        miCuentaPanel.add(lblNewLabel_17);
        
        passwordField_3 = new JPasswordField();
        passwordField_3.setBounds(147, 182, 148, 20);
        miCuentaPanel.add(passwordField_3);
        
        String rutaImagen8 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\edit.png"; 
        ImageIcon icono8 = new ImageIcon(rutaImagen8);
        Image imagenEscalada8 = icono8.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado8 = new ImageIcon(imagenEscalada8);
        JButton btnNewButton_3= new JButton("Editar", iconoEscalado8);
        btnNewButton_3.setBackground(Color.ORANGE);
        btnNewButton_3.setBounds(505, 363, 114, 23);
        btnNewButton_3.setFont(customFont.deriveFont(Font.PLAIN, 13));  
        miCuentaPanel.add(btnNewButton_3);

        
        String rutaImagen = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\diskette.png"; 
        ImageIcon icono = new ImageIcon(rutaImagen);
        Image imagenEscalada = icono.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        JButton btnNewButton_4 = new JButton("Guardar", iconoEscalado);
        btnNewButton_4.setBackground(Color.ORANGE);
        btnNewButton_4.setFont(customFont.deriveFont(Font.PLAIN, 13)); 

        btnNewButton_4.setBounds(520, 405, 121, 23);
        miCuentaPanel.add(btnNewButton_4);
        
        String rutaImagen5 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\close.png"; 
        ImageIcon icono5 = new ImageIcon(rutaImagen5);
        Image imagenEscalada5 = icono5.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado5 = new ImageIcon(imagenEscalada5);
        JButton btnNewButton_5 = new JButton("Eliminar", iconoEscalado5);
        btnNewButton_5.setForeground(Color.WHITE);
        btnNewButton_5.setBackground(Color.RED);
        btnNewButton_5.setFont(customFont.deriveFont(Font.PLAIN, 13)); 
        btnNewButton_5.setBounds(520, 448, 121, 23);
        miCuentaPanel.add(btnNewButton_5);

        lblNewLabel_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (usuarioActual != null) {
                    textField_3.setText(usuarioActual.getNombreUsuario());
                    textField_4.setText(usuarioActual.getApellidos());
                    textField_5.setText(usuarioActual.getCorreoElectronico());
                    passwordField_3.setText(usuarioActual.getContraseña());
                    cardLayout.show(panelContainer, "miCuentaPanel");
                } else {
                    JOptionPane.showMessageDialog(frame, "Debes iniciar sesión o registrarte para acceder a tu cuenta.");
                }
            }
        });

        
        //registroPanel
        registroPanel = new JPanel();
        registroPanel.setBackground(Color.YELLOW);
        panelContainer.add(registroPanel, "registroPanel");
        registroPanel.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Registro");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        Font customFont4 = new Font("Blackboard Restaurant", Font.PLAIN, 34);
        Font customFontBold = customFont4.deriveFont(Font.BOLD, 34);
        lblNewLabel_2.setFont(customFontBold);    //
        lblNewLabel_2.setBounds(291, 39, 167, 46);
        registroPanel.add(lblNewLabel_2);
        
        nombreRegistroField = new JTextField();
        nombreRegistroField.setBounds(119, 139, 180, 20);
        registroPanel.add(nombreRegistroField);
        nombreRegistroField.setColumns(10);
        
        apellidosReigstroField = new JTextField();
        apellidosReigstroField.setColumns(10);
        apellidosReigstroField.setBounds(427, 139, 180, 20);
        registroPanel.add(apellidosReigstroField);
        
        correoRegistroField = new JTextField();
        correoRegistroField.setBounds(280, 203, 193, 20);
        registroPanel.add(correoRegistroField);
        correoRegistroField.setColumns(10);
        
        contraseñaRegistro = new JPasswordField();
        contraseñaRegistro.setBounds(280, 266, 193, 20);
        registroPanel.add(contraseñaRegistro);
        
        ccontraseñaField = new JPasswordField();
        ccontraseñaField.setBounds(280, 326, 193, 20);
        registroPanel.add(ccontraseñaField);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones");
        chckbxNewCheckBox.setBackground(Color.YELLOW);
        chckbxNewCheckBox.setForeground(Color.BLACK);
        chckbxNewCheckBox.setFont(customFont4.deriveFont(Font.PLAIN, 15));
        
        chckbxNewCheckBox.setBounds(280, 370, 246, 23);
        registroPanel.add(chckbxNewCheckBox);
        
        JButton btnRegistro1Button = new JButton("Registro");                
        btnRegistro1Button.setBackground(Color.YELLOW);
        
        btnRegistro1Button.addActionListener(e -> {
            String nombre = nombreRegistroField.getText();
            String apellidos = apellidosReigstroField.getText();
            String correo = correoRegistroField.getText();
            String contraseña = new String(contraseñaRegistro.getPassword());
            String confirmarContraseña = new String(ccontraseñaField.getPassword());

            if (!nombre.isEmpty() && !apellidos.isEmpty() && !correo.isEmpty() && !contraseña.isEmpty() && !confirmarContraseña.isEmpty()) {
                if (contraseña.equals(confirmarContraseña)) {
                    User nuevoUsuario = new User(nombre, apellidos, correo, contraseña);
                    if (guardarUsuarioEnArchivo(nuevoUsuario)) {
                        JOptionPane.showMessageDialog(frame, "Usuario registrado exitosamente.");
                        usuarioAutenticado = true;
                        cardLayout.show(panelContainer, "menuInicio");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Error al registrar usuario. Por favor, inténtalo de nuevo.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Las contraseñas no coinciden. Por favor, inténtalo de nuevo.");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Por favor, completa todos los campos.");
            }
        });


        btnRegistro1Button.setFont(customFont4.deriveFont(Font.PLAIN, 15)); 
        btnRegistro1Button.setBounds(291, 406, 111, 23);
        registroPanel.add(btnRegistro1Button);
        
        JButton btnIniciarSesion1 = new JButton("Iniciar sesion");       
        btnIniciarSesion1.setBackground(Color.YELLOW);
        btnIniciarSesion1.setFont(customFont4.deriveFont(Font.PLAIN, 15)); 
        btnIniciarSesion1.addActionListener(e -> {
            cardLayout.show(panelContainer, "loginPanel");
        });
        btnIniciarSesion1.setBounds(304, 475, 129, 23);
        registroPanel.add(btnIniciarSesion1);
        
        JLabel lblNewLabel_3 = new JLabel("Nombre");
        lblNewLabel_3.setFont(customFont4.deriveFont(Font.PLAIN, 15)); 
        lblNewLabel_3.setBounds(156, 114, 77, 14);
        registroPanel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Apellidos");
        lblNewLabel_4.setFont(customFont4.deriveFont(Font.PLAIN, 15)); 
        lblNewLabel_4.setBounds(427, 114, 180, 14);
        registroPanel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Correo electrónico");
        lblNewLabel_5.setFont(customFont4.deriveFont(Font.PLAIN, 15)); 
        lblNewLabel_5.setBounds(319, 180, 114, 14);
        registroPanel.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Contraseña");
        lblNewLabel_6.setFont(customFont4.deriveFont(Font.PLAIN, 15)); 
        lblNewLabel_6.setBounds(319, 246, 83, 14);
        registroPanel.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Confirmar contraseña");
        lblNewLabel_7.setFont(customFont4.deriveFont(Font.PLAIN, 15)); 
        lblNewLabel_7.setBounds(302, 301, 143, 14);
        registroPanel.add(lblNewLabel_7);

        
        JLabel lblNewLabel_8 = new JLabel("¿Ya tienes cuenta?, da click aquí");
        lblNewLabel_8.setFont(customFont4.deriveFont(Font.PLAIN, 15)); 
        lblNewLabel_8.setBounds(278, 450, 195, 14);
        registroPanel.add(lblNewLabel_8);
        
        btnRegistro.addActionListener(e -> {
            cardLayout.show(panelContainer, "registroPanel");
        });

        JPanel platillosPanel = new JPanel(new BorderLayout());
        panelContainer.add(platillosPanel, "platillosPanel");
        
        modelTablaPlatillos = new DefaultTableModel(new Object[]{"Nombre", "Descripción", "Categoría", "Precio", "Imagen"}, 0);
        tablaPlatillos = new JTable(modelTablaPlatillos);
        tablaPlatillos.setForeground(Color.WHITE);
        tablaPlatillos.setBackground(new Color(0, 153, 51));
        platillosPanel.add(new JScrollPane(tablaPlatillos), BorderLayout.CENTER);
        
        modelTablaPlatillos.addColumn("Seleccionar");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i = 0; i < modelTablaPlatillos.getRowCount(); i++) {
            JRadioButton radioButton = new JRadioButton();
            buttonGroup.add(radioButton);
            modelTablaPlatillos.setValueAt(radioButton, i, modelTablaPlatillos.getColumnCount() - 1);        
        }

        JPanel panelAgregarPlatillo = new JPanel(new GridLayout(6, 2, 10, 10));
        panelAgregarPlatillo.setBackground(new Color(0, 153, 51));

        txtNombrePlatillo = new JTextField();
        txtDescripcionPlatillo = new JTextField();
        txtCategoriaPlatilo = new JTextField();
        txtPrecioPlatillo = new JTextField();

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setForeground(Color.WHITE);
        lblNombre.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelAgregarPlatillo.add(lblNombre);
        
        panelAgregarPlatillo.add(txtNombrePlatillo);
        
        JLabel lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setForeground(Color.WHITE);
        lblDescripcion.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelAgregarPlatillo.add(lblDescripcion);
        
        panelAgregarPlatillo.add(txtDescripcionPlatillo);
        
        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setForeground(Color.WHITE);
        lblCategoria.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelAgregarPlatillo.add(lblCategoria);
        
        panelAgregarPlatillo.add(txtCategoriaPlatilo);
        
        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setForeground(Color.WHITE);
        lblPrecio.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelAgregarPlatillo.add(lblPrecio);
        
        panelAgregarPlatillo.add(txtPrecioPlatillo);

        JButton btnSeleccionarImagen = new JButton("Seleccionar Imagen");
        btnSeleccionarImagen.setForeground(Color.WHITE);
        btnSeleccionarImagen.setBackground(new Color(0, 153, 51));
        btnSeleccionarImagen.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelAgregarPlatillo.add(btnSeleccionarImagen);
        
        JLabel lblImagen = new JLabel("Imagen (opcional)");
        lblImagen.setForeground(Color.WHITE);
        lblImagen.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelAgregarPlatillo.add(lblImagen);
        
        platillosPanel.add(panelAgregarPlatillo, BorderLayout.NORTH);

        JPanel panelBotones1 = new JPanel(new FlowLayout());
        panelBotones1.setBackground(new Color(0, 153, 0));
        String rutaImagen6 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\plus.png"; 
        ImageIcon icono6 = new ImageIcon(rutaImagen6);
        Image imagenEscalada6 = icono6.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado6 = new ImageIcon(imagenEscalada6);
        JButton btnAgregar = new JButton("Agregar", iconoEscalado6);
        btnAgregar.setBackground(new Color(0, 153, 0));
        btnAgregar.setForeground(Color.WHITE);
        btnAgregar.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelBotones1.add(btnAgregar);
        String rutaImagen9 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\edit.png"; 
        ImageIcon icono9 = new ImageIcon(rutaImagen9);
        Image imagenEscalada9 = icono9.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado9 = new ImageIcon(imagenEscalada9);
        JButton btnEditar= new JButton("Editar Platillo", iconoEscalado9);        
        btnEditar.setBackground(new Color(0, 153, 0));
        btnEditar.setForeground(Color.WHITE);
        btnEditar.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelBotones1.add(btnEditar);
        String rutaImagen4 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\close.png"; 
        ImageIcon icono4 = new ImageIcon(rutaImagen4);
        Image imagenEscalada4 = icono4.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado4 = new ImageIcon(imagenEscalada4);
        JButton btnEliminar = new JButton("Eliminar",iconoEscalado4);
        btnEliminar.setBackground(Color.RED);
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        panelBotones1.add(btnEliminar);

        panelBotones1.add(btnAgregar);
        panelBotones1.add(btnEditar);
        panelBotones1.add(btnEliminar);

        platillosPanel.add(panelBotones1, BorderLayout.SOUTH);

        btnAgregar.addActionListener(e -> agregarPlatillo());
        btnEditar.addActionListener(e -> editarPlatillo());
        btnEliminar.addActionListener(e -> eliminarPlatillo());
        btnSeleccionarImagen.addActionListener(e -> seleccionarRutaImagen());

        
        JMenuItem platillosMenuItem = new JMenuItem("Platillos");
        menuPlatillos.add(platillosMenuItem);
        platillosMenuItem.addActionListener(e -> {
            if (usuarioAutenticado) {
                cardLayout.show(panelContainer, "platillosPanel");
            } else {
                JOptionPane.showMessageDialog(frame, "Debes iniciar sesión o registrarte para acceder a los platillos.");
            }
        });

        JPanel panelOrden = new JPanel(new BorderLayout());
        panelContainer.add(panelOrden, "panelOrden");
        

        modelOrden = new DefaultTableModel(new Object[]{"Platillo", "Cantidad", "Precio", "Total"}, 0);
        tablaOrden = new JTable(modelOrden);
        tablaOrden.setForeground(Color.WHITE);
        tablaOrden.setBackground(new Color(204, 153, 51));
        panelOrden.add(new JScrollPane(tablaOrden), BorderLayout.CENTER);
        
        modelOrden.addColumn("Seleccionar");
        ButtonGroup buttonGroup1 = new ButtonGroup();

        for (int i = 0; i < modelOrden.getRowCount(); i++) {
            JRadioButton radioButton = new JRadioButton();
            buttonGroup1.add(radioButton);
            modelOrden.setValueAt(radioButton, i, modelOrden.getColumnCount() - 1);
        }
        
        JPanel datosa = new JPanel(new GridLayout(3, 2, 10, 10));
        datosa.setBackground(new Color(204, 153, 51));
        txtNombreCliente = new JTextField();
    
        lblTotal = new JLabel("Total: $0.00");
        lblTotal.setForeground(Color.WHITE);
        lblTotal.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        datosa.add(lblTotal);

        lblTotalPlatillos = new JLabel("Total de platillos: 0");
        lblTotalPlatillos.setForeground(Color.WHITE);
        lblTotalPlatillos.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        datosa.add(lblTotalPlatillos);

        JLabel lblNombreCliente = new JLabel("Nombre del cliente:");
        lblNombreCliente.setForeground(Color.WHITE);
        lblNombreCliente.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        datosa.add(lblNombreCliente);
        
        datosa.add(txtNombreCliente);
        panelOrden.add(datosa, BorderLayout.NORTH);

        JPanel botonesg = new JPanel(new FlowLayout());
        botonesg.setBackground(new Color(204, 153, 0));
        String rutaImagen7 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\plus.png"; 
        ImageIcon icono7 = new ImageIcon(rutaImagen7);
        Image imagenEscalada7 = icono7.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado7 = new ImageIcon(imagenEscalada7);
        JButton btnAgregarPlatilloOrden = new JButton("Agregar Platillo", iconoEscalado7);
        btnAgregarPlatilloOrden.setBackground(new Color(204, 153, 0));
        btnAgregarPlatilloOrden.setForeground(Color.WHITE);
        btnAgregarPlatilloOrden.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        botonesg.add(btnAgregarPlatilloOrden);
        
        String rutaImagen10 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\edit.png"; 
        ImageIcon icono10 = new ImageIcon(rutaImagen10);
        Image imagenEscalada10 = icono10.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado10 = new ImageIcon(imagenEscalada10);
        JButton btnEditarPlatilloOrden= new JButton("Editar platillo", iconoEscalado10);
        btnEditarPlatilloOrden.setForeground(Color.WHITE);
        btnEditarPlatilloOrden.setBackground(new Color(204, 153, 0));
        btnEditarPlatilloOrden.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        botonesg.add(btnEditarPlatilloOrden);
        String rutaImagen1 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\close.png"; 
        ImageIcon icono1 = new ImageIcon(rutaImagen1);
        Image imagenEscalada1 = icono1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado1 = new ImageIcon(imagenEscalada1);
        JButton btnEliminarPlatilloOrden1 = new JButton("Eliminar Platillo", iconoEscalado1);
        btnEliminarPlatilloOrden1.setForeground(Color.WHITE);
        btnEliminarPlatilloOrden1.setBackground(Color.RED);
        btnEliminarPlatilloOrden1.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        botonesg.add(btnAgregarPlatilloOrden);
        botonesg.add(btnEditarPlatilloOrden);
        botonesg.add(btnEliminarPlatilloOrden1);
        panelOrden.add(botonesg, BorderLayout.SOUTH);

     
        btnAgregarPlatilloOrden.addActionListener(e -> agregarPlatilloOrden());
        btnEditarPlatilloOrden.addActionListener(e -> editarPlatilloOrden());
        btnEliminarPlatilloOrden1.addActionListener(e -> eliminarPlatilloOrden());
 
        
        String rutaImagen11 = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\printer.png"; 
        ImageIcon icono11 = new ImageIcon(rutaImagen11);
        Image imagenEscalada11 = icono11.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado11 = new ImageIcon(imagenEscalada11);
        JButton btnImprimirComanda= new JButton("Imprimir Comanda", iconoEscalado11);
        btnImprimirComanda.setForeground(Color.WHITE);
        btnImprimirComanda.setBackground(new Color(204, 153, 0));
        btnImprimirComanda.setFont(customFont.deriveFont(Font.PLAIN, 15)); 
        botonesg.add(btnImprimirComanda);

        btnImprimirComanda.addActionListener(e -> {
            try {
                FileWriter writer = new FileWriter("comanda.txt");
                writer.write("Comanda\n\n");
                
                String nombreCliente = txtNombreCliente.getText();
                writer.write("Cliente: " + nombreCliente + "\n\n");
                
                for (int i = 0; i < modelOrden.getRowCount(); i++) {
                    String platillo = (String) modelOrden.getValueAt(i, 0);
                    int cantidad = (int) modelOrden.getValueAt(i, 1);
                    double precio = (double) modelOrden.getValueAt(i, 2);
                    double total = (double) modelOrden.getValueAt(i, 3);
                    writer.write(String.format("%-20s x %2d $%6.2f $%6.2f\n", platillo, cantidad, precio, total));
                }
                
                writer.write("\nTotal: $" + lblTotal.getText().substring(7));
                writer.close();
                
                JOptionPane.showMessageDialog(frame, "Comanda guardada en el archivo comanda.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error al guardar la comanda: " + ex.getMessage());
            }
        });

        
        // Menu de Ordenes
        JMenuItem ordenMenuItem = new JMenuItem("Orden");
        menuOrdenes.add(ordenMenuItem);
        ordenMenuItem.addActionListener(e -> {
            if (usuarioAutenticado) {
                modelOrden.setRowCount(0); 
                for (int i = 0; i < modelTablaPlatillos.getRowCount(); i++) {
                    String nombrePlatillo = (String) modelTablaPlatillos.getValueAt(i, 0);
                    double precioPlatillo = (double) modelTablaPlatillos.getValueAt(i, 3);
                    modelOrden.addRow(new Object[]{nombrePlatillo, 0, precioPlatillo, 0.0});
                }
                cardLayout.show(panelContainer, "panelOrden");
            } else {
                JOptionPane.showMessageDialog(frame, "Debes iniciar sesión o registrarte para acceder a las órdenes.");
            }
        });

        loginMenuItem.addActionListener(e -> {
            cardLayout.show(panelContainer, "loginPanel");
        });

        RegistroMenuItem.addActionListener(e -> {
            cardLayout.show(panelContainer, "registroPanel");
        });
    }
    


    private boolean guardarUsuarioEnArchivo(User usuario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            String linea = String.format("%s,%s,%s,%s\n", usuario.getNombreUsuario(), usuario.getApellidos(), usuario.getCorreoElectronico(), usuario.getContraseña());
            writer.write(linea);
            writer.flush(); 
            return true;
        } catch (IOException ex) {
            System.err.println("Error al guardar usuario en archivo: " + ex.getMessage());
            return false;
        }
    }

    private boolean verificarUsuarioDesdeArchivo(String nombreUsuario, String contraseña) {
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    String nombre = partes[0].trim();
                    String contraseñaGuardada = contraseñaHash(partes[1].trim());
                    String correo = partes[2].trim();
                    String apellidos = partes[3].trim();

                    if (nombre.equals(nombreUsuario) && contraseñaGuardada.equals(contraseñaHash(contraseña))) {
                        usuarioActual = new User(nombre, partes[1], correo, apellidos);
                        return true;
                    }
                } else {
                    System.err.println("Error: formato de linea incorrecto en archivo usuarios.txt: " + linea);
                }
            }
        } catch (IOException ex) {
            System.err.println("Error al verificar usuario en archivo: " + ex.getMessage());
        }
        return false;
    }


    private String contraseñaHash(String contraseña) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(contraseña.getBytes(StandardCharsets.UTF_8));
            // Convertir el hash byte a representación hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }


    //TIENE ERRORES

    private void agregarPlatillo() {
        String nombre = txtNombrePlatillo.getText().trim();
        String descripcion = txtDescripcionPlatillo.getText().trim();
        String categoria = txtCategoriaPlatilo.getText().trim();
        double precio = 0.0;

        if (!nombre.isEmpty() && !descripcion.isEmpty() && !categoria.isEmpty()) {
            try {
                precio = Double.parseDouble(txtPrecioPlatillo.getText().trim());

                modelTablaPlatillos.addRow(new Object[]{nombre, descripcion, categoria, precio});
                limpiarCamposNuevoPlatillo();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "El precio ingresado no es válido.");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Por favor, completa todos los campos obligatorios.");
        }
    }

   

    private void editarPlatillo() {
        int filaSeleccionada = tablaPlatillos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String nombre = txtNombrePlatillo.getText().trim();
            String descripcion = txtDescripcionPlatillo.getText().trim();
            String categoria = txtCategoriaPlatilo.getText().trim();
            double precio = 0.0;

            if (!nombre.isEmpty() && !descripcion.isEmpty() && !categoria.isEmpty()) {
                try {
                    precio = Double.parseDouble(txtPrecioPlatillo.getText().trim());
                    modelTablaPlatillos.setValueAt(nombre, filaSeleccionada, 0);
                    modelTablaPlatillos.setValueAt(descripcion, filaSeleccionada, 1);
                    modelTablaPlatillos.setValueAt(categoria, filaSeleccionada, 2);
                    modelTablaPlatillos.setValueAt(precio, filaSeleccionada, 3);
                    limpiarCamposNuevoPlatillo();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "El precio ingresado no es válido.");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Por favor, completa todos los campos obligatorios.");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Selecciona un platillo para editar.");
        }
    }


    private void eliminarPlatillo() {
        int filaSeleccionada = tablaPlatillos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String nombrePlatillo = (String) modelTablaPlatillos.getValueAt(filaSeleccionada, 0);
            String descripcionPlatillo = (String) modelTablaPlatillos.getValueAt(filaSeleccionada, 1);

            modelTablaPlatillos.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(frame, "El platillo \"" + nombrePlatillo + "\" (Descripción: " + descripcionPlatillo + ") ha sido eliminado.");
        } else {
            JOptionPane.showMessageDialog(frame, "Selecciona un platillo para eliminar.");
        }
    }

    private String seleccionarRutaImagen() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtroImagenes = new FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "gif");
        fileChooser.setFileFilter(filtroImagenes);

        int respuesta = fileChooser.showOpenDialog(frame);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            return archivoSeleccionado.getAbsolutePath();
        }
        return null;
    }
    
    //TIENE ERRORES
    private void agregarPlatilloOrden() {
        int filaSeleccionada = tablaPlatillos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            JRadioButton radioButton = (JRadioButton) tablaPlatillos.getValueAt(filaSeleccionada, modelTablaPlatillos.getColumnCount() - 1);
            if (radioButton.isSelected()) {
                String nombrePlatillo = (String) tablaPlatillos.getValueAt(filaSeleccionada, 0);
                double precioPlatillo = (double) tablaPlatillos.getValueAt(filaSeleccionada, 3);

                boolean existeOrden = false;
                for (int i = 0; i < modelOrden.getRowCount(); i++) {
                    if (modelOrden.getValueAt(i, 0).equals(nombrePlatillo)) {
                        int cantidadActual = (int) modelOrden.getValueAt(i, 1);
                        modelOrden.setValueAt(cantidadActual + 1, i, 1);
                        modelOrden.setValueAt((cantidadActual + 1) * precioPlatillo, i, 3);
                        existeOrden = true;
                        break;
                    }
                }

                if (!existeOrden) {
                    modelOrden.addRow(new Object[]{nombrePlatillo, 1, precioPlatillo, precioPlatillo});
                }

                actualizarTotal();

                guardarPlatilloEnArchivo(txtNombreCliente.getText(), nombrePlatillo, precioPlatillo);

                JOptionPane.showMessageDialog(frame, "El platillo \"" + nombrePlatillo + "\" ha sido agregado a la orden.");
            } else {
                JOptionPane.showMessageDialog(frame, "Selecciona un platillo para agregar a la orden.");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Selecciona un platillo para agregar a la orden.");
        }
    }

    

    
    private void editarPlatilloOrden() {
        int filaSeleccionada = tablaOrden.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String ingresarCantidad = JOptionPane.showInputDialog("Ingresa la nueva cantidad:");

            if (ingresarCantidad != null && !ingresarCantidad.isEmpty()) {
                try {
                    int cantidad = Integer.parseInt(ingresarCantidad);
                    double precioUnitario = (double) modelOrden.getValueAt(filaSeleccionada, 2);

                    modelOrden.setValueAt(cantidad, filaSeleccionada, 1);
                    modelOrden.setValueAt(cantidad * precioUnitario, filaSeleccionada, 3);

                    actualizarTotal();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingresa una cantidad válida.");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Operación cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Selecciona un platillo de la orden para editar.");
        }
    }

    private void eliminarPlatilloOrden() {
        int filaSeleccionada = tablaOrden.getSelectedRow();
        if (filaSeleccionada >= 0) {
            JCheckBox checkBox = (JCheckBox) modelOrden.getValueAt(filaSeleccionada, modelOrden.getColumnCount() - 1);
            if (checkBox.isSelected()) {
                String nombrePlatillo = (String) modelOrden.getValueAt(filaSeleccionada, 0);
                modelOrden.removeRow(filaSeleccionada);
                actualizarTotal();
                eliminarPlatilloDeArchivo(nombrePlatillo);
                JOptionPane.showMessageDialog(frame, "El platillo \"" + nombrePlatillo + "\" ha sido eliminado de la orden.");
            } else {
                JOptionPane.showMessageDialog(frame, "Selecciona un platillo de la orden para eliminar.");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Selecciona un platillo de la orden para eliminar.");
        }
    }

    private void eliminarPlatilloDeArchivo(String nombrePlatillo) {
        try {
            File file = new File("Comandas.txt");
            File tempFile = new File("temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (!parts[0].equals(nombrePlatillo)) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();
            file.delete();
            tempFile.renameTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void guardarPlatilloEnArchivo(String nombreUsuario, String nombrePlatillo, double precioPlatillo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Comandas.txt", true))) {
            writer.write(nombreUsuario + "," + nombrePlatillo + "," + precioPlatillo);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private void actualizarTotal() {
        double total = 0;
        int totalPlatillos = 0;

        for (int i = 0; i < modelOrden.getRowCount(); i++) {
            int cantidad = (int) modelOrden.getValueAt(i, 1);
            double precio = (double) modelOrden.getValueAt(i, 2);
            total += cantidad * precio;
            totalPlatillos += cantidad;
        }

        lblTotal.setText("Total: $" + String.format("%.2f", total));
        lblTotalPlatillos.setText("Total de platillos: " + totalPlatillos);
    }
    
    private void limpiarCamposNuevoPlatillo() {
        txtNombrePlatillo.setText("");
        txtDescripcionPlatillo.setText("");
        txtCategoriaPlatilo.setText("");
        txtPrecioPlatillo.setText("");
    }
}
