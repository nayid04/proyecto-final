package modelo.personas;
import modelo.Direccion;

public class Sospechoso extends Persona {
    
    private String alias,caracteristicas;
    private String direccion;
    private int edad;
    
    public Sospechoso(){
        this.alias = "";
        this.direccion = "";
        this.edad = 0;
        this.caracteristicas = "";
    }

    public Sospechoso(String alias, String caracteristicas, String direccion, int edad, String id, String nombre1, String nombre2, String apellido1, String apellido2) {
        super(id, nombre1, nombre2, apellido1, apellido2);
        this.alias = alias;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    public void setAlias(String alias){this.alias = alias;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void setEdad(int edad){this.edad = edad;}
    public void setCart(String caracteristicas){this.caracteristicas = caracteristicas;}
    public String getAlias(){return this.alias;}
    public String getDireccion(){return this.direccion;}
    public int getEdad(){return this.edad;}
    public String getCart(){return this.caracteristicas;}    

    @Override
    public String getDataStringFormat() {
        return this.id + ";" + this.nombre1 + ";" + this.nombre2 + ";" + this.apellido1 + ";" + this.apellido2 + ";" + this.alias + ";" + this.edad + ";" + this.direccion + ";" + this.caracteristicas+ "\n";
    }

    @Override
    public String getStringFormat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
