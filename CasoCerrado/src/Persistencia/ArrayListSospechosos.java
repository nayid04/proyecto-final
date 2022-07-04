package Persistencia;

import java.util.List;
import modelo.personas.Persona;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSospechosos implements ISospechososDao{

    private List<Persona> listaSospechoso;
    
    public ArrayListSospechosos(){
        this.listaSospechoso = new ArrayList(); 
    }
    
    @Override
    public void insertarSospechosos(Persona p) {
        this.listaSospechoso.add(p);
    }

    @Override
    public List<Persona> leerSospechosos() {
        List<Persona> lista = new ArrayList(this.listaSospechoso);
       return lista;
    }

    @Override
    public Persona buscarSospechosos(Persona p) {
        Persona buscar=null;
        for(Persona i: this.listaSospechoso){
            if(i.getId().equalsIgnoreCase(p.getId())){
                buscar = i;
                break;
            }
        }
        return buscar;
    }

    @Override
    public Persona eliminarSospechosos(Persona p) {
        Iterator<Persona> i = this.listaSospechoso.iterator();
        Persona eliminado=null;
        while(i.hasNext()){
            Persona aux = i.next();
            if(aux.getId().equalsIgnoreCase(p.getId())){
                eliminado = aux;
                i.remove();
                break;
            }
        }
        return eliminado;
    }
    
}
