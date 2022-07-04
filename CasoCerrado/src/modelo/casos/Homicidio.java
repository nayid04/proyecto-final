package modelo.casos;

import modelo.Bitacora;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public class Homicidio extends Caso{
    private String detective2;

    public Homicidio(String detective2, int NoCaso, String descripcion, String prioridad, String NomClave, String detective, String sospechoso) {
        super(NoCaso, descripcion, prioridad, NomClave, detective, sospechoso);
        this.detective2 = detective2;
    }

    
    
    public Homicidio(){this.detective2 = "";}
    public void setDetective2(String detective2){this.detective2 = detective2;}
    public String getDetective2(){return this.detective2;}

    @Override
    public String toString() {
        return "Homicidio{" +super.toString()+", detective2=" + detective2 + '}';
    }

    @Override
    public String getDataStringFormat() {
        return this.NoCaso +";"+"Homicidio"+";"+ this.prioridad +";"+ this.NomClave+";"+" "+";"+this.descripcion+";"+this.detective+";"+this.detective2+";"+this.sospechoso+";"+" "+"\n";
    }

    @Override
    public String getStringFormat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

