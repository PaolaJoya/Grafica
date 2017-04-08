/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author Paola Joya- David Castro
 */

public class PanelCirculo extends JPanel{

    /**
     *
     */
    public Color colorLinea;

    /**
     *
     */
    public Color colorFondo;

    /**
     *
     */
    public ObtienePunto puntoA;

    /**
     *
     */
    public ObtienePunto puntoB;

    private PrincipalCirculo principal;
    private BotonCuadrado botones;
    
    /**
     *
     * @param principal
     */
    public PanelCirculo(PrincipalCirculo principal) {
        this.principal =principal;
        setBackground(Color.LIGHT_GRAY);
        
        
    }
    
    
      
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.botones = botones;
        g.setColor(Color.BLACK);
        g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
        g.drawLine(this.getWidth()/2, 0,this.getWidth()/2 , this.getHeight());
 
        
        Graphics2D grafico = (Graphics2D) g;
        Polygon polygon = new Polygon();
        if(puntoA != null){
        g.drawOval(((int)puntoA.getX()+(this.getWidth()/2)),((this.getHeight()/2)-(int)puntoA.getY()) ,((this.getWidth()/2)+(int) puntoB.getX()), ((this.getHeight()/2)-(int)puntoB.getY()));
        grafico.setColor(colorFondo);
        }
        grafico.setColor(colorFondo);
        grafico.setColor(colorLinea);
    }

    /**
     *
     * @return
     */
    public Color getColorLinea() {
        return colorLinea;
    }

    /**
     *
     * @param colorLinea
     */
    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    /**
     *
     * @return
     */
    public Color getColorFondo() {
        return colorFondo;
    }

    /**
     *
     * @param colorFondo
     */
    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    /**
     *
     * @return
     */
    public ObtienePunto getPuntoA() {
        return puntoA;
    }

    /**
     *
     * @param puntoA
     */
    public void setPuntoA(ObtienePunto puntoA) {
        this.puntoA = puntoA;
    }

    /**
     *
     * @return
     */
    public ObtienePunto getPuntoB() {
        return puntoB;
    }

    /**
     *
     * @param puntoB
     */
    public void setPuntoB(ObtienePunto puntoB) {
        this.puntoB = puntoB;
    }
    
}
