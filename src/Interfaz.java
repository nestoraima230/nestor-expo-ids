import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factura en Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel clientInfoPanel = new JPanel(new GridLayout(4, 2));
        clientInfoPanel.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
        clientInfoPanel.add(new JLabel("Documento:"));
        clientInfoPanel.add(new JTextField(10)); 
        clientInfoPanel.add(new JLabel("Nombre:"));
        clientInfoPanel.add(new JTextField(10)); 
        clientInfoPanel.add(new JLabel("Dirección:"));
        clientInfoPanel.add(new JTextField(10)); 
        clientInfoPanel.add(new JLabel("Teléfono:"));
        clientInfoPanel.add(new JTextField(10)); 

        JPanel facturaInforPanel = new JPanel(new GridLayout(2, 2));
        facturaInforPanel.setBorder(BorderFactory.createTitledBorder("Datos de factura"));

        JLabel numFacturaLabel = new JLabel("N. de factura: ");
        numFacturaLabel.setFont(numFacturaLabel.getFont().deriveFont(Font.BOLD)); 
        facturaInforPanel.add(numFacturaLabel);

        JLabel numFacturaValorLabel = new JLabel("1");
        numFacturaValorLabel.setFont(numFacturaValorLabel.getFont().deriveFont(Font.BOLD)); 
        facturaInforPanel.add(numFacturaValorLabel);

        JLabel fechaLabel = new JLabel("Fecha: ");
        fechaLabel.setFont(fechaLabel.getFont().deriveFont(Font.BOLD)); 
        facturaInforPanel.add(fechaLabel);

        JLabel fechaValorLabel = new JLabel("2021/05/21");
        fechaValorLabel.setFont(fechaValorLabel.getFont().deriveFont(Font.BOLD)); 
        facturaInforPanel.add(fechaValorLabel);


        String[] columnNames = {"Producto", "Cantidad", "Valor", "Sub Total"};
        Object[][] data = {
        	      {"Agua", 5, 100.0, 500.0},
        	      {"Cereal", 2, 1000.0, 2000.0},
        	      {"Leche", 5, 300.0, 600.0},
        	      {"Pan", 3, 200.0, 600.0},
        	      {"Manzanas", 10, 50.0, 500.0},
        	      {"Huevos", 12, 20.0, 240.0},
        	      {"Queso", 1, 400.0, 400.0}
        };
        JTable table = new JTable(data, columnNames);

        JPanel productListPanel = new JPanel(new BorderLayout());
        productListPanel.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel labelPanel = new JPanel(new BorderLayout());

        JLabel productListLabel = new JLabel("Ver listado de facturas", SwingConstants.LEFT);
        productListLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\list (1).png"));
        JLabel addListLabel = new JLabel("Agregar", SwingConstants.RIGHT);
        

        addListLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\check.png"));
        JLabel deleteListLabel = new JLabel("Eliminar", SwingConstants.RIGHT);
        deleteListLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Acceso\\src\\close.png"));

        labelPanel.add(productListLabel, BorderLayout.WEST);
        labelPanel.add(addListLabel, BorderLayout.CENTER);
        labelPanel.add(deleteListLabel, BorderLayout.EAST);

        productListPanel.add(labelPanel, BorderLayout.NORTH);


        JPanel totalPanel = new JPanel(new BorderLayout());

        JPanel calculosPanel = new JPanel(new GridLayout(6, 4));
        JLabel subTotalLabel = new JLabel("SubTotal:");
        Font boldFont = subTotalLabel.getFont().deriveFont(Font.BOLD); 
        subTotalLabel.setFont(boldFont);
        calculosPanel.add(subTotalLabel);

        JLabel subTotalValueLabel = new JLabel("9450.0");
        subTotalValueLabel.setFont(boldFont);
        calculosPanel.add(subTotalValueLabel);

        JLabel discountLabel = new JLabel("% Descuento:");
        discountLabel.setFont(boldFont);
        calculosPanel.add(discountLabel);

        JLabel discountValueLabel = new JLabel("5");
        discountValueLabel.setFont(boldFont);
        calculosPanel.add(discountValueLabel);

        JLabel discountAmountLabel = new JLabel("Valor descontado:");
        discountAmountLabel.setFont(boldFont);
        calculosPanel.add(discountAmountLabel);

        JLabel discountAmountValueLabel = new JLabel("472.5");
        discountAmountValueLabel.setFont(boldFont);
        calculosPanel.add(discountAmountValueLabel);

        JLabel taxLabel = new JLabel("IVA 19%:");
        taxLabel.setFont(boldFont);
        calculosPanel.add(taxLabel);

        JLabel taxValueLabel = new JLabel("1795.0");
        taxValueLabel.setFont(boldFont);
        calculosPanel.add(taxValueLabel);

        JLabel totalLabel = new JLabel("Total Factura:");
        totalLabel.setFont(boldFont);
        calculosPanel.add(totalLabel);

        JLabel totalValueLabel = new JLabel("10772.5");
        totalValueLabel.setFont(boldFont);
        calculosPanel.add(totalValueLabel);

        
        JPanel buttonFinishPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton finishButton = new JButton("Finalizar factura");
        JButton clearButton = new JButton("Limpiar");
        finishButton.setPreferredSize(new Dimension(200, 30)); 
        clearButton.setPreferredSize(new Dimension(100, 30));
        buttonFinishPanel.add(finishButton);
        buttonFinishPanel.add(clearButton);

        totalPanel.add(calculosPanel, BorderLayout.CENTER);
        totalPanel.add(buttonFinishPanel, BorderLayout.SOUTH);

        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.add(clientInfoPanel);
        topPanel.add(facturaInforPanel);

        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(productListPanel, BorderLayout.CENTER);
        panel.add(totalPanel, BorderLayout.SOUTH);
        
        finishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "La factura se ha realizado con éxito!", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.pack();
    }
}
