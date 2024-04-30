import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
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

import javax.swing.BorderFactory;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
        
        lblNewLabel_9 = new JLabel("Mi Cuenta");
        lblNewLabel_9.setBounds(5, 5, 102, 50);
        panel_1.add(lblNewLabel_9);
        lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\icons8-user-50.png"));
        
        JButton btnNewButton_2 = new JButton("Cerrar sesion");
        btnNewButton_2.setForeground(Color.WHITE);
        btnNewButton_2.setBackground(Color.RED);
        btnNewButton_2.setBounds(10, 480, 97, 23);
        panel_1.add(btnNewButton_2);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(167, 459, 0, 10);
        menuInicioPanel.add(panel_2);
        panel_2.setLayout(null);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.GREEN);
        panel_3.setBounds(132, 428, 652, 111);
        menuInicioPanel.add(panel_3);
        panel_3.setLayout(null);

        panel.add(panelContainer, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuAcceso = new JMenu("Acceso/Salir");
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
        

        btnIniciarSesion.addActionListener(e -> {
            String nombreUsuario = txtNombre.getText().trim();
            String contraseña = new String(passwordField.getPassword()).trim();

            if (!nombreUsuario.isEmpty() && !contraseña.isEmpty()) { // Verificar longitud de usuario y contraseña
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
        btnRegistro.setBounds(298, 453, 150, 30);
        loginPanel.add(btnRegistro);
        
        btnRegistro.addActionListener(e -> {
        });

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

        miCuentaPanel = new JPanel();
        panelContainer.add(miCuentaPanel, "miCuentaPanel");
        miCuentaPanel.setLayout(null);
        
        JLabel lblNewLabel_10 = new JLabel("Nombre");
        lblNewLabel_10.setBounds(47, 73, 102, 14);
        miCuentaPanel.add(lblNewLabel_10);
        
        JLabel lblNewLabel_11 = new JLabel("Apellidos");
        lblNewLabel_11.setBounds(47, 111, 90, 14);
        miCuentaPanel.add(lblNewLabel_11);
        
        JLabel lblNewLabel_12 = new JLabel("Correo electronico");
        lblNewLabel_12.setBounds(23, 147, 114, 14);
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
        
        JLabel lblNewLabel_13 = new JLabel("");
        lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\vector-users-icon.jpg"));
        lblNewLabel_13.setBounds(520, 40, 102, 148);
        miCuentaPanel.add(lblNewLabel_13);
        
        JLabel lblNewLabel_14 = new JLabel("DATOS GENERALES");
        lblNewLabel_14.setBounds(47, 36, 102, 14);
        miCuentaPanel.add(lblNewLabel_14);
        
        JLabel lblNewLabel_15 = new JLabel("PERFIL");
        lblNewLabel_15.setBounds(516, 36, 46, 14);
        miCuentaPanel.add(lblNewLabel_15);
        
        JLabel lblNewLabel_16 = new JLabel("COMENTARIOS");
        lblNewLabel_16.setBounds(47, 332, 154, 14);
        miCuentaPanel.add(lblNewLabel_16);
        
        JTextPane textPane = new JTextPane();
        textPane.setBounds(47, 379, 388, 118);
        miCuentaPanel.add(textPane);
        
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(435, 379, 17, 118);
        miCuentaPanel.add(scrollBar);
        
        JLabel lblNewLabel_17 = new JLabel("Contraseña");
        lblNewLabel_17.setBounds(33, 185, 92, 14);
        miCuentaPanel.add(lblNewLabel_17);
        
        passwordField_3 = new JPasswordField();
        passwordField_3.setBounds(147, 182, 148, 20);
        miCuentaPanel.add(passwordField_3);
        
        JButton btnNewButton_3 = new JButton("Editar datos");
        btnNewButton_3.setBounds(520, 354, 114, 23);
        miCuentaPanel.add(btnNewButton_3);
        
        String rutaImagen = "C:\\\\Users\\\\Asus\\\\eclipse-workspace\\\\Acceso\\\\src\\\\diskette.png"; 
        ImageIcon icono = new ImageIcon(rutaImagen);
        Image imagenEscalada = icono.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        JButton btnNewButton_4 = new JButton("Guardar", iconoEscalado);

        btnNewButton_4.setBounds(520, 405, 121, 23);
        miCuentaPanel.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("Eliminar");
        btnNewButton_5.setBackground(Color.RED);
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
        JPanel registroPanel = new JPanel();
        panelContainer.add(registroPanel, "registroPanel");
        registroPanel.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Registro");
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
        lblNewLabel_2.setBounds(319, 41, 126, 46);
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
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones");
        chckbxNewCheckBox.setBounds(280, 370, 246, 23);
        registroPanel.add(chckbxNewCheckBox);
        
        JButton btnRegistro1Button = new JButton("Registro");
        
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


        
        btnRegistro1Button.setBounds(291, 406, 89, 23);
        registroPanel.add(btnRegistro1Button);
        
        JButton btnIniciarSesion1 = new JButton("Iniciar sesion");
        btnIniciarSesion1.setBounds(304, 475, 129, 23);
        registroPanel.add(btnIniciarSesion1);
        
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
        
   
        JPanel platillosPanel = new JPanel(new BorderLayout());
        panelContainer.add(platillosPanel, "platillosPanel");
        
        modelTablaPlatillos = new DefaultTableModel(new Object[]{"Nombre", "Descripción", "Categoría", "Precio", "Imagen"}, 0);
        tablaPlatillos = new JTable(modelTablaPlatillos);
        platillosPanel.add(new JScrollPane(tablaPlatillos), BorderLayout.CENTER);


        JPanel panelAgregarPlatillo = new JPanel(new GridLayout(6, 2, 10, 10));

        txtNombrePlatillo = new JTextField();
        txtDescripcionPlatillo = new JTextField();
        txtCategoriaPlatilo = new JTextField();
        txtPrecioPlatillo = new JTextField();

        panelAgregarPlatillo.add(new JLabel("Nombre:"));
        panelAgregarPlatillo.add(txtNombrePlatillo);
        panelAgregarPlatillo.add(new JLabel("Descripción:"));
        panelAgregarPlatillo.add(txtDescripcionPlatillo);
        panelAgregarPlatillo.add(new JLabel("Categoría:"));
        panelAgregarPlatillo.add(txtCategoriaPlatilo);
        panelAgregarPlatillo.add(new JLabel("Precio:"));
        panelAgregarPlatillo.add(txtPrecioPlatillo);

        JButton btnSeleccionarImagen = new JButton("Seleccionar Imagen");
        panelAgregarPlatillo.add(new JLabel("Imagen (opcional):"));
        panelAgregarPlatillo.add(btnSeleccionarImagen);

        platillosPanel.add(panelAgregarPlatillo, BorderLayout.NORTH);

        JPanel panelBotones1 = new JPanel(new FlowLayout());
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEditar = new JButton("Editar");
        JButton btnEliminar = new JButton("Eliminar");

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
        
        // Tabla de Órdenes
        modelOrden = new DefaultTableModel(new Object[]{"Platillo", "Cantidad", "Precio", "Total"}, 0);
        tablaOrden = new JTable(modelOrden);
        panelOrden.add(new JScrollPane(tablaOrden), BorderLayout.CENTER);


        JPanel datosa = new JPanel(new GridLayout(3, 2, 10, 10));
        JTextField txtNombreCliente = new JTextField();
        JLabel lblTotal = new JLabel("Total: $0.00");
        lblTotalPlatillos = new JLabel("Total de platillos: 0");
        datosa.add(new JLabel("Nombre del cliente:"));
        datosa.add(txtNombreCliente);
        datosa.add(new JLabel("Total:"));
        datosa.add(lblTotal);
        datosa.add(new JLabel("Total de platillos:"));
        datosa.add(lblTotalPlatillos);
        panelOrden.add(datosa, BorderLayout.NORTH);

        JPanel botonesg = new JPanel(new FlowLayout());
        JButton btnAgregarPlatilloOrden = new JButton("Agregar Platillo");
        JButton btnEditarPlatilloOrden = new JButton("Editar Platillo");
        JButton btnEliminarPlatilloOrden = new JButton("Eliminar Platillo");
        botonesg.add(btnAgregarPlatilloOrden);
        botonesg.add(btnEditarPlatilloOrden);
        botonesg.add(btnEliminarPlatilloOrden);
        panelOrden.add(botonesg, BorderLayout.SOUTH);

     
        btnAgregarPlatilloOrden.addActionListener(e -> agregarPlatilloOrden());
        btnEditarPlatilloOrden.addActionListener(e -> editarPlatilloOrden());
        btnEliminarPlatilloOrden.addActionListener(e -> eliminarPlatilloOrden());
 
        JButton btnImprimirComanda = new JButton("Imprimir Comanda");
        botonesg.add(btnImprimirComanda);

        btnImprimirComanda.addActionListener(e -> {
            try {
                FileWriter writer = new FileWriter("comanda.txt");
                writer.write("Comanda\n\n");
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
        
        // Menú de Órdenes
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
                    System.err.println("Error: formato de línea incorrecto en archivo usuarios.txt: " + linea);
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



    private void agregarPlatillo() {
        String nombre = txtNombrePlatillo.getText().trim();
        String descripcion = txtDescripcionPlatillo.getText().trim();
        String categoria = txtCategoriaPlatilo.getText().trim();
        double precio = 0.0;
        String rutaImagen = null;

        if (!nombre.isEmpty() && !descripcion.isEmpty() && !categoria.isEmpty()) {
            try {
                precio = Double.parseDouble(txtPrecioPlatillo.getText().trim());
                rutaImagen = seleccionarRutaImagen();

                modelTablaPlatillos.addRow(new Object[]{nombre, descripcion, categoria, precio, rutaImagen != null ? new ImageIcon(rutaImagen) : null});
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
            String nombreAnterior = (String) modelTablaPlatillos.getValueAt(filaSeleccionada, 0);
            String descripcionAnterior = (String) modelTablaPlatillos.getValueAt(filaSeleccionada, 1);

            String nombre = txtNombrePlatillo.getText().trim();
            String descripcion = txtDescripcionPlatillo.getText().trim();
            String categoria = txtCategoriaPlatilo.getText().trim();
            double precio = Double.parseDouble(txtPrecioPlatillo.getText().trim());

            modelTablaPlatillos.setValueAt(nombre, filaSeleccionada, 0);
            modelTablaPlatillos.setValueAt(descripcion, filaSeleccionada, 1);
            modelTablaPlatillos.setValueAt(categoria, filaSeleccionada, 2);
            modelTablaPlatillos.setValueAt(precio, filaSeleccionada, 3);

            limpiarCamposNuevoPlatillo();

            JOptionPane.showMessageDialog(frame, "El platillo \"" + nombreAnterior + "\" (Descripción: " + descripcionAnterior + ") ha sido editado.");
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
    
    private void agregarPlatilloOrden() {
        int filaSeleccionada = tablaPlatillos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String nombrePlatillo = (String) modelTablaPlatillos.getValueAt(filaSeleccionada, 0);
            double precioPlatillo = (double) modelTablaPlatillos.getValueAt(filaSeleccionada, 3);

            modelOrden.addRow(new Object[]{nombrePlatillo, 1, precioPlatillo, precioPlatillo});
            actualizarTotal();

            JOptionPane.showMessageDialog(frame, "El platillo \"" + nombrePlatillo + "\" ha sido agregado a la orden.");
        } else {
            JOptionPane.showMessageDialog(frame, "Selecciona un platillo para agregar a la orden.");
        }
    }

    private void editarPlatilloOrden() {
        int filaSeleccionada = tablaOrden.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nueva cantidad:"));
            double precioUnitario = (double) modelOrden.getValueAt(filaSeleccionada, 2);
            modelOrden.setValueAt(cantidad, filaSeleccionada, 1);
            modelOrden.setValueAt(cantidad * precioUnitario, filaSeleccionada, 3);
            actualizarTotal();
        } else {
            JOptionPane.showMessageDialog(frame, "Selecciona un platillo de la orden para editar.");
        }
    }

    private void eliminarPlatilloOrden() {
        int filaSeleccionada = tablaOrden.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String nombrePlatillo = (String) modelOrden.getValueAt(filaSeleccionada, 0);
            modelOrden.removeRow(filaSeleccionada);
            actualizarTotal();

            JOptionPane.showMessageDialog(frame, "El platillo \"" + nombrePlatillo + "\" ha sido eliminado de la orden.");
        } else {
            JOptionPane.showMessageDialog(frame, "Selecciona un platillo de la orden para eliminar.");
        }
    }

    
    private void actualizarTotal() {
        double total = 0;
        int totalPlatillos = 0;

        for (int i = 0; i < modelOrden.getRowCount(); i++) {
            int cantidad = (int) modelOrden.getValueAt(i, 1);
            double precio = (double) modelOrden.getValueAt(i, 2);
            total += cantidad * precio;
            if (cantidad > 0) {
                totalPlatillos++;
            }
        }

        txtTota.setText("Total: $" + String.format("%.2f", total));
        lblTotalPlatillos.setText("Total de platillos: " + totalPlatillos);
    }
    
    private void limpiarCamposNuevoPlatillo() {
        txtNombrePlatillo.setText("");
        txtDescripcionPlatillo.setText("");
        txtCategoriaPlatilo.setText("");
        txtPrecioPlatillo.setText("");
    }
}
