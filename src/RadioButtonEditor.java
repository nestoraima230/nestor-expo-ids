import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

class RadioButtonCellRenderer implements TableCellRenderer {
    private final JRadioButton radioButton;

    public RadioButtonCellRenderer() {
        radioButton = new JRadioButton();
        radioButton.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        radioButton.setSelected((Boolean) value);
        return radioButton;
    }
}