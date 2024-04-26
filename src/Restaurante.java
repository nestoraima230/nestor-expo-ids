import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;


public class Restaurante {

    private JPanel menuInicioPanel;
    private JPanel panelContainer;
    private CardLayout cardLayout;
    private JFrame frame;
    private JPasswordField passwordField;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JPasswordField passwordField_1;
    private JPasswordField passwordField_2;
    private DefaultTableModel modelTablaPlatillos;

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
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout());

        menuInicioPanel = new JPanel();
        menuInicioPanel.setLayout(new BorderLayout());
        menuInicioPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel tituloLabel = new JLabel("Bienvenido al Sistema de Restaurante", SwingConstants.CENTER);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        menuInicioPanel.add(tituloLabel, BorderLayout.NORTH);

        cardLayout = new CardLayout();
        panelContainer = new JPanel(cardLayout);
        panelContainer.add(menuInicioPanel, "menuInicio");

        panel.add(panelContainer, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuAcceso = new JMenu("Acceso/Salir");
        JMenu menuPlatillos = new JMenu("Platillos");
        JMenu menuOrdenes = new JMenu("Órdenes");

        JMenuItem loginMenuItem = new JMenuItem("Acceso (Login)");
        menuAcceso.add(loginMenuItem);
        JMenuItem logoutMenuItem = new JMenuItem("Salir (Logout)");
        menuAcceso.add(logoutMenuItem);
        JMenuItem RegistroMenuItem = new JMenuItem("Registro");
        menuAcceso.add(RegistroMenuItem);


        frame.setJMenuBar(menuBar);
        menuBar.add(menuAcceso);
        menuBar.add(menuPlatillos);
        menuBar.add(menuOrdenes);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);

        JLabel lblIniciarSesion = new JLabel("Iniciar Sesión");
        lblIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblIniciarSesion.setBounds(284, 23, 201, 88);
        loginPanel.add(lblIniciarSesion);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(224, 181, 300, 30);
        loginPanel.add(txtNombre);
        txtNombre.setColumns(10);

        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.setBounds(298, 355, 150, 30);
        loginPanel.add(btnIniciarSesion);

        JButton btnRegistro = new JButton("Registrarse");
        btnRegistro.setBounds(298, 453, 150, 30);
        loginPanel.add(btnRegistro);

        panelContainer.add(loginPanel, "loginPanel");
        
        JLabel lblNewLabel = new JLabel("Ingresa tu nombre");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel.setBounds(285, 145, 161, 25);
        loginPanel.add(lblNewLabel);
        
        JLabel lblIngresaTuContrasea = new JLabel("Ingresa tu contraseña");
        lblIngresaTuContrasea.setFont(new Font("Arial", Font.PLAIN, 12));
        lblIngresaTuContrasea.setBounds(284, 242, 161, 25);
        loginPanel.add(lblIngresaTuContrasea);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(224, 278, 300, 30);
        loginPanel.add(passwordField);
        
        JLabel lblNewLabel_1 = new JLabel("¿No tienes cuenta?, da click aqui");
        lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
        lblNewLabel_1.setBounds(275, 412, 186, 25);
        loginPanel.add(lblNewLabel_1);

        JPanel logoutPanel = new JPanel(new BorderLayout());
        JLabel tituloLabel3 = new JLabel("Logout", SwingConstants.CENTER);
        tituloLabel3.setFont(new Font("Arial", Font.BOLD, 24));
        logoutPanel.add(tituloLabel3);

        panelContainer.add(logoutPanel, "logoutPanel");
        
        JPanel registroPanel = new JPanel();
        panelContainer.add(registroPanel, "registroPanel");
        registroPanel.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Registro");
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
        lblNewLabel_2.setBounds(319, 41, 126, 46);
        registroPanel.add(lblNewLabel_2);
        
        textField = new JTextField();
        textField.setBounds(119, 139, 180, 20);
        registroPanel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(427, 139, 180, 20);
        registroPanel.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setBounds(280, 203, 193, 20);
        registroPanel.add(textField_2);
        textField_2.setColumns(10);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(280, 266, 193, 20);
        registroPanel.add(passwordField_1);
        
        passwordField_2 = new JPasswordField();
        passwordField_2.setBounds(280, 326, 193, 20);
        registroPanel.add(passwordField_2);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones");
        chckbxNewCheckBox.setBounds(280, 370, 246, 23);
        registroPanel.add(chckbxNewCheckBox);
        
        JButton btnNewButton = new JButton("Registro");
        btnNewButton.setBounds(291, 406, 89, 23);
        registroPanel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Iniciar sesion");
        btnNewButton_1.setBounds(304, 475, 129, 23);
        registroPanel.add(btnNewButton_1);
        
        JLabel lblNewLabel_3 = new JLabel("Nombre");
        lblNewLabel_3.setBounds(156, 114, 77, 14);
        registroPanel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Apellidos");
        lblNewLabel_4.setBounds(474, 114, 133, 14);
        registroPanel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Correo electronico");
        lblNewLabel_5.setBounds(319, 180, 114, 14);
        registroPanel.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Contraseña");
        lblNewLabel_6.setBounds(319, 246, 83, 14);
        registroPanel.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("Confirmar contraseña");
        lblNewLabel_7.setBounds(319, 307, 114, 14);
        registroPanel.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("¿Ya tienes cuenta?, da click aqui");
        lblNewLabel_8.setBounds(278, 450, 195, 14);
        registroPanel.add(lblNewLabel_8);

        JPanel panelImagenesPlatillos = new JPanel(new GridLayout(0, 3, 10, 10)); // GridLayout con 3 columnas y espacio entre celdas
        panelImagenesPlatillos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Borde interno

        // Agrega las imágenes de los platillos al panel
        JLabel labelImagen1 = new JLabel(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\check.png"));
        labelImagen1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                agregarPlatilloATabla("Platillo 1", 7.99);
            }
        });
        panelImagenesPlatillos.add(labelImagen1);

        JLabel labelImagen2 = new JLabel(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\check.png"));
        labelImagen2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                agregarPlatilloATabla("Platillo 2", 9.99);
            }
        });
        panelImagenesPlatillos.add(labelImagen2);

        // Panel para mostrar la tabla de platillos
        JPanel panelTablaPlatillos = new JPanel(new BorderLayout());
        modelTablaPlatillos = new DefaultTableModel(new Object[]{"Platillo", "Cantidad", "Precio"}, 0);
        JTable tablaPlatillos = new JTable(modelTablaPlatillos);
        panelTablaPlatillos.add(new JScrollPane(tablaPlatillos), BorderLayout.CENTER);

        // Panel principal que contiene los paneles de imágenes y tabla
        JPanel platillosPanel = new JPanel(new BorderLayout());
        platillosPanel.add(panelImagenesPlatillos, BorderLayout.CENTER);
        platillosPanel.add(panelTablaPlatillos, BorderLayout.SOUTH);

        // Agregar el panel principal al contenedor principal
        panelContainer.add(platillosPanel, "platillosPanel");

        // Agregar elementos de menú
        JMenuItem platillosMenuItem = new JMenuItem("Platillos");
        menuPlatillos.add(platillosMenuItem);
        platillosMenuItem.addActionListener(e -> {
            cardLayout.show(panelContainer, "platillosPanel");
        });

        loginMenuItem.addActionListener(e -> {
            cardLayout.show(panelContainer, "loginPanel");
        });

        logoutMenuItem.addActionListener(e -> {
            cardLayout.show(panelContainer, "logoutPanel");
        });

        RegistroMenuItem.addActionListener(e -> {
            cardLayout.show(panelContainer, "registroPanel");
        });
    }

    private void agregarPlatilloATabla(String nombrePlatillo, double precio) {
        modelTablaPlatillos.addRow(new Object[]{nombrePlatillo, 1, precio});
    }
        
    
}
