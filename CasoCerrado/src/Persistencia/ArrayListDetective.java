package Persistencia;

import java.util.List;
import modelo.personas.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDetective implements IDetectivesDao{

    private List<Persona> listaDetective;
    
    public ArrayListDetective(){
        this.listaDetective = new ArrayList(); 
    }
    
    @Override
    public void insertarDetectives(Persona p) {
        this.listaDetective.add(p);
    }

    @Override
    public List<Persona> leerDetectives() {
        List<Persona> lista = new ArrayList(this.listaDetective);
       return lista;
    }

    @Override
    public Persona buscarDetectives(Persona p) {
        Persona buscar=null;
        for(Persona i: this.listaDetective){
            if(i.getId().equalsIgnoreCase(p.getId())){
                buscar = i;
                break;
            }
        }
        return buscar;
    }

    @Override
    public Persona eliminarDetectives(Persona p) {
        Iterator<Persona> i = this.listaDetective.iterator();
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
