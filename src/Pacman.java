import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;

public class Pacman extends JFrame implements KeyListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    int x = 100;
    int y = 100;
    int radio = 20;

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
        panel.add(btnNewButton);

        JPanel panel_1 = new JPanel() {
            @Override
            public void paint(Graphics g) {

                super.paint(g);

                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.YELLOW);
                g2d.drawOval(x , y , radio,  radio);
                g2d.fillOval(x , y , radio,  radio);

            }

        };
        panel_1.setBackground(Color.BLACK);
        panel_1.setForeground(new Color(0, 0, 0));
        contentPane.add(panel_1, BorderLayout.CENTER);

        panel_1.addComponentListener(null);
        setFocusable(true);
        addKeyListener(this); 
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int tecla = e.getKeyCode();

        if (tecla == KeyEvent.VK_W) {
            y -= 10;
        } else if (tecla == KeyEvent.VK_A) {
            x -= 10;
        } else if (tecla == KeyEvent.VK_S) {
            y += 10;
        } else if (tecla == KeyEvent.VK_D) {
            x += 10;
        }
        update(getGraphics());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
