/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsumo;

/**
 *
 * @author Mariano
 */
public class Pais {
    private int codPais;
    private String pais;

    public Pais(int codPais, String pais) {
        this.codPais = codPais;
        this.pais = pais;
    }

    public int getCodPais() {
        return codPais;
    }

    public String getPais() {
        return pais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return  pais;
    }
    
    
    public boolean equals(Pais p){
        String pais="Argentina";
        boolean r;
        
        if(p.pais==pais){
            r=true;
        }else{
            r=false;
        }
        
        return r;
    }
}
