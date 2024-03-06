import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


public class Interfaz extends JFrame {

    private JPanel mainPanel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Interfaz interfaz = new Interfaz();
            interfaz.setVisible(true);
        });
    }

    public Interfaz() {
        setTitle("Registro de Usuarios");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        mainPanel = new JPanel(new BorderLayout()); 
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel, BorderLayout.CENTER);

        JPanel DatosPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        DatosPanel.setBackground(Color.BLUE);
        DatosPanel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.WHITE, 2), "Datos Generales", 0, 0, new Font("Arial", Font.BOLD, 14), Color.WHITE));
        mainPanel.add(DatosPanel, BorderLayout.WEST);

        DatosPanel.add(new JLabel("Nombres:",0));
        DatosPanel.add(new JTextField("Juan Carlos"));
        DatosPanel.add(new JLabel("Apellido Paterno:", 0));
        DatosPanel.add(new JTextField("Arcila"));
        DatosPanel.add(new JLabel("Apellido Materno:", 0));
        DatosPanel.add(new JTextField("Diaz"));
        DatosPanel.add(new JLabel("Fecha Nacimiento:", 0));
        JTextField fechaTextField = new JTextField("07/01/1990");
        DatosPanel.add(fechaTextField);
        DatosPanel.add(new JLabel("Sexo:", 0));
        JPanel sexPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        sexPanel.setOpaque(false); 
        JRadioButton maleRadio = new JRadioButton("Masculino", true);
        maleRadio.setOpaque(false); 
        JRadioButton femaleRadio = new JRadioButton("Femenino");
        femaleRadio.setOpaque(false); 
        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(maleRadio);
        sexGroup.add(femaleRadio);
        sexPanel.add(maleRadio);
        sexPanel.add(femaleRadio);
        DatosPanel.add(sexPanel);
        DatosPanel.add(new JLabel("Nacionalidad:", 0));
        DatosPanel.add(new JComboBox(new String[]{"Perú", "Colombia", "Chile", "Argentina", "México","Brasil"}));
        
        JPanel profilePanel = new JPanel(new BorderLayout());
        profilePanel.setBackground(new Color(255, 102, 102));
        profilePanel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.WHITE, 2), "Perfil del Usuario", 0, 0, new Font("Arial", Font.BOLD, 14), Color.WHITE));
        mainPanel.add(profilePanel, BorderLayout.EAST);
        
        ImageIcon profileIcon = new ImageIcon(getClass().getResource("vector-users-icon.jpg"));

        JLabel profileImageLabel = new JLabel(profileIcon);

        Image scaledImage = profileIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        profileImageLabel.setIcon(new ImageIcon(scaledImage));
        profilePanel.add(profileImageLabel, BorderLayout.CENTER);

        JPanel checkboxPanel = new JPanel(new GridLayout(2, 1));
        checkboxPanel.setOpaque(false);
        profilePanel.add(checkboxPanel, BorderLayout.SOUTH);

        JCheckBox showPhotoCheckbox = new JCheckBox("Mostrar Foto de Perfil", true);
        showPhotoCheckbox.setOpaque(false);
        checkboxPanel.add(showPhotoCheckbox);

        JCheckBox showBirthdateCheckbox = new JCheckBox("Mostrar Fecha de Nacimiento", true);
        showBirthdateCheckbox.setOpaque(false);
        checkboxPanel.add(showBirthdateCheckbox);


        JPanel optionalAndButtonPanel = new JPanel(new BorderLayout());
        optionalAndButtonPanel.setBackground(Color.WHITE);
        mainPanel.add(optionalAndButtonPanel, BorderLayout.SOUTH);

        JPanel optionalDataPanel = new JPanel(new BorderLayout());
        optionalDataPanel.setBackground(Color.RED);
        optionalDataPanel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.WHITE, 2), "Datos Opcionales", 0, 0, new Font("Arial", Font.BOLD, 14), Color.WHITE));
        optionalAndButtonPanel.add(optionalDataPanel, BorderLayout.WEST);

        JPanel optionalDataInnerPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        optionalDataInnerPanel.setBackground(Color.RED);
        optionalDataPanel.add(optionalDataInnerPanel, BorderLayout.NORTH);
        optionalDataInnerPanel.add(new JLabel("Descripción:", SwingConstants.RIGHT));
        JTextArea descriptionArea = new JTextArea("Hola amigos de youtube gracias por compartir mis videos.");
        optionalDataInnerPanel.add(new JScrollPane(descriptionArea));

        optionalDataPanel.add(new JLabel("Preferencias:", SwingConstants.RIGHT), BorderLayout.WEST);
        optionalDataPanel.add(new JComboBox(new String[]{"Cantar", "Escuchar Música", "Leer", "Deportes", "Otros"}), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLUE);
        optionalAndButtonPanel.add(buttonPanel);

        JButton nuevoButton = new JButton("Nuevo");
        nuevoButton.setBackground(Color.BLACK);
        nuevoButton.setForeground(Color.WHITE);
        buttonPanel.add(nuevoButton);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.setBackground(Color.BLACK);
        guardarButton.setForeground(Color.WHITE);
        buttonPanel.add(guardarButton);

        JButton salirButton = new JButton("Salir");
        salirButton.setBackground(Color.BLACK);
        salirButton.setForeground(Color.WHITE);
        buttonPanel.add(salirButton);

    }
}
