package modelo.casos;

import modelo.Bitacora;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public class Narcotrafico extends Caso {
    private String region;

    public Narcotrafico(String region, int NoCaso, String descripcion, String prioridad, String NomClave, String detective, String sospechoso) {
        super(NoCaso, descripcion, prioridad, NomClave, detective, sospechoso);
        this.region = region;
    }

    public Narcotrafico(){this.region = "";}
    public void setRegion(String region){this.region = region;}
    public String getRegion(){return this.region;}

    @Override
    public String toString() {
        return "Narcotrafico{" +super.toString()+ ",region=" + region + '}';
    }

    
    
    @Override
    public String getDataStringFormat(){
        return this.NoCaso +";"+"Narcotrafico"+";"+ this.prioridad +";"+ this.NomClave+";"+" "+";"+this.descripcion+";"+this.detective+";"+" "+";"+this.sospechoso+";"+this.region+"\n";
    }
    @Override
    public String getStringFormat(){
        return "";
    }
}
