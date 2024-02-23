import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{

	public Ventana() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,600);
		this.setLocationRelativeTo(null);

		this.setTitle("Registro");
		this.setResizable(true); 
		this.setMinimumSize(new Dimension(200,200));
		
		
		this.setLayout(null);
		
		this.loadComponents();
	}
	
	public void loadComponents() {
		
		//this.login();
		
		//this.registro();		
		
		this.admin();
		this.repaint();

	}
		
	public void login() {
		
			JPanel login = new JPanel();
			login.setSize(this.getWidth()/2, this.getHeight());
			login.setLocation(0,0);
			login.setLayout(null);
			login.setBackground(Color.black);
			
			JMenuBar menuBar = new JMenuBar();
			 JMenu fileMenu = new JMenu("Archivo");
			
			JMenuItem openItem = new JMenuItem("Abrir");
	        JMenuItem saveItem = new JMenuItem("Guardar");
	        JMenuItem exitItem = new JMenuItem("Salir");
	        
	        fileMenu.add(openItem);
	        fileMenu.add(saveItem);
	        fileMenu.addSeparator(); 
	        fileMenu.add(exitItem);
	        
	        menuBar.add(fileMenu);
	        
	        setJMenuBar(menuBar);
			
			JLabel title = new JLabel("Bienvenido al sistema",SwingConstants.CENTER);
			title.setFont(new Font("Agency FB", Font.BOLD, 20));
			title.setBackground(Color.white);
			title.setLocation(150, 10);
			title.setSize(220, 40);
			title.setOpaque(true); 
			login.add(title);
			
			JLabel user_tag = new JLabel("Correo electrónico: ");
			user_tag.setFont(new Font("Agency FB", Font.BOLD, 15));
			user_tag.setBackground(Color.white);
			user_tag.setLocation(10, 70);
			user_tag.setSize(180, 30);
			user_tag.setOpaque(true); 
			login.add(user_tag);
			
			JTextField user_field = new JTextField();
			user_field.setBounds(10, 120, 180, 30);
			this.add(user_field);
			
			JLabel pwd_tag = new JLabel("Contraseña: ");
			pwd_tag.setFont(new Font("Agency FB", Font.BOLD, 15));
			pwd_tag.setBackground(Color.white);
			pwd_tag.setLocation(10, 170);
			pwd_tag.setSize(180, 30);
			pwd_tag.setOpaque(true); 
			login.add(pwd_tag);
			
			JPasswordField pwd_field = new JPasswordField();
			pwd_field.setBounds(10, 220, 180, 30);
			pwd_field.setBackground(Color.red);
			pwd_field.setOpaque(true);
			this.add(pwd_field);
			
			JButton login_btn = new JButton("ACCEDER");
			login_btn.setBounds(10, 270, 180, 30);
			this.add(login_btn);
			
			this.add(login);
			this.repaint();
		}
		

	public void registro() {
			
			JPanel registro = new JPanel();
			registro.setSize(this.getWidth()/2, this.getHeight());
			registro.setLocation(this.getWidth()/2,0);
			registro.setLayout(null);
			registro.setBackground(Color.decode("#203F5C"));
			
			JLabel titleR = new JLabel("Registro",SwingConstants.CENTER);
			titleR.setFont(new Font("Scratches", Font.BOLD, 40));
			titleR.setBackground(Color.white);
			titleR.setForeground(Color.white);
			titleR.setLocation(150, 10);
			titleR.setSize(220, 40);
			titleR.setOpaque(false); 
			registro.add(titleR);
			
			JLabel name_tag = new JLabel("Nombre completo: ");
			name_tag.setFont(new Font("Scratches", Font.BOLD, 20)); 
			name_tag.setLocation(10, 70);
			name_tag.setForeground(Color.white);
			name_tag.setSize(180, 30); 
			registro.add(name_tag);
			
			JTextField name_field = new JTextField();
			name_field.setBounds(9, 95, 350, 35);
			registro.add(name_field);
			
			JCheckBox gusto1 = new JCheckBox("Chocolate");
			gusto1.setFont(new Font("Scratches", Font.BOLD, 20)); 
			gusto1.setBounds(10, 150, 150, 35);
			gusto1.setOpaque(true);
			gusto1.setBackground(Color.green);
			registro.add(gusto1);
			
			JCheckBox gusto2 = new JCheckBox("Pizza");
			gusto2.setFont(new Font("Scratches", Font.BOLD, 20)); 
			gusto2.setBounds(170, 150,150, 35);
			gusto2.setOpaque(true);
			gusto2.setBackground(Color.red);
			registro.add(gusto2);
			
			JRadioButton type = new JRadioButton("Al sartén");
			type.setBounds(10, 240, 150, 35);
			type.setFont(new Font("Scratches", Font.BOLD, 20)); 
			type.setForeground(Color.white);
			type.setOpaque(false); 
			registro.add(type);
			
			JRadioButton type2 = new JRadioButton("Tradicional");
			type2.setBounds(10, 285, 150, 35);
			type2.setFont(new Font("Scratches", Font.BOLD, 20)); 
			type2.setForeground(Color.white);
			type2.setOpaque(false); 
			registro.add(type2);
			
	        JButton register_btn = new JButton("REGISTRAR");
	        register_btn.setBounds(10, 450, 180, 30);
	        registro.add(register_btn);

	        ButtonGroup grupo = new ButtonGroup();
	        grupo.add(type);
	        grupo.add(type2);
	        grupo.add(gusto2);
	        grupo.add(register_btn);

	        JTextArea bio = new JTextArea(10, 10);
	        bio.setLocation(10, 330);
	        bio.setSize(350, 100);
	        registro.add(bio);
	        
			this.add(registro);
			this.repaint();
		}
		
	public void admin() {
		
		JPanel admin_Panel = new JPanel();
		admin_Panel.setLocation(0, 0);
		admin_Panel.setSize(this.getWidth(), this.getHeight());
		admin_Panel.setBackground(Color.orange);
		admin_Panel.setLayout(null);
		
		JLabel user_label = new JLabel("REGISTRO", 0);
		user_label.setFont(new Font("Agency FB", Font.BOLD, 50));
		user_label.setForeground(Color.white);
		user_label.setSize(300, 80);
		user_label.setLocation(350, 20);
		user_label.setOpaque(true);
		user_label.setBackground(Color.black);
		admin_Panel.add(user_label);
		
		JLabel registro_label = new JLabel("Usuarios registrados",0);
		registro_label.setBounds(40, 120, 300, 40);
		registro_label.setForeground(Color.white);
		registro_label.setFont(new Font("Agency FB", Font.BOLD, 20));
		registro_label.setOpaque(true);
		registro_label.setBackground(Color.black);
		admin_Panel.add(registro_label);
		
		JLabel numero_label = new JLabel("50",0);
		numero_label.setBounds(40, 160, 300, 40);
		numero_label.setForeground(Color.white);
		numero_label.setFont(new Font("Agency FB", Font.BOLD, 20));
		numero_label.setOpaque(true);
		numero_label.setBackground(Color.black);
		admin_Panel.add(numero_label);
		
		JButton add_user = new JButton("Añadir");
		add_user.setBounds(880, 200, 80, 40);
		admin_Panel.add(add_user);
		
		JButton download_user = new JButton("Descargar");
		download_user.setBounds(790, 200, 80, 40);
		admin_Panel.add(download_user);
				
		String titles[] = {"Nu. Control", "Nombre", "Apellido"};
		
		String data[][] = {
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"},
				{"Nu. Control", "Nombre", "Apellido"}
		};
		
		JTable users = new JTable(data, titles);
		
		JScrollPane table_scroll = new JScrollPane(users);
		table_scroll.setBounds(40, 280, 920, 300);
		admin_Panel.add(table_scroll);
		
		
		this.add(admin_Panel);
	}

		
	

}