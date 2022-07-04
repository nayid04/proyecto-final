package modelo.casos;

import modelo.Bitacora;
import modelo.personas.Detective;
import modelo.personas.Sospechoso;

public abstract class Caso {
    
    protected int NoCaso;
    protected String descripcion,prioridad,NomClave;
    protected String detective;
    protected String sospechoso;
    //protected Bitacora bitacora;

    public Caso(int NoCaso, String descripcion, String prioridad, String NomClave, String detective, String sospechoso) {
        this.NoCaso = NoCaso;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.NomClave = NomClave;
        this.detective = detective;
        this.sospechoso = sospechoso;
        //this.bitacora = bitacora;
    }
    
    public Caso(){
        this.NoCaso = 0;
        this.descripcion = "";
        this.prioridad = "";
        this.NomClave = "";
        
        detective = "";
        sospechoso = "";
    }
    
    public void setNoCaso(int NoCaso){this.NoCaso = NoCaso;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    public void setPrioridad(String prioridad){this.prioridad = prioridad;}
    public void setNomClave(String NomClave){this.NomClave = NomClave;}
    //public void setDetective(Detective detective){this.detective = detective;}
    //public void setSospechoso(int num,Sospechoso sospechoso){this.sospechoso[num] = sospechoso;}
    
    public int getNoCaso(){return this.NoCaso;}
    public String getDescripcion(){return this.descripcion;}
    public String getPrioridad(){return this.prioridad;}
    public String getNomClave(){return this.NomClave;}
    //public Detective getDetective(){return this.detective;}
    //public Sospechoso getSospechoso(int num){return this.sospechoso[num];}
    //public Bitacora getBitacora(){return this.bitacora;}

    @Override
    public String toString() {
        return "Caso{" + "NoCaso=" + NoCaso + ", descripcion=" + descripcion + ", prioridad=" + prioridad + ", NomClave=" + NomClave + ", detective=" + detective + ", sospechoso=" + sospechoso + ", bitacora=" + "bitacora" + '}';
    }
    
    public abstract String getDataStringFormat(); // retorna los datos del objeto en formato String
    public abstract String getStringFormat();
}