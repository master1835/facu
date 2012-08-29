/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author mariano
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Punto inicio = new Punto(2.0, 1.1);
       Punto p = new Punto();
       
    System.out.println("x= "+inicio.getX()+" y= "+inicio.getY());
    
    System.out.println(inicio.equals(inicio));
    System.out.println(inicio.equals(new Punto(2.0, 1.1)));
    System.out.println("comparamos"+inicio+"con"+new Punto(2.0, 1.1));

    Circulo c=new Circulo(5);
    System.out.println("circulo de orige"+c.getOrigen()+"radio "+c.getRadio());
    c.setRadio(8);
        System.out.println("circulo de orige"+c.getOrigen()+"radio "+c.getRadio());
        
        Circulo c1= new Circulo(p, 10);
        System.out.println("circulo de origen "+ c1.getOrigen());
        
        System.out.println("el área del círculo es:  "+ c1.calcularArea());
        System.out.println("el perímetro del círculo es:  "+ c1.calcularPerimetro());
        
        Rectangulo r=new Rectangulo(p, 20.3, 7.5);
        
        System.out.println("el área del rectángulo es:  "+r.calcularArea());
        System.out.println("el perímetro del rectángulo es:  "+r.calcularPerimetro());
        
    }
    
}
