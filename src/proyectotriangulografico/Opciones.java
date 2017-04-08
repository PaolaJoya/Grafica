/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


/**
 *
 * @author Paola Joya- David Castro
 */
public class Opciones extends JPanel implements ActionListener{
    private JButton btnOpcion1;
    private JButton btnOpcion2;
    private JButton btnOpcion3;
    private Principal principal;
    private PrincipalCuadrado cuadrado;
    private PrincipalCirculo circulo;
    
    private static final String OPCION_1 = "OPCION 1";
    private static final String OPCION_2 = "OPCION 2";
    private static final String OPCION_3 = "OPCION 3";
    
    /**
     *
     */
    public Opciones(){
        
        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Opciones"));
        setLayout(new GridLayout(1,2));
        
        btnOpcion1 = new JButton("Triangulo");
        btnOpcion1.addActionListener(this);
        btnOpcion1.setActionCommand(OPCION_1);
        add(btnOpcion1);
        
        btnOpcion2 = new JButton("Cuadrado");
        btnOpcion2.addActionListener(this);
        btnOpcion2.setActionCommand(OPCION_2);
        add(btnOpcion2);
        
        btnOpcion3 = new JButton("Circulo");
        btnOpcion3.addActionListener(this);
        btnOpcion3.setActionCommand(OPCION_3);
        add(btnOpcion3);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(OPCION_1.equals(e.getActionCommand())){
            principal =new Principal();
        }
        else if (OPCION_2.equals(e.getActionCommand())){
            cuadrado =new PrincipalCuadrado();
        }else if(OPCION_3.equals(e.getActionCommand())){
            circulo =new PrincipalCirculo();
        }
    }
}