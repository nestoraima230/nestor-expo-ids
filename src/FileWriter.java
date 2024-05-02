import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;

import javax.swing.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileWriter extends JFrame {
    private JButton btnLeerJson;

    public FileWriter() {
        setTitle("JSON Reader");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        btnLeerJson = new JButton("Leer JSON");
        btnLeerJson.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                leerJson();
            }
        });

        JPanel panel = new JPanel();
        panel.add(btnLeerJson);
        add(panel, BorderLayout.CENTER);
    }

    private void leerJson() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione un archivo JSON");
        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                JSONParser parser = new JSONParser();
                Object obj = parser.parse(new FileReader(fileChooser.getSelectedFile()));

                JSONObject jsonObject = (JSONObject) obj;
                System.out.println("Contenido del archivo JSON:");
                System.out.println(jsonObject.toJSONString());
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al leer el archivo JSON: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	FileWriter app = new FileWriter();
                app.setVisible(true);
            }
        });
    }
}
