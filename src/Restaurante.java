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
import java.awt.Color;


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
    private DefaultTableModel modelOrden;
    private JTable tablaOrden;
    private JTextField txtNombreCliente;
    private JTextField txtTota;

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

        //menuInicioPanel
        menuInicioPanel = new JPanel();
        menuInicioPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        menuInicioPanel.setLayout(null);

        JLabel tituloLabel = new JLabel("Bienvenido", SwingConstants.CENTER);
        tituloLabel.setBounds(107, 20, 657, 28);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 24));
        menuInicioPanel.add(tituloLabel);

        cardLayout = new CardLayout();
        panelContainer = new JPanel(cardLayout);
        panelContainer.add(menuInicioPanel, "menuInicio");
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.GRAY);
        panel_1.setBounds(0, 0, 132, 539);
        menuInicioPanel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel_9 = new JLabel("Mi Cuenta");
        lblNewLabel_9.setBounds(5, 5, 102, 50);
        panel_1.add(lblNewLabel_9);
        lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\icons8-user-50.png"));
        
        JButton btnNewButton_2 = new JButton("Cerrar sesion");
        btnNewButton_2.setForeground(Color.WHITE);
        btnNewButton_2.setBackground(Color.RED);
        btnNewButton_2.setBounds(10, 480, 97, 23);
        panel_1.add(btnNewButton_2);

        panel.add(panelContainer, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuAcceso = new JMenu("Acceso/Salir");
        JMenu menuPlatillos = new JMenu("Platillos");
        JMenu menuOrdenes = new JMenu("Órdenes");

        JMenuItem loginMenuItem = new JMenuItem("Acceso (Login)");
        menuAcceso.add(loginMenuItem);
        JMenuItem logoutMenuItem = new JMenuItem("Salir (Logout)"); //Eliminar 
        menuAcceso.add(logoutMenuItem);
        JMenuItem RegistroMenuItem = new JMenuItem("Registro");
        menuAcceso.add(RegistroMenuItem);


        frame.setJMenuBar(menuBar);
        menuBar.add(menuAcceso);
        menuBar.add(menuPlatillos);
        menuBar.add(menuOrdenes);

        //loginPanel
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

        //logoutPanel
        JPanel logoutPanel = new JPanel(new BorderLayout());
        JLabel tituloLabel3 = new JLabel("Logout", SwingConstants.CENTER);
        tituloLabel3.setFont(new Font("Arial", Font.BOLD, 24));
        logoutPanel.add(tituloLabel3);

        panelContainer.add(logoutPanel, "logoutPanel");
        
        //registroPanel
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
        
        int totalImagenes = 8; 
        int filas = 2; 
        int columnas = (totalImagenes + filas - 1) / filas; 

        //panelImagenesPlatillos
        JPanel panelImagenesPlatillos = new JPanel(new GridLayout(filas, columnas, 10, 10));
        panelImagenesPlatillos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        
        for (int i = 1; i <= totalImagenes; i++) {
        	final int index = i;
        	JLabel labelImagen = new JLabel(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\check" + i + ".png"));
            labelImagen.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    agregarPlatilloATabla("Platillo " + index, 7.99 * index); 
                }
            });
            panelImagenesPlatillos.add(labelImagen);
        }
        


        
        JPanel panelTablaPlatillos = new JPanel(new BorderLayout());
        modelTablaPlatillos = new DefaultTableModel(new Object[]{"Platillo", "Cantidad", "Precio"}, 0);
        JTable tablaPlatillos = new JTable(modelTablaPlatillos);
        panelTablaPlatillos.add(new JScrollPane(tablaPlatillos), BorderLayout.CENTER);

        JPanel platillosPanel = new JPanel(new BorderLayout());
        platillosPanel.add(panelImagenesPlatillos, BorderLayout.CENTER);
        platillosPanel.add(panelTablaPlatillos, BorderLayout.SOUTH);

        panelContainer.add(platillosPanel, "platillosPanel");

        JMenuItem platillosMenuItem = new JMenuItem("Platillos");
        menuPlatillos.add(platillosMenuItem);
        platillosMenuItem.addActionListener(e -> {
            cardLayout.show(panelContainer, "platillosPanel");
        });
        
        JPanel ordenPanel = new JPanel(new BorderLayout());

        JPanel panelPlatillosDisponibles = new JPanel(new GridLayout(0, 3, 10, 10));

        JPanel panelOrden = new JPanel(new BorderLayout());
        modelOrden = new DefaultTableModel(new Object[]{"Platillo", "Cantidad", "Precio"}, 0);
        tablaOrden = new JTable(modelOrden);
        panelOrden.add(new JScrollPane(tablaOrden), BorderLayout.CENTER);

        JPanel panelDatosOrden = new JPanel(new GridLayout(3, 2, 10, 10));
        JLabel lblNombreCliente = new JLabel("Nombre del Cliente:");
        txtNombreCliente = new JTextField();
        JLabel lblTotal = new JLabel("Total:");
        txtTota = new JTextField();
        txtTota.setEditable(false);
        panelDatosOrden.add(lblNombreCliente);
        panelDatosOrden.add(txtNombreCliente);
        panelDatosOrden.add(lblTotal);
        panelDatosOrden.add(txtTota);

        ordenPanel.add(panelPlatillosDisponibles, BorderLayout.WEST);
        ordenPanel.add(panelOrden, BorderLayout.CENTER);
        ordenPanel.add(panelDatosOrden, BorderLayout.SOUTH);

        panelContainer.add(ordenPanel, "ordenPanel");
     
        //labelImagen.addMouseListener(new MouseAdapter() {    //Error labelImagen cannot be resolved       
    	    //@Override
    	    //public void mouseClicked(MouseEvent e) {
    	        //agregarPlatilloAOrden("Platillo " + index, 7.99 * index); //Error index cannot be resolved to a variable
    	    //}
         //});
 
        JMenuItem ordenMenuItem = new JMenuItem("Orden");
        menuOrdenes.add(ordenMenuItem);
          ordenMenuItem.addActionListener(e -> {
         cardLayout.show(panelContainer, "ordenPanel");
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

    private void agregarPlatilloAOrden(String nombrePlatillo, double precio) {  //CORREGIR
        boolean encontrado = false;
        for (int i = 0; i < modelOrden.getRowCount(); i++) {
            if (modelOrden.getValueAt(i, 0).equals(nombrePlatillo)) {
                int cantidad = (int) modelOrden.getValueAt(i, 1);
                modelOrden.setValueAt(cantidad + 1, i, 1);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            modelOrden.addRow(new Object[]{nombrePlatillo, 1, precio});
        }
        actualizarTotal();
    }
    
    private void actualizarTotal() {      //CORREGIR
        double total = 0;
        for (int i = 0; i < modelOrden.getRowCount(); i++) {
            int cantidad = (int) modelOrden.getValueAt(i, 1);
            double precio = (double) modelOrden.getValueAt(i, 2);
            total += cantidad * precio;
        }
        txtTota.setText(String.format("%.2f", total));  //Cambiar formato
    }
    
    private void agregarPlatilloATabla(String nombrePlatillo, double precio) { //CORREGIR
        modelTablaPlatillos.addRow(new Object[]{nombrePlatillo, 1, precio});
    }
         
}
