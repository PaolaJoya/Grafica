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
public class Cuadrado extends Genera{
    private ObtienePunto puntoC;
    private ObtienePunto puntoD;

    /**
     *
     * @param puntoC
     * @param puntoD
     * @param puntoA
     * @param puntoB
     */
    public Cuadrado(ObtienePunto puntoC, ObtienePunto puntoD, ObtienePunto puntoA, ObtienePunto puntoB) {
        super(puntoA, puntoB);
        this.puntoC = puntoC;
        this.puntoD = puntoD;
    }

    /**
     *
     */
    @Override
    public void hallarInformacion() {
        
        double lado1 = hallarLado(this.getPuntoA(), this.getPuntoB());
        double lado2 = hallarLado(this.getPuntoB(), this.puntoC);
        double lado3 = hallarLado(this.puntoC, this.getPuntoA());
        double lado4 = hallarLado(this.puntoD, this.getPuntoA());
        this.setPerimetro(lado1+lado2+lado3+lado4);
        this.setArea (lado1*lado2);
    }    
}
