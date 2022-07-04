package modelo.casos;

import modelo.Bitacora;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public class CiberCrimen extends Caso{
    private String tipo;

    public CiberCrimen(String tipo, int NoCaso, String descripcion, String prioridad, String NomClave, String detective, String sospechoso) {
        super(NoCaso, descripcion, prioridad, NomClave, detective, sospechoso);
        this.tipo = tipo;
    }

    
    public CiberCrimen(){this.tipo = "";}
    public void setTipo(String tipo){this.tipo = tipo;}
    public String getTipo(){return this.tipo;}

    @Override
    public String toString() {
        return "CiberCrimen{" +super.toString()+ ",tipo=" + tipo + '}';
    }

    @Override
    public String getDataStringFormat() {
        return this.NoCaso +";"+ "Ciber Crimen" +";"+ this.prioridad +";"+ this.NomClave+";"+this.tipo+";"+this.descripcion+";"+this.detective+";"+" "+";"+this.sospechoso+";"+" "+"\n";
        }

    @Override
    public String getStringFormat() {
        return "";
    }
}
