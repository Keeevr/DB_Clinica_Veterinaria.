package CRUD_Veterinaria;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Metodos {

    public void limpiarCampos(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }

    public void limpiarDateChooser(JDateChooser... fechas) {
        for (JDateChooser fecha : fechas) {
            fecha.setDate(null);
        }
    }

    //Seleciona al primero
    public void limpiarComboBox(JComboBox<?>... combos) {
        for (JComboBox<?> combo : combos) {
            if (combo.getItemCount() > 0) {
                combo.setSelectedIndex(0); // selecciona el primer ítem
            } else {
                combo.setSelectedItem(null); // o lo deja sin selección
            }
        }
    }

    //Elimina todo    
    public void vaciarComboBox(JComboBox<?>... combos) {
        for (JComboBox<?> combo : combos) {
            combo.removeAllItems();
        }
    }
}
