/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.text.DecimalFormat;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Contenido boton circulo
 * @author Paola Joya- David Castro
 */
public class BotonCirculo extends JPanel implements ActionListener{
    
    String x1, x2, x3,x4, y1, y2, y3,y4;
    double a1, a2, a3,a4, b1, b2, b3,b4;
    Cuadrado cuadrado;

    /**
     *
     */
    public JButton btnColorFondo;
    private JButton btnPunto;
    private JButton btnColorLinea;
    private JLabel LArea;
    private JLabel LPerimetro;
    private JLabel LAltura;
    
    /**
     *
     */
    public static final String BTN_COLOR_FONDO = "COLORFONDO";
    private static final String BTN_COLOR_LINEA = "COLORLINEA";
    private static final String BTN_PUNTO = "PUNTO";
    
    private PrincipalCirculo principal;
    private Genera genera;

    /**
     *
     * @param principal
     */
    public BotonCirculo(PrincipalCirculo principal){
        this.principal=principal;
        setBackground(Color.WHITE);
        setLayout(new GridLayout(6, 1));
        
        btnColorFondo = new JButton ("Cambiar fondo");
        btnColorFondo.addActionListener((ActionListener) this);
        btnColorFondo.setActionCommand(BTN_COLOR_FONDO);
        add(btnColorFondo, BorderLayout.WEST);

        
        btnColorLinea = new JButton ("Cambiar linea");
        btnColorLinea.addActionListener((ActionListener) this);
        btnColorLinea.setActionCommand(BTN_COLOR_LINEA);
        add(btnColorLinea);
        
        btnPunto = new JButton ("Cambiar punto");
        btnPunto.addActionListener((ActionListener) this);
        btnPunto.setActionCommand(BTN_PUNTO);
        add(btnPunto);
       
        ObtienePunto puntoA = new ObtienePunto(0, 0);
        ObtienePunto puntoB = new ObtienePunto(4, 0);
               
        puntoA = new ObtienePunto(0, 0);
        puntoB = new ObtienePunto(4, 0);
        genera = new Circulo(puntoA,puntoB);
        genera.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.0000");
        
        LArea = new JLabel("Area:" + numero.format(genera.getArea()));
        add(LArea);
        
        LPerimetro = new JLabel("Radio:" + numero.format(genera.getRadio()));
        add(LPerimetro);
        
        
        
        
    }
    /**
     * Configuracion boton circulo
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
           if(BTN_COLOR_FONDO.equals(e.getActionCommand())){
            JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelCirculo().setColorFondo(cl);
                this.principal.getPanelCirculo().repaint();
            }
           else if (BTN_COLOR_LINEA.equals(e.getActionCommand())){
                JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelCirculo().setColorLinea(cl);
                this.principal.getPanelCirculo().repaint();
                
        }
        else if (BTN_PUNTO.equals(e.getActionCommand())){
            pidePuntos();
            
        }
    }
    
    /**
     *Metodo de lectura
     */
    public void pidePuntos(){
        x1 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada x1");
        a1 = Double.parseDouble(x1);
        y1 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada y1");
        b1 = Double.parseDouble(y1);
        x2 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada x2");
        a2 = Double.parseDouble(x2);
        y2 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada y2");
        b2 = Double.parseDouble(y2);
        
        ObtienePunto puntoA = new ObtienePunto(a1, b1);
        ObtienePunto puntoB = new ObtienePunto(a2, b2);
        genera = new Circulo(puntoA,puntoB);
        genera.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.000");

        
        LArea.setText("Area:" + numero.format(genera.getArea()));
        LPerimetro.setText("Radio:" + numero.format(genera.getRadio()));
        
        this.principal.getPanelCirculo().setPuntoA(puntoA);
        this.principal.getPanelCirculo().setPuntoB(puntoB);
        this.principal.getPanelCirculo().repaint();

    }


}