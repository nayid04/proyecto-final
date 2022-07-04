
package modelo.personas;
import modelo.Direccion;

public class Detective extends Persona {
    
    private int experiencia;
    private String capacitado;

    public Detective(int experiencia, String capacitado, String id, String nombre1, String nombre2, String apellido1, String apellido2) {
        super(id, nombre1, nombre2, apellido1, apellido2);
        this.experiencia = experiencia;
        this.capacitado = capacitado;
    }
    
    public Detective(){
        this.experiencia = 0;
        this.capacitado = "";
    }
    
    public void setExp(int experiencia){this.experiencia = experiencia;}
    public void setCap(String capacitado){this.capacitado = capacitado;}
    public int getExp(){return this.experiencia;}
    public String getCap(){return this.capacitado;}

    @Override
    public String getDataStringFormat() {
        return this.id + ";" + this.nombre1 + ";" + this.nombre2 + ";" + this.apellido1 + ";" + this.apellido2 + ";" + this.capacitado + ";" + this.experiencia + "\n";
    }

    @Override
    public String getStringFormat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
