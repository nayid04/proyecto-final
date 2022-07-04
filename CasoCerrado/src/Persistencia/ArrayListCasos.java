package Persistencia;

import java.util.List;
import modelo.casos.Caso;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListCasos implements ICasosDao{

    private List<Caso> listaCasos;
    
    public ArrayListCasos(){
        this.listaCasos = new ArrayList(); 
    }
    
    @Override
    public void insertarCasos(Caso c) {
        this.listaCasos.add(c);
    }

    @Override
    public List<Caso> leerCasos() {
        List<Caso> lista = new ArrayList(this.listaCasos);
       return lista;
    }

    @Override
    public Caso buscarCasos(Caso c) {
        Caso buscar=null;
        for(Caso i: this.listaCasos){
            if(i.getNoCaso()==c.getNoCaso()){
                buscar = i;
                break;
            }
        }
        return buscar;
    }

    @Override
    public Caso eliminarCasos(Caso c) {
        Iterator<Caso> i = this.listaCasos.iterator();
        Caso eliminado=null;
        while(i.hasNext()){
            Caso aux = i.next();
            if(aux.getNoCaso()==c.getNoCaso()){
                eliminado = aux;
                i.remove();
                break;
            }
        }
        return eliminado;
    }
    
}
