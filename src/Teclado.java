import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Teclado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JPanel panel_3; 
    Random rand = new Random();
    private String[] catalogoPalabras = {
            "casa", "perro", "gato", "coche", "pelota", "libro", "ordenador", "jardin", "familia", "amigo",
            "agua", "sol", "luna", "estrella", "planta", "mesa", "silla", "ventana", "puerta", "telefono",
            "cama", "ropa", "comida", "musica", "pelicula", "juego", "trabajo", "escuela", "parque", "ciudad",
            "paisaje", "montaña", "playa", "bosque", "rio", "lago", "mar", "isla", "avion", "tren", "barco",
            "bicicleta", "piscina", "supermercado", "restaurante", "hospital", "medico", "enfermedad", "dinero",
            "trabajo", "viaje", "vacaciones", "escritorio", "pintura", "escultura", "dibujo", "musica", "baile",
            "teatro", "concierto", "exposicion", "zoo", "parque de atracciones", "museo", "biblioteca", "futbol",
            "baloncesto", "tenis", "natacion", "atletismo", "ciclismo", "voleibol", "golf", "ajedrez", "judo",
            "karate", "taekwondo", "boxeo", "yoga", "pilates", "senderismo", "escalada", "esqui", "snowboard",
            "surf", "kayak", "rafting", "buceo", "pesca", "cine", "televisión", "lectura", "puzzle", "videojuego",
            "deporte", "arte", "cultura", "ciencia", "tecnologia", "historia", "geografia", "matematicas", "idiomas"
        };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado frame = new Teclado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teclado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		mostrarInstrucciones();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Esperando",SwingConstants.LEFT);
		lblNewLabel.setBackground(new Color(51, 255, 0));
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_30 = new JLabel("0");
		lblNewLabel_30.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel.add(lblNewLabel_30, BorderLayout.EAST);

		JLabel lblNewLabel_31 = new JLabel(PalabraAleatoria());
		lblNewLabel_31.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel.add(lblNewLabel_31, BorderLayout.SOUTH);		
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 9, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Q");
		lblNewLabel_2.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("W");
		lblNewLabel_3.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("E");
		lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_5);
		
		JLabel lblNewLabel_5 = new JLabel("R");
		lblNewLabel_5.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_6);
		
		JLabel lblNewLabel_6 = new JLabel("T");
		lblNewLabel_6.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_6.add(lblNewLabel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_7);
		
		JLabel lblNewLabel_7 = new JLabel("Y");
		lblNewLabel_7.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_7.add(lblNewLabel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_8);
		
		JLabel lblNewLabel_8 = new JLabel("U");
		lblNewLabel_8.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_8.add(lblNewLabel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_9);
		
		JLabel lblNewLabel_9 = new JLabel("I");
		lblNewLabel_9.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_9.add(lblNewLabel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_10);
		
		JLabel lblNewLabel_10 = new JLabel("O");
		lblNewLabel_10.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_10.add(lblNewLabel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_11);
		
		JLabel lblNewLabel_11 = new JLabel("P");
		lblNewLabel_11.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_11.add(lblNewLabel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_12);
		
		JLabel lblNewLabel_12 = new JLabel("A");
		lblNewLabel_12.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_12.add(lblNewLabel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_13);
		
		JLabel lblNewLabel_13 = new JLabel("S");
		lblNewLabel_13.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_13.add(lblNewLabel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_14);
		
		JLabel lblNewLabel_14 = new JLabel("D");
		lblNewLabel_14.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_14.add(lblNewLabel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_15);
		
		JLabel lblNewLabel_15 = new JLabel("F");
		lblNewLabel_15.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_15.add(lblNewLabel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_16);
		
		JLabel lblNewLabel_16 = new JLabel("G");
		lblNewLabel_16.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_16.add(lblNewLabel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_17);
		
		JLabel lblNewLabel_17 = new JLabel("H");
		lblNewLabel_17.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_17.add(lblNewLabel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_18);
		
		JLabel lblNewLabel_18 = new JLabel("J");
		lblNewLabel_18.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_18.add(lblNewLabel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_19);
		
		JLabel lblNewLabel_19 = new JLabel("K");
		lblNewLabel_19.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_19.add(lblNewLabel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_20);
		
		JLabel lblNewLabel_20 = new JLabel("L");
		lblNewLabel_20.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_20.add(lblNewLabel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_21);
		
		JLabel lblNewLabel_21 = new JLabel("Ñ");
		lblNewLabel_21.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_21.add(lblNewLabel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_22);
		
		JLabel lblNewLabel_22 = new JLabel("Z");
		lblNewLabel_22.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_22.add(lblNewLabel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_23);
		
		JLabel lblNewLabel_24 = new JLabel("X");
		lblNewLabel_24.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_23.add(lblNewLabel_24);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_24);
		
		JLabel lblNewLabel_25 = new JLabel("C");
		lblNewLabel_25.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_24.add(lblNewLabel_25);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_25);
		
		JLabel lblNewLabel_26 = new JLabel("V");
		lblNewLabel_26.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_25.add(lblNewLabel_26);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_26);
		
		JLabel lblNewLabel_27 = new JLabel("B");
		lblNewLabel_27.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_26.add(lblNewLabel_27);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_27);
		
		JLabel lblNewLabel_28 = new JLabel("N");
		lblNewLabel_28.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_27.add(lblNewLabel_28);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_28);
		
		JLabel lblNewLabel_23 = new JLabel("M");
		lblNewLabel_23.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_28.add(lblNewLabel_23);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_29, BorderLayout.SOUTH);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("ESPACIO ");
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 20));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		panel_29.add(lblNewLabel_1);
		
		JLabel lblNewLabel_29 = new JLabel("BORRANDO");
		lblNewLabel_29.setFont(new Font("Agency FB", Font.BOLD, 20));
		panel_29.add(lblNewLabel_29, BorderLayout.EAST);
		
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_Q) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                    panel_2.setBackground(color); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_W) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                    panel_3.setBackground(color); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_E) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                	
                    panel_4.setBackground(color); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_R) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                	
                    panel_5.setBackground(color); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_T) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                	
                    panel_6.setBackground(color); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_Y) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                	panel_7.setBackground(color); 
                }

                if (evt.getKeyCode() == KeyEvent.VK_U) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                	panel_8.setBackground(color); 
                }                

                if (evt.getKeyCode() == KeyEvent.VK_I) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                	panel_9.setBackground(color); 
                }          
                
                if (evt.getKeyCode() == KeyEvent.VK_O) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                    
                	panel_10.setBackground(color); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_P) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                    
                	panel_11.setBackground(color); 
                }
 
                if (evt.getKeyCode() == KeyEvent.VK_A) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_12.setBackground(color); 
                }            
            
                if (evt.getKeyCode() == KeyEvent.VK_S) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                    
                	panel_13.setBackground(color); 
                }            
                
                if (evt.getKeyCode() == KeyEvent.VK_D) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                    
                	panel_14.setBackground(color); 
                }         
                
                if (evt.getKeyCode() == KeyEvent.VK_F) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_15.setBackground(color); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_G) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                    	
                    panel_16.setBackground(color); 
                }                   
           
                if (evt.getKeyCode() == KeyEvent.VK_H) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_17.setBackground(color); 
                }      
                
                if (evt.getKeyCode() == KeyEvent.VK_J) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_18.setBackground(color); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_K) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_19.setBackground(color); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_L) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_20.setBackground(color); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.KEY_PRESSED) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_21.setBackground(color);                 }
                
                
                if (evt.getKeyCode() == KeyEvent.VK_Z) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_22.setBackground(color); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_X) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                    	
                    panel_23.setBackground(color); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_C) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_24.setBackground(color); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_V) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_25.setBackground(color); 
                }     
                
                if (evt.getKeyCode() == KeyEvent.VK_B) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_26.setBackground(color); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_N) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                        
                	panel_27.setBackground(color); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_M) {
                	Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));                                                        	
                    panel_28.setBackground(color); 
                }  
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	
                if (evt.getKeyCode() == KeyEvent.VK_Q) {
                    panel_2.setBackground(Color.decode("#F0F0F0")); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_W) {
                    panel_3.setBackground(Color.decode("#F0F0F0")); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_E) {
                    panel_4.setBackground(Color.decode("#F0F0F0"));  
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_R) {
                    panel_5.setBackground(Color.decode("#F0F0F0")); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_T) {
                    panel_6.setBackground(Color.decode("#F0F0F0")); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_Y) {
                    panel_7.setBackground(Color.decode("#F0F0F0")); 
                }

                if (evt.getKeyCode() == KeyEvent.VK_U) {
                    panel_8.setBackground(Color.decode("#F0F0F0")); 
                }                

                if (evt.getKeyCode() == KeyEvent.VK_I) {
                    panel_9.setBackground(Color.decode("#F0F0F0")); 
                }          
                
                if (evt.getKeyCode() == KeyEvent.VK_O) {
                    panel_10.setBackground(Color.decode("#F0F0F0")); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_P) {
                    panel_11.setBackground(Color.decode("#F0F0F0")); 
                }
 
                if (evt.getKeyCode() == KeyEvent.VK_A) {
                    panel_12.setBackground(Color.decode("#F0F0F0")); 
                }            
            
                if (evt.getKeyCode() == KeyEvent.VK_S) {
                    panel_13.setBackground(Color.decode("#F0F0F0")); 
                }            
                
                if (evt.getKeyCode() == KeyEvent.VK_D) {
                    panel_14.setBackground(Color.decode("#F0F0F0")); 
                }         
                
                if (evt.getKeyCode() == KeyEvent.VK_F) {
                    panel_15.setBackground(Color.decode("#F0F0F0")); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_G) {
                    panel_16.setBackground(Color.decode("#F0F0F0")); 
                }                   
           
                if (evt.getKeyCode() == KeyEvent.VK_H) {
                    panel_17.setBackground(Color.decode("#F0F0F0")); 
                }      
                
                if (evt.getKeyCode() == KeyEvent.VK_J) {
                    panel_18.setBackground(Color.decode("#F0F0F0")); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_K) {
                    panel_19.setBackground(Color.decode("#F0F0F0")); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_L) {
                    panel_20.setBackground(Color.decode("#F0F0F0")); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.KEY_PRESSED) {
                    panel_18.setBackground(Color.decode("#F0F0F0")); 
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_Z) {
                    panel_22.setBackground(Color.decode("#F0F0F0")); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_X) {
                    panel_23.setBackground(Color.decode("#F0F0F0")); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_C) {
                    panel_24.setBackground(Color.decode("#F0F0F0")); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_V) {
                    panel_25.setBackground(Color.decode("#F0F0F0")); 
                }     
                
                if (evt.getKeyCode() == KeyEvent.VK_B) {
                    panel_26.setBackground(Color.decode("#F0F0F0")); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_N) {
                    panel_27.setBackground(Color.decode("#F0F0F0")); 
                }  
                
                if (evt.getKeyCode() == KeyEvent.VK_M) {
                	panel_28.setBackground(Color.decode("#F0F0F0"));  

                }  
            }
        });

        setFocusable(true); 

	}
	
    private void mostrarInstrucciones() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Bienvenido al Juego del teclado!\n\n");
        mensaje.append("Instrucciones:\n");
        mensaje.append("- Selecciona la palabra correcta de la lista dada.\n");
        mensaje.append("- Tienes un tiempo limitado para responder.\n");
        mensaje.append("Presiona OK para comenzar");
        
        JOptionPane.showMessageDialog(this, mensaje.toString(), "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private String PalabraAleatoria() {
        Random rand = new Random();
        return catalogoPalabras[rand.nextInt(catalogoPalabras.length)];
    }
    


    


	
}
