package modelo.casos;

import Persistencia.*;
import java.util.List;
import modelo.personas.*;

public class ListaCasos implements ICasosDao{
    private ICasosDao registroCasos;

    public ListaCasos() {
        this.registroCasos = new ArrayListCasos();
    }

    @Override
    public void insertarCasos(Caso c) {
        this.registroCasos.insertarCasos(c);
    }

    @Override
    public List<Caso> leerCasos() {
        return this.registroCasos.leerCasos();
    }

    @Override
    public Caso buscarCasos(Caso c) {
        return this.registroCasos.buscarCasos(c);
    }

    @Override
    public Caso eliminarCasos(Caso c) {
        return this.registroCasos.eliminarCasos(c);
    }
    
}
