/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;
import java.text.DecimalFormat;
/**
 *
 * @author Paola Joya- David Castro
 */
public class Circulo extends Genera{
    private ObtienePunto puntoC;
    private ObtienePunto puntoD;

    /**
     *
     * @param puntoA
     * @param puntoB
     */
    public Circulo(ObtienePunto puntoA, ObtienePunto puntoB) {
        super(puntoA, puntoB);
    }

    /**
     *calcula area
     */
    @Override
    public void hallarInformacion() {
        
        double lado1 = hallarLado(this.getPuntoA(), this.getPuntoB());
        this.setRadio(lado1);
        this.setArea (PI*lado1*lado1);
    }    
}
