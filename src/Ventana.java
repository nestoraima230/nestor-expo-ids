import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
import javax.swing.border.Border;

public class Ventana extends JFrame{

	public Ventana() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);

		this.setTitle("Calculadora");
		this.setResizable(true); 
        this.setMinimumSize(new Dimension(500, 400)); 
		
		
		this.setLayout(new BorderLayout());
		
		this.loadComponents();
	}
	
	public void loadComponents() {
		
		//this.login();
		
		//this.registro();		
		
		//this.admin();
		this.repaint();
		//this.calculadora();
		//this.user();
		this.interfazLayout();

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
	
	public void calculadora() {
	    JPanel calculadora_panel = new JPanel();
	    calculadora_panel.setLayout(null);

	    JTextField textField = new JTextField("0");
	    textField.setHorizontalAlignment(JTextField.RIGHT);
	    textField.setFont(new Font("Arial", Font.BOLD, 24));
	    textField.setBounds(10, 10, 270, 50);
	    calculadora_panel.add(textField);

	    JButton boton9 = new JButton("9");
	    boton9.setFont(new Font("Arial", Font.BOLD, 20));
	    boton9.setBounds(140, 70, 60, 60);
	    calculadora_panel.add(boton9);

	    JButton boton4 = new JButton("4");
	    boton4.setFont(new Font("Arial", Font.BOLD, 20));
	    boton4.setBounds(10, 135, 60, 60);
	    calculadora_panel.add(boton4);

	    JButton boton5 = new JButton("5");
	    boton5.setFont(new Font("Arial", Font.BOLD, 20));
	    boton5.setBounds(75, 135, 60, 60);
	    calculadora_panel.add(boton5);

	    JButton boton6 = new JButton("6");
	    boton6.setFont(new Font("Arial", Font.BOLD, 20));
	    boton6.setBounds(140, 135, 60, 60);
	    calculadora_panel.add(boton6);

	    JButton boton1 = new JButton("1");
	    boton1.setFont(new Font("Arial", Font.BOLD, 20));
	    boton1.setBounds(10, 200, 60, 60);
	    calculadora_panel.add(boton1);

	    JButton boton2 = new JButton("2");
	    boton2.setFont(new Font("Arial", Font.BOLD, 20));
	    boton2.setBounds(75, 200, 60, 60);
	    calculadora_panel.add(boton2);

	    JButton boton3 = new JButton("3");
	    boton3.setFont(new Font("Arial", Font.BOLD, 20));
	    boton3.setBounds(140, 200, 60, 60);
	    calculadora_panel.add(boton3);

	    JButton boton0 = new JButton("0");
	    boton0.setFont(new Font("Arial", Font.BOLD, 20));
	    boton0.setBounds(10, 265, 60, 60);
	    calculadora_panel.add(boton0);

	    JButton botonPunto = new JButton(".");
	    botonPunto.setFont(new Font("Arial", Font.BOLD, 20));
	    botonPunto.setBounds(75, 265, 60, 60);
	    calculadora_panel.add(botonPunto);

	    JButton botonMenos = new JButton("-");
	    botonMenos.setFont(new Font("Arial", Font.BOLD, 20));
	    botonMenos.setBounds(205, 200, 75, 60);
	    calculadora_panel.add(botonMenos);

	    JButton botonMultiplicar = new JButton("*");
	    botonMultiplicar.setFont(new Font("Arial", Font.BOLD, 20));
	    botonMultiplicar.setBounds(205, 135, 75, 60);
	    calculadora_panel.add(botonMultiplicar);

	    JButton botonDividir = new JButton("/");
	    botonDividir.setFont(new Font("Arial", Font.BOLD, 20));
	    botonDividir.setBounds(205, 70, 75, 60);
	    calculadora_panel.add(botonDividir);
	    
	    JButton botonMas = new JButton("+");
	    botonMas.setFont(new Font("Arial", Font.BOLD, 20));
	    botonMas.setBounds(205, 265, 75, 60);
	    calculadora_panel.add(botonMas);

	    JButton botonIgual = new JButton("=");
	    botonIgual.setFont(new Font("Arial", Font.BOLD, 20));
	    botonIgual.setBounds(140, 265, 60, 60);
	    calculadora_panel.add(botonIgual);

	    
	    this.add(calculadora_panel);
	}
	
	public void user() {
	    JPanel userPanel = new JPanel();
	    userPanel.setLayout(null);
	    userPanel.setBackground(Color.decode("#1617BD"));
	    userPanel.setSize(this.getWidth(), this.getHeight());

	    JLabel userL = new JLabel("User Login", SwingConstants.CENTER);
	    userL.setFont(new Font("Arial", Font.BOLD, 40));
	    userL.setForeground(Color.white);
	    userL.setBounds(150, 10, 220, 40);
	    userPanel.add(userL);

	    JPanel loginPanel = new JPanel();
	    loginPanel.setLayout(null);
	    loginPanel.setBackground(Color.decode("#1314AD"));
	    loginPanel.setBounds(50, 100, 500, 400); 
	    loginPanel.setBorder(BorderFactory.createLineBorder(Color.white));
	    userPanel.add(loginPanel);

	    JLabel accountLabel = new JLabel("My Account", SwingConstants.CENTER);
	    accountLabel.setFont(new Font("Arial", Font.BOLD, 40));
	    accountLabel.setForeground(Color.decode("#D4AF37"));
	    accountLabel.setBounds(110, 20, 300, 40);
	    loginPanel.add(accountLabel);

	    JLabel usernameLabel = new JLabel("Enter Your Username");
	    usernameLabel.setFont(new Font("Arial", Font.BOLD, 20));
	    usernameLabel.setForeground(Color.white);
	    usernameLabel.setBounds(50, 100, 300, 40);
	    loginPanel.add(usernameLabel);

	    JLabel logo1 = new JLabel();
	    logo1.setIcon(new ImageIcon(getClass().getResource("icons8-user-50.png")));
	    logo1.setBounds(50, 150, 50, 50);
	    loginPanel.add(logo1);

	    JTextField usernameField = new JTextField();
	    usernameField.setBounds(110, 160, 350, 30);
	    loginPanel.add(usernameField);

	    JLabel passwordLabel = new JLabel("Enter Your Password");
	    passwordLabel.setFont(new Font("Arial", Font.BOLD, 20));
	    passwordLabel.setForeground(Color.white);
	    passwordLabel.setBounds(50, 220, 300, 40);
	    loginPanel.add(passwordLabel);

	    JLabel logo2 = new JLabel();
	    logo2.setIcon(new ImageIcon(getClass().getResource("icons8-padlock-48.png")));
	    logo2.setBounds(50, 270, 50, 50);
	    loginPanel.add(logo2);

	    JPasswordField passwordField = new JPasswordField("PASSWORD");
	    passwordField.setForeground(Color.gray);
	    passwordField.setBounds(110, 280, 350, 30);
	    passwordField.setBackground(Color.white);
	    passwordField.setEchoChar((char)0); 
	    loginPanel.add(passwordField);

        JButton loginButton = new RoundedButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 20));
        loginButton.setBounds(200, 350, 180, 30);
        loginButton.setBackground(Color.decode("#D4AF37"));
        loginPanel.add(loginButton);
        
	    JLabel noAccountLabel = new JLabel("Don't have an account?");
	    noAccountLabel.setFont(new Font("Arial", Font.BOLD, 24));
	    noAccountLabel.setForeground(Color.white);
	    noAccountLabel.setBounds(180, 520, 200, 20); 
	    noAccountLabel.setBackground(Color.white);
	    userPanel.add(noAccountLabel);

	    JButton signUpButton = new RoundedButton("Sign Up");
	    loginButton.setFont(new Font("Arial", Font.BOLD, 20));
	    signUpButton.setBounds(210, 550, 120, 30); 
	    signUpButton.setBackground(Color.decode("#D4AF37"));
	    userPanel.add(signUpButton);

	    this.add(userPanel);
	    this.repaint();
	}
	
    public void interfazLayout() {
    	JPanel mainPanel = new JPanel(new BorderLayout());

    	JPanel northPanel = new JPanel();
    	northPanel.setBackground(Color.WHITE);
    	JLabel interestLabel = new JLabel("Interés");
    	interestLabel.setFont(new Font("Arial", Font.BOLD, 16));
    	interestLabel.setForeground(Color.RED); 
    	northPanel.add(interestLabel); 
    	mainPanel.add(northPanel, BorderLayout.NORTH);

    	JPanel eastPanel = new JPanel();
    	eastPanel.setBackground(Color.WHITE);
    	eastPanel.setPreferredSize(new Dimension(50, 0));
    	JPanel westPanel = new JPanel();
    	westPanel.setBackground(Color.WHITE);
    	westPanel.setPreferredSize(new Dimension(50, 0)); 

    	JPanel greenPanel = new JPanel(new GridLayout(5, 2, 5, 5));
    	greenPanel.setBackground(Color.GREEN);
    	greenPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    	JLabel capitalLabel = new JLabel("Capital:");
    	JTextField capitalField = new JTextField("1500");
    	JLabel tiempoLabel = new JLabel("Tiempo:");
    	JTextField tiempoField = new JTextField("2");
    	JLabel interesLabel = new JLabel("Tasa de Interés:");
    	JTextField interesField = new JTextField("0.1");

    	JButton calculateButton = new JButton("Calcular");
    	calculateButton.setBackground(Color.BLACK); 
    	calculateButton.setForeground(Color.WHITE); 
    	ImageIcon calculateIcon = new ImageIcon(getClass().getResource("diskette.png")); 
    	calculateButton.setIcon(new ImageIcon(calculateIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH))); 
    	JButton cancelButton = new JButton("Cancelar");
    	cancelButton.setBackground(Color.BLACK); 
    	cancelButton.setForeground(Color.WHITE); 
    	ImageIcon cancelIcon = new ImageIcon(getClass().getResource("close.png")); 
    	cancelButton.setIcon(new ImageIcon(cancelIcon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH)));

    	greenPanel.add(capitalLabel);
    	greenPanel.add(capitalField);
    	greenPanel.add(tiempoLabel);
    	greenPanel.add(tiempoField);
    	greenPanel.add(interesLabel);
    	greenPanel.add(interesField);
    	greenPanel.add(calculateButton);
    	greenPanel.add(cancelButton);

    	JPanel redPanel = new JPanel(new GridLayout(2, 2, 5, 5));
    	redPanel.setBackground(Color.RED);
    	redPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 

    	JLabel interesRLabel = new JLabel("Interés:");
    	JTextField interesRField = new JTextField("315.0000000002");
    	JLabel montoLabel = new JLabel("Monto:");
    	JTextField montoField = new JTextField("1812.0000000002");

    	redPanel.add(interesRLabel);
    	redPanel.add(interesRField);
    	redPanel.add(montoLabel);
    	redPanel.add(montoField);

    	mainPanel.add(eastPanel, BorderLayout.EAST);
    	mainPanel.add(westPanel, BorderLayout.WEST);
    	mainPanel.add(greenPanel, BorderLayout.CENTER);
    	mainPanel.add(redPanel, BorderLayout.SOUTH);

    	this.add(mainPanel);
    	this.pack(); 
    	this.setLocationRelativeTo(null); 
    	this.setVisible(true); 
    }








}		


		
	
