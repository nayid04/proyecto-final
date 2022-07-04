package modelo;

public class Fecha {
    private byte dia,mes;
    private int year;
    
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.year = 0;
    }
    
    public void setDia(byte dia){this.dia = dia;}
    public void setMes(byte mes){this.mes = mes;}
    public void setYear(int year){this.year = year;}
    public byte getDia(){return dia;}
    public byte getMes(){return mes;}
    public int getYear(){return year;}
}
