/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlesdedatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author eass
 */

public class ControlesdeDatos extends JFrame implements ActionListener{
    private JLabel lbll,lblN,lblG,lblE,lblT,lblCE,lblC;
    private JTextField txtN,txtCE;
    private JButton btnG,btnL;
    private JToggleButton tbtnM,tbtnF;
    private JSpinner spnEdad;
    private JFormattedTextField ftxtTel;
    private JPasswordField pf1;
    private JTextArea txtal;
    private String Genero;
    
    public ControlesdeDatos() {
        
        //crear instancias de controles y propiedades
        lbll= new JLabel("Ingresa Lo Siguiente");
        lbll.setBounds(15, 50, 160, 30);
        add(lbll);
        
        lblN= new JLabel("NOMBRE");
        lblN.setBounds(15,50,120,30);
        add(lblN);
    }
    
}
