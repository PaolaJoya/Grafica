/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Paola Joya- David Castro
 */
public class PrincipalCirculo extends JFrame{
    private Imagen imagen;
    
    private Opciones opciones;
    
    private BotonCirculo botones;
    
    private PanelCirculo panelCirculo;
    
    /**
     *
     */
    public PrincipalCirculo(){
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("TRABAJO FIGURAS");
        getContentPane().setLayout(new BorderLayout());
        
        imagen = new Imagen();
        getContentPane().add(imagen, BorderLayout.NORTH);
        
        botones = new BotonCirculo(this);
        getContentPane().add(botones, BorderLayout.WEST);
        
        opciones = new Opciones();
        getContentPane().add(opciones, BorderLayout.SOUTH);
        
        panelCirculo = new PanelCirculo(this);
        getContentPane().add(panelCirculo, BorderLayout.CENTER);
        

        setVisible(true);
        

    }

    /**
     *
     * @return
     */
    public Imagen getImagen() {
        return imagen;
    }

    /**
     *
     * @param imagen
     */
    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    /**
     *
     * @return
     */
    public Opciones getOpciones() {
        return opciones;
    }

    /**
     *
     * @param opciones
     */
    public void setOpciones(Opciones opciones) {
        this.opciones = opciones;
    }

    /**
     *
     * @return
     */
    public BotonCirculo getBotones() {
        return botones;
    }

    /**
     *
     * @param botones
     */
    public void setBotones(BotonCirculo botones) {
        this.botones = botones;
    }

    /**
     *
     * @return
     */
    public PanelCirculo getPanelCirculo() {
        return panelCirculo;
    }

    /**
     *
     * @param panelCirculo
     */
    public void setPanelCirculo(PanelCirculo panelCirculo) {
        this.panelCirculo = panelCirculo;
    }

}
