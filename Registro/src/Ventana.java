import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    
    private JTextField usuario;
    private JPasswordField contrasena;
    private JTextField email;
    private JTextArea direccion;
    private JRadioButton hombreRadiobtn, mujerRadiobtn;
    private ButtonGroup grupo;
    private JButton registro;
    
    public Ventana() {
        setTitle("Registro de Usuario");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null); 
        
        panel.setBackground(Color.BLUE);
        
        add(panel);
        
        JLabel usernameLabel = new JLabel("Nombre de Usuario");
        usernameLabel.setBounds(20, 20, 120, 20);
        panel.add(usernameLabel);
        
        usuario = new JTextField();
        usuario.setBounds(150, 20, 200, 20);
        panel.add(usuario);
        
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(20, 50, 120, 20);
        panel.add(passwordLabel);
        
        contrasena = new JPasswordField();
        contrasena.setBounds(150, 50, 200, 20);
        panel.add(contrasena);
        
        JLabel emailLabel = new JLabel("Correo Electrónico:");
        emailLabel.setBounds(20, 80, 120, 20);
        panel.add(emailLabel);
        
        email = new JTextField();
        email.setBounds(150, 80, 200, 20);
        panel.add(email);
        
        JLabel addressLabel = new JLabel("Dirección:");
        addressLabel.setBounds(20, 110, 120, 20);
        panel.add(addressLabel);
        
        direccion = new JTextArea();
        direccion.setBounds(150, 110, 200, 80);
        panel.add(direccion);
        
        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(20, 200, 120, 20);
        panel.add(genderLabel);
        
        hombreRadiobtn = new JRadioButton("Masculino");
        hombreRadiobtn.setBounds(150, 200, 100, 20);
        panel.add(hombreRadiobtn);
        
        mujerRadiobtn = new JRadioButton("Femenino");
        mujerRadiobtn.setBounds(250, 200, 100, 20);
        panel.add(mujerRadiobtn);
        
        grupo = new ButtonGroup();
        grupo.add(hombreRadiobtn);
        grupo.add(mujerRadiobtn);
        
        registro = new JButton("Registrarse");
        registro.setBounds(150, 260, 120, 30);
        panel.add(registro);
    }
}
