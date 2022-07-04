package modelo;

public class Bitacora {
    
    private String novedades[];
    private Fecha fecha[];
    
    public Bitacora(){
        this.novedades = new String[30];
        this.fecha = new Fecha[30];
    }

    public String getNovedad(int num) {return novedades[num];}
    public void setNovedad(String novedad,int num){this.novedades[num] = novedad;}
    public Fecha getFecha(int num){return fecha[num];}
    public void setFecha(Fecha fecha,int num){this.fecha[num] = fecha;}
    
    
    
}
