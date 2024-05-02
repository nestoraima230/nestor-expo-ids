import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileWriter {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(402, 297);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnLeerArchivo = new RoundedButton("Leer Archivo");
        btnLeerArchivo.setBackground(Color.RED);
        btnLeerArchivo.setForeground(Color.WHITE);
        btnLeerArchivo.setBounds(123, 94, 128, 52);
        btnLeerArchivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(frame);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                        String line;
                        System.out.println("Contenido:");
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        reader.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        frame.getContentPane().setLayout(null);

        frame.getContentPane().add(btnLeerArchivo);
        frame.setVisible(true);
    }
}
