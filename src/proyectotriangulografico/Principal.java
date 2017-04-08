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
public class Principal extends JFrame{
   
    private Imagen imagen;
    
    private Opciones opciones;
    
    private Botones botones;
    
    private PanelTriangulo panelTriangulo;
    
    /**
     *
     */
    public Principal(){
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("TRABAJO FIGURAS");
        getContentPane().setLayout(new BorderLayout());
        
        imagen = new Imagen();
        getContentPane().add(imagen, BorderLayout.NORTH);
        
        botones = new Botones(this);
        getContentPane().add(botones, BorderLayout.WEST);
        
        opciones = new Opciones();
        getContentPane().add(opciones, BorderLayout.SOUTH);
        
        panelTriangulo = new PanelTriangulo(this);
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        

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
    public Botones getBotones() {
        return botones;
    }

    /**
     *
     * @param botones
     */
    public void setBotones(Botones botones) {
        this.botones = botones;
    }

    /**
     *
     * @return
     */
    public PanelTriangulo getPanelTriangulo() {
        return panelTriangulo;
    }

    /**
     *
     * @param panelTriangulo
     */
    public void setPanelTriangulo(PanelTriangulo panelTriangulo) {
        this.panelTriangulo = panelTriangulo;
    }

    
       
}