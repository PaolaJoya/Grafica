/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Paola Joya- David Castro
 */
public class Imagen extends JPanel{
    private JLabel etiquetaImagen;
    private JLabel nombre;
    private JLabel carrera;
    
    /**
     *
     */
    public Imagen(){
        setBackground(Color.WHITE);
        setBorder(new LineBorder (Color.GRAY));
        ImageIcon icon = new ImageIcon("imagenes/logo.JPG");
        etiquetaImagen = new JLabel();
        etiquetaImagen.setIcon(icon);
        add(etiquetaImagen);
        nombre = new JLabel("David Castro- Paola Joya");
        add(nombre);
        carrera = new JLabel("    Ing. de Sistemas");
        add(carrera);
    }
}