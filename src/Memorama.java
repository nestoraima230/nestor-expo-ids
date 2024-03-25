import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;

public class Memorama extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private ArrayList<ImageIcon> imagenes;
    private ArrayList<JButton> botones;
    private JLabel lblJugadas;
    private int jugadas = 0;
    private ArrayList<JButton> botonesSeleccionados = new ArrayList<>();
    private Set<ImageIcon> imagenesSeleccionadas;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Memorama frame = new Memorama();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Memorama() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 516, 440);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);
        lblJugadas = new JLabel("Jugadas: 0");
        panel.add(lblJugadas);

        JPanel panel_1 = new JPanel();
        contentPane.add(panel_1, BorderLayout.SOUTH);
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });
        panel_1.add(btnReiniciar);

        JPanel panel_2 = new JPanel();
        contentPane.add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new GridLayout(2, 4, 5, 5));

        imagenes = new ArrayList<>();
        imagenes.add(new ImageIcon(Memorama.class.getResource("close.png")));
        imagenes.add(new ImageIcon(Memorama.class.getResource("check.png")));
        imagenes.add(new ImageIcon(Memorama.class.getResource("icons8-padlock-48.png")));
        imagenes.add(new ImageIcon(Memorama.class.getResource("icons8-user-50.png")));

        imagenes.addAll(imagenes);

        Collections.shuffle(imagenes);

        botones = new ArrayList<>();

        imagenesSeleccionadas = new HashSet<>();

        for (int i = 0; i < 8; i++) {
            JButton btn = new JButton("");
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton boton = (JButton) e.getSource();
                    int indice = botones.indexOf(boton);
                    ImageIcon imagen = imagenes.get(indice);
                    boton.setIcon(imagen);

                    seleccionarCarta(boton, imagen);
                }
            });
            panel_2.add(btn);
            botones.add(btn);
        }
    }

    private void seleccionarCarta(JButton boton, ImageIcon imagen) {
        if (botonesSeleccionados.size() < 2 && !imagenesSeleccionadas.contains(imagen)) {
            botonesSeleccionados.add(boton);

            if (botonesSeleccionados.size() == 2) {
                jugadas++;
                lblJugadas.setText("Jugadas: " + jugadas);

                int indice1 = botones.indexOf(botonesSeleccionados.get(0));
                int indice2 = botones.indexOf(botonesSeleccionados.get(1));

                if (imagenes.get(indice1).equals(imagenes.get(indice2))) {
                    imagenesSeleccionadas.add(imagen);
                    botonesSeleccionados.clear();
                } else {
                    new java.util.Timer().schedule(new java.util.TimerTask() {
                        @Override
                        public void run() {
                            voltearCartas();
                        }
                    }, 1000);
                }
            }
        }
    }

    private void voltearCartas() {
    	for (int i = 0; i < botonesSeleccionados.size(); i++) {
    	    botonesSeleccionados.get(i).setIcon(null);
    	}

        botonesSeleccionados.clear();
    }

    private void reiniciarJuego() {
    	for (int i = 0; i < botones.size(); i++) {
    	    botones.get(i).setIcon(null);
    	}

        imagenes.clear();
        imagenesSeleccionadas.clear();
        imagenes.add(new ImageIcon(Memorama.class.getResource("close.png")));
        imagenes.add(new ImageIcon(Memorama.class.getResource("check.png")));
        imagenes.add(new ImageIcon(Memorama.class.getResource("icons8-padlock-48.png")));
        imagenes.add(new ImageIcon(Memorama.class.getResource("icons8-user-50.png")));
        imagenes.addAll(imagenes);
        Collections.shuffle(imagenes);
        jugadas = 0;
        lblJugadas.setText("Jugadas: 0");
    }
}
