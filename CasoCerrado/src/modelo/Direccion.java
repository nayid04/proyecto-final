package modelo;

public class Direccion {
    String NoVivienda,localidad,ciudad,departamento,pais;
    
    public Direccion(){
        this.NoVivienda = "";
        this.localidad = "";
        this.ciudad = "";
        this.departamento = "";
        this.pais = "";
    }
    
    public void setNoVivienda(String vivienda){this.NoVivienda = vivienda;}
    public void setLocalidad(String localidad){this.localidad = localidad;}
    public void setCiudad(String ciudad){this.ciudad = ciudad;}
    public void setDepartamento(String departamento){this.departamento = departamento;}
    public void setPais(String pais){this.pais = pais;}

    public String getNoVivienda(){return NoVivienda;}
    public String getLocalidad(){return localidad;}
    public String getCiudad(){return ciudad;}
    public String getDepartamento(){return departamento;}
    public String getPais(){return pais;}
}
