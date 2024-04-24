import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;



public class Pacman extends JFrame implements KeyListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel panel_1;
    int x = 440;
    int y = 360;
    int radio = 20;
    private Tablero tablero;

    
	Player jugador = new Player(x,y,25,25,"");
	Player muro = new Player(100,100,20,100,"");
	int score = 0;
	private JLabel lblNewLabel;
	private int coordYTablero;



    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Pacman frame = new Pacman();
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
    public Pacman() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 566, 395);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setForeground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.SOUTH);

        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		reiniciar();
        	}
        });
        
        panel.add(btnNewButton);
        
        lblNewLabel = new JLabel("Puntos: 0");
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lblNewLabel);
        

         panel_1 = new JPanel() {
            @Override
            public void paint(Graphics g) {

                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.YELLOW); 
                g2d.fillArc(jugador.x, jugador.y, jugador.w, jugador.h, 30, 300);

                g2d.setColor(Color.BLUE);
                for (Rectangle muro : tablero.getMuros()) {
                    g2d.fillRect(muro.x, muro.y, muro.width, muro.height);
                }
                
                g2d.setColor(Color.WHITE);
                for (Rectangle pastilla : tablero.getPastillas()) {
                    g2d.fillRect(pastilla.x, pastilla.y, pastilla.width, pastilla.height);
                }                
            }

        };
        panel_1.setBackground(Color.BLACK);
        panel_1.setForeground(new Color(0, 0, 0));
        contentPane.add(panel_1, BorderLayout.CENTER);

        panel_1.addComponentListener(null);
        setFocusable(true);
        addKeyListener(this); 
        tablero = new Tablero();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        int nuevoX = jugador.x;
        int nuevoY = jugador.y;
        

        if (tecla == KeyEvent.VK_W) {
            nuevoY -= 10;
        } else if (tecla == KeyEvent.VK_A) {
            nuevoX -= 10;
        } else if (tecla == KeyEvent.VK_S) {
            nuevoY += 10;
        } else if (tecla == KeyEvent.VK_D) {
            nuevoX += 10;
        }
        
        int entradaSuperiorX = tablero.coordXTablero + tablero.anchoTablero / 2 - 40;
        int entradaInferiorX = tablero.coordXTablero + tablero.anchoTablero / 2 - 40;
        int entradaInferiorY = tablero.coordYTablero + tablero.altoTablero - 20;

        if (nuevoY < coordYTablero && nuevoX >= entradaSuperiorX && nuevoX <= entradaSuperiorX + 80) {
            nuevoY = entradaInferiorY - jugador.h; 
        } else if (nuevoY + jugador.h > entradaInferiorY && nuevoX >= entradaInferiorX && nuevoX <= entradaInferiorX + 80) {
            nuevoY = coordYTablero; 
        }


        Rectangle nuevaPosicion = new Rectangle(nuevoX, nuevoY, jugador.w, jugador.h);

        boolean colision = false;
        for (Rectangle muro : tablero.getMuros()) {
            if (nuevaPosicion.intersects(muro)) {
                colision = true;
                break;
            }
        }

        if (!colision) {
            jugador.x = nuevoX;
            jugador.y = nuevoY;

            Rectangle rectPacman = new Rectangle(jugador.x, jugador.y, jugador.w, jugador.h);
            for (Rectangle pastilla : tablero.getPastillas()) {
                if (rectPacman.intersects(pastilla)) {
                    tablero.getPastillas().remove(pastilla); 
                    score += 1;
                    lblNewLabel.setText("Puntos: " + score);
                    
                    if (tablero.getPastillas().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "¡Ganaste!", "Nivel Completado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                }
            }
        }

        update(getGraphics());
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    private void reiniciar() {
        jugador.x = 440;
        jugador.y = 360;
        score = 0;
        tablero.resetPastillas();
        update(getGraphics());

        panel_1.requestFocusInWindow();
        panel_1.addKeyListener(this);

    }
    

}

