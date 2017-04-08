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
 *
 * @author Paola Joya- David Castro
 */
public class BotonCuadrado extends JPanel implements ActionListener{
    
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
    
    private PrincipalCuadrado principal;
    private Genera genera;

    /**
     * Contenido boton cuadrado
     * @param principal
     */
    public BotonCuadrado(PrincipalCuadrado principal){
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
        ObtienePunto puntoC = new ObtienePunto(4, 4);
        ObtienePunto puntoD = new ObtienePunto(0, 4);
               
        puntoA = new ObtienePunto(0, 0);
        puntoB = new ObtienePunto(4, 0);
        puntoC = new ObtienePunto(4, 4);
        puntoD=new ObtienePunto(0,4);
        genera = new Cuadrado(puntoC, puntoD, puntoA,puntoB);
        genera.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.0000");
        
        LArea = new JLabel("Area:" + numero.format(genera.getArea()));
        add(LArea);
        
        LPerimetro = new JLabel("Perimetro:" + numero.format(genera.getPerimetro()));
        add(LPerimetro);
        
        LAltura = new JLabel("Altura:" + numero.format(genera.getAltura()));
        add(LAltura);
        
        
        
        
    }
    /**
     * configuracion boton cuadrado
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
           if(BTN_COLOR_FONDO.equals(e.getActionCommand())){
            JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelCuadrado().setColorFondo(cl);
                this.principal.getPanelCuadrado().repaint();
            }
           else if (BTN_COLOR_LINEA.equals(e.getActionCommand())){
                JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelCuadrado().setColorLinea(cl);
                this.principal.getPanelCuadrado().repaint();
                
        }
        else if (BTN_PUNTO.equals(e.getActionCommand())){
            pidePuntos();
            
        }
    }
    
    /**
     * Lectura de datos
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
        x3 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada x3");
        a3 = Double.parseDouble(x3);
        y3 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada y3");
        b3 = Double.parseDouble(y3);
        x4=JOptionPane.showInputDialog(btnPunto,"Digite coordenada x4");
        b4 = Double.parseDouble(x4);
        y4=JOptionPane.showInputDialog(btnPunto,"Digite coordenada y4");
        b4 = Double.parseDouble(y4);
        
        ObtienePunto puntoA = new ObtienePunto(a1, b1);
        ObtienePunto puntoB = new ObtienePunto(a2, b2);
        ObtienePunto puntoC = new ObtienePunto(a3, b3);
        ObtienePunto puntoD = new ObtienePunto(a4, b4);
        genera = new Cuadrado(puntoC, puntoD, puntoA,puntoB);
        genera.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.000");

        
        LArea.setText("Area:" + numero.format(genera.getArea()));
        LPerimetro.setText("Perimetro:" + numero.format(genera.getPerimetro()));
        LAltura.setText("Altura:" + numero.format(genera.getAltura()));
        
        this.principal.getPanelCuadrado().setPuntoA(puntoA);
        this.principal.getPanelCuadrado().setPuntoB(puntoB);
        this.principal.getPanelCuadrado().setPuntoC(puntoC);
        this.principal.getPanelCuadrado().setPuntoD(puntoD);
        this.principal.getPanelCuadrado().repaint();

    }


}